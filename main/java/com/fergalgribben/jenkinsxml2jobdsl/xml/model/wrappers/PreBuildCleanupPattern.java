package com.fergalgribben.jenkinsxml2jobdsl.xml.model.wrappers;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class PreBuildCleanupPattern implements Buildable{
	public String pattern;
	public String type;
	
	@Override
	public void build(Builder builder) {
		builder.createMethod(type.toLowerCase()+"Pattern").withStringParameter(pattern).endMethod();
	}
}
