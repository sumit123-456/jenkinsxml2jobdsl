package com.fergalgribben.jenkinsxml2jobdsl.xml.model.project;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class MavenProjectGlobalSettings implements Buildable{
	@XmlAttribute(name="class")
	public String clazz;

	@Override
	public void build(Builder builder) {
		// TODO Auto-generated method stub
		
	}
}
