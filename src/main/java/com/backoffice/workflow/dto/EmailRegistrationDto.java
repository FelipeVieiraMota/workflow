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
public class EmailRegistrationDto extends WorkflowDto {

  @JsonProperty(value = "id_email_registration")
  Long idEmailRegistration;

  @JsonProperty(value = "email_token")
  String emailToken;

  @JsonProperty(value = "email")
  String email;

  @JsonProperty(value = "main_email")
  boolean mainEmail;
}
