package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.wrappers.PreBuildCleanup;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.wrappers.TimestamperBuildWrapper;

@XmlRootElement(name="buildWrappers") 
public class BuildWrappers implements Buildable{
	

	@XmlElements({
		@XmlElement(name="hudson.plugins.ws__cleanup.PreBuildCleanup", type=PreBuildCleanup.class),
		@XmlElement(name="hudson.plugins.timestamper.TimestamperBuildWrapper", type=TimestamperBuildWrapper.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder builder) {
		if (elements != null){
			builder.create("wrappers").openClosure();
			for (Buildable b : elements){
				b.build(builder);
			}
			builder.closeClosure();
		}
	}
}
