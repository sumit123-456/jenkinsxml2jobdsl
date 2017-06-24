package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class UserExclusion implements Buildable{
	public String excludedUsers;

	@Override
	public void build(Builder builder) {
		// TODO Unsipported
		
	}
}
