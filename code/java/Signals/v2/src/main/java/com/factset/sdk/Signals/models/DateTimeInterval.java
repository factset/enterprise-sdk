/*
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Signals.models;

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
import com.factset.sdk.Signals.JSON;


/**
 * Represents a valid date/time (UTC) interval. The upper bound of the interval is represented by the attribute **gt** or **gte**. The lower bound of the interval is presented by **lt** or **lte** The interval can contain either of the bounds or both. e.g. { \&quot;gt\&quot;: \&quot;2021-05-01T00:00:00.000Z\&quot;, \&quot;lt\&quot;: \&quot;2021-05-08T00:00:00.000Z\&quot; } 
 */
@ApiModel(description = "Represents a valid date/time (UTC) interval. The upper bound of the interval is represented by the attribute **gt** or **gte**. The lower bound of the interval is presented by **lt** or **lte** The interval can contain either of the bounds or both. e.g. { \"gt\": \"2021-05-01T00:00:00.000Z\", \"lt\": \"2021-05-08T00:00:00.000Z\" } ")
@JsonPropertyOrder({
  DateTimeInterval.JSON_PROPERTY_GT,
  DateTimeInterval.JSON_PROPERTY_GTE,
  DateTimeInterval.JSON_PROPERTY_LT,
  DateTimeInterval.JSON_PROPERTY_LTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DateTimeInterval implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_GT = "gt";
  private OffsetDateTime gt;

  public static final String JSON_PROPERTY_GTE = "gte";
  private OffsetDateTime gte;

  public static final String JSON_PROPERTY_LT = "lt";
  private OffsetDateTime lt;

  public static final String JSON_PROPERTY_LTE = "lte";
  private OffsetDateTime lte;

  public DateTimeInterval() { 
  }

  public DateTimeInterval gt(OffsetDateTime gt) {
    this.gt = gt;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format.
   * @return gt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "A date/time string in ISO 8601 format.")
  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getGt() {
    return gt;
  }


  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGt(OffsetDateTime gt) {
    this.gt = gt;
  }


  public DateTimeInterval gte(OffsetDateTime gte) {
    this.gte = gte;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format.
   * @return gte
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "A date/time string in ISO 8601 format.")
  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getGte() {
    return gte;
  }


  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGte(OffsetDateTime gte) {
    this.gte = gte;
  }


  public DateTimeInterval lt(OffsetDateTime lt) {
    this.lt = lt;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format.
   * @return lt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "A date/time string in ISO 8601 format.")
  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLt() {
    return lt;
  }


  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLt(OffsetDateTime lt) {
    this.lt = lt;
  }


  public DateTimeInterval lte(OffsetDateTime lte) {
    this.lte = lte;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format.
   * @return lte
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T00:00Z", value = "A date/time string in ISO 8601 format.")
  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLte() {
    return lte;
  }


  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLte(OffsetDateTime lte) {
    this.lte = lte;
  }


  /**
   * Return true if this DateTimeInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeInterval dateTimeInterval = (DateTimeInterval) o;
    return Objects.equals(this.gt, dateTimeInterval.gt) &&
        Objects.equals(this.gte, dateTimeInterval.gte) &&
        Objects.equals(this.lt, dateTimeInterval.lt) &&
        Objects.equals(this.lte, dateTimeInterval.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeInterval {\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
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

