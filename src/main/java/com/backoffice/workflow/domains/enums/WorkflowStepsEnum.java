package com.backoffice.workflow.domains.enums;

public enum WorkflowStepsEnum {

  PERSONAL_REGISTRATION   ("com.backoffice.workflow.services.workflow.PersonalRegistrationWorkflowService"),
  EMAIL_REGISTRATION      ("com.backoffice.workflow.services.workflow.EmailRegistrationWorkflowService"),
  CELLPHONE_REGISTRATION  ("com.backoffice.workflow.services.workflow.CellPhoneRegistrationWorkflowService"),
  ADDRESS_REGISTRATION    ("com.backoffice.workflow.services.workflow.AddressRegistrationWorkflowService");

  private final String step;

  WorkflowStepsEnum(String step){
    this.step = step;
  }

  public String getEnumValue(){
    return this.step;
  }
}
