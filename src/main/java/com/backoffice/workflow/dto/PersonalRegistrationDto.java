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
public class PersonalRegistrationDto extends WorkflowDto {

  @JsonProperty(value = "id_customer")
  Long idCustomer;

  @JsonProperty(value = "customer_token")
  String customerToken;

  @JsonProperty(value = "first_name")
  String firstName;

  @JsonProperty(value = "last_name")
  String lastName;

  @JsonProperty(value = "nif")
  String nif;

  @JsonProperty(value = "age")
  int age;
}
