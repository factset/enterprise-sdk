/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Formula.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Formula.JSON;


/**
 * BatchStatus
 */
@JsonPropertyOrder({
  BatchStatus.JSON_PROPERTY_ID,
  BatchStatus.JSON_PROPERTY_START_TIME,
  BatchStatus.JSON_PROPERTY_END_TIME,
  BatchStatus.JSON_PROPERTY_STATUS,
  BatchStatus.JSON_PROPERTY_ERROR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BatchStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private JsonNullable<OffsetDateTime> startTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private JsonNullable<OffsetDateTime> endTime = JsonNullable.<OffsetDateTime>undefined();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    EXECUTING("EXECUTING"),
    
    DONE("DONE"),
    
    FAILED("FAILED");

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

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public BatchStatus() { 
  }

  public BatchStatus id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * the id of batch request.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "the id of batch request.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public BatchStatus startTime(OffsetDateTime startTime) {
    this.startTime = JsonNullable.<OffsetDateTime>of(startTime);
    return this;
  }

   /**
   * Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.")
  @JsonIgnore

  public OffsetDateTime getStartTime() {
        return startTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartTime_JsonNullable() {
    return startTime;
  }
  
  @JsonProperty(JSON_PROPERTY_START_TIME)
  public void setStartTime_JsonNullable(JsonNullable<OffsetDateTime> startTime) {
    this.startTime = startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = JsonNullable.<OffsetDateTime>of(startTime);
  }


  public BatchStatus endTime(OffsetDateTime endTime) {
    this.endTime = JsonNullable.<OffsetDateTime>of(endTime);
    return this;
  }

   /**
   * Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.")
  @JsonIgnore

  public OffsetDateTime getEndTime() {
        return endTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEndTime_JsonNullable() {
    return endTime;
  }
  
  @JsonProperty(JSON_PROPERTY_END_TIME)
  public void setEndTime_JsonNullable(JsonNullable<OffsetDateTime> endTime) {
    this.endTime = endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = JsonNullable.<OffsetDateTime>of(endTime);
  }


  public BatchStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public BatchStatus error(String error) {
    this.error = JsonNullable.<String>of(error);
    return this;
  }

   /**
   * Error message.
   * @return error
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "The parameter 'formulas' is required and may not be empty.", value = "Error message.")
  @JsonIgnore

  public String getError() {
        return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(String error) {
    this.error = JsonNullable.<String>of(error);
  }


  /**
   * Return true if this BatchStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStatus batchStatus = (BatchStatus) o;
    return Objects.equals(this.id, batchStatus.id) &&
        equalsNullable(this.startTime, batchStatus.startTime) &&
        equalsNullable(this.endTime, batchStatus.endTime) &&
        Objects.equals(this.status, batchStatus.status) &&
        equalsNullable(this.error, batchStatus.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(startTime), hashCodeNullable(endTime), status, hashCodeNullable(error));
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
    sb.append("class BatchStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

