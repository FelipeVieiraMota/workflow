package com.backoffice.workflow.services;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;
import com.backoffice.workflow.services.interfaces.WorkflowServiceInterface;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

@Service
public class WorkflowService implements WorkflowServiceInterface {

  @Override
  public void callTargetWorkflowStepByReflection(WorkflowStepsEnum workflowStepsEnum) {
    try{

      var targetStep =  workflowStepsEnum.getEnumValue();
      var classToProcess = Class.forName(targetStep);
      var methods = classToProcess.getMethods();

      for (var method : methods) {
        if (method.getName() == "process") {
          var parameter = method.getParameters()[0];
          var methodToInvoke = classToProcess.getMethod("process", parameter.getClass());
          //methodToInvoke.invoke();
        }
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }  catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
