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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Signals.JSON;


/**
 * Represents a valid range for user relevancy score for signal events. The upper bound of the range is represented by the attribute **gt** or **gte**. The lower bound of the range is presented by **lt** or **lte** The range can contain either of the bounds or both. e.g. { \&quot;gt\&quot;: 0.4, \&quot;lt\&quot;: 0.8 } 
 */
@ApiModel(description = "Represents a valid range for user relevancy score for signal events. The upper bound of the range is represented by the attribute **gt** or **gte**. The lower bound of the range is presented by **lt** or **lte** The range can contain either of the bounds or both. e.g. { \"gt\": 0.4, \"lt\": 0.8 } ")
@JsonPropertyOrder({
  RelevanceScoreRange.JSON_PROPERTY_GT,
  RelevanceScoreRange.JSON_PROPERTY_GTE,
  RelevanceScoreRange.JSON_PROPERTY_LT,
  RelevanceScoreRange.JSON_PROPERTY_LTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RelevanceScoreRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_GT = "gt";
  private Float gt;

  public static final String JSON_PROPERTY_GTE = "gte";
  private Float gte;

  public static final String JSON_PROPERTY_LT = "lt";
  private Float lt;

  public static final String JSON_PROPERTY_LTE = "lte";
  private Float lte;

  public RelevanceScoreRange() { 
  }

  public RelevanceScoreRange gt(Float gt) {
    this.gt = gt;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format. gt stands for greater than
   * @return gt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A date/time string in ISO 8601 format. gt stands for greater than")
  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getGt() {
    return gt;
  }


  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGt(Float gt) {
    this.gt = gt;
  }


  public RelevanceScoreRange gte(Float gte) {
    this.gte = gte;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format. gte stands for greater than or equal to
   * @return gte
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A date/time string in ISO 8601 format. gte stands for greater than or equal to")
  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getGte() {
    return gte;
  }


  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGte(Float gte) {
    this.gte = gte;
  }


  public RelevanceScoreRange lt(Float lt) {
    this.lt = lt;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format. lt stands for less than
   * @return lt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A date/time string in ISO 8601 format. lt stands for less than")
  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLt() {
    return lt;
  }


  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLt(Float lt) {
    this.lt = lt;
  }


  public RelevanceScoreRange lte(Float lte) {
    this.lte = lte;
    return this;
  }

   /**
   * A date/time string in ISO 8601 format. lte stands for less than or equal to
   * @return lte
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A date/time string in ISO 8601 format. lte stands for less than or equal to")
  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLte() {
    return lte;
  }


  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLte(Float lte) {
    this.lte = lte;
  }


  /**
   * Return true if this RelevanceScoreRange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelevanceScoreRange relevanceScoreRange = (RelevanceScoreRange) o;
    return Objects.equals(this.gt, relevanceScoreRange.gt) &&
        Objects.equals(this.gte, relevanceScoreRange.gte) &&
        Objects.equals(this.lt, relevanceScoreRange.lt) &&
        Objects.equals(this.lte, relevanceScoreRange.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevanceScoreRange {\n");
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

