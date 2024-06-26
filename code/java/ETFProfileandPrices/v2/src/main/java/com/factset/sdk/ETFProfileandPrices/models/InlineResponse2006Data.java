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


package com.factset.sdk.ETFProfileandPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2006DataIndustries;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * ETP industry allocation data.
 */
@ApiModel(description = "ETP industry allocation data.")
@JsonPropertyOrder({
  InlineResponse2006Data.JSON_PROPERTY_REPORT_DATE,
  InlineResponse2006Data.JSON_PROPERTY_INDUSTRIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2006Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_INDUSTRIES = "industries";
  private java.util.Set<InlineResponse2006DataIndustries> industries = null;

  public InlineResponse2006Data() { 
  }

  public InlineResponse2006Data reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * Reporting date for the allocations.
   * @return reportDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Reporting date for the allocations.")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReportDate() {
    return reportDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }


  public InlineResponse2006Data industries(java.util.Set<InlineResponse2006DataIndustries> industries) {
    this.industries = industries;
    return this;
  }

  public InlineResponse2006Data addIndustriesItem(InlineResponse2006DataIndustries industriesItem) {
    if (this.industries == null) {
      this.industries = new java.util.LinkedHashSet<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

   /**
   * List of allocations by industry.
   * @return industries
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of allocations by industry.")
  @JsonProperty(JSON_PROPERTY_INDUSTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<InlineResponse2006DataIndustries> getIndustries() {
    return industries;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustries(java.util.Set<InlineResponse2006DataIndustries> industries) {
    this.industries = industries;
  }


  /**
   * Return true if this inline_response_200_6_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006Data inlineResponse2006Data = (InlineResponse2006Data) o;
    return Objects.equals(this.reportDate, inlineResponse2006Data.reportDate) &&
        Objects.equals(this.industries, inlineResponse2006Data.industries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, industries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006Data {\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
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

