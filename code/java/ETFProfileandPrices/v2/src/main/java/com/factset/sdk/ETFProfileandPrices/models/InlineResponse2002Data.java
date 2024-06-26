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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse2002DataCountries;
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
 * ETP country allocation data.
 */
@ApiModel(description = "ETP country allocation data.")
@JsonPropertyOrder({
  InlineResponse2002Data.JSON_PROPERTY_REPORT_DATE,
  InlineResponse2002Data.JSON_PROPERTY_COUNTRIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse2002Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private java.util.Set<InlineResponse2002DataCountries> countries = null;

  public InlineResponse2002Data() { 
  }

  public InlineResponse2002Data reportDate(LocalDate reportDate) {
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


  public InlineResponse2002Data countries(java.util.Set<InlineResponse2002DataCountries> countries) {
    this.countries = countries;
    return this;
  }

  public InlineResponse2002Data addCountriesItem(InlineResponse2002DataCountries countriesItem) {
    if (this.countries == null) {
      this.countries = new java.util.LinkedHashSet<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * List of allocations by country.
   * @return countries
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of allocations by country.")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<InlineResponse2002DataCountries> getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountries(java.util.Set<InlineResponse2002DataCountries> countries) {
    this.countries = countries;
  }


  /**
   * Return true if this inline_response_200_2_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(this.reportDate, inlineResponse2002Data.reportDate) &&
        Objects.equals(this.countries, inlineResponse2002Data.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDate, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

