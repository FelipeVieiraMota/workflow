package com.backoffice.workflow.services.workflow;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;
import com.backoffice.workflow.dto.WorkflowDto;
import com.backoffice.workflow.services.interfaces.WorkflowProcessInterface;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AddressRegistrationWorkflowService implements WorkflowProcessInterface <WorkflowDto, WorkflowStepsEnum>{

  private final WorkflowStepsEnum nextStep = null;

  @Override
  public WorkflowStepsEnum process(WorkflowDto workflowDto) {
    System.out.println("************************************************");
    System.out.println("It works here in AddressRegistrationWorkflowService !");
    System.out.println("************************************************");
    System.out.println("Token " + workflowDto.getWorkflowToken());
    System.out.println("Next Step is " + getNextStep());
    System.out.println("************************************************");
    return getNextStep();
  }
}