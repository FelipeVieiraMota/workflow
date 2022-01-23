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
public class EmailInformationDto extends WorkflowDto {

  @JsonProperty(value = "id_email")
  Long idEmail;

  @JsonProperty(value = "token")
  String token;

  @JsonProperty(value = "email")
  String email;

  @JsonProperty(value = "is_main_email")
  boolean isMainEmail;
}
