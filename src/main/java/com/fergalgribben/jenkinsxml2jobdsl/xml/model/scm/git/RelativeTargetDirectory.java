package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class RelativeTargetDirectory implements Buildable{
	
	public String relativeTargetDir;

	@Override
	public void build(Builder builder) {
		builder.createMethod("relativeTargetDirectory").withStringParameter(relativeTargetDir).endMethod();
	}

}
