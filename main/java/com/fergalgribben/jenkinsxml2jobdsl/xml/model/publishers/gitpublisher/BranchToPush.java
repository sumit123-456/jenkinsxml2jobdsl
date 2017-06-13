package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.gitpublisher;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class BranchToPush implements Buildable{
	public String targetRepoName;
	public String branchName;
	@Override
	public void build(Builder builder) {
		builder.createMethod("branch").withStringParameter(targetRepoName).withStringParameter(branchName).endMethod();
		
	}

}
