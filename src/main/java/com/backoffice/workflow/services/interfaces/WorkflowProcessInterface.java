package com.backoffice.workflow.services.interfaces;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;

public interface WorkflowProcessInterface <TParameters, TResult> {
  TResult process(TParameters parameters);
}
