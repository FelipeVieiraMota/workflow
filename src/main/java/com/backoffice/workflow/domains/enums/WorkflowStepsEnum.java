package com.backoffice.workflow.domains.enums;

public enum WorkflowStepsEnum {

  //SERVICE_PATH            ("com.backoffice.workflow.services"),
  PERSONAL_REGISTRATION   ("com.backoffice.workflow.services.PersonalRegistrationService"),
  EMAIL_REGISTRATION      ("com.backoffice.workflow.services.EmailRegistrationService"),
  CELLPHONE_REGISTRATION  ("com.backoffice.workflow.services.CellPhoneRegistrationService"),
  ADDRESS_REGISTRATION    ("com.backoffice.workflow.services.AddressRegistrationService");

  private final String step;

  WorkflowStepsEnum(String step){
    this.step = step;
  }

  public String getEnumValue(){
    return this.step;
  }
}
