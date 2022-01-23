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
public class CellphoneInformationDto extends WorkflowDto {

  @JsonProperty(value = "id_cellphone")
  Long idCellphone;

  @JsonProperty(value = "token")
  String token;

  @JsonProperty(value = "cellphone")
  String cellphone;

  @JsonProperty(value = "is_main_cellphone")
  boolean isMainCellphone;

}
