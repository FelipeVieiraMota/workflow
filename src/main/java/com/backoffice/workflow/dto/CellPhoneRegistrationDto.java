package com.backoffice.workflow.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellPhoneRegistrationDto extends WorkflowDto {

  @JsonProperty(value = "id_cellphone_registration")
  Long idCellphoneRegistration;

  @JsonProperty(value = "cellphone_token")
  String cellphoneToken;

  @JsonProperty(value = "cellphone")
  String cellphone;

  @JsonProperty(value = "main_cellphone")
  boolean mainCellphone;

}
