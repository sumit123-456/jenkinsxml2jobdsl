package com.fergalgribben.jenkinsxml2jobdsl.xml.model.builders.maven;

import javax.xml.bind.annotation.XmlAttribute;

public class Settings{
	
	@XmlAttribute(name="class")
	public String clazz;
	
	public String path;
}
