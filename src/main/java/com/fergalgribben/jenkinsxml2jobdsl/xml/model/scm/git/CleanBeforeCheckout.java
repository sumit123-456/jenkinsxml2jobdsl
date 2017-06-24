package com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class CleanBeforeCheckout implements Buildable{

	@Override
	public void build(Builder builder) {
		builder.createMethod("cleanBeforeCheckout").endMethod();
		
	}

}
