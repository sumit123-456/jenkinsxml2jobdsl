package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ParameterizedBuildTriggerConfigMatrixSubsetBuildParameters implements Buildable{

	public String filter;

	@Override
	public void build(Builder builder) {
		builder.createMethod("matrixSubset").withStringParameter(filter).endMethod();
		
	}
}
