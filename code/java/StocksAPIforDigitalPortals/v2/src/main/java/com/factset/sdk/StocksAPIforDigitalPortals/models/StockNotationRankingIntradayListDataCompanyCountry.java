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
 * Only stocks issued by a company whose head office is located in a country in the provided list will be returned.
 */
@ApiModel(description = "Only stocks issued by a company whose head office is located in a country in the provided list will be returned.")
@JsonPropertyOrder({
  StockNotationRankingIntradayListDataCompanyCountry.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationRankingIntradayListDataCompanyCountry implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.Set<BigDecimal> ids = null;

  public StockNotationRankingIntradayListDataCompanyCountry() { 
  }

  public StockNotationRankingIntradayListDataCompanyCountry ids(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public StockNotationRankingIntradayListDataCompanyCountry addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of country identifiers. See endpoint &#x60;/basic/region/country/list&#x60; for valid values.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of country identifiers. See endpoint `/basic/region/country/list` for valid values.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _stock_notation_ranking_intraday_list_data_company_country object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationRankingIntradayListDataCompanyCountry stockNotationRankingIntradayListDataCompanyCountry = (StockNotationRankingIntradayListDataCompanyCountry) o;
    return Objects.equals(this.ids, stockNotationRankingIntradayListDataCompanyCountry.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationRankingIntradayListDataCompanyCountry {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

