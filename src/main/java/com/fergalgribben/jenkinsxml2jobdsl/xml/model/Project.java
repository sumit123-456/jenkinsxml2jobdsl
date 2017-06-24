package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import java.util.Set;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;

public interface Project extends Buildable{

	public void setName(String name);
	
	public Set<String> getDownstreamJobs();
}
