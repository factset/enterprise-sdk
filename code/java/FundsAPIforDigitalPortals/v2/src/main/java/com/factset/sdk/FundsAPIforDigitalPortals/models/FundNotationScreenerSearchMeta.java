/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchMetaPagination;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  FundNotationScreenerSearchMeta.JSON_PROPERTY_ATTRIBUTES,
  FundNotationScreenerSearchMeta.JSON_PROPERTY_LANGUAGE,
  FundNotationScreenerSearchMeta.JSON_PROPERTY_SORT,
  FundNotationScreenerSearchMeta.JSON_PROPERTY_PAGINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerSearchMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    CURRENCY_CODE("currency.code"),
    
    _CURRENCY_CODE("-currency.code"),
    
    INSTRUMENT_NAME("instrument.name"),
    
    _INSTRUMENT_NAME("-instrument.name"),
    
    INSTRUMENT_SHORTNAME("instrument.shortName"),
    
    _INSTRUMENT_SHORTNAME("-instrument.shortName"),
    
    FUND_ETF("fund.etf"),
    
    _FUND_ETF("-fund.etf"),
    
    FUND_CURRENCY_ISOCODE("fund.currency.isoCode"),
    
    _FUND_CURRENCY_ISOCODE("-fund.currency.isoCode"),
    
    FUND_DOMICILE_NAME("fund.domicile.name"),
    
    _FUND_DOMICILE_NAME("-fund.domicile.name"),
    
    FUND_HOLDINGTYPE_NAME("fund.holdingType.name"),
    
    _FUND_HOLDINGTYPE_NAME("-fund.holdingType.name"),
    
    FUND_COUNTRYDEVELOPMENT_NAME("fund.countryDevelopment.name"),
    
    _FUND_COUNTRYDEVELOPMENT_NAME("-fund.countryDevelopment.name"),
    
    FUND_REGIONALEXPOSURE_BROAD_NAME("fund.regionalExposure.broad.name"),
    
    _FUND_REGIONALEXPOSURE_BROAD_NAME("-fund.regionalExposure.broad.name"),
    
    FUND_REGIONALEXPOSURE_SPECIFIC_NAME("fund.regionalExposure.specific.name"),
    
    _FUND_REGIONALEXPOSURE_SPECIFIC_NAME("-fund.regionalExposure.specific.name"),
    
    FUND_STRATEGY_LEVEL1_NAME("fund.strategy.level1.name"),
    
    _FUND_STRATEGY_LEVEL1_NAME("-fund.strategy.level1.name"),
    
    FUND_STRATEGY_LEVEL2_NAME("fund.strategy.level2.name"),
    
    _FUND_STRATEGY_LEVEL2_NAME("-fund.strategy.level2.name"),
    
    FUND_STRATEGY_LEVEL3_NAME("fund.strategy.level3.name"),
    
    _FUND_STRATEGY_LEVEL3_NAME("-fund.strategy.level3.name"),
    
    FUND_INDUSTRY_NAME("fund.industry.name"),
    
    _FUND_INDUSTRY_NAME("-fund.industry.name"),
    
    FUND_SRRI_GRADE("fund.srri.grade"),
    
    _FUND_SRRI_GRADE("-fund.srri.grade"),
    
    FUND_ISSUER_NAME("fund.issuer.name"),
    
    _FUND_ISSUER_NAME("-fund.issuer.name"),
    
    FUND_ISSUER_COUNTRY_NAME("fund.issuer.country.name"),
    
    _FUND_ISSUER_COUNTRY_NAME("-fund.issuer.country.name"),
    
    FUND_ASSETSUNDERMANAGEMENT("fund.assetsUnderManagement"),
    
    _FUND_ASSETSUNDERMANAGEMENT("-fund.assetsUnderManagement"),
    
    SHARECLASS_LIFECYCLE_ISSUE("shareClass.lifeCycle.issue"),
    
    _SHARECLASS_LIFECYCLE_ISSUE("-shareClass.lifeCycle.issue"),
    
    SHARECLASS_MINIMUMINVESTMENT_INITIAL("shareClass.minimumInvestment.initial"),
    
    _SHARECLASS_MINIMUMINVESTMENT_INITIAL("-shareClass.minimumInvestment.initial"),
    
    SHARECLASS_MINIMUMINVESTMENT_SUBSEQUENT("shareClass.minimumInvestment.subsequent"),
    
    _SHARECLASS_MINIMUMINVESTMENT_SUBSEQUENT("-shareClass.minimumInvestment.subsequent"),
    
    SHARECLASS_ASSETSUNDERMANAGEMENT("shareClass.assetsUnderManagement"),
    
    _SHARECLASS_ASSETSUNDERMANAGEMENT("-shareClass.assetsUnderManagement"),
    
    SHARECLASS_FEE_ONGOING_CURRENT("shareClass.fee.ongoing.current"),
    
    _SHARECLASS_FEE_ONGOING_CURRENT("-shareClass.fee.ongoing.current"),
    
    SHARECLASS_FEE_ALLIN_CURRENT("shareClass.fee.allIn.current"),
    
    _SHARECLASS_FEE_ALLIN_CURRENT("-shareClass.fee.allIn.current"),
    
    SHARECLASS_FEE_PERFORMANCE_CURRENT("shareClass.fee.performance.current"),
    
    _SHARECLASS_FEE_PERFORMANCE_CURRENT("-shareClass.fee.performance.current"),
    
    SHARECLASS_FEE_MANAGEMENT_CURRENT("shareClass.fee.management.current"),
    
    _SHARECLASS_FEE_MANAGEMENT_CURRENT("-shareClass.fee.management.current"),
    
    SHARECLASS_FEE_INITIAL_MINIMUM("shareClass.fee.initial.minimum"),
    
    _SHARECLASS_FEE_INITIAL_MINIMUM("-shareClass.fee.initial.minimum"),
    
    SHARECLASS_FEE_INITIAL_CURRENT("shareClass.fee.initial.current"),
    
    _SHARECLASS_FEE_INITIAL_CURRENT("-shareClass.fee.initial.current"),
    
    SHARECLASS_FEE_INITIAL_MAXIMUM("shareClass.fee.initial.maximum"),
    
    _SHARECLASS_FEE_INITIAL_MAXIMUM("-shareClass.fee.initial.maximum"),
    
    SHARECLASS_FEE_DISTRIBUTION_MAXIMUM("shareClass.fee.distribution.maximum"),
    
    _SHARECLASS_FEE_DISTRIBUTION_MAXIMUM("-shareClass.fee.distribution.maximum"),
    
    SHARECLASS_FEE_HANDLING_MAXIMUM("shareClass.fee.handling.maximum"),
    
    _SHARECLASS_FEE_HANDLING_MAXIMUM("-shareClass.fee.handling.maximum"),
    
    SHARECLASS_FEE_REDEMPTION_CURRENT("shareClass.fee.redemption.current"),
    
    _SHARECLASS_FEE_REDEMPTION_CURRENT("-shareClass.fee.redemption.current"),
    
    SHARECLASS_FEE_REDEMPTION_MAXIMUM("shareClass.fee.redemption.maximum"),
    
    _SHARECLASS_FEE_REDEMPTION_MAXIMUM("-shareClass.fee.redemption.maximum"),
    
    SHARECLASS_FEE_CUSTODIANBANK_CURRENT("shareClass.fee.custodianBank.current"),
    
    _SHARECLASS_FEE_CUSTODIANBANK_CURRENT("-shareClass.fee.custodianBank.current"),
    
    SHARECLASS_FEE_12B_CURRENT("shareClass.fee.12b.current"),
    
    _SHARECLASS_FEE_12B_CURRENT("-shareClass.fee.12b.current"),
    
    SHARECLASS_FEE_SWITCHING_CURRENT("shareClass.fee.switching.current"),
    
    _SHARECLASS_FEE_SWITCHING_CURRENT("-shareClass.fee.switching.current"),
    
    PERFORMANCE_ENDOFDAY_DAY1("performance.endOfDay.day1"),
    
    _PERFORMANCE_ENDOFDAY_DAY1("-performance.endOfDay.day1"),
    
    PERFORMANCE_ENDOFDAY_WEEK1("performance.endOfDay.week1"),
    
    _PERFORMANCE_ENDOFDAY_WEEK1("-performance.endOfDay.week1"),
    
    PERFORMANCE_ENDOFDAY_MONTH1("performance.endOfDay.month1"),
    
    _PERFORMANCE_ENDOFDAY_MONTH1("-performance.endOfDay.month1"),
    
    PERFORMANCE_ENDOFDAY_MONTHS3("performance.endOfDay.months3"),
    
    _PERFORMANCE_ENDOFDAY_MONTHS3("-performance.endOfDay.months3"),
    
    PERFORMANCE_ENDOFDAY_MONTHS6("performance.endOfDay.months6"),
    
    _PERFORMANCE_ENDOFDAY_MONTHS6("-performance.endOfDay.months6"),
    
    PERFORMANCE_ENDOFDAY_YEAR1("performance.endOfDay.year1"),
    
    _PERFORMANCE_ENDOFDAY_YEAR1("-performance.endOfDay.year1"),
    
    PERFORMANCE_ENDOFDAY_YEARS3("performance.endOfDay.years3"),
    
    _PERFORMANCE_ENDOFDAY_YEARS3("-performance.endOfDay.years3"),
    
    PERFORMANCE_ENDOFDAY_YEARS5("performance.endOfDay.years5"),
    
    _PERFORMANCE_ENDOFDAY_YEARS5("-performance.endOfDay.years5"),
    
    PERFORMANCE_ENDOFDAY_YEARTODATE("performance.endOfDay.yearToDate"),
    
    _PERFORMANCE_ENDOFDAY_YEARTODATE("-performance.endOfDay.yearToDate");

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

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private FundNotationScreenerSearchMetaPagination pagination;

  public FundNotationScreenerSearchMeta() { 
  }

  public FundNotationScreenerSearchMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public FundNotationScreenerSearchMeta addAttributesItem(String attributesItem) {
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


  public FundNotationScreenerSearchMeta language(String language) {
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


  public FundNotationScreenerSearchMeta sort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public FundNotationScreenerSearchMeta addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.LinkedHashSet<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.")
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


  public FundNotationScreenerSearchMeta pagination(FundNotationScreenerSearchMetaPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchMetaPagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(FundNotationScreenerSearchMetaPagination pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this _fund_notation_screener_search_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerSearchMeta fundNotationScreenerSearchMeta = (FundNotationScreenerSearchMeta) o;
    return Objects.equals(this.attributes, fundNotationScreenerSearchMeta.attributes) &&
        Objects.equals(this.language, fundNotationScreenerSearchMeta.language) &&
        Objects.equals(this.sort, fundNotationScreenerSearchMeta.sort) &&
        Objects.equals(this.pagination, fundNotationScreenerSearchMeta.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, language, sort, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerSearchMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

