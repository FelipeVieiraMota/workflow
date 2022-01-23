package com.backoffice.workflow.services.workflow;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;
import com.backoffice.workflow.dto.WorkflowDto;
import com.backoffice.workflow.services.interfaces.WorkflowServiceInterface;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class WorkflowService implements WorkflowServiceInterface {

  @Override
  public void callTargetWorkflowStepByReflection(WorkflowDto workflowDto) {
    try
    {
      var targetStep =  workflowDto.getWorkflowStep().getEnumValue();
      var classToProcess = Class.forName(targetStep);
      var workflow = classToProcess.getDeclaredConstructor().newInstance();
      var methodToInvoke = classToProcess.getMethod("process", WorkflowDto.class);
      var nextStep = (WorkflowStepsEnum) methodToInvoke.invoke(workflow, workflowDto);
      if (nextStep != null){
        workflowDto.setWorkflowStep(nextStep);
        callTargetWorkflowStepByReflection(workflowDto);
      }
    } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
