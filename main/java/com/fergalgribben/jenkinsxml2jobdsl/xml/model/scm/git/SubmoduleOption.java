package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SubmoduleOption implements Buildable{
	public boolean disableSubmodules;
	public boolean recursiveSubmodules;
	public boolean trackingSubmodules;
	public String reference;
	public boolean parentCredentials;
	public long timeout;
	@Override
	public void build(Builder builder) {
		builder.create("submoduleOptions").openClosure();
		builder.createMethod("disable").withBooleanParameter(disableSubmodules).endMethod();
		builder.createMethod("parentCredentials").withBooleanParameter(parentCredentials).endMethod();
		builder.createMethod("recursive").withBooleanParameter(recursiveSubmodules).endMethod();
		builder.createMethod("reference").withStringParameter(reference).endMethod();
		builder.createMethod("timeout").withLongParameter(timeout).endMethod();
		builder.createMethod("tracking").withBooleanParameter(trackingSubmodules).endMethod();
		builder.closeClosure();
		
	}
	
}
