package com.backoffice.workflow.controllers;

import com.backoffice.workflow.dto.*;

import com.backoffice.workflow.services.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/v1/backoffice/personal-information")
public class PersonalInformationController {

  private final PersonalInformationService personalInformationService;

  @Autowired
  public PersonalInformationController(PersonalInformationService personalInformationService){
    this.personalInformationService = personalInformationService;
  }

  @PostMapping
  public void processWorkflowToSavePersonalInformation(@RequestBody EnvelopedDataDto<PersonalInformationDto> personalRegistrationDto) {
    this.personalInformationService.saveCustomerPersonalInformation(personalRegistrationDto.getData());
  }

  @GetMapping("/{workflow_token}")
  public void getCustomerByWorkflowToken(@PathVariable(name="workflow_token")  EnvelopedDataDto<String> workflowToken) {
    this.personalInformationService.getCustomerByWorkflowToken(workflowToken.getData());
  }

}
