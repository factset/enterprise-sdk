/*
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPAREngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SPAREngine.models.Error;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPAREngine.JSON;


/**
 * CalculationUnitStatus
 */
@JsonPropertyOrder({
  CalculationUnitStatus.JSON_PROPERTY_STATUS,
  CalculationUnitStatus.JSON_PROPERTY_ERRORS,
  CalculationUnitStatus.JSON_PROPERTY_RESULT,
  CalculationUnitStatus.JSON_PROPERTY_PROGRESS,
  CalculationUnitStatus.JSON_PROPERTY_POINTS,
  CalculationUnitStatus.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationUnitStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The status of calculation unit.
   */
  public enum StatusEnum {
    QUEUED("Queued"),
    
    EXECUTING("Executing"),
    
    SUCCESS("Success"),
    
    FAILED("Failed"),
    
    CANCELLED("Cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<java.util.List<Error>> errors = JsonNullable.<java.util.List<Error>>undefined();

  public static final String JSON_PROPERTY_RESULT = "result";
  private JsonNullable<String> result = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private JsonNullable<String> progress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POINTS = "points";
  private JsonNullable<Integer> points = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private JsonNullable<java.util.List<String>> warnings = JsonNullable.<java.util.List<String>>undefined();

  public CalculationUnitStatus() { 
  }

  public CalculationUnitStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of calculation unit.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The status of calculation unit.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CalculationUnitStatus errors(java.util.List<Error> errors) {
    this.errors = JsonNullable.<java.util.List<Error>>of(errors);
    return this;
  }

  public CalculationUnitStatus addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<java.util.List<Error>>of(new java.util.ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The error in a calculation unit.
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The error in a calculation unit.")
  @JsonIgnore

  public java.util.List<Error> getErrors() {
        return errors.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<Error>> getErrors_JsonNullable() {
    return errors;
  }
  
  @JsonProperty(JSON_PROPERTY_ERRORS)
  public void setErrors_JsonNullable(JsonNullable<java.util.List<Error>> errors) {
    this.errors = errors;
  }

  public void setErrors(java.util.List<Error> errors) {
    this.errors = JsonNullable.<java.util.List<Error>>of(errors);
  }


  public CalculationUnitStatus result(String result) {
    this.result = JsonNullable.<String>of(result);
    return this;
  }

   /**
   * The result URL of the calculation.
   * @return result
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The result URL of the calculation.")
  @JsonIgnore

  public String getResult() {
        return result.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getResult_JsonNullable() {
    return result;
  }
  
  @JsonProperty(JSON_PROPERTY_RESULT)
  public void setResult_JsonNullable(JsonNullable<String> result) {
    this.result = result;
  }

  public void setResult(String result) {
    this.result = JsonNullable.<String>of(result);
  }


  public CalculationUnitStatus progress(String progress) {
    this.progress = JsonNullable.<String>of(progress);
    return this;
  }

   /**
   * The progress of the calculation unit.
   * @return progress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The progress of the calculation unit.")
  @JsonIgnore

  public String getProgress() {
        return progress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProgress_JsonNullable() {
    return progress;
  }
  
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  public void setProgress_JsonNullable(JsonNullable<String> progress) {
    this.progress = progress;
  }

  public void setProgress(String progress) {
    this.progress = JsonNullable.<String>of(progress);
  }


  public CalculationUnitStatus points(Integer points) {
    this.points = JsonNullable.<Integer>of(points);
    return this;
  }

   /**
   * The points for the calculation unit.
   * @return points
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The points for the calculation unit.")
  @JsonIgnore

  public Integer getPoints() {
        return points.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPoints_JsonNullable() {
    return points;
  }
  
  @JsonProperty(JSON_PROPERTY_POINTS)
  public void setPoints_JsonNullable(JsonNullable<Integer> points) {
    this.points = points;
  }

  public void setPoints(Integer points) {
    this.points = JsonNullable.<Integer>of(points);
  }


  public CalculationUnitStatus warnings(java.util.List<String> warnings) {
    this.warnings = JsonNullable.<java.util.List<String>>of(warnings);
    return this;
  }

  public CalculationUnitStatus addWarningsItem(String warningsItem) {
    if (this.warnings == null || !this.warnings.isPresent()) {
      this.warnings = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.warnings.get().add(warningsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The warnings in a calculation unit.
   * @return warnings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The warnings in a calculation unit.")
  @JsonIgnore

  public java.util.List<String> getWarnings() {
        return warnings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getWarnings_JsonNullable() {
    return warnings;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  public void setWarnings_JsonNullable(JsonNullable<java.util.List<String>> warnings) {
    this.warnings = warnings;
  }

  public void setWarnings(java.util.List<String> warnings) {
    this.warnings = JsonNullable.<java.util.List<String>>of(warnings);
  }


  /**
   * Return true if this CalculationUnitStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationUnitStatus calculationUnitStatus = (CalculationUnitStatus) o;
    return Objects.equals(this.status, calculationUnitStatus.status) &&
        equalsNullable(this.errors, calculationUnitStatus.errors) &&
        equalsNullable(this.result, calculationUnitStatus.result) &&
        equalsNullable(this.progress, calculationUnitStatus.progress) &&
        equalsNullable(this.points, calculationUnitStatus.points) &&
        equalsNullable(this.warnings, calculationUnitStatus.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, hashCodeNullable(errors), hashCodeNullable(result), hashCodeNullable(progress), hashCodeNullable(points), hashCodeNullable(warnings));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationUnitStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

