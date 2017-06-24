package com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.scm;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SCMTrigger implements Buildable {

	public String spec;
	public boolean ignorePostCommitHooks;
	@Override
	public void build(Builder builder) {
		
		if (ignorePostCommitHooks){
			builder.createMethod("scm").withStringParameter(spec).endMethodAndOpenClosure();
			builder.createMethod("ignorePostCommitHooks").endMethod();
			builder.closeClosure();
		}
		else {
			builder.createMethod("scm").withStringParameter(spec).endMethod();
		}
		
	}
}
