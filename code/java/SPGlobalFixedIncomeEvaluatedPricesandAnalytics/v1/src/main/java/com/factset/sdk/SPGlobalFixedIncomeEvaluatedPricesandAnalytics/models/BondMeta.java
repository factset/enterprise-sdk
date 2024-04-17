/*
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.JSON;


/**
 * BondMeta
 */
@JsonPropertyOrder({
  BondMeta.JSON_PROPERTY_REQUEST_ID,
  BondMeta.JSON_PROPERTY_FSYM_ID,
  BondMeta.JSON_PROPERTY_DATE,
  BondMeta.JSON_PROPERTY_CLASSIFICATION,
  BondMeta.JSON_PROPERTY_MATURITY_DATE,
  BondMeta.JSON_PROPERTY_ASSUMED_MATURITY_DATE,
  BondMeta.JSON_PROPERTY_DEFAULTED,
  BondMeta.JSON_PROPERTY_ISIN,
  BondMeta.JSON_PROPERTY_CUSIP,
  BondMeta.JSON_PROPERTY_VENDOR_ID,
  BondMeta.JSON_PROPERTY_TICKER,
  BondMeta.JSON_PROPERTY_SET_ID,
  BondMeta.JSON_PROPERTY_BENCHMARK_I_S_I_N,
  BondMeta.JSON_PROPERTY_BENCHMARK_C_U_S_I_P,
  BondMeta.JSON_PROPERTY_NAME,
  BondMeta.JSON_PROPERTY_ISSUER_NAME,
  BondMeta.JSON_PROPERTY_BENCHMARK_NAME,
  BondMeta.JSON_PROPERTY_PERPETUAL,
  BondMeta.JSON_PROPERTY_REGION,
  BondMeta.JSON_PROPERTY_TIER,
  BondMeta.JSON_PROPERTY_ISSUE_NAME,
  BondMeta.JSON_PROPERTY_BOND_TICKER,
  BondMeta.JSON_PROPERTY_INDEX_TRANCHE_NAME,
  BondMeta.JSON_PROPERTY_REDEMPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BondMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CLASSIFICATION = "classification";
  private JsonNullable<String> classification = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MATURITY_DATE = "maturityDate";
  private JsonNullable<LocalDate> maturityDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_ASSUMED_MATURITY_DATE = "assumedMaturityDate";
  private JsonNullable<LocalDate> assumedMaturityDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_DEFAULTED = "defaulted";
  private JsonNullable<String> defaulted = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISIN = "isin";
  private JsonNullable<String> isin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  private JsonNullable<String> cusip = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VENDOR_ID = "vendorId";
  private JsonNullable<String> vendorId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private JsonNullable<String> ticker = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SET_ID = "setId";
  private JsonNullable<BigDecimal> setId = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_BENCHMARK_I_S_I_N = "benchmarkISIN";
  private JsonNullable<String> benchmarkISIN = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BENCHMARK_C_U_S_I_P = "benchmarkCUSIP";
  private JsonNullable<String> benchmarkCUSIP = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUER_NAME = "issuerName";
  private JsonNullable<String> issuerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BENCHMARK_NAME = "benchmarkName";
  private JsonNullable<String> benchmarkName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERPETUAL = "perpetual";
  private JsonNullable<String> perpetual = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REGION = "region";
  private JsonNullable<String> region = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIER = "tier";
  private JsonNullable<String> tier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUE_NAME = "issueName";
  private JsonNullable<String> issueName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BOND_TICKER = "bondTicker";
  private JsonNullable<String> bondTicker = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INDEX_TRANCHE_NAME = "indexTrancheName";
  private JsonNullable<String> indexTrancheName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REDEMPTION = "redemption";
  private JsonNullable<String> redemption = JsonNullable.<String>undefined();

  public BondMeta() { 
  }

  public BondMeta requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US45905URL07", value = "Identifier that was used for the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public BondMeta fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CJQZQ0-S", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public BondMeta date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date on which the price is calculated.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu Jan 26 00:00:00 UTC 2023", value = "The date on which the price is calculated.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public BondMeta classification(String classification) {
    this.classification = JsonNullable.<String>of(classification);
    return this;
  }

   /**
   * Returns the top level sector classification of the instrument.
   * @return classification
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "GovernmentRelated", value = "Returns the top level sector classification of the instrument.")
  @JsonIgnore

  public String getClassification() {
        return classification.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClassification_JsonNullable() {
    return classification;
  }
  
  @JsonProperty(JSON_PROPERTY_CLASSIFICATION)
  public void setClassification_JsonNullable(JsonNullable<String> classification) {
    this.classification = classification;
  }

  public void setClassification(String classification) {
    this.classification = JsonNullable.<String>of(classification);
  }


  public BondMeta maturityDate(LocalDate maturityDate) {
    this.maturityDate = JsonNullable.<LocalDate>of(maturityDate);
    return this;
  }

   /**
   * The date on which the principal amount of the security becomes due and payable, as stated in the terms of the security. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;.
   * @return maturityDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mon Mar 03 00:00:00 UTC 2025", value = "The date on which the principal amount of the security becomes due and payable, as stated in the terms of the security. Available only for `corporate bonds` and `municipal bonds`.")
  @JsonIgnore

  public LocalDate getMaturityDate() {
        return maturityDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getMaturityDate_JsonNullable() {
    return maturityDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  public void setMaturityDate_JsonNullable(JsonNullable<LocalDate> maturityDate) {
    this.maturityDate = maturityDate;
  }

  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = JsonNullable.<LocalDate>of(maturityDate);
  }


  public BondMeta assumedMaturityDate(LocalDate assumedMaturityDate) {
    this.assumedMaturityDate = JsonNullable.<LocalDate>of(assumedMaturityDate);
    return this;
  }

   /**
   * The assumed maturity date on which the principal amount of the security becomes due and payable. This is controlled by the evaluator and represents the maturity date being used in the market. Available only for &#x60;corporate bonds&#x60;.
   * @return assumedMaturityDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The assumed maturity date on which the principal amount of the security becomes due and payable. This is controlled by the evaluator and represents the maturity date being used in the market. Available only for `corporate bonds`.")
  @JsonIgnore

  public LocalDate getAssumedMaturityDate() {
        return assumedMaturityDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSUMED_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getAssumedMaturityDate_JsonNullable() {
    return assumedMaturityDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSUMED_MATURITY_DATE)
  public void setAssumedMaturityDate_JsonNullable(JsonNullable<LocalDate> assumedMaturityDate) {
    this.assumedMaturityDate = assumedMaturityDate;
  }

  public void setAssumedMaturityDate(LocalDate assumedMaturityDate) {
    this.assumedMaturityDate = JsonNullable.<LocalDate>of(assumedMaturityDate);
  }


  public BondMeta defaulted(String defaulted) {
    this.defaulted = JsonNullable.<String>of(defaulted);
    return this;
  }

   /**
   * Indicates if an instrument is default or not. Available only for &#x60;corporate bonds&#x60;.
   * @return defaulted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "N", value = "Indicates if an instrument is default or not. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getDefaulted() {
        return defaulted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaulted_JsonNullable() {
    return defaulted;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULTED)
  public void setDefaulted_JsonNullable(JsonNullable<String> defaulted) {
    this.defaulted = defaulted;
  }

  public void setDefaulted(String defaulted) {
    this.defaulted = JsonNullable.<String>of(defaulted);
  }


  public BondMeta isin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
    return this;
  }

   /**
   * The ISIN (International Securities Identification Number) to which the price data applies.
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US45905URL07", value = "The ISIN (International Securities Identification Number) to which the price data applies.")
  @JsonIgnore

  public String getIsin() {
        return isin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsin_JsonNullable() {
    return isin;
  }
  
  @JsonProperty(JSON_PROPERTY_ISIN)
  public void setIsin_JsonNullable(JsonNullable<String> isin) {
    this.isin = isin;
  }

  public void setIsin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
  }


  public BondMeta cusip(String cusip) {
    this.cusip = JsonNullable.<String>of(cusip);
    return this;
  }

   /**
   * Unique CUSIP identifier for the instrument to which the price data applies.
   * @return cusip
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "45905URL0", value = "Unique CUSIP identifier for the instrument to which the price data applies.")
  @JsonIgnore

  public String getCusip() {
        return cusip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCusip_JsonNullable() {
    return cusip;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSIP)
  public void setCusip_JsonNullable(JsonNullable<String> cusip) {
    this.cusip = cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = JsonNullable.<String>of(cusip);
  }


  public BondMeta vendorId(String vendorId) {
    this.vendorId = JsonNullable.<String>of(vendorId);
    return this;
  }

   /**
   * Returns the Vendor ID.
   * @return vendorId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US45905URL07", value = "Returns the Vendor ID.")
  @JsonIgnore

  public String getVendorId() {
        return vendorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VENDOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVendorId_JsonNullable() {
    return vendorId;
  }
  
  @JsonProperty(JSON_PROPERTY_VENDOR_ID)
  public void setVendorId_JsonNullable(JsonNullable<String> vendorId) {
    this.vendorId = vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = JsonNullable.<String>of(vendorId);
  }


  public BondMeta ticker(String ticker) {
    this.ticker = JsonNullable.<String>of(ticker);
    return this;
  }

   /**
   * The IHS Markit ticker for the organization. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;.
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "IBRD", value = "The IHS Markit ticker for the organization. Available only for `corporate bonds` and `asset-backed security bonds`.")
  @JsonIgnore

  public String getTicker() {
        return ticker.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTicker_JsonNullable() {
    return ticker;
  }
  
  @JsonProperty(JSON_PROPERTY_TICKER)
  public void setTicker_JsonNullable(JsonNullable<String> ticker) {
    this.ticker = ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = JsonNullable.<String>of(ticker);
  }


  public BondMeta setId(BigDecimal setId) {
    this.setId = JsonNullable.<BigDecimal>of(setId);
    return this;
  }

   /**
   * EVB internal identifier of instrumentSet. Available only for &#x60;corporate bonds&#x60;.
   * @return setId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "684", value = "EVB internal identifier of instrumentSet. Available only for `corporate bonds`.")
  @JsonIgnore

  public BigDecimal getSetId() {
        return setId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getSetId_JsonNullable() {
    return setId;
  }
  
  @JsonProperty(JSON_PROPERTY_SET_ID)
  public void setSetId_JsonNullable(JsonNullable<BigDecimal> setId) {
    this.setId = setId;
  }

  public void setSetId(BigDecimal setId) {
    this.setId = JsonNullable.<BigDecimal>of(setId);
  }


  public BondMeta benchmarkISIN(String benchmarkISIN) {
    this.benchmarkISIN = JsonNullable.<String>of(benchmarkISIN);
    return this;
  }

   /**
   * The ISIN of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;.
   * @return benchmarkISIN
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US91282CGD74", value = "The ISIN of the benchmark instrument. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getBenchmarkISIN() {
        return benchmarkISIN.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENCHMARK_I_S_I_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBenchmarkISIN_JsonNullable() {
    return benchmarkISIN;
  }
  
  @JsonProperty(JSON_PROPERTY_BENCHMARK_I_S_I_N)
  public void setBenchmarkISIN_JsonNullable(JsonNullable<String> benchmarkISIN) {
    this.benchmarkISIN = benchmarkISIN;
  }

  public void setBenchmarkISIN(String benchmarkISIN) {
    this.benchmarkISIN = JsonNullable.<String>of(benchmarkISIN);
  }


  public BondMeta benchmarkCUSIP(String benchmarkCUSIP) {
    this.benchmarkCUSIP = JsonNullable.<String>of(benchmarkCUSIP);
    return this;
  }

   /**
   * The CUSIP of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;.
   * @return benchmarkCUSIP
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "91282CGD7", value = "The CUSIP of the benchmark instrument. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getBenchmarkCUSIP() {
        return benchmarkCUSIP.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENCHMARK_C_U_S_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBenchmarkCUSIP_JsonNullable() {
    return benchmarkCUSIP;
  }
  
  @JsonProperty(JSON_PROPERTY_BENCHMARK_C_U_S_I_P)
  public void setBenchmarkCUSIP_JsonNullable(JsonNullable<String> benchmarkCUSIP) {
    this.benchmarkCUSIP = benchmarkCUSIP;
  }

  public void setBenchmarkCUSIP(String benchmarkCUSIP) {
    this.benchmarkCUSIP = JsonNullable.<String>of(benchmarkCUSIP);
  }


  public BondMeta name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Returns full bond name (issuer name-coupon rate-maturity year)
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Intl Bk for Recon & Dev 2.125 03-Mar-2025", value = "Returns full bond name (issuer name-coupon rate-maturity year)")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public BondMeta issuerName(String issuerName) {
    this.issuerName = JsonNullable.<String>of(issuerName);
    return this;
  }

   /**
   * Returns the short name of the issuer. Available only for &#x60;corporate bonds&#x60; and &#39;municipal bonds&#39;.
   * @return issuerName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Intl Bk for Recon & Dev", value = "Returns the short name of the issuer. Available only for `corporate bonds` and 'municipal bonds'.")
  @JsonIgnore

  public String getIssuerName() {
        return issuerName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssuerName_JsonNullable() {
    return issuerName;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  public void setIssuerName_JsonNullable(JsonNullable<String> issuerName) {
    this.issuerName = issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = JsonNullable.<String>of(issuerName);
  }


  public BondMeta benchmarkName(String benchmarkName) {
    this.benchmarkName = JsonNullable.<String>of(benchmarkName);
    return this;
  }

   /**
   * The name of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;.
   * @return benchmarkName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USGB 4.25 12/31/24", value = "The name of the benchmark instrument. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getBenchmarkName() {
        return benchmarkName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENCHMARK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBenchmarkName_JsonNullable() {
    return benchmarkName;
  }
  
  @JsonProperty(JSON_PROPERTY_BENCHMARK_NAME)
  public void setBenchmarkName_JsonNullable(JsonNullable<String> benchmarkName) {
    this.benchmarkName = benchmarkName;
  }

  public void setBenchmarkName(String benchmarkName) {
    this.benchmarkName = JsonNullable.<String>of(benchmarkName);
  }


  public BondMeta perpetual(String perpetual) {
    this.perpetual = JsonNullable.<String>of(perpetual);
    return this;
  }

   /**
   * Shows that a maturity date is not specified for the instrument. Available only for &#x60;corporate bonds&#x60;.
   * @return perpetual
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "N", value = "Shows that a maturity date is not specified for the instrument. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getPerpetual() {
        return perpetual.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERPETUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPerpetual_JsonNullable() {
    return perpetual;
  }
  
  @JsonProperty(JSON_PROPERTY_PERPETUAL)
  public void setPerpetual_JsonNullable(JsonNullable<String> perpetual) {
    this.perpetual = perpetual;
  }

  public void setPerpetual(String perpetual) {
    this.perpetual = JsonNullable.<String>of(perpetual);
  }


  public BondMeta region(String region) {
    this.region = JsonNullable.<String>of(region);
    return this;
  }

   /**
   * Region of the coupon currency. Available only for &#x60;corporate bonds&#x60;.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Americas", value = "Region of the coupon currency. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getRegion() {
        return region.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRegion_JsonNullable() {
    return region;
  }
  
  @JsonProperty(JSON_PROPERTY_REGION)
  public void setRegion_JsonNullable(JsonNullable<String> region) {
    this.region = region;
  }

  public void setRegion(String region) {
    this.region = JsonNullable.<String>of(region);
  }


  public BondMeta tier(String tier) {
    this.tier = JsonNullable.<String>of(tier);
    return this;
  }

   /**
   * The code representing the bond seniority type. Available only for &#x60;corporate bonds&#x60;.
   * @return tier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SNRFOR", value = "The code representing the bond seniority type. Available only for `corporate bonds`.")
  @JsonIgnore

  public String getTier() {
        return tier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTier_JsonNullable() {
    return tier;
  }
  
  @JsonProperty(JSON_PROPERTY_TIER)
  public void setTier_JsonNullable(JsonNullable<String> tier) {
    this.tier = tier;
  }

  public void setTier(String tier) {
    this.tier = JsonNullable.<String>of(tier);
  }


  public BondMeta issueName(String issueName) {
    this.issueName = JsonNullable.<String>of(issueName);
    return this;
  }

   /**
   * Name of the instrument. Available only for &#x60;municipal bonds&#x60;.
   * @return issueName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the instrument. Available only for `municipal bonds`.")
  @JsonIgnore

  public String getIssueName() {
        return issueName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssueName_JsonNullable() {
    return issueName;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUE_NAME)
  public void setIssueName_JsonNullable(JsonNullable<String> issueName) {
    this.issueName = issueName;
  }

  public void setIssueName(String issueName) {
    this.issueName = JsonNullable.<String>of(issueName);
  }


  public BondMeta bondTicker(String bondTicker) {
    this.bondTicker = JsonNullable.<String>of(bondTicker);
    return this;
  }

   /**
   * Returns the bond specific ticker. Available only for &#x60;asset-backed security bonds&#x60;.
   * @return bondTicker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Returns the bond specific ticker. Available only for `asset-backed security bonds`.")
  @JsonIgnore

  public String getBondTicker() {
        return bondTicker.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOND_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBondTicker_JsonNullable() {
    return bondTicker;
  }
  
  @JsonProperty(JSON_PROPERTY_BOND_TICKER)
  public void setBondTicker_JsonNullable(JsonNullable<String> bondTicker) {
    this.bondTicker = bondTicker;
  }

  public void setBondTicker(String bondTicker) {
    this.bondTicker = JsonNullable.<String>of(bondTicker);
  }


  public BondMeta indexTrancheName(String indexTrancheName) {
    this.indexTrancheName = JsonNullable.<String>of(indexTrancheName);
    return this;
  }

   /**
   * The field shows Index Tranche Name. Available only for &#x60;asset-backed security bonds&#x60;.
   * @return indexTrancheName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The field shows Index Tranche Name. Available only for `asset-backed security bonds`.")
  @JsonIgnore

  public String getIndexTrancheName() {
        return indexTrancheName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDEX_TRANCHE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIndexTrancheName_JsonNullable() {
    return indexTrancheName;
  }
  
  @JsonProperty(JSON_PROPERTY_INDEX_TRANCHE_NAME)
  public void setIndexTrancheName_JsonNullable(JsonNullable<String> indexTrancheName) {
    this.indexTrancheName = indexTrancheName;
  }

  public void setIndexTrancheName(String indexTrancheName) {
    this.indexTrancheName = JsonNullable.<String>of(indexTrancheName);
  }


  public BondMeta redemption(String redemption) {
    this.redemption = JsonNullable.<String>of(redemption);
    return this;
  }

   /**
   * Returns the indication of whether the bond is run to maturity or to the optional redemption/call. Available only for &#x60;asset-backed security bonds&#x60;.
   * @return redemption
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Returns the indication of whether the bond is run to maturity or to the optional redemption/call. Available only for `asset-backed security bonds`.")
  @JsonIgnore

  public String getRedemption() {
        return redemption.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRedemption_JsonNullable() {
    return redemption;
  }
  
  @JsonProperty(JSON_PROPERTY_REDEMPTION)
  public void setRedemption_JsonNullable(JsonNullable<String> redemption) {
    this.redemption = redemption;
  }

  public void setRedemption(String redemption) {
    this.redemption = JsonNullable.<String>of(redemption);
  }


  /**
   * Return true if this bondMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondMeta bondMeta = (BondMeta) o;
    return Objects.equals(this.requestId, bondMeta.requestId) &&
        equalsNullable(this.fsymId, bondMeta.fsymId) &&
        equalsNullable(this.date, bondMeta.date) &&
        equalsNullable(this.classification, bondMeta.classification) &&
        equalsNullable(this.maturityDate, bondMeta.maturityDate) &&
        equalsNullable(this.assumedMaturityDate, bondMeta.assumedMaturityDate) &&
        equalsNullable(this.defaulted, bondMeta.defaulted) &&
        equalsNullable(this.isin, bondMeta.isin) &&
        equalsNullable(this.cusip, bondMeta.cusip) &&
        equalsNullable(this.vendorId, bondMeta.vendorId) &&
        equalsNullable(this.ticker, bondMeta.ticker) &&
        equalsNullable(this.setId, bondMeta.setId) &&
        equalsNullable(this.benchmarkISIN, bondMeta.benchmarkISIN) &&
        equalsNullable(this.benchmarkCUSIP, bondMeta.benchmarkCUSIP) &&
        equalsNullable(this.name, bondMeta.name) &&
        equalsNullable(this.issuerName, bondMeta.issuerName) &&
        equalsNullable(this.benchmarkName, bondMeta.benchmarkName) &&
        equalsNullable(this.perpetual, bondMeta.perpetual) &&
        equalsNullable(this.region, bondMeta.region) &&
        equalsNullable(this.tier, bondMeta.tier) &&
        equalsNullable(this.issueName, bondMeta.issueName) &&
        equalsNullable(this.bondTicker, bondMeta.bondTicker) &&
        equalsNullable(this.indexTrancheName, bondMeta.indexTrancheName) &&
        equalsNullable(this.redemption, bondMeta.redemption);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(classification), hashCodeNullable(maturityDate), hashCodeNullable(assumedMaturityDate), hashCodeNullable(defaulted), hashCodeNullable(isin), hashCodeNullable(cusip), hashCodeNullable(vendorId), hashCodeNullable(ticker), hashCodeNullable(setId), hashCodeNullable(benchmarkISIN), hashCodeNullable(benchmarkCUSIP), hashCodeNullable(name), hashCodeNullable(issuerName), hashCodeNullable(benchmarkName), hashCodeNullable(perpetual), hashCodeNullable(region), hashCodeNullable(tier), hashCodeNullable(issueName), hashCodeNullable(bondTicker), hashCodeNullable(indexTrancheName), hashCodeNullable(redemption));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BondMeta {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    assumedMaturityDate: ").append(toIndentedString(assumedMaturityDate)).append("\n");
    sb.append("    defaulted: ").append(toIndentedString(defaulted)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
    sb.append("    benchmarkISIN: ").append(toIndentedString(benchmarkISIN)).append("\n");
    sb.append("    benchmarkCUSIP: ").append(toIndentedString(benchmarkCUSIP)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    benchmarkName: ").append(toIndentedString(benchmarkName)).append("\n");
    sb.append("    perpetual: ").append(toIndentedString(perpetual)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
    sb.append("    bondTicker: ").append(toIndentedString(bondTicker)).append("\n");
    sb.append("    indexTrancheName: ").append(toIndentedString(indexTrancheName)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
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

