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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2004DataClassifications;
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
 * List of allocations.
 */
@ApiModel(description = "List of allocations.")
@JsonPropertyOrder({
  InlineResponse2004Data.JSON_PROPERTY_REPORT_DATE,
  InlineResponse2004Data.JSON_PROPERTY_CLASSIFICATIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2004Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_CLASSIFICATIONS = "classifications";
  private java.util.List<InlineResponse2004DataClassifications> classifications = null;

  public InlineResponse2004Data() { 
  }

  public InlineResponse2004Data reportDate(LocalDate reportDate) {
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


  public InlineResponse2004Data classifications(java.util.List<InlineResponse2004DataClassifications> classifications) {
    this.classifications = classifications;
    return this;
  }

  public InlineResponse2004Data addClassificationsItem(InlineResponse2004DataClassifications classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new java.util.ArrayList<>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * List of allocations classified by a holding&#39;s economic development status, sorted by weight in descending order.
   * @return classifications
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of allocations classified by a holding's economic development status, sorted by weight in descending order.")
  @JsonProperty(JSON_PROPERTY_CLASSIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004DataClassifications> getClassifications() {
    return classifications;
  }


  @JsonProperty(JSON_PROPERTY_CLASSIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassifications(java.util.List<InlineResponse2004DataClassifications> classifications) {
    this.classifications = classifications;
  }


  /**
   * Return true if this inline_response_200_4_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Data inlineResponse2004Data = (InlineResponse2004Data) o;
    return Objects.equals(this.reportDate, inlineResponse2004Data.reportDate) &&
        Objects.equals(this.classifications, inlineResponse2004Data.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, classifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Data {\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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

