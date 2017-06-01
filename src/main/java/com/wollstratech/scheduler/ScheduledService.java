package com.wollstratech.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {
	
	@Scheduled(fixedRateString = "${fixedDelay.in.milliseconds}")
	public void scheduleFixedRateTask() {
		//call relevant method
	    System.out.println(
	      "Fixed rate task - " + System.currentTimeMillis() / 1000);
	}
}
