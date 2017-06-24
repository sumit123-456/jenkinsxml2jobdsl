package com.fergalgribben.jenkinsxml2jobdsl.xml.model.builders.ssh;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SSHBuilderPlugin implements Buildable{
	
	public SSHBuilderWrapperDelegate delegate;

	@Override
	public void build(Builder builder) {
		delegate.build(builder);
	}
	
	
	

}
