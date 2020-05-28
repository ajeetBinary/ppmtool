package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

	//new addition
	ProjectTask findByProjectSequence(String sequence);
	List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);
	
}
