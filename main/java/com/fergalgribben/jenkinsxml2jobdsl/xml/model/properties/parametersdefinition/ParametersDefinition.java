package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ParametersDefinition implements Buildable{

	public ParameterDefinitions parameterDefinitions;

	@Override
	public void build(Builder builder) {
		parameterDefinitions.build(builder);
		
	}
}
