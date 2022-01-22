package com.backoffice.workflow.services;

import com.backoffice.workflow.dto.EmailRegistrationDto;
import com.backoffice.workflow.services.interfaces.WorkflowProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class EmailRegistrationService implements WorkflowProcessInterface <EmailRegistrationDto> {
  @Override
  public void process(EmailRegistrationDto emailRegistrationDto) {}
}
