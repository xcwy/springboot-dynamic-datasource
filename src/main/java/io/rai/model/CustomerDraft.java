package io.rai.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by rai on 16/12/25.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerDraft {
  @NotNull
  private String name;

  @NotNull
  @Min(0)
  @Max(128)
  private Integer age;
}
