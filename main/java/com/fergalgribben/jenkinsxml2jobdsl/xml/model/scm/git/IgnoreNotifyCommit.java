package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class IgnoreNotifyCommit implements Buildable{

	@Override
	public void build(Builder builder) {
		builder.createMethod("ignoreNotifyCommit").endMethod();
		
	}

}
