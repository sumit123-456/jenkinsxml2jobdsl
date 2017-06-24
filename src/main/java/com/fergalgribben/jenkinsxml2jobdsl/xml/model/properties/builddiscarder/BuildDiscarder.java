package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.builddiscarder;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class BuildDiscarder implements Buildable{

	public Strategy strategy;

	@Override
	public void build(Builder builder) {
		strategy.build(builder);
		
	}
	
	
}
