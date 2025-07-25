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
 * Parameters related to the exercise.
 */
@ApiModel(description = "Parameters related to the exercise.")
@JsonPropertyOrder({
  PostOptionByClassListRequestDataContractExcercise.JSON_PROPERTY_RIGHT,
  PostOptionByClassListRequestDataContractExcercise.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionByClassListRequestDataContractExcercise implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Restricts the exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |  
   */
  public enum RightEnum {
    PUT("put"),
    
    CALL("call");

    private String value;

    RightEnum(String value) {
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
    public static RightEnum fromValue(String value) {
      for (RightEnum b : RightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RIGHT = "right";
  private RightEnum right;

  /**
   * Restricts the exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |  
   */
  public enum StyleEnum {
    AMERICAN("american"),
    
    EUROPEAN("european");

    private String value;

    StyleEnum(String value) {
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
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STYLE = "style";
  private StyleEnum style;

  public PostOptionByClassListRequestDataContractExcercise() { 
  }

  public PostOptionByClassListRequestDataContractExcercise right(RightEnum right) {
    this.right = right;
    return this;
  }

   /**
   * Restricts the exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |  
   * @return right
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "call", value = "Restricts the exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |  ")
  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RightEnum getRight() {
    return right;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRight(RightEnum right) {
    this.right = right;
  }


  public PostOptionByClassListRequestDataContractExcercise style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Restricts the exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |  
   * @return style
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "american", value = "Restricts the exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |  ")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StyleEnum getStyle() {
    return style;
  }


  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(StyleEnum style) {
    this.style = style;
  }


  /**
   * Return true if this PostOptionByClassListRequest_data_contract_excercise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionByClassListRequestDataContractExcercise postOptionByClassListRequestDataContractExcercise = (PostOptionByClassListRequestDataContractExcercise) o;
    return Objects.equals(this.right, postOptionByClassListRequestDataContractExcercise.right) &&
        Objects.equals(this.style, postOptionByClassListRequestDataContractExcercise.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(right, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOptionByClassListRequestDataContractExcercise {\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

