package com.fergalgribben.jenkinsxml2jobdsl.xml.model.project;

import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;
import com.fergalgribben.jenkinsxml2jobdsl.xml.Parser;

@XmlRootElement(name=Parser.PIPELINE_PROJECT_TYPE) 
public class PipelineProject extends BaseProject{
	
	@XmlAttribute
	public String plugin; 

	@Override
	public void build(Builder builder) {
		builder.createMethod("pipelineJob").withStringParameter(name).endMethodAndOpenClosure();
		
		super.build(builder);
		
		builder.closeClosure();
		
	}


	@Override
	public Set<String> getDownstreamJobs() {
		// TODO Auto-generated method stub
		return null;
	}

}
