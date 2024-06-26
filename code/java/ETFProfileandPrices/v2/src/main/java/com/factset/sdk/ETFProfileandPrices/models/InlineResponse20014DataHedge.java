/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ETFProfileandPrices.models;

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
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Hedge.
 */
@ApiModel(description = "Hedge.")
@JsonPropertyOrder({
  InlineResponse20014DataHedge.JSON_PROPERTY_IS_HEDGED,
  InlineResponse20014DataHedge.JSON_PROPERTY_SOURCE_CURRENCY,
  InlineResponse20014DataHedge.JSON_PROPERTY_TARGET_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20014DataHedge implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_HEDGED = "isHedged";
  private Boolean isHedged;

  public static final String JSON_PROPERTY_SOURCE_CURRENCY = "sourceCurrency";
  private String sourceCurrency;

  public static final String JSON_PROPERTY_TARGET_CURRENCY = "targetCurrency";
  private String targetCurrency;

  public InlineResponse20014DataHedge() { 
  }

  public InlineResponse20014DataHedge isHedged(Boolean isHedged) {
    this.isHedged = isHedged;
    return this;
  }

   /**
   * Flags ETPs that are hedged to eliminate or reduce foreign currency exposure for US investors. This data is available for all the regions.
   * @return isHedged
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Flags ETPs that are hedged to eliminate or reduce foreign currency exposure for US investors. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_IS_HEDGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHedged() {
    return isHedged;
  }


  @JsonProperty(JSON_PROPERTY_IS_HEDGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHedged(Boolean isHedged) {
    this.isHedged = isHedged;
  }


  public InlineResponse20014DataHedge sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * For currency-hedged funds, the values shows foreign currency the ETP is hedged against. Currency code is in ISO 4217 format. This data is available for all the regions.
   * @return sourceCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "For currency-hedged funds, the values shows foreign currency the ETP is hedged against. Currency code is in ISO 4217 format. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_SOURCE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceCurrency() {
    return sourceCurrency;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }


  public InlineResponse20014DataHedge targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

   /**
   * For currency-hedged funds, the currency the ETP is exposed to after hedging. Currency code is in ISO 4217 format. This data is available for all the regions.
   * @return targetCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "For currency-hedged funds, the currency the ETP is exposed to after hedging. Currency code is in ISO 4217 format. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_TARGET_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetCurrency() {
    return targetCurrency;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }


  /**
   * Return true if this inline_response_200_14_data_hedge object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014DataHedge inlineResponse20014DataHedge = (InlineResponse20014DataHedge) o;
    return Objects.equals(this.isHedged, inlineResponse20014DataHedge.isHedged) &&
        Objects.equals(this.sourceCurrency, inlineResponse20014DataHedge.sourceCurrency) &&
        Objects.equals(this.targetCurrency, inlineResponse20014DataHedge.targetCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHedged, sourceCurrency, targetCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014DataHedge {\n");
    sb.append("    isHedged: ").append(toIndentedString(isHedged)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
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

