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
@Entity(name="tb_temporary_customer_email_information")
public class EmailInformationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_customer", nullable = false)
  private Long idCustomer;

  @Column(name = "token", updatable = false, nullable = false)
  private String token;

  @ManyToOne
  @JoinColumn(name="id_customer", nullable = false)
  private PersonalInformationEntity personalInformationEntity;
}
