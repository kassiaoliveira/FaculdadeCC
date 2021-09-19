package com.unifg.girah.service;

import com.unifg.girah.exception.RecordNotFoundException;
import com.unifg.girah.model.ProjectEntity;
import com.unifg.girah.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository repository;

    public List<ProjectEntity> getAllProjects()
    {
        List<ProjectEntity> result = (List<ProjectEntity>) repository.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<ProjectEntity>();
        }
    }

    public ProjectEntity getProjectById(Integer id) throws RecordNotFoundException
    {
        Optional<ProjectEntity> project = repository.findById(id);

        if(project.isPresent()) {
            return project.get();
        } else {
            throw new RecordNotFoundException("No project record exist for given id");
        }
    }

    public ProjectEntity createOrUpdateProject(ProjectEntity entity)
    {
        if(entity.getCodProjeto()  == null)
        {
            entity = repository.save(entity);

            return entity;
        }
        else
        {
            Optional<ProjectEntity> project = repository.findById(entity.getCodProjeto());

            if(project.isPresent())
            {
                ProjectEntity newEntity = project.get();
                newEntity.setCodProjeto(entity.getCodProjeto());
                newEntity.setEquipe(entity.getEquipe());
                newEntity.setNomeProjeto(entity.getNomeProjeto());
                newEntity.setDataInicio(entity.getDataInicio());
                newEntity.setDataFim(entity.getDataFim());

                newEntity = repository.save(newEntity);

                return newEntity;
            } else {
                entity = repository.save(entity);

                return entity;
            }
        }
    }

    public void deleteProjectById(Integer id) throws RecordNotFoundException
    {
        Optional<ProjectEntity> project = repository.findById(id);

        if(project.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No project record exist for given id");
        }
    }
}
