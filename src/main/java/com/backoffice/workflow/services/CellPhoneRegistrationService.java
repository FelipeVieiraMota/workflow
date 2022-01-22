package com.backoffice.workflow.services;

import com.backoffice.workflow.dto.CellPhoneRegistrationDto;
import com.backoffice.workflow.services.interfaces.WorkflowProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class CellPhoneRegistrationService implements WorkflowProcessInterface<CellPhoneRegistrationDto> {
  @Override
  public void process(CellPhoneRegistrationDto cellPhoneRegistrationDto) {}
}