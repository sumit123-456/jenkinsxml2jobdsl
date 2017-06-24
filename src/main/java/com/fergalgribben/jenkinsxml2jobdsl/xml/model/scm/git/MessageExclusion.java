package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class MessageExclusion implements Buildable{

	public String excludedMessage;
	
	@Override
	public void build(Builder builder) {
		// TODO Unsipported
		
	}
}
