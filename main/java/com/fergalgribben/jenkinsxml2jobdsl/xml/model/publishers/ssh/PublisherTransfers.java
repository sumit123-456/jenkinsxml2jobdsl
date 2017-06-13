package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.ssh;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class PublisherTransfers implements Buildable{

	@XmlElements({
		@XmlElement(name="jenkins.plugins.publish__over__ssh.BapSshTransfer", type=SSHPublisherTransfer.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(Builder builder) {
		for (Buildable tro : elements){
			tro.build(builder);
		}
		
	}
}
