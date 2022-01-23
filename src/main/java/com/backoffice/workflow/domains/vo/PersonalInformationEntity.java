package com.backoffice.workflow.domains.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="tb_temporary_customer_personal_information")
public class PersonalInformationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_customer", nullable = false)
  private Long idCustomer;

  @Column(name = "token", updatable = false, nullable = false)
  private String token;

  @Column(name = "first_name", length = 75, nullable = false)
  private String firstName;

  @Column(name = "last_name", length = 100, nullable = false)
  private String lastName;

  @Column(name = "nif", length = 30, nullable = false)
  private String nif;

  @Column(name = "age", nullable = false)
  int age;

  @Getter(onMethod = @__({@JsonIgnore}))
  @OneToMany(mappedBy = "personalInformationEntity")
  private List<EmailInformationEntity> emailInformationEntity = new ArrayList<>();
}
