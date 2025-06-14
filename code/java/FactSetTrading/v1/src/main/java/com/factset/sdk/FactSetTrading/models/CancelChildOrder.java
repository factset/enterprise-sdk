/*
 * Trading API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1.0.0
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
 * Cancel Child Order
 */
@ApiModel(description = "Cancel Child Order")
@JsonPropertyOrder({
  CancelChildOrder.JSON_PROPERTY_TICKET_ID,
  CancelChildOrder.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CancelChildOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TICKET_ID = "ticketId";
  private String ticketId;

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public CancelChildOrder() { 
  }

  @JsonCreator
  public CancelChildOrder(
    @JsonProperty(value=JSON_PROPERTY_TICKET_ID, required=true) String ticketId
  ) {
    this();
    this.ticketId = ticketId;
  }

  public CancelChildOrder ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Ticket Id for the child order to be cancelled
   * @return ticketId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "RKPW.3280015", required = true, value = "Ticket Id for the child order to be cancelled")
  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTicketId() {
    return ticketId;
  }


  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }


  public CancelChildOrder reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

   /**
   * Reason for cancelling the child order
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "mistyped order quantity to be routed", value = "Reason for cancelling the child order")
  @JsonIgnore

  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  /**
   * Return true if this CancelChildOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelChildOrder cancelChildOrder = (CancelChildOrder) o;
    return Objects.equals(this.ticketId, cancelChildOrder.ticketId) &&
        equalsNullable(this.reason, cancelChildOrder.reason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, hashCodeNullable(reason));
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
    sb.append("class CancelChildOrder {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

