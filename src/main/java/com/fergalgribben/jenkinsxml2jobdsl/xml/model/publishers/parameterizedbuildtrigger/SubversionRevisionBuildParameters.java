package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class SubversionRevisionBuildParameters implements Buildable{
	public boolean includeUpstreamParameters;

	@Override
	public void build(Builder builder) {
		builder.createMethod("subversionRevision").withBooleanParameter(includeUpstreamParameters).endMethod();
	}
}
