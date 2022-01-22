package com.backoffice.workflow.services;

import com.backoffice.workflow.dto.AddressRegistrationDto;
import com.backoffice.workflow.services.interfaces.WorkflowProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class AddressRegistrationService implements WorkflowProcessInterface <AddressRegistrationDto> {
  @Override
  public void process(AddressRegistrationDto addressRegistrationDto) {}
}
