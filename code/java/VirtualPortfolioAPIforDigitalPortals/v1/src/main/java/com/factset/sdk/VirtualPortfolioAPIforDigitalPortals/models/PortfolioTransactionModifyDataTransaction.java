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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.PortfolioTransactionDeleteDataNotation;
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
 * Transaction of the portfolio.
 */
@ApiModel(description = "Transaction of the portfolio.")
@JsonPropertyOrder({
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_ID,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_NOTATION,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_TIME,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_NUMBER_SHARES,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_PRICE,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_CHARGES,
  PortfolioTransactionModifyDataTransaction.JSON_PROPERTY_EXCHANGE_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioTransactionModifyDataTransaction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private PortfolioTransactionDeleteDataNotation notation;

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

  public PortfolioTransactionModifyDataTransaction() { 
  }

  @JsonCreator
  public PortfolioTransactionModifyDataTransaction(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id
  ) {
    this();
    this.id = id;
  }

  public PortfolioTransactionModifyDataTransaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the transaction.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the transaction.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PortfolioTransactionModifyDataTransaction notation(PortfolioTransactionDeleteDataNotation notation) {
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

  public PortfolioTransactionDeleteDataNotation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(PortfolioTransactionDeleteDataNotation notation) {
    this.notation = notation;
  }


  public PortfolioTransactionModifyDataTransaction time(String time) {
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


  public PortfolioTransactionModifyDataTransaction numberShares(BigDecimal numberShares) {
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


  public PortfolioTransactionModifyDataTransaction price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Purchase price.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Purchase price.")
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


  public PortfolioTransactionModifyDataTransaction charges(BigDecimal charges) {
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


  public PortfolioTransactionModifyDataTransaction exchangeRate(BigDecimal exchangeRate) {
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
   * Return true if this _portfolio_transaction_modify_data_transaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioTransactionModifyDataTransaction portfolioTransactionModifyDataTransaction = (PortfolioTransactionModifyDataTransaction) o;
    return Objects.equals(this.id, portfolioTransactionModifyDataTransaction.id) &&
        Objects.equals(this.notation, portfolioTransactionModifyDataTransaction.notation) &&
        Objects.equals(this.time, portfolioTransactionModifyDataTransaction.time) &&
        Objects.equals(this.numberShares, portfolioTransactionModifyDataTransaction.numberShares) &&
        Objects.equals(this.price, portfolioTransactionModifyDataTransaction.price) &&
        Objects.equals(this.charges, portfolioTransactionModifyDataTransaction.charges) &&
        Objects.equals(this.exchangeRate, portfolioTransactionModifyDataTransaction.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notation, time, numberShares, price, charges, exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioTransactionModifyDataTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
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

