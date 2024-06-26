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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2008DataRegions;
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
 * ETP region allocation data.
 */
@ApiModel(description = "ETP region allocation data.")
@JsonPropertyOrder({
  InlineResponse2008Data.JSON_PROPERTY_REPORT_DATE,
  InlineResponse2008Data.JSON_PROPERTY_REGIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2008Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private java.util.Set<InlineResponse2008DataRegions> regions = null;

  public InlineResponse2008Data() { 
  }

  public InlineResponse2008Data reportDate(LocalDate reportDate) {
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


  public InlineResponse2008Data regions(java.util.Set<InlineResponse2008DataRegions> regions) {
    this.regions = regions;
    return this;
  }

  public InlineResponse2008Data addRegionsItem(InlineResponse2008DataRegions regionsItem) {
    if (this.regions == null) {
      this.regions = new java.util.LinkedHashSet<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * List of allocations by region.
   * @return regions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of allocations by region.")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<InlineResponse2008DataRegions> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(java.util.Set<InlineResponse2008DataRegions> regions) {
    this.regions = regions;
  }


  /**
   * Return true if this inline_response_200_8_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Data inlineResponse2008Data = (InlineResponse2008Data) o;
    return Objects.equals(this.reportDate, inlineResponse2008Data.reportDate) &&
        Objects.equals(this.regions, inlineResponse2008Data.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Data {\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

