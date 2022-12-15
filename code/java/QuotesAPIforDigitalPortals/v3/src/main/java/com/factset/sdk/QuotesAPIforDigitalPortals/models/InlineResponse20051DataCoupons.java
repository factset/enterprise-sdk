/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataInterestRate;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataPeriod;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20051DataCoupons
 */
@JsonPropertyOrder({
  InlineResponse20051DataCoupons.JSON_PROPERTY_PERIOD,
  InlineResponse20051DataCoupons.JSON_PROPERTY_PAYMENT_DATE,
  InlineResponse20051DataCoupons.JSON_PROPERTY_INTEREST_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20051DataCoupons implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private JsonNullable<InlineResponse20051DataPeriod> period = JsonNullable.<InlineResponse20051DataPeriod>undefined();

  public static final String JSON_PROPERTY_PAYMENT_DATE = "paymentDate";
  private JsonNullable<LocalDate> paymentDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_INTEREST_RATE = "interestRate";
  private InlineResponse20051DataInterestRate interestRate;

  public InlineResponse20051DataCoupons() { 
  }

  public InlineResponse20051DataCoupons period(InlineResponse20051DataPeriod period) {
    this.period = JsonNullable.<InlineResponse20051DataPeriod>of(period);
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20051DataPeriod getPeriod() {
        return period.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20051DataPeriod> getPeriod_JsonNullable() {
    return period;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIOD)
  public void setPeriod_JsonNullable(JsonNullable<InlineResponse20051DataPeriod> period) {
    this.period = period;
  }

  public void setPeriod(InlineResponse20051DataPeriod period) {
    this.period = JsonNullable.<InlineResponse20051DataPeriod>of(period);
  }


  public InlineResponse20051DataCoupons paymentDate(LocalDate paymentDate) {
    this.paymentDate = JsonNullable.<LocalDate>of(paymentDate);
    return this;
  }

   /**
   * Payment date of the coupon, usually 2 days after the ending date of the coupon period. For the latter, see attribute &#x60;coupons.period.end&#x60;.
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment date of the coupon, usually 2 days after the ending date of the coupon period. For the latter, see attribute `coupons.period.end`.")
  @JsonIgnore

  public LocalDate getPaymentDate() {
        return paymentDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getPaymentDate_JsonNullable() {
    return paymentDate;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  public void setPaymentDate_JsonNullable(JsonNullable<LocalDate> paymentDate) {
    this.paymentDate = paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = JsonNullable.<LocalDate>of(paymentDate);
  }


  public InlineResponse20051DataCoupons interestRate(InlineResponse20051DataInterestRate interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20051DataInterestRate getInterestRate() {
    return interestRate;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestRate(InlineResponse20051DataInterestRate interestRate) {
    this.interestRate = interestRate;
  }


  /**
   * Return true if this inline_response_200_51_data_coupons object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20051DataCoupons inlineResponse20051DataCoupons = (InlineResponse20051DataCoupons) o;
    return equalsNullable(this.period, inlineResponse20051DataCoupons.period) &&
        equalsNullable(this.paymentDate, inlineResponse20051DataCoupons.paymentDate) &&
        Objects.equals(this.interestRate, inlineResponse20051DataCoupons.interestRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(period), hashCodeNullable(paymentDate), interestRate);
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
    sb.append("class InlineResponse20051DataCoupons {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
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

