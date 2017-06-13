package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class PreBuildMerge implements Buildable{
	
	public PreBuildMergeOptions options;


	@Override
	public void build(Builder builder) {
		builder.create("mergeOptions").openClosure();
		builder.createMethod("branch").withStringParameter(options.mergeTarget).endMethod();
		builder.createMethod("fastForwardMode").withConstantParameter("FastForwardMergeMode."+options.fastForwardMode).endMethod();
		builder.createMethod("remote").withStringParameter(options.mergeRemote).endMethod();
		builder.createMethod("strategy").withStringParameter(options.mergeStrategy).endMethod();
		builder.closeClosure();
	}
}
