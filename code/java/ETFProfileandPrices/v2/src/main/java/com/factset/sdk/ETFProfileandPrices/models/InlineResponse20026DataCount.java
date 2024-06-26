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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Count of premium, disount and neutral.
 */
@ApiModel(description = "Count of premium, disount and neutral.")
@JsonPropertyOrder({
  InlineResponse20026DataCount.JSON_PROPERTY_PREMIUM,
  InlineResponse20026DataCount.JSON_PROPERTY_DISCOUNT,
  InlineResponse20026DataCount.JSON_PROPERTY_NEUTRAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20026DataCount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PREMIUM = "premium";
  private BigDecimal premium;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private BigDecimal discount;

  public static final String JSON_PROPERTY_NEUTRAL = "neutral";
  private BigDecimal neutral;

  public InlineResponse20026DataCount() { 
  }

  public InlineResponse20026DataCount premium(BigDecimal premium) {
    this.premium = premium;
    return this;
  }

   /**
   * Number of days ETP is traded at premium.
   * @return premium
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of days ETP is traded at premium.")
  @JsonProperty(JSON_PROPERTY_PREMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPremium() {
    return premium;
  }


  @JsonProperty(JSON_PROPERTY_PREMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPremium(BigDecimal premium) {
    this.premium = premium;
  }


  public InlineResponse20026DataCount discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Number of days ETP is traded at discount.
   * @return discount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of days ETP is traded at discount.")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }


  public InlineResponse20026DataCount neutral(BigDecimal neutral) {
    this.neutral = neutral;
    return this;
  }

   /**
   * Number of days ETP is neither traded at discount nor at premium.
   * @return neutral
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of days ETP is neither traded at discount nor at premium.")
  @JsonProperty(JSON_PROPERTY_NEUTRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNeutral() {
    return neutral;
  }


  @JsonProperty(JSON_PROPERTY_NEUTRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeutral(BigDecimal neutral) {
    this.neutral = neutral;
  }


  /**
   * Return true if this inline_response_200_26_data_count object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026DataCount inlineResponse20026DataCount = (InlineResponse20026DataCount) o;
    return Objects.equals(this.premium, inlineResponse20026DataCount.premium) &&
        Objects.equals(this.discount, inlineResponse20026DataCount.discount) &&
        Objects.equals(this.neutral, inlineResponse20026DataCount.neutral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premium, discount, neutral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026DataCount {\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    neutral: ").append(toIndentedString(neutral)).append("\n");
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

