package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.aggregatedtestresults.AggregatedTestResultPublisher;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.artifactarchiver.ArtifactArchiver;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.buildtrigger.BuildTrigger;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.ccmpublisher.CCMPublisher;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.fingerprinter.FingerPrinter;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.gitpublisher.GitPublisher;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.javadocarchiver.JavadocArchiver;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.junitresult.JUnitResultArchiver;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.mailer.Mailer;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger.ParameterizedBuildTrigger;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.ssh.SSHPublisherPlugin;

@XmlRootElement(name="builders") 
public class Publishers implements Buildable{
	
	@XmlElements({
		@XmlElement(name="hudson.tasks.BuildTrigger", type=BuildTrigger.class),
		@XmlElement(name="hudson.tasks.Mailer", type=Mailer.class),
		@XmlElement(name="hudson.plugins.git.GitPublisher", type=GitPublisher.class),
		@XmlElement(name="hudson.tasks.JavadocArchiver", type=JavadocArchiver.class),
		@XmlElement(name="jenkins.plugins.publish__over__ssh.BapSshPublisherPlugin", type=SSHPublisherPlugin.class),
		@XmlElement(name="hudson.tasks.Fingerprinter", type=FingerPrinter.class),
		@XmlElement(name="hudson.tasks.junit.JUnitResultArchiver", type=JUnitResultArchiver.class),
		@XmlElement(name="hudson.tasks.ArtifactArchiver", type=ArtifactArchiver.class),
		@XmlElement(name="hudson.tasks.test.AggregatedTestResultPublisher", type=AggregatedTestResultPublisher.class),
		@XmlElement(name="hudson.plugins.ccm.CcmPublisher", type=CCMPublisher.class),
		@XmlElement(name="hudson.plugins.parameterizedtrigger.BuildTrigger", type=ParameterizedBuildTrigger.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(Builder builder) {
		if (elements !=null){
			
			builder.create("publishers").openClosure();
			for (Buildable po : elements){
				po.build(builder);
			}
			builder.closeClosure();
		}
		
	}
}
