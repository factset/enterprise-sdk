/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataAssetClass;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataInstrumentCategory;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataMarket;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataText;
import com.factset.sdk.RealTimeQuotes.models.PostNotationSearchByTextRequestDataValidation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostNotationSearchByTextRequestData.JSON_PROPERTY_TEXT,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_VALIDATION,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_ASSET_CLASS,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_INSTRUMENT_CATEGORY,
  PostNotationSearchByTextRequestData.JSON_PROPERTY_MARKET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNotationSearchByTextRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TEXT = "text";
  private PostNotationSearchByTextRequestDataText text;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private PostNotationSearchByTextRequestDataValidation validation;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private PostNotationSearchByTextRequestDataAssetClass assetClass;

  public static final String JSON_PROPERTY_INSTRUMENT_CATEGORY = "instrumentCategory";
  private PostNotationSearchByTextRequestDataInstrumentCategory instrumentCategory;

  public static final String JSON_PROPERTY_MARKET = "market";
  private PostNotationSearchByTextRequestDataMarket market;

  public PostNotationSearchByTextRequestData() { 
  }

  @JsonCreator
  public PostNotationSearchByTextRequestData(
    @JsonProperty(value=JSON_PROPERTY_TEXT, required=true) PostNotationSearchByTextRequestDataText text
  ) {
    this();
    this.text = text;
  }

  public PostNotationSearchByTextRequestData text(PostNotationSearchByTextRequestDataText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostNotationSearchByTextRequestDataText getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nullable
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


  public PostNotationSearchByTextRequestData assetClass(PostNotationSearchByTextRequestDataAssetClass assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Get assetClass
   * @return assetClass
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataAssetClass getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(PostNotationSearchByTextRequestDataAssetClass assetClass) {
    this.assetClass = assetClass;
  }


  public PostNotationSearchByTextRequestData instrumentCategory(PostNotationSearchByTextRequestDataInstrumentCategory instrumentCategory) {
    this.instrumentCategory = instrumentCategory;
    return this;
  }

   /**
   * Get instrumentCategory
   * @return instrumentCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationSearchByTextRequestDataInstrumentCategory getInstrumentCategory() {
    return instrumentCategory;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentCategory(PostNotationSearchByTextRequestDataInstrumentCategory instrumentCategory) {
    this.instrumentCategory = instrumentCategory;
  }


  public PostNotationSearchByTextRequestData market(PostNotationSearchByTextRequestDataMarket market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @jakarta.annotation.Nullable
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
        Objects.equals(this.assetClass, postNotationSearchByTextRequestData.assetClass) &&
        Objects.equals(this.instrumentCategory, postNotationSearchByTextRequestData.instrumentCategory) &&
        Objects.equals(this.market, postNotationSearchByTextRequestData.market);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, validation, assetClass, instrumentCategory, market);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationSearchByTextRequestData {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    instrumentCategory: ").append(toIndentedString(instrumentCategory)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
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

