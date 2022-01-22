package com.backoffice.workflow.controllers;

import com.backoffice.workflow.dto.EnvelopedDataDto;
import com.backoffice.workflow.dto.WorkflowDto;
import com.backoffice.workflow.services.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/backoffice/workflow")
public class WorkflowController {

  private final WorkflowService workflowService;

  @Autowired
  public WorkflowController(WorkflowService workflowService){
    this.workflowService = workflowService;
  }

  @PostMapping
  public void processWorkflow(@RequestBody EnvelopedDataDto<WorkflowDto> workflowBody) {
    var targetStep = workflowBody.getData().getWorkflow_step().getEnumValue();
    this.workflowService.callTargetWorkflowStepByReflection(targetStep);
  }
}
