package com.backoffice.workflow.services.interfaces;

public interface WorkflowServiceInterface {

  void callTargetWorkflowStepByReflection(String targetStep);
}
