package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.parameterizedbuildtrigger;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class ParameterizedBuildTriggerConfigPredefinedBuildParameters implements Buildable{

	public String properties;

	@Override
	public void build(Builder builder) {
		String [] pplines = properties.split("\n");
		for (String kv : pplines){
			String [] kvp = kv.split("=");
			if (kvp.length >= 2){
				builder.createMethod("predefinedProp").withStringParameter(kvp[0]).withStringParameter(kvp[1]).endMethod();
			}
			else{
				builder.createMethod("predefinedProp").withStringParameter(kvp[0]).withStringParameter("").endMethod();
			}
		}
	}
}
