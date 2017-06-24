package com.fergalgribben.jenkinsxml2jobdsl.xml.model.triggers.timer;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class TimerTrigger implements Buildable {

	public String spec;

	@Override
	public void build(Builder builder) {
		builder.createMethod("cron").withStringParameter(spec).endMethod();
		
	}
}
