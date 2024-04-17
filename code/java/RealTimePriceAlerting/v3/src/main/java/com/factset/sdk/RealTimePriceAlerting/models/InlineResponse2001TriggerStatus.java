/*
 * Price Alerting API For Digital Portals
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.  A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.  When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimePriceAlerting.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimePriceAlerting.JSON;


/**
 * Status of the trigger.
 */
@ApiModel(description = "Status of the trigger.")
@JsonPropertyOrder({
  InlineResponse2001TriggerStatus.JSON_PROPERTY_CODE,
  InlineResponse2001TriggerStatus.JSON_PROPERTY_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2001TriggerStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Code of the status.
   */
  public enum CodeEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    ERROR("error");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<CodeEnum> code = JsonNullable.<CodeEnum>undefined();

  public static final String JSON_PROPERTY_DETAILS = "details";
  private JsonNullable<String> details = JsonNullable.<String>undefined();

  public InlineResponse2001TriggerStatus() { 
  }

  public InlineResponse2001TriggerStatus code(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
    return this;
  }

   /**
   * Code of the status.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Code of the status.")
  @JsonIgnore

  public CodeEnum getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CodeEnum> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<CodeEnum> code) {
    this.code = code;
  }

  public void setCode(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
  }


  public InlineResponse2001TriggerStatus details(String details) {
    this.details = JsonNullable.<String>of(details);
    return this;
  }

   /**
   * A human-readable, unstructured explanation specific to this error.
   * @return details
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human-readable, unstructured explanation specific to this error.")
  @JsonIgnore

  public String getDetails() {
        return details.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDetails_JsonNullable() {
    return details;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAILS)
  public void setDetails_JsonNullable(JsonNullable<String> details) {
    this.details = details;
  }

  public void setDetails(String details) {
    this.details = JsonNullable.<String>of(details);
  }


  /**
   * Return true if this inline_response_200_1_trigger_status object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001TriggerStatus inlineResponse2001TriggerStatus = (InlineResponse2001TriggerStatus) o;
    return equalsNullable(this.code, inlineResponse2001TriggerStatus.code) &&
        equalsNullable(this.details, inlineResponse2001TriggerStatus.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(details));
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
    sb.append("class InlineResponse2001TriggerStatus {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

