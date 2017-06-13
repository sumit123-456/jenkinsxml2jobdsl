package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.fingerprinter;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class FingerPrinter implements Buildable{

	public String targets;

	@Override
	public void build(Builder builder) {
		builder.createMethod("fingerprint").withStringParameter(targets).endMethod();
		
	}
}
