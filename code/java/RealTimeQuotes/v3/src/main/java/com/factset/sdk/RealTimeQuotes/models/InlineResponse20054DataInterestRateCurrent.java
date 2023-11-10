/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20054DataInterestRateCurrentAccruedInterest;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20054DataInterestRateCurrentType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Details of the current coupon period.
 */
@ApiModel(description = "Details of the current coupon period.")
@JsonPropertyOrder({
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_VALUE,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_TYPE,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_ACCRUED_INTEREST,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_PERIOD_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20054DataInterestRateCurrent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<BigDecimal> value = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20054DataInterestRateCurrentType type;

  public static final String JSON_PROPERTY_ACCRUED_INTEREST = "accruedInterest";
  private InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  private JsonNullable<LocalDate> periodEnd = JsonNullable.<LocalDate>undefined();

  public InlineResponse20054DataInterestRateCurrent() { 
  }

  public InlineResponse20054DataInterestRateCurrent value(BigDecimal value) {
    this.value = JsonNullable.<BigDecimal>of(value);
    return this;
  }

   /**
   * Value of the interest rate.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the interest rate.")
  @JsonIgnore

  public BigDecimal getValue() {
        return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<BigDecimal> value) {
    this.value = value;
  }

  public void setValue(BigDecimal value) {
    this.value = JsonNullable.<BigDecimal>of(value);
  }


  public InlineResponse20054DataInterestRateCurrent type(InlineResponse20054DataInterestRateCurrentType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataInterestRateCurrentType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20054DataInterestRateCurrentType type) {
    this.type = type;
  }


  public InlineResponse20054DataInterestRateCurrent accruedInterest(InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest) {
    this.accruedInterest = accruedInterest;
    return this;
  }

   /**
   * Get accruedInterest
   * @return accruedInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataInterestRateCurrentAccruedInterest getAccruedInterest() {
    return accruedInterest;
  }


  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccruedInterest(InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest) {
    this.accruedInterest = accruedInterest;
  }


  public InlineResponse20054DataInterestRateCurrent periodEnd(LocalDate periodEnd) {
    this.periodEnd = JsonNullable.<LocalDate>of(periodEnd);
    return this;
  }

   /**
   * Ending date (inclusive).
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending date (inclusive).")
  @JsonIgnore

  public LocalDate getPeriodEnd() {
        return periodEnd.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getPeriodEnd_JsonNullable() {
    return periodEnd;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  public void setPeriodEnd_JsonNullable(JsonNullable<LocalDate> periodEnd) {
    this.periodEnd = periodEnd;
  }

  public void setPeriodEnd(LocalDate periodEnd) {
    this.periodEnd = JsonNullable.<LocalDate>of(periodEnd);
  }


  /**
   * Return true if this inline_response_200_54_data_interestRate_current object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054DataInterestRateCurrent inlineResponse20054DataInterestRateCurrent = (InlineResponse20054DataInterestRateCurrent) o;
    return equalsNullable(this.value, inlineResponse20054DataInterestRateCurrent.value) &&
        Objects.equals(this.type, inlineResponse20054DataInterestRateCurrent.type) &&
        Objects.equals(this.accruedInterest, inlineResponse20054DataInterestRateCurrent.accruedInterest) &&
        equalsNullable(this.periodEnd, inlineResponse20054DataInterestRateCurrent.periodEnd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(value), type, accruedInterest, hashCodeNullable(periodEnd));
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
    sb.append("class InlineResponse20054DataInterestRateCurrent {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
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
