package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.userremoteconfigs.UserRemoteConfig;

public class UserRemoteConfigs implements Buildable{

	@XmlElements({
       @XmlElement(name="hudson.plugins.git.UserRemoteConfig", type=UserRemoteConfig.class)
    })
	public List<Buildable> elements;

	@Override
	public void build(Builder builder) {
		for (Buildable urc : elements){
			urc.build(builder);
		}
	}
}
