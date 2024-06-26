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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20021DataCapitalGains;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20021DataDividend;
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
 * Distribution.
 */
@ApiModel(description = "Distribution.")
@JsonPropertyOrder({
  InlineResponse20021Data.JSON_PROPERTY_DIVIDEND,
  InlineResponse20021Data.JSON_PROPERTY_CAPITAL_GAINS,
  InlineResponse20021Data.JSON_PROPERTY_TOTAL_DISTRIBUTION,
  InlineResponse20021Data.JSON_PROPERTY_DISTRIBUTION_YIELD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20021Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DIVIDEND = "dividend";
  private InlineResponse20021DataDividend dividend;

  public static final String JSON_PROPERTY_CAPITAL_GAINS = "capitalGains";
  private InlineResponse20021DataCapitalGains capitalGains;

  public static final String JSON_PROPERTY_TOTAL_DISTRIBUTION = "totalDistribution";
  private BigDecimal totalDistribution;

  public static final String JSON_PROPERTY_DISTRIBUTION_YIELD = "distributionYield";
  private BigDecimal distributionYield;

  public InlineResponse20021Data() { 
  }

  public InlineResponse20021Data dividend(InlineResponse20021DataDividend dividend) {
    this.dividend = dividend;
    return this;
  }

   /**
   * Get dividend
   * @return dividend
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20021DataDividend getDividend() {
    return dividend;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividend(InlineResponse20021DataDividend dividend) {
    this.dividend = dividend;
  }


  public InlineResponse20021Data capitalGains(InlineResponse20021DataCapitalGains capitalGains) {
    this.capitalGains = capitalGains;
    return this;
  }

   /**
   * Get capitalGains
   * @return capitalGains
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAPITAL_GAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20021DataCapitalGains getCapitalGains() {
    return capitalGains;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_GAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalGains(InlineResponse20021DataCapitalGains capitalGains) {
    this.capitalGains = capitalGains;
  }


  public InlineResponse20021Data totalDistribution(BigDecimal totalDistribution) {
    this.totalDistribution = totalDistribution;
    return this;
  }

   /**
   * Total Distribution on exDividend-date. Values are in the ETP&#39;s listing currency in the ISO 4217 format. This data is available for all regions. Please refer currency.listing in /factset/etf/getBySymbol for currency value.
   * @return totalDistribution
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total Distribution on exDividend-date. Values are in the ETP's listing currency in the ISO 4217 format. This data is available for all regions. Please refer currency.listing in /factset/etf/getBySymbol for currency value.")
  @JsonProperty(JSON_PROPERTY_TOTAL_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalDistribution() {
    return totalDistribution;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDistribution(BigDecimal totalDistribution) {
    this.totalDistribution = totalDistribution;
  }


  public InlineResponse20021Data distributionYield(BigDecimal distributionYield) {
    this.distributionYield = distributionYield;
    return this;
  }

   /**
   * Total 12-month distribution of the ETP multiplied by split factor then divided by its net asset value. Data is split adjusted. This data is available for the US regions.
   * @return distributionYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Total 12-month distribution of the ETP multiplied by split factor then divided by its net asset value. Data is split adjusted. This data is available for the US regions.")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDistributionYield() {
    return distributionYield;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributionYield(BigDecimal distributionYield) {
    this.distributionYield = distributionYield;
  }


  /**
   * Return true if this inline_response_200_21_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021Data inlineResponse20021Data = (InlineResponse20021Data) o;
    return Objects.equals(this.dividend, inlineResponse20021Data.dividend) &&
        Objects.equals(this.capitalGains, inlineResponse20021Data.capitalGains) &&
        Objects.equals(this.totalDistribution, inlineResponse20021Data.totalDistribution) &&
        Objects.equals(this.distributionYield, inlineResponse20021Data.distributionYield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividend, capitalGains, totalDistribution, distributionYield);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021Data {\n");
    sb.append("    dividend: ").append(toIndentedString(dividend)).append("\n");
    sb.append("    capitalGains: ").append(toIndentedString(capitalGains)).append("\n");
    sb.append("    totalDistribution: ").append(toIndentedString(totalDistribution)).append("\n");
    sb.append("    distributionYield: ").append(toIndentedString(distributionYield)).append("\n");
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

