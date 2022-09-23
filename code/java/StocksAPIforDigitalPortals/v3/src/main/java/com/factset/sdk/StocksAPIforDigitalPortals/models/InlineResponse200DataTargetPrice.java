/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200DataTargetPriceCurrency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Details of the target price.
 */
@ApiModel(description = "Details of the target price.")
@JsonPropertyOrder({
  InlineResponse200DataTargetPrice.JSON_PROPERTY_LATEST_UPDATE,
  InlineResponse200DataTargetPrice.JSON_PROPERTY_MEAN,
  InlineResponse200DataTargetPrice.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataTargetPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LATEST_UPDATE = "latestUpdate";
  private LocalDate latestUpdate;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private BigDecimal mean;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse200DataTargetPriceCurrency currency;

  public InlineResponse200DataTargetPrice() { 
  }

  public InlineResponse200DataTargetPrice latestUpdate(LocalDate latestUpdate) {
    this.latestUpdate = latestUpdate;
    return this;
  }

   /**
   * Date of the latest update.
   * @return latestUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the latest update.")
  @JsonProperty(JSON_PROPERTY_LATEST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getLatestUpdate() {
    return latestUpdate;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestUpdate(LocalDate latestUpdate) {
    this.latestUpdate = latestUpdate;
  }


  public InlineResponse200DataTargetPrice mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Mean value.
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mean value.")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }


  public InlineResponse200DataTargetPrice currency(InlineResponse200DataTargetPriceCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataTargetPriceCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse200DataTargetPriceCurrency currency) {
    this.currency = currency;
  }


  /**
   * Return true if this inline_response_200_data_targetPrice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataTargetPrice inlineResponse200DataTargetPrice = (InlineResponse200DataTargetPrice) o;
    return Objects.equals(this.latestUpdate, inlineResponse200DataTargetPrice.latestUpdate) &&
        Objects.equals(this.mean, inlineResponse200DataTargetPrice.mean) &&
        Objects.equals(this.currency, inlineResponse200DataTargetPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestUpdate, mean, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataTargetPrice {\n");
    sb.append("    latestUpdate: ").append(toIndentedString(latestUpdate)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
