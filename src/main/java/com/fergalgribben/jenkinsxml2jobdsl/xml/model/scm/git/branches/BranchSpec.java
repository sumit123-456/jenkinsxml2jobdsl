package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git.branches;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class BranchSpec implements Buildable{
	public String name;

	@Override
	public void build(Builder builder) {
		builder.withStringParameter(name);
		
	}

}
