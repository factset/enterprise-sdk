/*
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GIPS.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.GIPS.JSON;


/**
 * Details of the calculation
 */
@ApiModel(description = "Details of the calculation")
@JsonPropertyOrder({
  CalculationsSummary.JSON_PROPERTY_STATUS,
  CalculationsSummary.JSON_PROPERTY_UNITS,
  CalculationsSummary.JSON_PROPERTY_REQUEST_TIME,
  CalculationsSummary.JSON_PROPERTY_LAST_POLL_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CalculationsSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Last poll status of the calculation.
   */
  public enum StatusEnum {
    QUEUED("Queued"),
    
    EXECUTING("Executing"),
    
    COMPLETED("Completed"),
    
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

  public static final String JSON_PROPERTY_UNITS = "units";
  private Integer units;

  public static final String JSON_PROPERTY_REQUEST_TIME = "requestTime";
  private OffsetDateTime requestTime;

  public static final String JSON_PROPERTY_LAST_POLL_TIME = "lastPollTime";
  private OffsetDateTime lastPollTime;

  public CalculationsSummary() { 
  }

  public CalculationsSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Last poll status of the calculation.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Last poll status of the calculation.")
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


  public CalculationsSummary units(Integer units) {
    this.units = units;
    return this;
  }

   /**
   * Number of calculation units in batch.
   * @return units
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of calculation units in batch.")
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(Integer units) {
    this.units = units;
  }


  public CalculationsSummary requestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Request time of calculation.
   * @return requestTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Request time of calculation.")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRequestTime() {
    return requestTime;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
  }


  public CalculationsSummary lastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
    return this;
  }

   /**
   * Last poll time of calculation.
   * @return lastPollTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Last poll time of calculation.")
  @JsonProperty(JSON_PROPERTY_LAST_POLL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastPollTime() {
    return lastPollTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_POLL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
  }


  /**
   * Return true if this CalculationsSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationsSummary calculationsSummary = (CalculationsSummary) o;
    return Objects.equals(this.status, calculationsSummary.status) &&
        Objects.equals(this.units, calculationsSummary.units) &&
        Objects.equals(this.requestTime, calculationsSummary.requestTime) &&
        Objects.equals(this.lastPollTime, calculationsSummary.lastPollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, units, requestTime, lastPollTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationsSummary {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    lastPollTime: ").append(toIndentedString(lastPollTime)).append("\n");
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

