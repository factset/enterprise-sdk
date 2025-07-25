/*
 * Real-Time Options API
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeOptions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListRequestDataContractSizeExclude;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListRequestDataContractSizeRestrict;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeOptions.JSON;


/**
 * Parameters related to the contract size of the option.
 */
@ApiModel(description = "Parameters related to the contract size of the option.")
@JsonPropertyOrder({
  PostOptionByClassListRequestDataContractSize.JSON_PROPERTY_RESTRICT,
  PostOptionByClassListRequestDataContractSize.JSON_PROPERTY_EXCLUDE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionByClassListRequestDataContractSize implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESTRICT = "restrict";
  private PostOptionByClassListRequestDataContractSizeRestrict restrict;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private PostOptionByClassListRequestDataContractSizeExclude exclude;

  public PostOptionByClassListRequestDataContractSize() { 
  }

  public PostOptionByClassListRequestDataContractSize restrict(PostOptionByClassListRequestDataContractSizeRestrict restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Get restrict
   * @return restrict
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassListRequestDataContractSizeRestrict getRestrict() {
    return restrict;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrict(PostOptionByClassListRequestDataContractSizeRestrict restrict) {
    this.restrict = restrict;
  }


  public PostOptionByClassListRequestDataContractSize exclude(PostOptionByClassListRequestDataContractSizeExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassListRequestDataContractSizeExclude getExclude() {
    return exclude;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclude(PostOptionByClassListRequestDataContractSizeExclude exclude) {
    this.exclude = exclude;
  }


  /**
   * Return true if this PostOptionByClassListRequest_data_contractSize object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionByClassListRequestDataContractSize postOptionByClassListRequestDataContractSize = (PostOptionByClassListRequestDataContractSize) o;
    return Objects.equals(this.restrict, postOptionByClassListRequestDataContractSize.restrict) &&
        Objects.equals(this.exclude, postOptionByClassListRequestDataContractSize.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrict, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionByClassListRequestDataContractSize {\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

