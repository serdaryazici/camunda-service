package com.camunda.camundaservice.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendMail implements JavaDelegate{

	private static final Logger log = Logger.getLogger(SendMail.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Boolean isApproved = (Boolean) execution.getVariable("approved");
		if(isApproved)
			log.info("Onay mail servisi çalıştı.");
		else
			log.info("Red mail servisi çalıştı");
	}

}
