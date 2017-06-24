package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class CVSTagsParameterDefinition implements Buildable{

	@XmlAttribute
	public String plugin;
	
	public String name;
	public String cvsRoot;
	public String password;
	public String moduleName;
	public boolean passwordRequired;
	@Override
	public void build(Builder builder) {
		// TODO Auto-generated method stub
		
	}
}
