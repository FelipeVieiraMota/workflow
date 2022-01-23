package com.backoffice.workflow.dto;

import com.backoffice.workflow.domains.enums.WorkflowStepsEnum;
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
public class WorkflowDto {

  @JsonProperty(value = "workflow_step")
  WorkflowStepsEnum workflowStep;

  @JsonProperty(value = "workflow_token")
  String workflowToken;
}
