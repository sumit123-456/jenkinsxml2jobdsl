package com.fergalgribben.jenkinsxml2jobdsl.xml.model.wrappers;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class TimestamperBuildWrapper implements Buildable{

	@XmlAttribute
	public String plugin;
	
	@Override
	public void build(Builder builder) {
		builder.createMethod("timestamps").endMethod();
	}

}
