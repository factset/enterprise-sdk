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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Interest rate on an annual basis. Minimum/maximum interest rates and a fixed interest rate are, in general, mutually exclusive. However, for an instrument with a variable interest rate (i.e. the attribute &#x60;coupons.interestRate.type&#x60; has the value 4 or 6), a fixed interest rate might be provided if already determined for the respective period (current or past).
 */
@ApiModel(description = "Interest rate on an annual basis. Minimum/maximum interest rates and a fixed interest rate are, in general, mutually exclusive. However, for an instrument with a variable interest rate (i.e. the attribute `coupons.interestRate.type` has the value 4 or 6), a fixed interest rate might be provided if already determined for the respective period (current or past).")
@JsonPropertyOrder({
  InlineResponse20051DataInterestRateAnnualized.JSON_PROPERTY_FIXED,
  InlineResponse20051DataInterestRateAnnualized.JSON_PROPERTY_MINIMUM,
  InlineResponse20051DataInterestRateAnnualized.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20051DataInterestRateAnnualized implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIXED = "fixed";
  private JsonNullable<BigDecimal> fixed = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private JsonNullable<BigDecimal> minimum = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private JsonNullable<BigDecimal> maximum = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20051DataInterestRateAnnualized() { 
  }

  public InlineResponse20051DataInterestRateAnnualized fixed(BigDecimal fixed) {
    this.fixed = JsonNullable.<BigDecimal>of(fixed);
    return this;
  }

   /**
   * Fixed interest rate.
   * @return fixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed interest rate.")
  @JsonIgnore

  public BigDecimal getFixed() {
        return fixed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getFixed_JsonNullable() {
    return fixed;
  }
  
  @JsonProperty(JSON_PROPERTY_FIXED)
  public void setFixed_JsonNullable(JsonNullable<BigDecimal> fixed) {
    this.fixed = fixed;
  }

  public void setFixed(BigDecimal fixed) {
    this.fixed = JsonNullable.<BigDecimal>of(fixed);
  }


  public InlineResponse20051DataInterestRateAnnualized minimum(BigDecimal minimum) {
    this.minimum = JsonNullable.<BigDecimal>of(minimum);
    return this;
  }

   /**
   * Minimum interest rate.
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum interest rate.")
  @JsonIgnore

  public BigDecimal getMinimum() {
        return minimum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMinimum_JsonNullable() {
    return minimum;
  }
  
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  public void setMinimum_JsonNullable(JsonNullable<BigDecimal> minimum) {
    this.minimum = minimum;
  }

  public void setMinimum(BigDecimal minimum) {
    this.minimum = JsonNullable.<BigDecimal>of(minimum);
  }


  public InlineResponse20051DataInterestRateAnnualized maximum(BigDecimal maximum) {
    this.maximum = JsonNullable.<BigDecimal>of(maximum);
    return this;
  }

   /**
   * Maximum interest rate.
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum interest rate.")
  @JsonIgnore

  public BigDecimal getMaximum() {
        return maximum.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMaximum_JsonNullable() {
    return maximum;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  public void setMaximum_JsonNullable(JsonNullable<BigDecimal> maximum) {
    this.maximum = maximum;
  }

  public void setMaximum(BigDecimal maximum) {
    this.maximum = JsonNullable.<BigDecimal>of(maximum);
  }


  /**
   * Return true if this inline_response_200_51_data_interestRate_annualized object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20051DataInterestRateAnnualized inlineResponse20051DataInterestRateAnnualized = (InlineResponse20051DataInterestRateAnnualized) o;
    return equalsNullable(this.fixed, inlineResponse20051DataInterestRateAnnualized.fixed) &&
        equalsNullable(this.minimum, inlineResponse20051DataInterestRateAnnualized.minimum) &&
        equalsNullable(this.maximum, inlineResponse20051DataInterestRateAnnualized.maximum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fixed), hashCodeNullable(minimum), hashCodeNullable(maximum));
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
    sb.append("class InlineResponse20051DataInterestRateAnnualized {\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

