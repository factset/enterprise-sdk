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
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundAssetsUnderManagement;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundCompliance;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundCurrency;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundDomicile;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundEtf;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundHoldingType;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundIssuer;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundRegionalExposure;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2005DataFundSrri;
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
 * Values and value ranges of the parameters related to funds.
 */
@ApiModel(description = "Values and value ranges of the parameters related to funds.")
@JsonPropertyOrder({
  InlineResponse2005DataFund.JSON_PROPERTY_ETF,
  InlineResponse2005DataFund.JSON_PROPERTY_CURRENCY,
  InlineResponse2005DataFund.JSON_PROPERTY_DOMICILE,
  InlineResponse2005DataFund.JSON_PROPERTY_HOLDING_TYPE,
  InlineResponse2005DataFund.JSON_PROPERTY_COUNTRY_DEVELOPMENT,
  InlineResponse2005DataFund.JSON_PROPERTY_REGIONAL_EXPOSURE,
  InlineResponse2005DataFund.JSON_PROPERTY_STRATEGY,
  InlineResponse2005DataFund.JSON_PROPERTY_INDUSTRY,
  InlineResponse2005DataFund.JSON_PROPERTY_SRRI,
  InlineResponse2005DataFund.JSON_PROPERTY_ISSUER,
  InlineResponse2005DataFund.JSON_PROPERTY_ASSETS_UNDER_MANAGEMENT,
  InlineResponse2005DataFund.JSON_PROPERTY_COMPLIANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataFund implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ETF = "etf";
  private java.util.List<InlineResponse2005DataFundEtf> etf = null;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private java.util.List<InlineResponse2005DataFundCurrency> currency = null;

  public static final String JSON_PROPERTY_DOMICILE = "domicile";
  private java.util.List<InlineResponse2005DataFundDomicile> domicile = null;

  public static final String JSON_PROPERTY_HOLDING_TYPE = "holdingType";
  private java.util.List<InlineResponse2005DataFundHoldingType> holdingType = null;

  public static final String JSON_PROPERTY_COUNTRY_DEVELOPMENT = "countryDevelopment";
  private java.util.List<InlineResponse2005DataFundHoldingType> countryDevelopment = null;

  public static final String JSON_PROPERTY_REGIONAL_EXPOSURE = "regionalExposure";
  private InlineResponse2005DataFundRegionalExposure regionalExposure;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private java.util.List<InlineResponse2005DataFundHoldingType> strategy = null;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private java.util.List<InlineResponse2005DataFundHoldingType> industry = null;

  public static final String JSON_PROPERTY_SRRI = "srri";
  private java.util.List<InlineResponse2005DataFundSrri> srri = null;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private InlineResponse2005DataFundIssuer issuer;

  public static final String JSON_PROPERTY_ASSETS_UNDER_MANAGEMENT = "assetsUnderManagement";
  private InlineResponse2005DataFundAssetsUnderManagement assetsUnderManagement;

  public static final String JSON_PROPERTY_COMPLIANCE = "compliance";
  private java.util.List<InlineResponse2005DataFundCompliance> compliance = null;

  public InlineResponse2005DataFund() { 
  }

  public InlineResponse2005DataFund etf(java.util.List<InlineResponse2005DataFundEtf> etf) {
    this.etf = etf;
    return this;
  }

  public InlineResponse2005DataFund addEtfItem(InlineResponse2005DataFundEtf etfItem) {
    if (this.etf == null) {
      this.etf = new java.util.ArrayList<>();
    }
    this.etf.add(etfItem);
    return this;
  }

   /**
   * Indicates whether ETFs (&#x60;true&#x60;) and mutual funds (&#x60;false&#x60;) are among the results.
   * @return etf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether ETFs (`true`) and mutual funds (`false`) are among the results.")
  @JsonProperty(JSON_PROPERTY_ETF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundEtf> getEtf() {
    return etf;
  }


  @JsonProperty(JSON_PROPERTY_ETF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtf(java.util.List<InlineResponse2005DataFundEtf> etf) {
    this.etf = etf;
  }


  public InlineResponse2005DataFund currency(java.util.List<InlineResponse2005DataFundCurrency> currency) {
    this.currency = currency;
    return this;
  }

  public InlineResponse2005DataFund addCurrencyItem(InlineResponse2005DataFundCurrency currencyItem) {
    if (this.currency == null) {
      this.currency = new java.util.ArrayList<>();
    }
    this.currency.add(currencyItem);
    return this;
  }

   /**
   * List of main currency identifiers. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of main currency identifiers. See endpoint `/basic/valueUnit/currency/main/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundCurrency> getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(java.util.List<InlineResponse2005DataFundCurrency> currency) {
    this.currency = currency;
  }


  public InlineResponse2005DataFund domicile(java.util.List<InlineResponse2005DataFundDomicile> domicile) {
    this.domicile = domicile;
    return this;
  }

  public InlineResponse2005DataFund addDomicileItem(InlineResponse2005DataFundDomicile domicileItem) {
    if (this.domicile == null) {
      this.domicile = new java.util.ArrayList<>();
    }
    this.domicile.add(domicileItem);
    return this;
  }

   /**
   * List of countries representing domiciles of funds. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
   * @return domicile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of countries representing domiciles of funds. See endpoint `/basic/region/country/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_DOMICILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundDomicile> getDomicile() {
    return domicile;
  }


  @JsonProperty(JSON_PROPERTY_DOMICILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomicile(java.util.List<InlineResponse2005DataFundDomicile> domicile) {
    this.domicile = domicile;
  }


  public InlineResponse2005DataFund holdingType(java.util.List<InlineResponse2005DataFundHoldingType> holdingType) {
    this.holdingType = holdingType;
    return this;
  }

  public InlineResponse2005DataFund addHoldingTypeItem(InlineResponse2005DataFundHoldingType holdingTypeItem) {
    if (this.holdingType == null) {
      this.holdingType = new java.util.ArrayList<>();
    }
    this.holdingType.add(holdingTypeItem);
    return this;
  }

   /**
   * Lists of categories of the holdings&#39; asset type classification. Asset type of the holdings is a category from any level of category system \&quot;Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;288&#x60; for possible values.
   * @return holdingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists of categories of the holdings' asset type classification. Asset type of the holdings is a category from any level of category system \"Asset class classification system for mutual funds, defined by FactSet Research Systems Inc.\". See endpoint `/category/listBySystem` with `id=288` for possible values.")
  @JsonProperty(JSON_PROPERTY_HOLDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundHoldingType> getHoldingType() {
    return holdingType;
  }


  @JsonProperty(JSON_PROPERTY_HOLDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldingType(java.util.List<InlineResponse2005DataFundHoldingType> holdingType) {
    this.holdingType = holdingType;
  }


  public InlineResponse2005DataFund countryDevelopment(java.util.List<InlineResponse2005DataFundHoldingType> countryDevelopment) {
    this.countryDevelopment = countryDevelopment;
    return this;
  }

  public InlineResponse2005DataFund addCountryDevelopmentItem(InlineResponse2005DataFundHoldingType countryDevelopmentItem) {
    if (this.countryDevelopment == null) {
      this.countryDevelopment = new java.util.ArrayList<>();
    }
    this.countryDevelopment.add(countryDevelopmentItem);
    return this;
  }

   /**
   * Lists of categories of the holdings&#39; country development level classification. Country development level of the holdings is a category from any level of category system \&quot;Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;289&#x60; for possible values.
   * @return countryDevelopment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists of categories of the holdings' country development level classification. Country development level of the holdings is a category from any level of category system \"Country development level classification system for mutual funds, defined by FactSet Research Systems Inc.\". See endpoint `/category/listBySystem` with `id=289` for possible values.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_DEVELOPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundHoldingType> getCountryDevelopment() {
    return countryDevelopment;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_DEVELOPMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryDevelopment(java.util.List<InlineResponse2005DataFundHoldingType> countryDevelopment) {
    this.countryDevelopment = countryDevelopment;
  }


  public InlineResponse2005DataFund regionalExposure(InlineResponse2005DataFundRegionalExposure regionalExposure) {
    this.regionalExposure = regionalExposure;
    return this;
  }

   /**
   * Get regionalExposure
   * @return regionalExposure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONAL_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataFundRegionalExposure getRegionalExposure() {
    return regionalExposure;
  }


  @JsonProperty(JSON_PROPERTY_REGIONAL_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionalExposure(InlineResponse2005DataFundRegionalExposure regionalExposure) {
    this.regionalExposure = regionalExposure;
  }


  public InlineResponse2005DataFund strategy(java.util.List<InlineResponse2005DataFundHoldingType> strategy) {
    this.strategy = strategy;
    return this;
  }

  public InlineResponse2005DataFund addStrategyItem(InlineResponse2005DataFundHoldingType strategyItem) {
    if (this.strategy == null) {
      this.strategy = new java.util.ArrayList<>();
    }
    this.strategy.add(strategyItem);
    return this;
  }

   /**
   * Lists of categories of the strategy classification. Strategy is a category from any level of category system \&quot;Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;292&#x60; for possible values.
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists of categories of the strategy classification. Strategy is a category from any level of category system \"Three-tier strategy classification system for funds defined by FactSet Research Systems Inc.\". See endpoint `/category/listBySystem` with `id=292` for possible values.")
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundHoldingType> getStrategy() {
    return strategy;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategy(java.util.List<InlineResponse2005DataFundHoldingType> strategy) {
    this.strategy = strategy;
  }


  public InlineResponse2005DataFund industry(java.util.List<InlineResponse2005DataFundHoldingType> industry) {
    this.industry = industry;
    return this;
  }

  public InlineResponse2005DataFund addIndustryItem(InlineResponse2005DataFundHoldingType industryItem) {
    if (this.industry == null) {
      this.industry = new java.util.ArrayList<>();
    }
    this.industry.add(industryItem);
    return this;
  }

   /**
   * Lists of categories of the industry classification. Industry is a category from any level of category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for possible values.
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists of categories of the industry classification. Industry is a category from any level of category system \"Funds classification defined by FactSet Digital Solutions\". See endpoint `/category/listBySystem` with `id=27` for possible values.")
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundHoldingType> getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(java.util.List<InlineResponse2005DataFundHoldingType> industry) {
    this.industry = industry;
  }


  public InlineResponse2005DataFund srri(java.util.List<InlineResponse2005DataFundSrri> srri) {
    this.srri = srri;
    return this;
  }

  public InlineResponse2005DataFund addSrriItem(InlineResponse2005DataFundSrri srriItem) {
    if (this.srri == null) {
      this.srri = new java.util.ArrayList<>();
    }
    this.srri.add(srriItem);
    return this;
  }

   /**
   * List of values for the synthetic risk and reward indicator (SRRI).
   * @return srri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of values for the synthetic risk and reward indicator (SRRI).")
  @JsonProperty(JSON_PROPERTY_SRRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundSrri> getSrri() {
    return srri;
  }


  @JsonProperty(JSON_PROPERTY_SRRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrri(java.util.List<InlineResponse2005DataFundSrri> srri) {
    this.srri = srri;
  }


  public InlineResponse2005DataFund issuer(InlineResponse2005DataFundIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataFundIssuer getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(InlineResponse2005DataFundIssuer issuer) {
    this.issuer = issuer;
  }


  public InlineResponse2005DataFund assetsUnderManagement(InlineResponse2005DataFundAssetsUnderManagement assetsUnderManagement) {
    this.assetsUnderManagement = assetsUnderManagement;
    return this;
  }

   /**
   * Get assetsUnderManagement
   * @return assetsUnderManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSETS_UNDER_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataFundAssetsUnderManagement getAssetsUnderManagement() {
    return assetsUnderManagement;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS_UNDER_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetsUnderManagement(InlineResponse2005DataFundAssetsUnderManagement assetsUnderManagement) {
    this.assetsUnderManagement = assetsUnderManagement;
  }


  public InlineResponse2005DataFund compliance(java.util.List<InlineResponse2005DataFundCompliance> compliance) {
    this.compliance = compliance;
    return this;
  }

  public InlineResponse2005DataFund addComplianceItem(InlineResponse2005DataFundCompliance complianceItem) {
    if (this.compliance == null) {
      this.compliance = new java.util.ArrayList<>();
    }
    this.compliance.add(complianceItem);
    return this;
  }

   /**
   * List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/legalEntity/complianceProperty/list&#x60; for the full list of compliance properties associated with legal entities (across all roles). 
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of compliance properties for funds. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint `/legalEntity/complianceProperty/list` for the full list of compliance properties associated with legal entities (across all roles). ")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataFundCompliance> getCompliance() {
    return compliance;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompliance(java.util.List<InlineResponse2005DataFundCompliance> compliance) {
    this.compliance = compliance;
  }


  /**
   * Return true if this inline_response_200_5_data_fund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataFund inlineResponse2005DataFund = (InlineResponse2005DataFund) o;
    return Objects.equals(this.etf, inlineResponse2005DataFund.etf) &&
        Objects.equals(this.currency, inlineResponse2005DataFund.currency) &&
        Objects.equals(this.domicile, inlineResponse2005DataFund.domicile) &&
        Objects.equals(this.holdingType, inlineResponse2005DataFund.holdingType) &&
        Objects.equals(this.countryDevelopment, inlineResponse2005DataFund.countryDevelopment) &&
        Objects.equals(this.regionalExposure, inlineResponse2005DataFund.regionalExposure) &&
        Objects.equals(this.strategy, inlineResponse2005DataFund.strategy) &&
        Objects.equals(this.industry, inlineResponse2005DataFund.industry) &&
        Objects.equals(this.srri, inlineResponse2005DataFund.srri) &&
        Objects.equals(this.issuer, inlineResponse2005DataFund.issuer) &&
        Objects.equals(this.assetsUnderManagement, inlineResponse2005DataFund.assetsUnderManagement) &&
        Objects.equals(this.compliance, inlineResponse2005DataFund.compliance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etf, currency, domicile, holdingType, countryDevelopment, regionalExposure, strategy, industry, srri, issuer, assetsUnderManagement, compliance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataFund {\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    domicile: ").append(toIndentedString(domicile)).append("\n");
    sb.append("    holdingType: ").append(toIndentedString(holdingType)).append("\n");
    sb.append("    countryDevelopment: ").append(toIndentedString(countryDevelopment)).append("\n");
    sb.append("    regionalExposure: ").append(toIndentedString(regionalExposure)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    srri: ").append(toIndentedString(srri)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    assetsUnderManagement: ").append(toIndentedString(assetsUnderManagement)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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
