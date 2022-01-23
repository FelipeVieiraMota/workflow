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
public class AddressRegistrationDto extends WorkflowDto {

  @JsonProperty(value = "id_address")
  Long idAddress;

  @JsonProperty(value = "token")
  String token;

  @JsonProperty(value = "is_main_address")
  boolean isMainAddress;
}
