package com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.BooleanParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.CVSTagsParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.ChoiceParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.CredentialsParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.FileParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.ListSubversionTagsParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.PasswordParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.RunParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.StringParameterDefinition;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.properties.parametersdefinition.parameters.TextParameterDefinition;

public class ParameterDefinitions implements Buildable{

	@XmlElements({
		@XmlElement(name="hudson.model.StringParameterDefinition", type=StringParameterDefinition.class),
		@XmlElement(name="hudson.model.FileParameterDefinition", type=FileParameterDefinition.class),
		@XmlElement(name="hudson.model.BooleanParameterDefinition", type=BooleanParameterDefinition.class),
		@XmlElement(name="hudson.scm.CvsTagsParamDefinition", type=CVSTagsParameterDefinition.class),
		@XmlElement(name="hudson.model.ChoiceParameterDefinition", type=ChoiceParameterDefinition.class),
		@XmlElement(name="hudson.model.TextParameterDefinition", type=TextParameterDefinition.class),
		@XmlElement(name="hudson.model.RunParameterDefinition", type=RunParameterDefinition.class),
		@XmlElement(name="hudson.model.PasswordParameterDefinition", type=PasswordParameterDefinition.class),
		@XmlElement(name="com.cloudbees.plugins.credentials.CredentialsParameterDefinition", type=CredentialsParameterDefinition.class),
		@XmlElement(name="hudson.scm.listtagsparameter.ListSubversionTagsParameterDefinition", type=ListSubversionTagsParameterDefinition.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(Builder builder) {
		builder.create("parameters").openClosure();
		
		for (Buildable parameter : elements){
			parameter.build(builder);
		}
		
		builder.closeClosure();
	}
}
