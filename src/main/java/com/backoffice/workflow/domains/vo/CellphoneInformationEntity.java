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
@Entity(name="tb_temporary_customer_cellphone_information")
public class CellphoneInformationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_cellphone", nullable = false)
  private Long idCellphone;

  @Column(name = "token", updatable = false, nullable = false)
  private String token;
}
