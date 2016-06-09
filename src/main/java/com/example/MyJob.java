package com.example;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob extends QuartzJobBean {

	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}



	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		service.execute();
	}

	
}
