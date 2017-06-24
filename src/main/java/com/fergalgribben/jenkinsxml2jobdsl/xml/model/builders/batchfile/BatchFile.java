package com.fergalgribben.jenkinsxml2jobdsl.xml.model.builders.batchfile;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class BatchFile implements Buildable{
	public String command;

	@Override
	public void build(Builder builder) {
		builder.createMethod("batchFile").withStringParameter(command).endMethod();
		
	}
}
