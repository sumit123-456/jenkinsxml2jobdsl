package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class FileParameterDefinition implements Buildable{

	public String name;
	public String description;
	
	@Override
	public void build(Builder builder) {
		builder.createMethod("fileParam").withStringParameter(name).withStringParameter(description).endMethod();
	}
}
