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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Fiscal year to which the estimates belong.
 */
@ApiModel(description = "Fiscal year to which the estimates belong.")
@JsonPropertyOrder({
  InlineResponse2004EstimatesFirstFiscalYearFiscalYear.JSON_PROPERTY_YEAR_END,
  InlineResponse2004EstimatesFirstFiscalYearFiscalYear.JSON_PROPERTY_YEAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004EstimatesFirstFiscalYearFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_YEAR_END = "yearEnd";
  private BigDecimal yearEnd;

  public static final String JSON_PROPERTY_YEAR = "year";
  private BigDecimal year;

  public InlineResponse2004EstimatesFirstFiscalYearFiscalYear() { 
  }

  public InlineResponse2004EstimatesFirstFiscalYearFiscalYear yearEnd(BigDecimal yearEnd) {
    this.yearEnd = yearEnd;
    return this;
  }

   /**
   * Calendar year of the ending date of the fiscal year.
   * @return yearEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calendar year of the ending date of the fiscal year.")
  @JsonProperty(JSON_PROPERTY_YEAR_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYearEnd() {
    return yearEnd;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearEnd(BigDecimal yearEnd) {
    this.yearEnd = yearEnd;
  }


  public InlineResponse2004EstimatesFirstFiscalYearFiscalYear year(BigDecimal year) {
    this.year = year;
    return this;
  }

   /**
   * Derived fiscal year.
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived fiscal year.")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(BigDecimal year) {
    this.year = year;
  }


  /**
   * Return true if this inline_response_200_4_estimates_firstFiscalYear_fiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004EstimatesFirstFiscalYearFiscalYear inlineResponse2004EstimatesFirstFiscalYearFiscalYear = (InlineResponse2004EstimatesFirstFiscalYearFiscalYear) o;
    return Objects.equals(this.yearEnd, inlineResponse2004EstimatesFirstFiscalYearFiscalYear.yearEnd) &&
        Objects.equals(this.year, inlineResponse2004EstimatesFirstFiscalYearFiscalYear.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yearEnd, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004EstimatesFirstFiscalYearFiscalYear {\n");
    sb.append("    yearEnd: ").append(toIndentedString(yearEnd)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

