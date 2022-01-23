package com.backoffice.workflow.controllers;

import com.backoffice.workflow.dto.EnvelopedDataDto;
import com.backoffice.workflow.dto.EmailInformationDto;
import com.backoffice.workflow.services.EmailInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/v1/backoffice/email")
public class EmailInformationController {

  private final EmailInformationService emailInformationService;

  @Autowired
  public EmailInformationController(EmailInformationService emailInformationService){
    this.emailInformationService = emailInformationService;
  }

  @PostMapping
  public void processWorkflowToSaveEmailData(@RequestBody EnvelopedDataDto<List<EmailInformationDto>> listEmailRegistrationDto) {
    this.emailInformationService.saveCustomerEmailInformation(listEmailRegistrationDto.getData());
  }

  @GetMapping("/{workflow_token}")
  public void getCustomerByWorkflowToken(@PathVariable(name="workflow_token")  EnvelopedDataDto<String> workflowToken) {
    this.emailInformationService.getCustomerByWorkflowToken(workflowToken.getData());
  }

}
