package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.reversebuild.ReverseBuildTrigger;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.scm.SCMTrigger;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.timer.TimerTrigger;

@XmlRootElement(name="triggers") 
public class Triggers implements Buildable{

	@XmlElements({
	       @XmlElement(name="jenkins.triggers.ReverseBuildTrigger", type=ReverseBuildTrigger.class),
	       @XmlElement(name="hudson.triggers.TimerTrigger", type=TimerTrigger.class),
	       @XmlElement(name="hudson.triggers.SCMTrigger", type=SCMTrigger.class),
	       @XmlElement(name="com.cloudbees.jenkins.GitHubPushTrigger", type=GitHubPushTrigger.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder builder) {
		if (elements != null){
			builder.create("triggers").openClosure();
			for (Buildable tro : elements){
				tro.build(builder);
			}
			builder.closeClosure();
		}
	}
}
