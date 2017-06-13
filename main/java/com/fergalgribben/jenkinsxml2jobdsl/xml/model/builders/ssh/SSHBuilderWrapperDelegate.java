package com.fergalgribben.jenkinsxml2jobdsl.xml.model.builders.ssh;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SSHBuilderWrapperDelegate implements Buildable{

	@XmlAttribute
	public String plugin;
	
	public String consolePrefix;
	
	public BuilderDelegate delegate;

	@Override
	public void build(Builder builder) {
		delegate.build(builder);
		
	}
	
	
}
