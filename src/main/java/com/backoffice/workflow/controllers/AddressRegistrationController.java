package com.backoffice.workflow.controllers;

import com.backoffice.workflow.dto.EnvelopedDataDto;
import com.backoffice.workflow.dto.AddressRegistrationDto;
import com.backoffice.workflow.services.AddressInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/v1/backoffice/address")
public class AddressRegistrationController {

  private final AddressInformationService addressInformationService;

  @Autowired
  public AddressRegistrationController(AddressInformationService addressInformationService){
    this.addressInformationService = addressInformationService;
  }

  @PostMapping
  public void processWorkflowToSaveAddressData(@RequestBody EnvelopedDataDto<List<AddressRegistrationDto>> personalRegistrationDto) {
    this.addressInformationService.saveCustomerAddressInformation(personalRegistrationDto.getData());
  }


  @GetMapping("/{workflow_token}")
  public void getCustomerByWorkflowToken(@PathVariable(name="workflow_token")  EnvelopedDataDto<String> workflowToken) {
    this.addressInformationService.getCustomerByWorkflowToken(workflowToken.getData());
  }

}
