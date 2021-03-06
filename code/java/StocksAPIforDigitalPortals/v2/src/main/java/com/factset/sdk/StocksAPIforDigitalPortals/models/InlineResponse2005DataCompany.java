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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataCompanyCountry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Details of the companies.
 */
@ApiModel(description = "Details of the companies.")
@JsonPropertyOrder({
  InlineResponse2005DataCompany.JSON_PROPERTY_COUNTRY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataCompany implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private java.util.List<InlineResponse2005DataCompanyCountry> country = null;

  public InlineResponse2005DataCompany() { 
  }

  public InlineResponse2005DataCompany country(java.util.List<InlineResponse2005DataCompanyCountry> country) {
    this.country = country;
    return this;
  }

  public InlineResponse2005DataCompany addCountryItem(InlineResponse2005DataCompanyCountry countryItem) {
    if (this.country == null) {
      this.country = new java.util.ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * List of countries where a head office of a company is located. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of countries where a head office of a company is located. See endpoint `/basic/region/country/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataCompanyCountry> getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(java.util.List<InlineResponse2005DataCompanyCountry> country) {
    this.country = country;
  }


  /**
   * Return true if this inline_response_200_5_data_company object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataCompany inlineResponse2005DataCompany = (InlineResponse2005DataCompany) o;
    return Objects.equals(this.country, inlineResponse2005DataCompany.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataCompany {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

