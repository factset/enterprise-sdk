/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetTrading.models.ParentId;
import com.factset.sdk.FactSetTrading.models.TimeInForce;
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
import com.factset.sdk.FactSetTrading.JSON;


/**
 * EMS Child Orders
 */
@ApiModel(description = "EMS Child Orders")
@JsonPropertyOrder({
  EMSChildOrder.JSON_PROPERTY_PARENT_ID,
  EMSChildOrder.JSON_PROPERTY_SIDE,
  EMSChildOrder.JSON_PROPERTY_ORDER_TYPE,
  EMSChildOrder.JSON_PROPERTY_ORDER_QUANTITY,
  EMSChildOrder.JSON_PROPERTY_PRICE,
  EMSChildOrder.JSON_PROPERTY_TIME_IN_FORCE,
  EMSChildOrder.JSON_PROPERTY_HANDLING_INSTRUCTIONS,
  EMSChildOrder.JSON_PROPERTY_EX_DESTINATION,
  EMSChildOrder.JSON_PROPERTY_DESTINATION,
  EMSChildOrder.JSON_PROPERTY_STOP_PRICE,
  EMSChildOrder.JSON_PROPERTY_MAX_FLOOR,
  EMSChildOrder.JSON_PROPERTY_MIN_QUANTITY,
  EMSChildOrder.JSON_PROPERTY_SETTLEMENT_TYPE,
  EMSChildOrder.JSON_PROPERTY_SETTLEMENT_DATE,
  EMSChildOrder.JSON_PROPERTY_EXECUTION_INSTRUCTIONS,
  EMSChildOrder.JSON_PROPERTY_LOCATE_REQUIRED,
  EMSChildOrder.JSON_PROPERTY_TEXT,
  EMSChildOrder.JSON_PROPERTY_PROFILE,
  EMSChildOrder.JSON_PROPERTY_USER_DEFINED_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EMSChildOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private ParentId parentId;

  /**
   * Side of the order.If the parent order side is &#39;buy&#39;, valid values are &#39;buy&#39; or &#39;buyMinus&#39;. If the parent order side is &#39;sell&#39;, valid values are &#39;sell&#39; or &#39;sellPlus&#39;
   */
  public enum SideEnum {
    BUY("buy"),
    
    SELL("sell"),
    
    BUYMINUS("buyMinus"),
    
    SELLPLUS("sellPlus"),
    
    SELLSHORT("sellShort"),
    
    SELLSHORTEXEMPT("sellShortExempt");

    private String value;

    SideEnum(String value) {
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
    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SIDE = "side";
  private JsonNullable<SideEnum> side = JsonNullable.<SideEnum>undefined();

  /**
   * Type of the order
   */
  public enum OrderTypeEnum {
    MARKET("market"),
    
    LIMIT("limit"),
    
    STOP("stop"),
    
    STOPLIMIT("stopLimit"),
    
    MARKETONCLOSE("marketOnClose"),
    
    LIMITORBETTER("limitOrBetter");

    private String value;

    OrderTypeEnum(String value) {
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
    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  private OrderTypeEnum orderType;

  public static final String JSON_PROPERTY_ORDER_QUANTITY = "orderQuantity";
  private Double orderQuantity;

  public static final String JSON_PROPERTY_PRICE = "price";
  private JsonNullable<Double> price = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TIME_IN_FORCE = "timeInForce";
  private TimeInForce timeInForce;

  /**
   * Instructions for order handling on Broker trading floor.
   */
  public enum HandlingInstructionsEnum {
    AUTOORDERPRIVATE("autoOrderPrivate"),
    
    AUTOORDERPUBLIC("autoOrderPublic"),
    
    BESTEXECUTION("bestExecution");

    private String value;

    HandlingInstructionsEnum(String value) {
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
    public static HandlingInstructionsEnum fromValue(String value) {
      for (HandlingInstructionsEnum b : HandlingInstructionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_HANDLING_INSTRUCTIONS = "handlingInstructions";
  private JsonNullable<HandlingInstructionsEnum> handlingInstructions = JsonNullable.<HandlingInstructionsEnum>undefined();

  public static final String JSON_PROPERTY_EX_DESTINATION = "exDestination";
  private JsonNullable<String> exDestination = JsonNullable.<String>of("America Stock Exchange");

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public static final String JSON_PROPERTY_STOP_PRICE = "stopPrice";
  private JsonNullable<Double> stopPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MAX_FLOOR = "maxFloor";
  private JsonNullable<Double> maxFloor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MIN_QUANTITY = "minQuantity";
  private JsonNullable<Double> minQuantity = JsonNullable.<Double>undefined();

  /**
   * Order settlement period
   */
  public enum SettlementTypeEnum {
    REGULAR("regular"),
    
    CASH("cash"),
    
    NEXTDAY("nextDay"),
    
    TPLUS2("tPlus2"),
    
    TPLUS3("tPlus3"),
    
    TPLUS4("tPlus4"),
    
    FUTURE("future"),
    
    WHENISSUED("whenIssued"),
    
    SELLERSOPTION("sellersOption"),
    
    TPLUS5("tPlus5");

    private String value;

    SettlementTypeEnum(String value) {
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
    public static SettlementTypeEnum fromValue(String value) {
      for (SettlementTypeEnum b : SettlementTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SETTLEMENT_TYPE = "settlementType";
  private JsonNullable<SettlementTypeEnum> settlementType = JsonNullable.<SettlementTypeEnum>undefined();

  public static final String JSON_PROPERTY_SETTLEMENT_DATE = "settlementDate";
  private JsonNullable<String> settlementDate = JsonNullable.<String>undefined();

  /**
   * Instructions for order handling on exchange trading floor.
   */
  public enum ExecutionInstructionsEnum {
    NOTHELD("notHeld"),
    
    WORK("work"),
    
    GOALONG("goAlong"),
    
    OVERTHEDAY("overTheDay"),
    
    HELD("held"),
    
    PARTICIPATEDONOTINITIATE("participateDoNotInitiate"),
    
    STRICTSCALE("strictScale"),
    
    TRYTOSCALE("tryToScale"),
    
    STAYONBIDSIDE("stayOnBidSide"),
    
    STAYONOFFERSIDE("stayOnOfferSide"),
    
    NOCROSS("noCross"),
    
    OKTOCROSS("okToCross"),
    
    CALLFIRST("callFirst"),
    
    PERCENTOFVOLUME("percentOfVolume"),
    
    DONOTINCREASE("doNotIncrease"),
    
    DONOTREDUCE("doNotReduce"),
    
    ALLORNONE("allOrNone"),
    
    REINSTATEONSYSTEMFAILURE("reinstateOnSystemFailure"),
    
    INSTITUTIONSONLY("institutionsOnly"),
    
    REINSTATEONTRADINGHALT("reinstateOnTradingHalt"),
    
    CANCELONTRADINGHALT("cancelOnTradingHalt"),
    
    LASTPEG("lastPeg"),
    
    MIDPRICEPEG("midPricePeg"),
    
    NONNEGOTIABLE("nonNegotiable"),
    
    OPENINGPEG("openingPeg"),
    
    MARKETPEG("marketPeg"),
    
    CANCELONSYSTEMFAILURE("cancelOnSystemFailure"),
    
    PRIMARYPEG("primaryPeg"),
    
    SUSPEND("suspend"),
    
    FIXEDPEGTOLOCALBESTBID("fixedPegToLocalBestBid"),
    
    CUSTOMERDISPLAYINSTRUCTION("customerDisplayInstruction"),
    
    NETTING("netting"),
    
    PEGTOVWAP("pegToVWAP"),
    
    TRADEALONG("tradeAlong"),
    
    TRYTOSTOP("tryToStop"),
    
    CANCELIFNOTBEST("cancelIfNotBest"),
    
    TRAILINGSTOPPEG("trailingStopPeg"),
    
    STRICTLIMIT("strictLimit"),
    
    IGNOREPRICEVALIDITYCHECKS("ignorePriceValidityChecks"),
    
    PEGTOLIMITPRICE("pegToLimitPrice"),
    
    WORKTOTARGETSTRATEGY("workToTargetStrategy"),
    
    INTERMARKETSWEEP("intermarketSweep"),
    
    EXTERNALROUTINGALLOWED("externalRoutingAllowed"),
    
    EXTERNALROUTINGNOTALLOWED("externalRoutingNotAllowed"),
    
    IMBALANCEONLY("imbalanceOnly"),
    
    SINGLEEXECUTIONREQUESTEDFORBLOCKTRADE("singleExecutionRequestedForBlockTrade"),
    
    BESTEXECUTION("bestExecution");

    private String value;

    ExecutionInstructionsEnum(String value) {
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
    public static ExecutionInstructionsEnum fromValue(String value) {
      for (ExecutionInstructionsEnum b : ExecutionInstructionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_EXECUTION_INSTRUCTIONS = "executionInstructions";
  private JsonNullable<ExecutionInstructionsEnum> executionInstructions = JsonNullable.<ExecutionInstructionsEnum>undefined();

  public static final String JSON_PROPERTY_LOCATE_REQUIRED = "locateRequired";
  private JsonNullable<Boolean> locateRequired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private JsonNullable<String> profile = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_DEFINED_FIELDS = "userDefinedFields";
  private JsonNullable<java.util.Map<String, String>> userDefinedFields = JsonNullable.<java.util.Map<String, String>>undefined();

  public EMSChildOrder() { 
  }

  @JsonCreator
  public EMSChildOrder(
    @JsonProperty(value=JSON_PROPERTY_PARENT_ID, required=true) ParentId parentId, 
    @JsonProperty(value=JSON_PROPERTY_ORDER_TYPE, required=true) OrderTypeEnum orderType, 
    @JsonProperty(value=JSON_PROPERTY_ORDER_QUANTITY, required=true) Double orderQuantity, 
    @JsonProperty(value=JSON_PROPERTY_DESTINATION, required=true) String destination
  ) {
    this();
    this.parentId = parentId;
    this.orderType = orderType;
    this.orderQuantity = orderQuantity;
    this.destination = destination;
  }

  public EMSChildOrder parentId(ParentId parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ParentId getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentId(ParentId parentId) {
    this.parentId = parentId;
  }


  public EMSChildOrder side(SideEnum side) {
    this.side = JsonNullable.<SideEnum>of(side);
    return this;
  }

   /**
   * Side of the order.If the parent order side is &#39;buy&#39;, valid values are &#39;buy&#39; or &#39;buyMinus&#39;. If the parent order side is &#39;sell&#39;, valid values are &#39;sell&#39; or &#39;sellPlus&#39;
   * @return side
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "buy", value = "Side of the order.If the parent order side is 'buy', valid values are 'buy' or 'buyMinus'. If the parent order side is 'sell', valid values are 'sell' or 'sellPlus'")
  @JsonIgnore

  public SideEnum getSide() {
        return side.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SideEnum> getSide_JsonNullable() {
    return side;
  }
  
  @JsonProperty(JSON_PROPERTY_SIDE)
  public void setSide_JsonNullable(JsonNullable<SideEnum> side) {
    this.side = side;
  }

  public void setSide(SideEnum side) {
    this.side = JsonNullable.<SideEnum>of(side);
  }


  public EMSChildOrder orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Type of the order
   * @return orderType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "market", required = true, value = "Type of the order")
  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderTypeEnum getOrderType() {
    return orderType;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }


  public EMSChildOrder orderQuantity(Double orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

   /**
   * Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
   * minimum: 0
   * @return orderQuantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "250", required = true, value = "Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.")
  @JsonProperty(JSON_PROPERTY_ORDER_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getOrderQuantity() {
    return orderQuantity;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderQuantity(Double orderQuantity) {
    this.orderQuantity = orderQuantity;
  }


  public EMSChildOrder price(Double price) {
    this.price = JsonNullable.<Double>of(price);
    return this;
  }

   /**
   * Order price per share.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "450", value = "Order price per share.")
  @JsonIgnore

  public Double getPrice() {
        return price.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPrice_JsonNullable() {
    return price;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE)
  public void setPrice_JsonNullable(JsonNullable<Double> price) {
    this.price = price;
  }

  public void setPrice(Double price) {
    this.price = JsonNullable.<Double>of(price);
  }


  public EMSChildOrder timeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_IN_FORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }


  @JsonProperty(JSON_PROPERTY_TIME_IN_FORCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }


  public EMSChildOrder handlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = JsonNullable.<HandlingInstructionsEnum>of(handlingInstructions);
    return this;
  }

   /**
   * Instructions for order handling on Broker trading floor.
   * @return handlingInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "autoOrderPublic", value = "Instructions for order handling on Broker trading floor.")
  @JsonIgnore

  public HandlingInstructionsEnum getHandlingInstructions() {
        return handlingInstructions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HANDLING_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<HandlingInstructionsEnum> getHandlingInstructions_JsonNullable() {
    return handlingInstructions;
  }
  
  @JsonProperty(JSON_PROPERTY_HANDLING_INSTRUCTIONS)
  public void setHandlingInstructions_JsonNullable(JsonNullable<HandlingInstructionsEnum> handlingInstructions) {
    this.handlingInstructions = handlingInstructions;
  }

  public void setHandlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = JsonNullable.<HandlingInstructionsEnum>of(handlingInstructions);
  }


  public EMSChildOrder exDestination(String exDestination) {
    this.exDestination = JsonNullable.<String>of(exDestination);
    return this;
  }

   /**
   * Execution destination as defined by institution when order is entered.
   * @return exDestination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America Stock Exchange", value = "Execution destination as defined by institution when order is entered.")
  @JsonIgnore

  public String getExDestination() {
        return exDestination.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EX_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExDestination_JsonNullable() {
    return exDestination;
  }
  
  @JsonProperty(JSON_PROPERTY_EX_DESTINATION)
  public void setExDestination_JsonNullable(JsonNullable<String> exDestination) {
    this.exDestination = exDestination;
  }

  public void setExDestination(String exDestination) {
    this.exDestination = JsonNullable.<String>of(exDestination);
  }


  public EMSChildOrder destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Represents the designated venue or location to which an order is intended to be routed.
   * @return destination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PAPER", required = true, value = "Represents the designated venue or location to which an order is intended to be routed.")
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(String destination) {
    this.destination = destination;
  }


  public EMSChildOrder stopPrice(Double stopPrice) {
    this.stopPrice = JsonNullable.<Double>of(stopPrice);
    return this;
  }

   /**
   * Stop-loss price to buy/sell stock at market.
   * @return stopPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "250", value = "Stop-loss price to buy/sell stock at market.")
  @JsonIgnore

  public Double getStopPrice() {
        return stopPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STOP_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getStopPrice_JsonNullable() {
    return stopPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_STOP_PRICE)
  public void setStopPrice_JsonNullable(JsonNullable<Double> stopPrice) {
    this.stopPrice = stopPrice;
  }

  public void setStopPrice(Double stopPrice) {
    this.stopPrice = JsonNullable.<Double>of(stopPrice);
  }


  public EMSChildOrder maxFloor(Double maxFloor) {
    this.maxFloor = JsonNullable.<Double>of(maxFloor);
    return this;
  }

   /**
   * Maximum number of shares within an order to be shown on the exchange floor at any given time.
   * @return maxFloor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Maximum number of shares within an order to be shown on the exchange floor at any given time.")
  @JsonIgnore

  public Double getMaxFloor() {
        return maxFloor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMaxFloor_JsonNullable() {
    return maxFloor;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_FLOOR)
  public void setMaxFloor_JsonNullable(JsonNullable<Double> maxFloor) {
    this.maxFloor = maxFloor;
  }

  public void setMaxFloor(Double maxFloor) {
    this.maxFloor = JsonNullable.<Double>of(maxFloor);
  }


  public EMSChildOrder minQuantity(Double minQuantity) {
    this.minQuantity = JsonNullable.<Double>of(minQuantity);
    return this;
  }

   /**
   * Minimum quantity of an order to be executed.
   * @return minQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "Minimum quantity of an order to be executed.")
  @JsonIgnore

  public Double getMinQuantity() {
        return minQuantity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMinQuantity_JsonNullable() {
    return minQuantity;
  }
  
  @JsonProperty(JSON_PROPERTY_MIN_QUANTITY)
  public void setMinQuantity_JsonNullable(JsonNullable<Double> minQuantity) {
    this.minQuantity = minQuantity;
  }

  public void setMinQuantity(Double minQuantity) {
    this.minQuantity = JsonNullable.<Double>of(minQuantity);
  }


  public EMSChildOrder settlementType(SettlementTypeEnum settlementType) {
    this.settlementType = JsonNullable.<SettlementTypeEnum>of(settlementType);
    return this;
  }

   /**
   * Order settlement period
   * @return settlementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "regular", value = "Order settlement period")
  @JsonIgnore

  public SettlementTypeEnum getSettlementType() {
        return settlementType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTLEMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SettlementTypeEnum> getSettlementType_JsonNullable() {
    return settlementType;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_TYPE)
  public void setSettlementType_JsonNullable(JsonNullable<SettlementTypeEnum> settlementType) {
    this.settlementType = settlementType;
  }

  public void setSettlementType(SettlementTypeEnum settlementType) {
    this.settlementType = JsonNullable.<SettlementTypeEnum>of(settlementType);
  }


  public EMSChildOrder settlementDate(String settlementDate) {
    this.settlementDate = JsonNullable.<String>of(settlementDate);
    return this;
  }

   /**
   * Specific date of trade settlement in YYYYMMDD format.
   * @return settlementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20230823", value = "Specific date of trade settlement in YYYYMMDD format.")
  @JsonIgnore

  public String getSettlementDate() {
        return settlementDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSettlementDate_JsonNullable() {
    return settlementDate;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  public void setSettlementDate_JsonNullable(JsonNullable<String> settlementDate) {
    this.settlementDate = settlementDate;
  }

  public void setSettlementDate(String settlementDate) {
    this.settlementDate = JsonNullable.<String>of(settlementDate);
  }


  public EMSChildOrder executionInstructions(ExecutionInstructionsEnum executionInstructions) {
    this.executionInstructions = JsonNullable.<ExecutionInstructionsEnum>of(executionInstructions);
    return this;
  }

   /**
   * Instructions for order handling on exchange trading floor.
   * @return executionInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "notHeld", value = "Instructions for order handling on exchange trading floor.")
  @JsonIgnore

  public ExecutionInstructionsEnum getExecutionInstructions() {
        return executionInstructions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXECUTION_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ExecutionInstructionsEnum> getExecutionInstructions_JsonNullable() {
    return executionInstructions;
  }
  
  @JsonProperty(JSON_PROPERTY_EXECUTION_INSTRUCTIONS)
  public void setExecutionInstructions_JsonNullable(JsonNullable<ExecutionInstructionsEnum> executionInstructions) {
    this.executionInstructions = executionInstructions;
  }

  public void setExecutionInstructions(ExecutionInstructionsEnum executionInstructions) {
    this.executionInstructions = JsonNullable.<ExecutionInstructionsEnum>of(executionInstructions);
  }


  public EMSChildOrder locateRequired(Boolean locateRequired) {
    this.locateRequired = JsonNullable.<Boolean>of(locateRequired);
    return this;
  }

   /**
   * Indicates whether the broker is to locate the stock in conjunction with a short sell order.
   * @return locateRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.")
  @JsonIgnore

  public Boolean getLocateRequired() {
        return locateRequired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getLocateRequired_JsonNullable() {
    return locateRequired;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATE_REQUIRED)
  public void setLocateRequired_JsonNullable(JsonNullable<Boolean> locateRequired) {
    this.locateRequired = locateRequired;
  }

  public void setLocateRequired(Boolean locateRequired) {
    this.locateRequired = JsonNullable.<Boolean>of(locateRequired);
  }


  public EMSChildOrder text(String text) {
    this.text = JsonNullable.<String>of(text);
    return this;
  }

   /**
   * Free format text string.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "routing 10 orders to PAPER destination", value = "Free format text string.")
  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(String text) {
    this.text = JsonNullable.<String>of(text);
  }


  public EMSChildOrder profile(String profile) {
    this.profile = JsonNullable.<String>of(profile);
    return this;
  }

   /**
   * A name given to broker algo
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A name given to broker algo")
  @JsonIgnore

  public String getProfile() {
        return profile.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProfile_JsonNullable() {
    return profile;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE)
  public void setProfile_JsonNullable(JsonNullable<String> profile) {
    this.profile = profile;
  }

  public void setProfile(String profile) {
    this.profile = JsonNullable.<String>of(profile);
  }


  public EMSChildOrder userDefinedFields(java.util.Map<String, String> userDefinedFields) {
    this.userDefinedFields = JsonNullable.<java.util.Map<String, String>>of(userDefinedFields);
    return this;
  }

  public EMSChildOrder putUserDefinedFieldsItem(String key, String userDefinedFieldsItem) {
    if (this.userDefinedFields == null || !this.userDefinedFields.isPresent()) {
      this.userDefinedFields = JsonNullable.<java.util.Map<String, String>>of(new java.util.HashMap<>());
    }
    try {
      this.userDefinedFields.get().put(key, userDefinedFieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * User defined fields
   * @return userDefinedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User defined fields")
  @JsonIgnore

  public java.util.Map<String, String> getUserDefinedFields() {
        return userDefinedFields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_DEFINED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.Map<String, String>> getUserDefinedFields_JsonNullable() {
    return userDefinedFields;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_DEFINED_FIELDS)
  public void setUserDefinedFields_JsonNullable(JsonNullable<java.util.Map<String, String>> userDefinedFields) {
    this.userDefinedFields = userDefinedFields;
  }

  public void setUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
    this.userDefinedFields = JsonNullable.<java.util.Map<String, String>>of(userDefinedFields);
  }


  /**
   * Return true if this EMSChildOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSChildOrder emSChildOrder = (EMSChildOrder) o;
    return Objects.equals(this.parentId, emSChildOrder.parentId) &&
        equalsNullable(this.side, emSChildOrder.side) &&
        Objects.equals(this.orderType, emSChildOrder.orderType) &&
        Objects.equals(this.orderQuantity, emSChildOrder.orderQuantity) &&
        equalsNullable(this.price, emSChildOrder.price) &&
        Objects.equals(this.timeInForce, emSChildOrder.timeInForce) &&
        equalsNullable(this.handlingInstructions, emSChildOrder.handlingInstructions) &&
        equalsNullable(this.exDestination, emSChildOrder.exDestination) &&
        Objects.equals(this.destination, emSChildOrder.destination) &&
        equalsNullable(this.stopPrice, emSChildOrder.stopPrice) &&
        equalsNullable(this.maxFloor, emSChildOrder.maxFloor) &&
        equalsNullable(this.minQuantity, emSChildOrder.minQuantity) &&
        equalsNullable(this.settlementType, emSChildOrder.settlementType) &&
        equalsNullable(this.settlementDate, emSChildOrder.settlementDate) &&
        equalsNullable(this.executionInstructions, emSChildOrder.executionInstructions) &&
        equalsNullable(this.locateRequired, emSChildOrder.locateRequired) &&
        equalsNullable(this.text, emSChildOrder.text) &&
        equalsNullable(this.profile, emSChildOrder.profile) &&
        equalsNullable(this.userDefinedFields, emSChildOrder.userDefinedFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, hashCodeNullable(side), orderType, orderQuantity, hashCodeNullable(price), timeInForce, hashCodeNullable(handlingInstructions), hashCodeNullable(exDestination), destination, hashCodeNullable(stopPrice), hashCodeNullable(maxFloor), hashCodeNullable(minQuantity), hashCodeNullable(settlementType), hashCodeNullable(settlementDate), hashCodeNullable(executionInstructions), hashCodeNullable(locateRequired), hashCodeNullable(text), hashCodeNullable(profile), hashCodeNullable(userDefinedFields));
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
    sb.append("class EMSChildOrder {\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    handlingInstructions: ").append(toIndentedString(handlingInstructions)).append("\n");
    sb.append("    exDestination: ").append(toIndentedString(exDestination)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
    sb.append("    maxFloor: ").append(toIndentedString(maxFloor)).append("\n");
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    executionInstructions: ").append(toIndentedString(executionInstructions)).append("\n");
    sb.append("    locateRequired: ").append(toIndentedString(locateRequired)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    userDefinedFields: ").append(toIndentedString(userDefinedFields)).append("\n");
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
