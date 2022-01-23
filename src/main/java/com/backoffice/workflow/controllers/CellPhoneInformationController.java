package com.backoffice.workflow.controllers;

import com.backoffice.workflow.dto.EnvelopedDataDto;
import com.backoffice.workflow.dto.CellphoneInformationDto;
import com.backoffice.workflow.services.CellPhoneInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/v1/backoffice/cellphone")
public class CellPhoneInformationController {

  private final CellPhoneInformationService cellphoneInformationService;

  @Autowired
  public CellPhoneInformationController(CellPhoneInformationService cellphoneInformationService){
    this.cellphoneInformationService = cellphoneInformationService;
  }

  @PostMapping
  public void processWorkflowToSaveCellPhoneData(@RequestBody EnvelopedDataDto<List<CellphoneInformationDto>> listCellphoneRegistrationDto) {
    this.cellphoneInformationService.saveCustomerCellphoneInformation(listCellphoneRegistrationDto.getData());
  }

  @GetMapping("/{workflow_token}")
  public void getCustomerByWorkflowToken(@PathVariable(name="workflow_token")  EnvelopedDataDto<String> workflowToken) {
    this.cellphoneInformationService.getCustomerByWorkflowToken(workflowToken.getData());
  }
}
