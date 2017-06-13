package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ParameterizedBuildTriggerConfigCurrentBuildParameters implements Buildable{

	@Override
	public void build(Builder builder) {
		builder.createMethod("currentBuild").endMethod();
		
	}

}
