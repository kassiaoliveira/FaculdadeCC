package com.unifg.girah.repository;

import com.unifg.girah.model.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity, Integer> {
}
