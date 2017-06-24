package com.fergalgribben.jenkinsxml2jobdsl.xml.model.builders.shell;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;

public class Shell implements Buildable{
	public String command;

	@Override
	public void build(com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder builder) {
		builder.createMethod("shell").withStringParameter(command).endMethod();
	}
}
