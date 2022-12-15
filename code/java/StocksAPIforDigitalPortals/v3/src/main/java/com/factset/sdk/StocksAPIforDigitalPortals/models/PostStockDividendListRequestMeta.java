/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  PostStockDividendListRequestMeta.JSON_PROPERTY_ATTRIBUTES,
  PostStockDividendListRequestMeta.JSON_PROPERTY_LANGUAGE,
  PostStockDividendListRequestMeta.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostStockDividendListRequestMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    DIVIDENDS_DATES_ANNOUNCEMENT("dividends.dates.announcement"),
    
    _DIVIDENDS_DATES_ANNOUNCEMENT("-dividends.dates.announcement"),
    
    DIVIDENDS_DATES_RECORD("dividends.dates.record"),
    
    _DIVIDENDS_DATES_RECORD("-dividends.dates.record"),
    
    DIVIDENDS_DATES_EFFECTIVE("dividends.dates.effective"),
    
    _DIVIDENDS_DATES_EFFECTIVE("-dividends.dates.effective"),
    
    DIVIDENDS_DATES_PAYMENT("dividends.dates.payment"),
    
    _DIVIDENDS_DATES_PAYMENT("-dividends.dates.payment");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.Set<SortEnum> sort = null;

  public PostStockDividendListRequestMeta() { 
  }

  public PostStockDividendListRequestMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public PostStockDividendListRequestMeta addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Limit the attributes returned in the response to the specified set.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the attributes returned in the response to the specified set.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<String> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
  }


  public PostStockDividendListRequestMeta language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO 639-1 code of the language.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 639-1 code of the language.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public PostStockDividendListRequestMeta sort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public PostStockDividendListRequestMeta addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.LinkedHashSet<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<SortEnum> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
  }


  /**
   * Return true if this PostStockDividendListRequest_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockDividendListRequestMeta postStockDividendListRequestMeta = (PostStockDividendListRequestMeta) o;
    return Objects.equals(this.attributes, postStockDividendListRequestMeta.attributes) &&
        Objects.equals(this.language, postStockDividendListRequestMeta.language) &&
        Objects.equals(this.sort, postStockDividendListRequestMeta.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, language, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockDividendListRequestMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

