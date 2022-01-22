package com.backoffice.workflow.services.interfaces;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;

public interface WorkflowServiceInterface {

  void callTargetWorkflowStepByReflection(WorkflowStepsEnum targetStep);
}
