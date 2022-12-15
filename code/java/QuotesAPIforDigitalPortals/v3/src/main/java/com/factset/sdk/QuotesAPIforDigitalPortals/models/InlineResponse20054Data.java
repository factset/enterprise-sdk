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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054DataDayCountConvention;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054DataInterestRate;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054DataOccurrence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Key dates and details.
 */
@ApiModel(description = "Key dates and details.")
@JsonPropertyOrder({
  InlineResponse20054Data.JSON_PROPERTY_OCCURRENCE,
  InlineResponse20054Data.JSON_PROPERTY_INTEREST_RATE,
  InlineResponse20054Data.JSON_PROPERTY_DAY_COUNT_CONVENTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20054Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OCCURRENCE = "occurrence";
  private InlineResponse20054DataOccurrence occurrence;

  public static final String JSON_PROPERTY_INTEREST_RATE = "interestRate";
  private InlineResponse20054DataInterestRate interestRate;

  public static final String JSON_PROPERTY_DAY_COUNT_CONVENTION = "dayCountConvention";
  private InlineResponse20054DataDayCountConvention dayCountConvention;

  public InlineResponse20054Data() { 
  }

  public InlineResponse20054Data occurrence(InlineResponse20054DataOccurrence occurrence) {
    this.occurrence = occurrence;
    return this;
  }

   /**
   * Get occurrence
   * @return occurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataOccurrence getOccurrence() {
    return occurrence;
  }


  @JsonProperty(JSON_PROPERTY_OCCURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccurrence(InlineResponse20054DataOccurrence occurrence) {
    this.occurrence = occurrence;
  }


  public InlineResponse20054Data interestRate(InlineResponse20054DataInterestRate interestRate) {
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

  public InlineResponse20054DataInterestRate getInterestRate() {
    return interestRate;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterestRate(InlineResponse20054DataInterestRate interestRate) {
    this.interestRate = interestRate;
  }


  public InlineResponse20054Data dayCountConvention(InlineResponse20054DataDayCountConvention dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
    return this;
  }

   /**
   * Get dayCountConvention
   * @return dayCountConvention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY_COUNT_CONVENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataDayCountConvention getDayCountConvention() {
    return dayCountConvention;
  }


  @JsonProperty(JSON_PROPERTY_DAY_COUNT_CONVENTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayCountConvention(InlineResponse20054DataDayCountConvention dayCountConvention) {
    this.dayCountConvention = dayCountConvention;
  }


  /**
   * Return true if this inline_response_200_54_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054Data inlineResponse20054Data = (InlineResponse20054Data) o;
    return Objects.equals(this.occurrence, inlineResponse20054Data.occurrence) &&
        Objects.equals(this.interestRate, inlineResponse20054Data.interestRate) &&
        Objects.equals(this.dayCountConvention, inlineResponse20054Data.dayCountConvention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurrence, interestRate, dayCountConvention);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054Data {\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    dayCountConvention: ").append(toIndentedString(dayCountConvention)).append("\n");
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

