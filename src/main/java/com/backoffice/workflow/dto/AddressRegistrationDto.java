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

  @JsonProperty(value = "id_address_registration")
  Long idAddressRegistration;

  @JsonProperty(value = "address_token")
  String AddressToken;

  @JsonProperty(value = "main_address")
  boolean mainAddress;
}
