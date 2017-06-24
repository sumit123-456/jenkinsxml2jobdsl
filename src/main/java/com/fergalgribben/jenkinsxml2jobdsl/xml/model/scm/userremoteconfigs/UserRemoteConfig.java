package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.userremoteconfigs;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class UserRemoteConfig implements Buildable{

	public String name;
	public String refspec;
	public String url;
	public String credentialsId;
	
	@Override
	public void build(Builder builder) {
		builder.create("remote").openClosure();
		
		builder.createMethod("url").withStringParameter(url).endMethod();
		builder.createMethod("credentials").withStringParameter(credentialsId).endMethod();
		builder.createMethod("name").withStringParameter(name).endMethod();
		builder.createMethod("refspec").withStringParameter(refspec).endMethod();
		
		builder.closeClosure();
	}
}
