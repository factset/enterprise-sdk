/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataAssetClasses;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataText;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataTradingValue;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.PostNotationSearchByTextRequestDataValidation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostNotationSearchByTextRequestData.JSON_PROPERTY_TEXT,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_VALIDATION,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_ASSET_CLASSES,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_MARKET,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNotationSearchByTextRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TEXT = "text";
  private PostNotationSearchByTextRequestDataText text;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private PostNotationSearchByTextRequestDataValidation validation;

  public static final String JSON_PROPERTY_ASSET_CLASSES = "assetClasses";
  private PostNotationSearchByTextRequestDataAssetClasses assetClasses;

  public static final String JSON_PROPERTY_MARKET = "market";
  private PostNotationSearchByTextRequestDataMarket market;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private PostNotationSearchByTextRequestDataTradingValue tradingValue;

  public PostNotationSearchByTextRequestData() { 
  }

  public PostNotationSearchByTextRequestData text(PostNotationSearchByTextRequestDataText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataText getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(PostNotationSearchByTextRequestDataText text) {
    this.text = text;
  }


  public PostNotationSearchByTextRequestData validation(PostNotationSearchByTextRequestDataValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataValidation getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(PostNotationSearchByTextRequestDataValidation validation) {
    this.validation = validation;
  }


  public PostNotationSearchByTextRequestData assetClasses(PostNotationSearchByTextRequestDataAssetClasses assetClasses) {
    this.assetClasses = assetClasses;
    return this;
  }

   /**
   * Get assetClasses
   * @return assetClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataAssetClasses getAssetClasses() {
    return assetClasses;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClasses(PostNotationSearchByTextRequestDataAssetClasses assetClasses) {
    this.assetClasses = assetClasses;
  }


  public PostNotationSearchByTextRequestData market(PostNotationSearchByTextRequestDataMarket market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(PostNotationSearchByTextRequestDataMarket market) {
    this.market = market;
  }


  public PostNotationSearchByTextRequestData tradingValue(PostNotationSearchByTextRequestDataTradingValue tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Get tradingValue
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataTradingValue getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(PostNotationSearchByTextRequestDataTradingValue tradingValue) {
    this.tradingValue = tradingValue;
  }


  /**
   * Return true if this PostNotationSearchByTextRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNotationSearchByTextRequestData postNotationSearchByTextRequestData = (PostNotationSearchByTextRequestData) o;
    return Objects.equals(this.text, postNotationSearchByTextRequestData.text) &&
        Objects.equals(this.validation, postNotationSearchByTextRequestData.validation) &&
        Objects.equals(this.assetClasses, postNotationSearchByTextRequestData.assetClasses) &&
        Objects.equals(this.market, postNotationSearchByTextRequestData.market) &&
        Objects.equals(this.tradingValue, postNotationSearchByTextRequestData.tradingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, validation, assetClasses, market, tradingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationSearchByTextRequestData {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    assetClasses: ").append(toIndentedString(assetClasses)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
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
