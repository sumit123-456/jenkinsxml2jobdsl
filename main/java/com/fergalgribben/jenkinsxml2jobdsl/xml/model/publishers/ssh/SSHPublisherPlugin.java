package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.ssh;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SSHPublisherPlugin implements Buildable{

	@XmlAttribute
	public String plugin;
	
	public String consolePrefix;
	
	public PublisherDelegate delegate;

	@Override
	public void build(Builder builder) {
		delegate.build(builder);
		
	}
	
	
}
