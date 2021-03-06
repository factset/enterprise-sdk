/*
 * Bonds API For Digital Portals
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentCouponOccurrenceFrequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Occurrence and frequency of the coupon payments.
 */
@ApiModel(description = "Occurrence and frequency of the coupon payments.")
@JsonPropertyOrder({
  InlineResponse2003InstrumentCouponOccurrence.JSON_PROPERTY_TYPE,
  InlineResponse2003InstrumentCouponOccurrence.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003InstrumentCouponOccurrence implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Occurrence type of the coupon payments.
   */
  public enum TypeEnum {
    NEVER("never"),
    
    ONCE("once"),
    
    REPEATED("repeated");

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

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private InlineResponse2003InstrumentCouponOccurrenceFrequency frequency;

  public InlineResponse2003InstrumentCouponOccurrence() { 
  }

  public InlineResponse2003InstrumentCouponOccurrence type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Occurrence type of the coupon payments.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurrence type of the coupon payments.")
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


  public InlineResponse2003InstrumentCouponOccurrence frequency(InlineResponse2003InstrumentCouponOccurrenceFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentCouponOccurrenceFrequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(InlineResponse2003InstrumentCouponOccurrenceFrequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this inline_response_200_3_instrument_coupon_occurrence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003InstrumentCouponOccurrence inlineResponse2003InstrumentCouponOccurrence = (InlineResponse2003InstrumentCouponOccurrence) o;
    return Objects.equals(this.type, inlineResponse2003InstrumentCouponOccurrence.type) &&
        Objects.equals(this.frequency, inlineResponse2003InstrumentCouponOccurrence.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003InstrumentCouponOccurrence {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

