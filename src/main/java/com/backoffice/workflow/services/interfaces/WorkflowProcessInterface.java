package com.backoffice.workflow.services.interfaces;

public interface WorkflowProcessInterface <TParameters> {

  void process(TParameters parameters);
}
