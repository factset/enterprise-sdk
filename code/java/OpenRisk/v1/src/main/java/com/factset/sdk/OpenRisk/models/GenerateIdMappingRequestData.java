/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.Holdings;
import com.factset.sdk.OpenRisk.models.IDsAndMarketValues;
import com.factset.sdk.OpenRisk.models.InputDate;
import com.factset.sdk.OpenRisk.models.LaggingDates;
import com.factset.sdk.OpenRisk.models.RiskModelAppendData;
import com.factset.sdk.OpenRisk.models.SecurityIndexMapping;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * Input data for requests to generate ID mapping
 */
@ApiModel(description = "Input data for requests to generate ID mapping")
@JsonPropertyOrder({
  GenerateIdMappingRequestData.JSON_PROPERTY_ALLOW_FORCED_RISKLESS_ASSETS,
  GenerateIdMappingRequestData.JSON_PROPERTY_ASSET_TYPES,
  GenerateIdMappingRequestData.JSON_PROPERTY_CALENDAR,
  GenerateIdMappingRequestData.JSON_PROPERTY_COMPOSITE_ASSETS,
  GenerateIdMappingRequestData.JSON_PROPERTY_CURRENCY,
  GenerateIdMappingRequestData.JSON_PROPERTY_DATE,
  GenerateIdMappingRequestData.JSON_PROPERTY_HOLDINGS,
  GenerateIdMappingRequestData.JSON_PROPERTY_INDEX_MAPPING,
  GenerateIdMappingRequestData.JSON_PROPERTY_LAGGING_DATES,
  GenerateIdMappingRequestData.JSON_PROPERTY_RISK_MODEL,
  GenerateIdMappingRequestData.JSON_PROPERTY_RISK_MODEL_APPEND_DATA,
  GenerateIdMappingRequestData.JSON_PROPERTY_UNDERLYING_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GenerateIdMappingRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ALLOW_FORCED_RISKLESS_ASSETS = "allowForcedRisklessAssets";
  private Boolean allowForcedRisklessAssets = false;

  public static final String JSON_PROPERTY_ASSET_TYPES = "assetTypes";
  private java.util.Map<String, String> assetTypes = null;

  public static final String JSON_PROPERTY_CALENDAR = "calendar";
  private String calendar;

  public static final String JSON_PROPERTY_COMPOSITE_ASSETS = "compositeAssets";
  private java.util.Map<String, IDsAndMarketValues> compositeAssets = null;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DATE = "date";
  private InputDate date;

  public static final String JSON_PROPERTY_HOLDINGS = "holdings";
  private Holdings holdings;

  public static final String JSON_PROPERTY_INDEX_MAPPING = "indexMapping";
  private SecurityIndexMapping indexMapping;

  public static final String JSON_PROPERTY_LAGGING_DATES = "laggingDates";
  private LaggingDates laggingDates;

  public static final String JSON_PROPERTY_RISK_MODEL = "riskModel";
  private String riskModel;

  public static final String JSON_PROPERTY_RISK_MODEL_APPEND_DATA = "riskModelAppendData";
  private RiskModelAppendData riskModelAppendData;

  public static final String JSON_PROPERTY_UNDERLYING_IDS = "underlyingIds";
  private java.util.Map<String, String> underlyingIds = null;

  public GenerateIdMappingRequestData() { 
  }

  @JsonCreator
  public GenerateIdMappingRequestData(
    @JsonProperty(value=JSON_PROPERTY_DATE, required=true) InputDate date, 
    @JsonProperty(value=JSON_PROPERTY_HOLDINGS, required=true) Holdings holdings, 
    @JsonProperty(value=JSON_PROPERTY_RISK_MODEL, required=true) String riskModel
  ) {
    this();
    this.date = date;
    this.holdings = holdings;
    this.riskModel = riskModel;
  }

  public GenerateIdMappingRequestData allowForcedRisklessAssets(Boolean allowForcedRisklessAssets) {
    this.allowForcedRisklessAssets = allowForcedRisklessAssets;
    return this;
  }

   /**
   * Allow certain assets to be entirely riskless; certain models always override this to be true. Examples of asset types to which this applies includes offset cash.
   * @return allowForcedRisklessAssets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allow certain assets to be entirely riskless; certain models always override this to be true. Examples of asset types to which this applies includes offset cash.")
  @JsonProperty(JSON_PROPERTY_ALLOW_FORCED_RISKLESS_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowForcedRisklessAssets() {
    return allowForcedRisklessAssets;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_FORCED_RISKLESS_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowForcedRisklessAssets(Boolean allowForcedRisklessAssets) {
    this.allowForcedRisklessAssets = allowForcedRisklessAssets;
  }


  public GenerateIdMappingRequestData assetTypes(java.util.Map<String, String> assetTypes) {
    this.assetTypes = assetTypes;
    return this;
  }

  public GenerateIdMappingRequestData putAssetTypesItem(String key, String assetTypesItem) {
    if (this.assetTypes == null) {
      this.assetTypes = new java.util.HashMap<>();
    }
    this.assetTypes.put(key, assetTypesItem);
    return this;
  }

   /**
   * **(since 1.4.0)** A mapping of security ID to its asset type as the standard asset type keys. When this input is in a request, it is used to (1) identify assets that use Underlying IDs from &#39;underlyingIds&#39; input, and (2) identify asset types compatible with automatic removal of their contribution of currency to risk unless any form of the &#39;removeCurrencyRisk&#39; input is also provided. When this input is used in the request, underlying IDs (provided via &#39;underlyingIds&#39; input) are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details.
   * @return assetTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"FDS\":\"EQ_EQ_COMMON\",\"CFDTOIBM\":\"OTH_CFD\"}", value = "**(since 1.4.0)** A mapping of security ID to its asset type as the standard asset type keys. When this input is in a request, it is used to (1) identify assets that use Underlying IDs from 'underlyingIds' input, and (2) identify asset types compatible with automatic removal of their contribution of currency to risk unless any form of the 'removeCurrencyRisk' input is also provided. When this input is used in the request, underlying IDs (provided via 'underlyingIds' input) are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details.")
  @JsonProperty(JSON_PROPERTY_ASSET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getAssetTypes() {
    return assetTypes;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetTypes(java.util.Map<String, String> assetTypes) {
    this.assetTypes = assetTypes;
  }


  public GenerateIdMappingRequestData calendar(String calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Calendar code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. See also [OA:2012](https://my.apps.factset.com/oa/pages/2012#calendar) for global codes, \&quot;FIVEDAY\&quot; or \&quot;SEVENDAY\&quot; calendars and see [OA:16610](https://my.apps.factset.com/oa/pages/16610#country) for country codes (cf. &#39;Calendar Code&#39; column).
   * @return calendar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FJH", value = "Calendar code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via 'compositeAssets' field. See also [OA:2012](https://my.apps.factset.com/oa/pages/2012#calendar) for global codes, \"FIVEDAY\" or \"SEVENDAY\" calendars and see [OA:16610](https://my.apps.factset.com/oa/pages/16610#country) for country codes (cf. 'Calendar Code' column).")
  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalendar() {
    return calendar;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalendar(String calendar) {
    this.calendar = calendar;
  }


  public GenerateIdMappingRequestData compositeAssets(java.util.Map<String, IDsAndMarketValues> compositeAssets) {
    this.compositeAssets = compositeAssets;
    return this;
  }

  public GenerateIdMappingRequestData putCompositeAssetsItem(String key, IDsAndMarketValues compositeAssetsItem) {
    if (this.compositeAssets == null) {
      this.compositeAssets = new java.util.HashMap<>();
    }
    this.compositeAssets.put(key, compositeAssetsItem);
    return this;
  }

   /**
   * IDs to be defined as composite assets with their constituents&#39; IDs and market values. The typical use case is for risk look-through of ETF or Funds&#39; constituents. When defining composite assets and creating portfolios which hold them, the IDs provided must be an exact match.
   * @return compositeAssets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"CA1_to_IBM_and_CA2\":{\"ids\":[\"IBM\",\"CA2\"],\"marketValues\":[0.45,0.55]},\"CA2\":{\"ids\":[\"VZ\",\"cfd_FDS\"],\"marketValues\":[0.6,0.4]}}", value = "IDs to be defined as composite assets with their constituents' IDs and market values. The typical use case is for risk look-through of ETF or Funds' constituents. When defining composite assets and creating portfolios which hold them, the IDs provided must be an exact match.")
  @JsonProperty(JSON_PROPERTY_COMPOSITE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, IDsAndMarketValues> getCompositeAssets() {
    return compositeAssets;
  }


  @JsonProperty(JSON_PROPERTY_COMPOSITE_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompositeAssets(java.util.Map<String, IDsAndMarketValues> compositeAssets) {
    this.compositeAssets = compositeAssets;
  }


  public GenerateIdMappingRequestData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field.
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via 'compositeAssets' field.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public GenerateIdMappingRequestData date(InputDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InputDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(InputDate date) {
    this.date = date;
  }


  public GenerateIdMappingRequestData holdings(Holdings holdings) {
    this.holdings = holdings;
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Holdings getHoldings() {
    return holdings;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHoldings(Holdings holdings) {
    this.holdings = holdings;
  }


  public GenerateIdMappingRequestData indexMapping(SecurityIndexMapping indexMapping) {
    this.indexMapping = indexMapping;
    return this;
  }

   /**
   * Get indexMapping
   * @return indexMapping
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecurityIndexMapping getIndexMapping() {
    return indexMapping;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexMapping(SecurityIndexMapping indexMapping) {
    this.indexMapping = indexMapping;
  }


  public GenerateIdMappingRequestData laggingDates(LaggingDates laggingDates) {
    this.laggingDates = laggingDates;
    return this;
  }

   /**
   * Get laggingDates
   * @return laggingDates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAGGING_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LaggingDates getLaggingDates() {
    return laggingDates;
  }


  @JsonProperty(JSON_PROPERTY_LAGGING_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaggingDates(LaggingDates laggingDates) {
    this.laggingDates = laggingDates;
  }


  public GenerateIdMappingRequestData riskModel(String riskModel) {
    this.riskModel = riskModel;
    return this;
  }

   /**
   * Model code
   * @return riskModel
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FDS:GLOBAL_EQUITY_M_V1", required = true, value = "Model code")
  @JsonProperty(JSON_PROPERTY_RISK_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRiskModel() {
    return riskModel;
  }


  @JsonProperty(JSON_PROPERTY_RISK_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRiskModel(String riskModel) {
    this.riskModel = riskModel;
  }


  public GenerateIdMappingRequestData riskModelAppendData(RiskModelAppendData riskModelAppendData) {
    this.riskModelAppendData = riskModelAppendData;
    return this;
  }

   /**
   * Get riskModelAppendData
   * @return riskModelAppendData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_MODEL_APPEND_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RiskModelAppendData getRiskModelAppendData() {
    return riskModelAppendData;
  }


  @JsonProperty(JSON_PROPERTY_RISK_MODEL_APPEND_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskModelAppendData(RiskModelAppendData riskModelAppendData) {
    this.riskModelAppendData = riskModelAppendData;
  }


  public GenerateIdMappingRequestData underlyingIds(java.util.Map<String, String> underlyingIds) {
    this.underlyingIds = underlyingIds;
    return this;
  }

  public GenerateIdMappingRequestData putUnderlyingIdsItem(String key, String underlyingIdsItem) {
    if (this.underlyingIds == null) {
      this.underlyingIds = new java.util.HashMap<>();
    }
    this.underlyingIds.put(key, underlyingIdsItem);
    return this;
  }

   /**
   * A map of security IDs to their underlying IDs. When &#39;assetTypes&#39; input is in a request, underlying IDs provided via this input are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details.
   * @return underlyingIds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"CFD_IBM\":\"IBM\",\"cfd_FDS\":\"FDS\"}", value = "A map of security IDs to their underlying IDs. When 'assetTypes' input is in a request, underlying IDs provided via this input are only respected for the following standard asset type keys (all other underlying IDs will be discarded): refer to [OA:22019](https://my.apps.factset.com/oa/pages/22019) for compatible asset type keys and more details.")
  @JsonProperty(JSON_PROPERTY_UNDERLYING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getUnderlyingIds() {
    return underlyingIds;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyingIds(java.util.Map<String, String> underlyingIds) {
    this.underlyingIds = underlyingIds;
  }


  /**
   * Return true if this GenerateIdMappingRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateIdMappingRequestData generateIdMappingRequestData = (GenerateIdMappingRequestData) o;
    return Objects.equals(this.allowForcedRisklessAssets, generateIdMappingRequestData.allowForcedRisklessAssets) &&
        Objects.equals(this.assetTypes, generateIdMappingRequestData.assetTypes) &&
        Objects.equals(this.calendar, generateIdMappingRequestData.calendar) &&
        Objects.equals(this.compositeAssets, generateIdMappingRequestData.compositeAssets) &&
        Objects.equals(this.currency, generateIdMappingRequestData.currency) &&
        Objects.equals(this.date, generateIdMappingRequestData.date) &&
        Objects.equals(this.holdings, generateIdMappingRequestData.holdings) &&
        Objects.equals(this.indexMapping, generateIdMappingRequestData.indexMapping) &&
        Objects.equals(this.laggingDates, generateIdMappingRequestData.laggingDates) &&
        Objects.equals(this.riskModel, generateIdMappingRequestData.riskModel) &&
        Objects.equals(this.riskModelAppendData, generateIdMappingRequestData.riskModelAppendData) &&
        Objects.equals(this.underlyingIds, generateIdMappingRequestData.underlyingIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowForcedRisklessAssets, assetTypes, calendar, compositeAssets, currency, date, holdings, indexMapping, laggingDates, riskModel, riskModelAppendData, underlyingIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateIdMappingRequestData {\n");
    sb.append("    allowForcedRisklessAssets: ").append(toIndentedString(allowForcedRisklessAssets)).append("\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    compositeAssets: ").append(toIndentedString(compositeAssets)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    indexMapping: ").append(toIndentedString(indexMapping)).append("\n");
    sb.append("    laggingDates: ").append(toIndentedString(laggingDates)).append("\n");
    sb.append("    riskModel: ").append(toIndentedString(riskModel)).append("\n");
    sb.append("    riskModelAppendData: ").append(toIndentedString(riskModelAppendData)).append("\n");
    sb.append("    underlyingIds: ").append(toIndentedString(underlyingIds)).append("\n");
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

