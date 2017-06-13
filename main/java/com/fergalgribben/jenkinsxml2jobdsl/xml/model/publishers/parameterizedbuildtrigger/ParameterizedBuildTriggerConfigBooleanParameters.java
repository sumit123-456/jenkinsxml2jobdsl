package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ParameterizedBuildTriggerConfigBooleanParameters implements Buildable{

	public BuildTriggerConfigBooleanParametersConfigs configs;

	@Override
	public void build(Builder builder) {
		configs.build(builder);
		
	}
}
