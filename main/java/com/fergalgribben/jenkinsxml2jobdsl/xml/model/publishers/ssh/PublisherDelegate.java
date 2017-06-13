package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.ssh;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class PublisherDelegate implements Buildable{
	
	public SSHPublishers publishers;
	
	public boolean continueOnError;
	public boolean failOnError;
	public boolean alwaysPublishFromMaster;
	public ParamPublish paramPublish;
	public PublisherHostConfigurationAccess hostConfigurationAccess;
	
	@Override
	public void build(Builder builder) {
		builder.create("publishOverSsh").openClosure();
		builder.createMethod("alwaysPublishFromMaster").withBooleanParameter(alwaysPublishFromMaster).endMethod();
		builder.createMethod("continueOnError").withBooleanParameter(continueOnError).endMethod();
		builder.createMethod("failOnError").withBooleanParameter(failOnError).endMethod();
		builder.createMethod("parameterizedPublishing").withStringParameter(paramPublish.parameterName).endMethod();
		
		publishers.build(builder);
		
		builder.closeClosure();
		
	}

}
