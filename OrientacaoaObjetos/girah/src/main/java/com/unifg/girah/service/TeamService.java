package com.unifg.girah.service;

import com.unifg.girah.exception.RecordNotFoundException;
import com.unifg.girah.model.TeamEntity;
import com.unifg.girah.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    TeamRepository repository;

    public List<TeamEntity> getAllTeams()
    {
        List<TeamEntity> result = (List<TeamEntity>) repository.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<TeamEntity>();
        }
    }

    public TeamEntity getTeamById(Integer id) throws RecordNotFoundException
    {
        Optional<TeamEntity> team = repository.findById(id);

        if(team.isPresent()) {
            return team.get();
        } else {
            throw new RecordNotFoundException("No team record exist for given id");
        }
    }

    public TeamEntity createOrUpdateTeam(TeamEntity entity)
    {
        if(entity.getCode()  == null)
        {
            entity = repository.save(entity);

            return entity;
        }
        else
        {
            Optional<TeamEntity> team = repository.findById(entity.getCode());

            if(team.isPresent())
            {
                TeamEntity newEntity = team.get();
                newEntity.setCode(entity.getCode());
                newEntity.setName(entity.getName());

                newEntity = repository.save(newEntity);

                return newEntity;
            } else {
                entity = repository.save(entity);

                return entity;
            }
        }
    }

    public void deleteTeamById(Integer id) throws RecordNotFoundException
    {
        Optional<TeamEntity> team = repository.findById(id);

        if(team.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No team record exist for given id");
        }
    }
}
