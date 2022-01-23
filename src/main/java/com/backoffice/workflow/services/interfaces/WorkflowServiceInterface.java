package com.backoffice.workflow.services.interfaces;

import com.backoffice.workflow.dto.WorkflowDto;

public interface WorkflowServiceInterface {

  void callTargetWorkflowStepByReflection(WorkflowDto workflowBody);
}
