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

  @JsonProperty(value = "step")
  WorkflowStepsEnum workflow_step;

  @JsonProperty(value = "workflow_token")
  String workflowToken;
}
