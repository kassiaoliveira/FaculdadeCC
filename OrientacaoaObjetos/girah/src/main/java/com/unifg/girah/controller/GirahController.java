package com.unifg.girah.controller;

import java.util.List;
import java.util.Optional;

import com.unifg.girah.model.ProjectEntity;
import com.unifg.girah.model.ReportEntity;
import com.unifg.girah.model.TeamEntity;
import com.unifg.girah.service.ProjectService;
import com.unifg.girah.service.ReportService;
import com.unifg.girah.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unifg.girah.exception.RecordNotFoundException;
import com.unifg.girah.model.EmployeeEntity;
import com.unifg.girah.service.EmployeeService;

@Controller
@RequestMapping("/")
public class GirahController
{
	@Autowired
	EmployeeService employeeService;
	@Autowired
	TeamService teamService;
	@Autowired
	ProjectService projectService;
	@Autowired
	ReportService reportService;

	@RequestMapping
	public String getIndex(Model model){

		return "index";

	}

	/**
	 * Employee CRUD
	 **/

	@RequestMapping(path = "/listEmployee")
	public String getAllEmployees(Model model) 
	{
		List<EmployeeEntity> list = employeeService.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-employees";
	}

	@RequestMapping(path = {"/editEmployee", "/editEmployee/{id}"})
	public String editEmployeeById(Model model, @PathVariable("id") Optional<Integer> id)
							throws RecordNotFoundException 
	{
		if (id.isPresent()) {
			EmployeeEntity entity = employeeService.getEmployeeById(id.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new EmployeeEntity());
		}
		return "add-edit-employee";
	}
	
	@RequestMapping(path = "/deleteEmployee/{id}")
	public String deleteEmployeeById(Model model, @PathVariable("id") Integer id)
							throws RecordNotFoundException 
	{
		employeeService.deleteEmployeeById(id);
		return "redirect:/listEmployee";
	}

	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
	public String createOrUpdateEmployee(EmployeeEntity employee) 
	{
		employeeService.createOrUpdateEmployee(employee);
		return "redirect:/listEmployee";
	}

	/**
	 * Team CRUD
	 **/

	@RequestMapping(path = "/listTeam")
	public String getAllTeams(Model model)
	{
		List<TeamEntity> list = teamService.getAllTeams();

		model.addAttribute("teams", list);
		return "list-teams";
	}

	@RequestMapping(path = {"/editTeam", "/editTeam/{id}"})
	public String editTeamById(Model model, @PathVariable("id") Optional<Integer> id)
			throws RecordNotFoundException
	{
		if (id.isPresent()) {
			TeamEntity entity = teamService.getTeamById(id.get());
			model.addAttribute("team", entity);
		} else {
			model.addAttribute("team", new TeamEntity());
		}
		return "add-edit-team";
	}

	@RequestMapping(path = "/deleteTeam/{id}")
	public String deleteTeamById(Model model, @PathVariable("id") Integer id)
			throws RecordNotFoundException
	{
		teamService.deleteTeamById(id);
		return "redirect:/listTeam";
	}

	@RequestMapping(path = "/createTeam", method = RequestMethod.POST)
	public String createOrUpdateTeam(TeamEntity team)
	{
		teamService.createOrUpdateTeam(team);
		return "redirect:/listTeam";
	}

	/**
	 * Project CRUD
	 **/

	@RequestMapping(path = "/listProject")
	public String getAllProjects(Model model)
	{
		List<ProjectEntity> list = projectService.getAllProjects();

		model.addAttribute("projects", list);
		return "list-projects";
	}

	@RequestMapping(path = {"/editProject", "/editProject/{id}"})
	public String editProjectById(Model model, @PathVariable("id") Optional<Integer> id)
			throws RecordNotFoundException
	{
		if (id.isPresent()) {
			ProjectEntity entity = projectService.getProjectById(id.get());
			model.addAttribute("project", entity);
		} else {
			model.addAttribute("project", new ProjectEntity());
		}
		return "add-edit-project";
	}

	@RequestMapping(path = "/deleteProject/{id}")
	public String deleteProjectById(Model model, @PathVariable("id") Integer id)
			throws RecordNotFoundException
	{
		projectService.deleteProjectById(id);
		return "redirect:/listProject";
	}

	@RequestMapping(path = "/createProject", method = RequestMethod.POST)
	public String createOrUpdateProject(ProjectEntity project)
	{
		projectService.createOrUpdateProject(project);
		return "redirect:/listProject";
	}

	/**
	 * Reports
	 **/

	@RequestMapping(path = "/reports")
	public String getReportsParams(Model model)
	{
		List<ReportEntity> list = reportService.getReports();
		model.addAttribute("reports", list);

		return "list-reports";
	}
}
