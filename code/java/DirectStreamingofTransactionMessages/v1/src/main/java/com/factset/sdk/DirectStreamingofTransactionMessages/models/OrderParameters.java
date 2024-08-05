/*
 * DSOTM API
 * Allow clients to send transactions data to FactSet.
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DirectStreamingofTransactionMessages.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.DirectStreamingofTransactionMessages.JSON;


/**
 * OrderParameters
 */
@JsonPropertyOrder({
  OrderParameters.JSON_PROPERTY_TRANSACTION_STATUS,
  OrderParameters.JSON_PROPERTY_INSTRUCTION_TYPE,
  OrderParameters.JSON_PROPERTY_INSTRUCTION_VALUE,
  OrderParameters.JSON_PROPERTY_TIF,
  OrderParameters.JSON_PROPERTY_TIF_DATE,
  OrderParameters.JSON_PROPERTY_FUND_TEAM,
  OrderParameters.JSON_PROPERTY_TRADING_TEAM,
  OrderParameters.JSON_PROPERTY_TRADER,
  OrderParameters.JSON_PROPERTY_TRANSACTION_ID,
  OrderParameters.JSON_PROPERTY_ORDER_ID,
  OrderParameters.JSON_PROPERTY_PORTFOLIO,
  OrderParameters.JSON_PROPERTY_SYMBOL,
  OrderParameters.JSON_PROPERTY_DESCRIPTION,
  OrderParameters.JSON_PROPERTY_TRADE_TYPE,
  OrderParameters.JSON_PROPERTY_UNIT_TYPE,
  OrderParameters.JSON_PROPERTY_TRANSACTION_LEAVES,
  OrderParameters.JSON_PROPERTY_QUANTITY,
  OrderParameters.JSON_PROPERTY_GROSS,
  OrderParameters.JSON_PROPERTY_PRICE,
  OrderParameters.JSON_PROPERTY_CURRENCY_I_S_O,
  OrderParameters.JSON_PROPERTY_TRADE_DATE,
  OrderParameters.JSON_PROPERTY_ADDED_DATE_TIME,
  OrderParameters.JSON_PROPERTY_UPDATED_DATE_TIME,
  OrderParameters.JSON_PROPERTY_ENTITY,
  OrderParameters.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TRANSACTION_STATUS = "transactionStatus";
  private String transactionStatus;

  public static final String JSON_PROPERTY_INSTRUCTION_TYPE = "instructionType";
  private String instructionType;

  public static final String JSON_PROPERTY_INSTRUCTION_VALUE = "instructionValue";
  private Double instructionValue;

  public static final String JSON_PROPERTY_TIF = "tif";
  private String tif;

  public static final String JSON_PROPERTY_TIF_DATE = "tifDate";
  private String tifDate;

  public static final String JSON_PROPERTY_FUND_TEAM = "fundTeam";
  private String fundTeam;

  public static final String JSON_PROPERTY_TRADING_TEAM = "tradingTeam";
  private String tradingTeam;

  public static final String JSON_PROPERTY_TRADER = "trader";
  private String trader;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private JsonNullable<String> orderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private String portfolio;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TRADE_TYPE = "tradeType";
  private String tradeType;

  public static final String JSON_PROPERTY_UNIT_TYPE = "unitType";
  private String unitType;

  public static final String JSON_PROPERTY_TRANSACTION_LEAVES = "transactionLeaves";
  private Double transactionLeaves;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Double quantity;

  public static final String JSON_PROPERTY_GROSS = "gross";
  private Double gross;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_CURRENCY_I_S_O = "currencyISO";
  private String currencyISO;

  public static final String JSON_PROPERTY_TRADE_DATE = "tradeDate";
  private String tradeDate;

  public static final String JSON_PROPERTY_ADDED_DATE_TIME = "addedDateTime";
  private String addedDateTime;

  public static final String JSON_PROPERTY_UPDATED_DATE_TIME = "updatedDateTime";
  private String updatedDateTime;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private String entity;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public OrderParameters() { 
  }

  @JsonCreator
  public OrderParameters(
    @JsonProperty(JSON_PROPERTY_ENTITY) String entity, 
    @JsonProperty(JSON_PROPERTY_STATUS) String status
  ) {
    this();
    this.entity = entity;
    this.status = status;
  }

  public OrderParameters transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Transaction Status of an Order could be any of the following values: PendingApproval, Open, Placed, PartialFilled, Filled, Expired, Cancelled, Rejected, Booked.
   * @return transactionStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Transaction Status of an Order could be any of the following values: PendingApproval, Open, Placed, PartialFilled, Filled, Expired, Cancelled, Rejected, Booked.")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionStatus() {
    return transactionStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  public OrderParameters instructionType(String instructionType) {
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Instruction Type of an Order could be any of the following values: Market, Limit, Stop
   * @return instructionType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Instruction Type of an Order could be any of the following values: Market, Limit, Stop")
  @JsonProperty(JSON_PROPERTY_INSTRUCTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructionType() {
    return instructionType;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructionType(String instructionType) {
    this.instructionType = instructionType;
  }


  public OrderParameters instructionValue(Double instructionValue) {
    this.instructionValue = instructionValue;
    return this;
  }

   /**
   * Instruction Value of an Order
   * @return instructionValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Instruction Value of an Order")
  @JsonProperty(JSON_PROPERTY_INSTRUCTION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getInstructionValue() {
    return instructionValue;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructionValue(Double instructionValue) {
    this.instructionValue = instructionValue;
  }


  public OrderParameters tif(String tif) {
    this.tif = tif;
    return this;
  }

   /**
   * TIF of an Order could be any of the following values: GTC, GTD, D, W
   * @return tif
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TIF of an Order could be any of the following values: GTC, GTD, D, W")
  @JsonProperty(JSON_PROPERTY_TIF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTif() {
    return tif;
  }


  @JsonProperty(JSON_PROPERTY_TIF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTif(String tif) {
    this.tif = tif;
  }


  public OrderParameters tifDate(String tifDate) {
    this.tifDate = tifDate;
    return this;
  }

   /**
   * TIF date which is in the format YYYY-MM-DD
   * @return tifDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TIF date which is in the format YYYY-MM-DD")
  @JsonProperty(JSON_PROPERTY_TIF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTifDate() {
    return tifDate;
  }


  @JsonProperty(JSON_PROPERTY_TIF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTifDate(String tifDate) {
    this.tifDate = tifDate;
  }


  public OrderParameters fundTeam(String fundTeam) {
    this.fundTeam = fundTeam;
    return this;
  }

   /**
   * Fund Team of an Order
   * @return fundTeam
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Fund Team of an Order")
  @JsonProperty(JSON_PROPERTY_FUND_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFundTeam() {
    return fundTeam;
  }


  @JsonProperty(JSON_PROPERTY_FUND_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundTeam(String fundTeam) {
    this.fundTeam = fundTeam;
  }


  public OrderParameters tradingTeam(String tradingTeam) {
    this.tradingTeam = tradingTeam;
    return this;
  }

   /**
   * Trading Team of an Order
   * @return tradingTeam
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Trading Team of an Order")
  @JsonProperty(JSON_PROPERTY_TRADING_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTradingTeam() {
    return tradingTeam;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingTeam(String tradingTeam) {
    this.tradingTeam = tradingTeam;
  }


  public OrderParameters trader(String trader) {
    this.trader = trader;
    return this;
  }

   /**
   * User Id of assigned trader.
   * @return trader
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "User Id of assigned trader.")
  @JsonProperty(JSON_PROPERTY_TRADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrader() {
    return trader;
  }


  @JsonProperty(JSON_PROPERTY_TRADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrader(String trader) {
    this.trader = trader;
  }


  public OrderParameters transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique Id for the transaction
   * @return transactionId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique Id for the transaction")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public OrderParameters orderId(String orderId) {
    this.orderId = JsonNullable.<String>of(orderId);
    return this;
  }

   /**
   * Unique Id of the order which originated the record
   * @return orderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique Id of the order which originated the record")
  @JsonIgnore

  public String getOrderId() {
        return orderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrderId_JsonNullable() {
    return orderId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  public void setOrderId_JsonNullable(JsonNullable<String> orderId) {
    this.orderId = orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = JsonNullable.<String>of(orderId);
  }


  public OrderParameters portfolio(String portfolio) {
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Path of the portfolio (Ex: Client:/folder1/testing.ofdb)
   * @return portfolio
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path of the portfolio (Ex: Client:/folder1/testing.ofdb)")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPortfolio() {
    return portfolio;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }


  public OrderParameters symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol corresponding to the traded instrument.
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Symbol corresponding to the traded instrument.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public OrderParameters description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public OrderParameters tradeType(String tradeType) {
    this.tradeType = tradeType;
    return this;
  }

   /**
   * Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.
   * @return tradeType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.")
  @JsonProperty(JSON_PROPERTY_TRADE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradeType() {
    return tradeType;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }


  public OrderParameters unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Unit type could be one of Quantity or Value.
   * @return unitType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unit type could be one of Quantity or Value.")
  @JsonProperty(JSON_PROPERTY_UNIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnitType() {
    return unitType;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public OrderParameters transactionLeaves(Double transactionLeaves) {
    this.transactionLeaves = transactionLeaves;
    return this;
  }

   /**
   * Shares that have been ordered and not executed
   * @return transactionLeaves
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Shares that have been ordered and not executed")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_LEAVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTransactionLeaves() {
    return transactionLeaves;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_LEAVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionLeaves(Double transactionLeaves) {
    this.transactionLeaves = transactionLeaves;
  }


  public OrderParameters quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the instrument traded.
   * @return quantity
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Quantity of the instrument traded.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public OrderParameters gross(Double gross) {
    this.gross = gross;
    return this;
  }

   /**
   * Cash value of the transaction
   * @return gross
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cash value of the transaction")
  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getGross() {
    return gross;
  }


  @JsonProperty(JSON_PROPERTY_GROSS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGross(Double gross) {
    this.gross = gross;
  }


  public OrderParameters price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The transaction price
   * @return price
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The transaction price")
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


  public OrderParameters currencyISO(String currencyISO) {
    this.currencyISO = currencyISO;
    return this;
  }

   /**
   * The currency code of cash valued fields, Net Amount and Gross Amount.
   * @return currencyISO
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency code of cash valued fields, Net Amount and Gross Amount.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_I_S_O)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyISO() {
    return currencyISO;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_I_S_O)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyISO(String currencyISO) {
    this.currencyISO = currencyISO;
  }


  public OrderParameters tradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * Trade date which is in the format YYYY-MM-DD
   * @return tradeDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trade date which is in the format YYYY-MM-DD")
  @JsonProperty(JSON_PROPERTY_TRADE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradeDate() {
    return tradeDate;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
  }


  public OrderParameters addedDateTime(String addedDateTime) {
    this.addedDateTime = addedDateTime;
    return this;
  }

   /**
   * Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF
   * @return addedDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF")
  @JsonProperty(JSON_PROPERTY_ADDED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddedDateTime() {
    return addedDateTime;
  }


  @JsonProperty(JSON_PROPERTY_ADDED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddedDateTime(String addedDateTime) {
    this.addedDateTime = addedDateTime;
  }


  public OrderParameters updatedDateTime(String updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
    return this;
  }

   /**
   * Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF
   * @return updatedDateTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF")
  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedDateTime() {
    return updatedDateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedDateTime(String updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
  }


   /**
   * Get entity
   * @return entity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntity() {
    return entity;
  }




   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }




  /**
   * Return true if this OrderParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderParameters orderParameters = (OrderParameters) o;
    return Objects.equals(this.transactionStatus, orderParameters.transactionStatus) &&
        Objects.equals(this.instructionType, orderParameters.instructionType) &&
        Objects.equals(this.instructionValue, orderParameters.instructionValue) &&
        Objects.equals(this.tif, orderParameters.tif) &&
        Objects.equals(this.tifDate, orderParameters.tifDate) &&
        Objects.equals(this.fundTeam, orderParameters.fundTeam) &&
        Objects.equals(this.tradingTeam, orderParameters.tradingTeam) &&
        Objects.equals(this.trader, orderParameters.trader) &&
        Objects.equals(this.transactionId, orderParameters.transactionId) &&
        equalsNullable(this.orderId, orderParameters.orderId) &&
        Objects.equals(this.portfolio, orderParameters.portfolio) &&
        Objects.equals(this.symbol, orderParameters.symbol) &&
        Objects.equals(this.description, orderParameters.description) &&
        Objects.equals(this.tradeType, orderParameters.tradeType) &&
        Objects.equals(this.unitType, orderParameters.unitType) &&
        Objects.equals(this.transactionLeaves, orderParameters.transactionLeaves) &&
        Objects.equals(this.quantity, orderParameters.quantity) &&
        Objects.equals(this.gross, orderParameters.gross) &&
        Objects.equals(this.price, orderParameters.price) &&
        Objects.equals(this.currencyISO, orderParameters.currencyISO) &&
        Objects.equals(this.tradeDate, orderParameters.tradeDate) &&
        Objects.equals(this.addedDateTime, orderParameters.addedDateTime) &&
        Objects.equals(this.updatedDateTime, orderParameters.updatedDateTime) &&
        Objects.equals(this.entity, orderParameters.entity) &&
        Objects.equals(this.status, orderParameters.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, instructionType, instructionValue, tif, tifDate, fundTeam, tradingTeam, trader, transactionId, hashCodeNullable(orderId), portfolio, symbol, description, tradeType, unitType, transactionLeaves, quantity, gross, price, currencyISO, tradeDate, addedDateTime, updatedDateTime, entity, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderParameters {\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    instructionValue: ").append(toIndentedString(instructionValue)).append("\n");
    sb.append("    tif: ").append(toIndentedString(tif)).append("\n");
    sb.append("    tifDate: ").append(toIndentedString(tifDate)).append("\n");
    sb.append("    fundTeam: ").append(toIndentedString(fundTeam)).append("\n");
    sb.append("    tradingTeam: ").append(toIndentedString(tradingTeam)).append("\n");
    sb.append("    trader: ").append(toIndentedString(trader)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    transactionLeaves: ").append(toIndentedString(transactionLeaves)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currencyISO: ").append(toIndentedString(currencyISO)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    addedDateTime: ").append(toIndentedString(addedDateTime)).append("\n");
    sb.append("    updatedDateTime: ").append(toIndentedString(updatedDateTime)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

