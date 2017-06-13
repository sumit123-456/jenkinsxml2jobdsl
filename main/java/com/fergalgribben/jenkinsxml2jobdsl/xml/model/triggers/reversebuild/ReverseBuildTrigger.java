package com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.reversebuild;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ReverseBuildTrigger implements Buildable {

	public String spec;
	public String upstreamProjects;
	public BuildThreshold threshold;
	@Override
	public void build(Builder builder) {
		builder.createMethod("upstream").withStringParameter(upstreamProjects).withStringParameter(threshold.name).endMethod();
		
	}
}
