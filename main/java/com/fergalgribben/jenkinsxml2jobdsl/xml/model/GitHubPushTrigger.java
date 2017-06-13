package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class GitHubPushTrigger implements Buildable{

	@XmlAttribute
	public String plugin;

	@Override
	public void build(Builder builder) {
		builder.createMethod("githubPush").endMethod();
	}
	
	
}
