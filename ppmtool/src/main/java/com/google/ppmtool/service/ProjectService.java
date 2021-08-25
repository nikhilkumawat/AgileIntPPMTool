package com.google.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.ppmtool.domain.Project;
import com.google.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Project saveOrUpdateProject(Project project) {
		
		// Logic 
		return projectRepository.save(project);
	}
	
}
