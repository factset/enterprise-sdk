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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2008Notation;
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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * InlineResponse2008Data
 */
@JsonPropertyOrder({
  InlineResponse2008Data.JSON_PROPERTY_ID,
  InlineResponse2008Data.JSON_PROPERTY_NOTATION,
  InlineResponse2008Data.JSON_PROPERTY_TYPE,
  InlineResponse2008Data.JSON_PROPERTY_TIME,
  InlineResponse2008Data.JSON_PROPERTY_NUMBER_SHARES,
  InlineResponse2008Data.JSON_PROPERTY_PRICE,
  InlineResponse2008Data.JSON_PROPERTY_CHARGES,
  InlineResponse2008Data.JSON_PROPERTY_EXCHANGE_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2008Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private InlineResponse2008Notation notation;

  /**
   * Type of transaction
   */
  public enum TypeEnum {
    BUY("buy"),
    
    SELL("sell"),
    
    CASH("cash"),
    
    PAYOUT("payout"),
    
    SHORT("short"),
    
    COVER("cover");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_NUMBER_SHARES = "numberShares";
  private BigDecimal numberShares;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private BigDecimal charges;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
  private BigDecimal exchangeRate;

  public InlineResponse2008Data() { 
  }

  public InlineResponse2008Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of transaction.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2008Data notation(InlineResponse2008Notation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008Notation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(InlineResponse2008Notation notation) {
    this.notation = notation;
  }


  public InlineResponse2008Data type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of transaction
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of transaction")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InlineResponse2008Data time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time of the trade.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the trade.")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public InlineResponse2008Data numberShares(BigDecimal numberShares) {
    this.numberShares = numberShares;
    return this;
  }

   /**
   * Number of shares bought or sold.
   * @return numberShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of shares bought or sold.")
  @JsonProperty(JSON_PROPERTY_NUMBER_SHARES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberShares() {
    return numberShares;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_SHARES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberShares(BigDecimal numberShares) {
    this.numberShares = numberShares;
  }


  public InlineResponse2008Data price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Price the securities were purchased / sold for.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price the securities were purchased / sold for.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public InlineResponse2008Data charges(BigDecimal charges) {
    this.charges = charges;
    return this;
  }

   /**
   * Charges accrued in portfolio&#39;s base currency.
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Charges accrued in portfolio's base currency.")
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(BigDecimal charges) {
    this.charges = charges;
  }


  public InlineResponse2008Data exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate between the notation&#39;s currency and the portfolio currency.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exchange rate between the notation's currency and the portfolio currency.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  /**
   * Return true if this inline_response_200_8_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Data inlineResponse2008Data = (InlineResponse2008Data) o;
    return Objects.equals(this.id, inlineResponse2008Data.id) &&
        Objects.equals(this.notation, inlineResponse2008Data.notation) &&
        Objects.equals(this.type, inlineResponse2008Data.type) &&
        Objects.equals(this.time, inlineResponse2008Data.time) &&
        Objects.equals(this.numberShares, inlineResponse2008Data.numberShares) &&
        Objects.equals(this.price, inlineResponse2008Data.price) &&
        Objects.equals(this.charges, inlineResponse2008Data.charges) &&
        Objects.equals(this.exchangeRate, inlineResponse2008Data.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notation, type, time, numberShares, price, charges, exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    numberShares: ").append(toIndentedString(numberShares)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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

