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
 * EMS Order Metadata
 */
@ApiModel(description = "EMS Order Metadata")
@JsonPropertyOrder({
  EMSOrderMetadata.JSON_PROPERTY_SYMBOL,
  EMSOrderMetadata.JSON_PROPERTY_SIDE,
  EMSOrderMetadata.JSON_PROPERTY_ORDER_TYPE,
  EMSOrderMetadata.JSON_PROPERTY_ORDER_QUANTITY,
  EMSOrderMetadata.JSON_PROPERTY_ERROR,
  EMSOrderMetadata.JSON_PROPERTY_INFO,
  EMSOrderMetadata.JSON_PROPERTY_CLIENT_ORDER_ID,
  EMSOrderMetadata.JSON_PROPERTY_WARNING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EMSOrderMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private JsonNullable<String> symbol = JsonNullable.<String>undefined();

  /**
   * Side of the order
   */
  public enum SideEnum {
    BUY("buy"),
    
    SELL("sell"),
    
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
      return null;
    }
  }

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  private JsonNullable<OrderTypeEnum> orderType = JsonNullable.<OrderTypeEnum>undefined();

  public static final String JSON_PROPERTY_ORDER_QUANTITY = "orderQuantity";
  private JsonNullable<Double> orderQuantity = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<String> error = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFO = "info";
  private JsonNullable<String> info = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLIENT_ORDER_ID = "clientOrderId";
  private JsonNullable<String> clientOrderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WARNING = "warning";
  private JsonNullable<String> warning = JsonNullable.<String>undefined();

  public EMSOrderMetadata() { 
  }

  public EMSOrderMetadata symbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
    return this;
  }

   /**
   * Ticker symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ticker symbol")
  @JsonIgnore

  public String getSymbol() {
        return symbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSymbol_JsonNullable() {
    return symbol;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  public void setSymbol_JsonNullable(JsonNullable<String> symbol) {
    this.symbol = symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
  }


  public EMSOrderMetadata side(SideEnum side) {
    this.side = JsonNullable.<SideEnum>of(side);
    return this;
  }

   /**
   * Side of the order
   * @return side
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Side of the order")
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


  public EMSOrderMetadata orderType(OrderTypeEnum orderType) {
    this.orderType = JsonNullable.<OrderTypeEnum>of(orderType);
    return this;
  }

   /**
   * Type of the order
   * @return orderType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of the order")
  @JsonIgnore

  public OrderTypeEnum getOrderType() {
        return orderType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OrderTypeEnum> getOrderType_JsonNullable() {
    return orderType;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  public void setOrderType_JsonNullable(JsonNullable<OrderTypeEnum> orderType) {
    this.orderType = orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = JsonNullable.<OrderTypeEnum>of(orderType);
  }


  public EMSOrderMetadata orderQuantity(Double orderQuantity) {
    this.orderQuantity = JsonNullable.<Double>of(orderQuantity);
    return this;
  }

   /**
   * Number of shares/Quantity.
   * @return orderQuantity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of shares/Quantity.")
  @JsonIgnore

  public Double getOrderQuantity() {
        return orderQuantity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getOrderQuantity_JsonNullable() {
    return orderQuantity;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_QUANTITY)
  public void setOrderQuantity_JsonNullable(JsonNullable<Double> orderQuantity) {
    this.orderQuantity = orderQuantity;
  }

  public void setOrderQuantity(Double orderQuantity) {
    this.orderQuantity = JsonNullable.<Double>of(orderQuantity);
  }


  public EMSOrderMetadata error(String error) {
    this.error = JsonNullable.<String>of(error);
    return this;
  }

   /**
   * Error message
   * @return error
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Error message")
  @JsonIgnore

  public String getError() {
        return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<String> error) {
    this.error = error;
  }

  public void setError(String error) {
    this.error = JsonNullable.<String>of(error);
  }


  public EMSOrderMetadata info(String info) {
    this.info = JsonNullable.<String>of(info);
    return this;
  }

   /**
   * Information
   * @return info
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Information")
  @JsonIgnore

  public String getInfo() {
        return info.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInfo_JsonNullable() {
    return info;
  }
  
  @JsonProperty(JSON_PROPERTY_INFO)
  public void setInfo_JsonNullable(JsonNullable<String> info) {
    this.info = info;
  }

  public void setInfo(String info) {
    this.info = JsonNullable.<String>of(info);
  }


  public EMSOrderMetadata clientOrderId(String clientOrderId) {
    this.clientOrderId = JsonNullable.<String>of(clientOrderId);
    return this;
  }

   /**
   * Client Order Id
   * @return clientOrderId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Client Order Id")
  @JsonIgnore

  public String getClientOrderId() {
        return clientOrderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientOrderId_JsonNullable() {
    return clientOrderId;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_ORDER_ID)
  public void setClientOrderId_JsonNullable(JsonNullable<String> clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = JsonNullable.<String>of(clientOrderId);
  }


  public EMSOrderMetadata warning(String warning) {
    this.warning = JsonNullable.<String>of(warning);
    return this;
  }

   /**
   * Warning
   * @return warning
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Warning")
  @JsonIgnore

  public String getWarning() {
        return warning.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWarning_JsonNullable() {
    return warning;
  }
  
  @JsonProperty(JSON_PROPERTY_WARNING)
  public void setWarning_JsonNullable(JsonNullable<String> warning) {
    this.warning = warning;
  }

  public void setWarning(String warning) {
    this.warning = JsonNullable.<String>of(warning);
  }


  /**
   * Return true if this EMSOrderMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSOrderMetadata emSOrderMetadata = (EMSOrderMetadata) o;
    return equalsNullable(this.symbol, emSOrderMetadata.symbol) &&
        equalsNullable(this.side, emSOrderMetadata.side) &&
        equalsNullable(this.orderType, emSOrderMetadata.orderType) &&
        equalsNullable(this.orderQuantity, emSOrderMetadata.orderQuantity) &&
        equalsNullable(this.error, emSOrderMetadata.error) &&
        equalsNullable(this.info, emSOrderMetadata.info) &&
        equalsNullable(this.clientOrderId, emSOrderMetadata.clientOrderId) &&
        equalsNullable(this.warning, emSOrderMetadata.warning);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(symbol), hashCodeNullable(side), hashCodeNullable(orderType), hashCodeNullable(orderQuantity), hashCodeNullable(error), hashCodeNullable(info), hashCodeNullable(clientOrderId), hashCodeNullable(warning));
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
    sb.append("class EMSOrderMetadata {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

