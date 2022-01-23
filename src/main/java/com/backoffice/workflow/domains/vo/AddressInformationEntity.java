package com.backoffice.workflow.domains.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="tb_temporary_customer_address_information")
public class AddressInformationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_address", nullable = false)
  private Long idAddress;

  @Column(name = "token", updatable = false, nullable = false)
  private String token;
}
