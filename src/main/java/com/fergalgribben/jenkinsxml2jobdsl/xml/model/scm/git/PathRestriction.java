package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class PathRestriction implements Buildable{

	public String includedRegions;
	public String excludedRegions;
	
	@Override
	public void build(Builder builder) {
		// TODO Unsipported
		
	}
}
