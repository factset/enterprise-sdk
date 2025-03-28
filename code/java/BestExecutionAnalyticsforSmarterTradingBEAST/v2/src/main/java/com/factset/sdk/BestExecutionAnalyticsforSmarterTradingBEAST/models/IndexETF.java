/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models;

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
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.JSON;


/**
 * Index ETF object
 */
@ApiModel(description = "Index ETF object")
@JsonPropertyOrder({
  IndexETF.JSON_PROPERTY_PRICE_CHANGE,
  IndexETF.JSON_PROPERTY_TIME,
  IndexETF.JSON_PROPERTY_PRICE,
  IndexETF.JSON_PROPERTY_ETF_INDEX_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class IndexETF implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_CHANGE = "priceChange";
  private Double priceChange;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_ETF_INDEX_NAME = "etfIndexName";
  private String etfIndexName;

  public IndexETF() { 
  }

  public IndexETF priceChange(Double priceChange) {
    this.priceChange = priceChange;
    return this;
  }

   /**
   * Price Change
   * @return priceChange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Price Change")
  @JsonProperty(JSON_PROPERTY_PRICE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceChange() {
    return priceChange;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceChange(Double priceChange) {
    this.priceChange = priceChange;
  }


  public IndexETF time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Time
   * @return time
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(Long time) {
    this.time = time;
  }


  public IndexETF price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Price")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public IndexETF etfIndexName(String etfIndexName) {
    this.etfIndexName = etfIndexName;
    return this;
  }

   /**
   * ETF Index Name
   * @return etfIndexName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ETF Index Name")
  @JsonProperty(JSON_PROPERTY_ETF_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEtfIndexName() {
    return etfIndexName;
  }


  @JsonProperty(JSON_PROPERTY_ETF_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtfIndexName(String etfIndexName) {
    this.etfIndexName = etfIndexName;
  }


  /**
   * Return true if this IndexETF object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexETF indexETF = (IndexETF) o;
    return Objects.equals(this.priceChange, indexETF.priceChange) &&
        Objects.equals(this.time, indexETF.time) &&
        Objects.equals(this.price, indexETF.price) &&
        Objects.equals(this.etfIndexName, indexETF.etfIndexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceChange, time, price, etfIndexName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexETF {\n");
    sb.append("    priceChange: ").append(toIndentedString(priceChange)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    etfIndexName: ").append(toIndentedString(etfIndexName)).append("\n");
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

