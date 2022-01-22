package com.backoffice.workflow.services;

import com.backoffice.workflow.dto.PersonalRegistrationDto;
import com.backoffice.workflow.services.interfaces.WorkflowProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class PersonalRegistrationService implements WorkflowProcessInterface <PersonalRegistrationDto>{
  @Override
  public void process(PersonalRegistrationDto personalRegistrationDto) {}
}
