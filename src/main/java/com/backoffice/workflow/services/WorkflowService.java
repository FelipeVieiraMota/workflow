package com.backoffice.workflow.services;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;
import com.backoffice.workflow.services.interfaces.WorkflowServiceInterface;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class WorkflowService implements WorkflowServiceInterface {

  @Override
  public void callTargetWorkflowStepByReflection(String targetStep) {
    try{
      var classToCall = Class.forName(targetStep);
      var workflow = classToCall.getDeclaredConstructor().newInstance();
      var process = classToCall.getMethod("process");
      process.invoke(workflow);
      var getNextStep = classToCall.getMethod("getNextStep");
      var nextStep = (WorkflowStepsEnum) getNextStep.invoke(workflow);
      if (nextStep != null)
        callTargetWorkflowStepByReflection(nextStep.getEnumValue());
    }catch(ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException ex){
      System.out.println("Error: " + ex);
    }
  }
}
