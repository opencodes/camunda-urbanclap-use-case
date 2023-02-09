package com.rkjha.workflow.controller;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("logger")
public class ConsoleLoggerDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        System.out.printf(execution.getCurrentActivityName());
        System.out.printf(execution.getCurrentActivityName());
        System.out.printf(execution.getCurrentActivityId());
        System.out.printf(execution.getProcessInstanceId());
    }

}
