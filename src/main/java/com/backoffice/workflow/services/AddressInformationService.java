package com.backoffice.workflow.services;

import com.backoffice.workflow.dto.AddressRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressInformationService {

  public void saveCustomerAddressInformation(List<AddressRegistrationDto> listAddressRegistrationDto){}

  public void getCustomerByWorkflowToken(String workflowToken){}
}
