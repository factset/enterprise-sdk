/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAumFundMonth;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAumShareDaily;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAvailableForSale;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAverageSpread;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundCurrencyIso;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundDailyTradingVol;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundDistributionYield;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundEsgCompliance;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundEsgObjective;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundExpenseRatio;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundFirstNavRecord;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundFundFlowYTD;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundInceptionDateFund;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundInceptionDateShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundMeta;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundOutstandingShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundSfdrClassification;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * Key Statistics for the provided fund
 */
@ApiModel(description = "Key Statistics for the provided fund")
@JsonPropertyOrder({
  KeyStatsDataObjectFund.JSON_PROPERTY_AUM_FUND_MONTH,
  KeyStatsDataObjectFund.JSON_PROPERTY_AUM_SHARE_DAILY,
  KeyStatsDataObjectFund.JSON_PROPERTY_AVAILABLE_FOR_SALE,
  KeyStatsDataObjectFund.JSON_PROPERTY_AVERAGE_SPREAD,
  KeyStatsDataObjectFund.JSON_PROPERTY_CURRENCY_ISO,
  KeyStatsDataObjectFund.JSON_PROPERTY_DAILY_TRADING_VOL,
  KeyStatsDataObjectFund.JSON_PROPERTY_DISTRIBUTION_YIELD,
  KeyStatsDataObjectFund.JSON_PROPERTY_ESG_COMPLIANCE,
  KeyStatsDataObjectFund.JSON_PROPERTY_ESG_OBJECTIVE,
  KeyStatsDataObjectFund.JSON_PROPERTY_EXPENSE_RATIO,
  KeyStatsDataObjectFund.JSON_PROPERTY_FIRST_NAV_RECORD,
  KeyStatsDataObjectFund.JSON_PROPERTY_FUND_FLOW_Y_T_D,
  KeyStatsDataObjectFund.JSON_PROPERTY_INCEPTION_DATE_FUND,
  KeyStatsDataObjectFund.JSON_PROPERTY_INCEPTION_DATE_SHARE,
  KeyStatsDataObjectFund.JSON_PROPERTY_META,
  KeyStatsDataObjectFund.JSON_PROPERTY_OUTSTANDING_SHARE,
  KeyStatsDataObjectFund.JSON_PROPERTY_SFDR_CLASSIFICATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsDataObjectFund implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUM_FUND_MONTH = "aumFundMonth";
  private KeyStatsDataObjectFundAumFundMonth aumFundMonth;

  public static final String JSON_PROPERTY_AUM_SHARE_DAILY = "aumShareDaily";
  private KeyStatsDataObjectFundAumShareDaily aumShareDaily;

  public static final String JSON_PROPERTY_AVAILABLE_FOR_SALE = "availableForSale";
  private KeyStatsDataObjectFundAvailableForSale availableForSale;

  public static final String JSON_PROPERTY_AVERAGE_SPREAD = "averageSpread";
  private KeyStatsDataObjectFundAverageSpread averageSpread;

  public static final String JSON_PROPERTY_CURRENCY_ISO = "currencyIso";
  private KeyStatsDataObjectFundCurrencyIso currencyIso;

  public static final String JSON_PROPERTY_DAILY_TRADING_VOL = "dailyTradingVol";
  private KeyStatsDataObjectFundDailyTradingVol dailyTradingVol;

  public static final String JSON_PROPERTY_DISTRIBUTION_YIELD = "distributionYield";
  private KeyStatsDataObjectFundDistributionYield distributionYield;

  public static final String JSON_PROPERTY_ESG_COMPLIANCE = "esgCompliance";
  private KeyStatsDataObjectFundEsgCompliance esgCompliance;

  public static final String JSON_PROPERTY_ESG_OBJECTIVE = "esgObjective";
  private KeyStatsDataObjectFundEsgObjective esgObjective;

  public static final String JSON_PROPERTY_EXPENSE_RATIO = "expenseRatio";
  private KeyStatsDataObjectFundExpenseRatio expenseRatio;

  public static final String JSON_PROPERTY_FIRST_NAV_RECORD = "firstNavRecord";
  private KeyStatsDataObjectFundFirstNavRecord firstNavRecord;

  public static final String JSON_PROPERTY_FUND_FLOW_Y_T_D = "fundFlowYTD";
  private KeyStatsDataObjectFundFundFlowYTD fundFlowYTD;

  public static final String JSON_PROPERTY_INCEPTION_DATE_FUND = "inceptionDateFund";
  private KeyStatsDataObjectFundInceptionDateFund inceptionDateFund;

  public static final String JSON_PROPERTY_INCEPTION_DATE_SHARE = "inceptionDateShare";
  private KeyStatsDataObjectFundInceptionDateShare inceptionDateShare;

  public static final String JSON_PROPERTY_META = "meta";
  private KeyStatsDataObjectFundMeta meta;

  public static final String JSON_PROPERTY_OUTSTANDING_SHARE = "outstandingShare";
  private KeyStatsDataObjectFundOutstandingShare outstandingShare;

  public static final String JSON_PROPERTY_SFDR_CLASSIFICATION = "sfdrClassification";
  private KeyStatsDataObjectFundSfdrClassification sfdrClassification;

  public KeyStatsDataObjectFund() { 
  }

  public KeyStatsDataObjectFund aumFundMonth(KeyStatsDataObjectFundAumFundMonth aumFundMonth) {
    this.aumFundMonth = aumFundMonth;
    return this;
  }

   /**
   * Get aumFundMonth
   * @return aumFundMonth
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUM_FUND_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundAumFundMonth getAumFundMonth() {
    return aumFundMonth;
  }


  @JsonProperty(JSON_PROPERTY_AUM_FUND_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAumFundMonth(KeyStatsDataObjectFundAumFundMonth aumFundMonth) {
    this.aumFundMonth = aumFundMonth;
  }


  public KeyStatsDataObjectFund aumShareDaily(KeyStatsDataObjectFundAumShareDaily aumShareDaily) {
    this.aumShareDaily = aumShareDaily;
    return this;
  }

   /**
   * Get aumShareDaily
   * @return aumShareDaily
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUM_SHARE_DAILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundAumShareDaily getAumShareDaily() {
    return aumShareDaily;
  }


  @JsonProperty(JSON_PROPERTY_AUM_SHARE_DAILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAumShareDaily(KeyStatsDataObjectFundAumShareDaily aumShareDaily) {
    this.aumShareDaily = aumShareDaily;
  }


  public KeyStatsDataObjectFund availableForSale(KeyStatsDataObjectFundAvailableForSale availableForSale) {
    this.availableForSale = availableForSale;
    return this;
  }

   /**
   * Get availableForSale
   * @return availableForSale
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_FOR_SALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundAvailableForSale getAvailableForSale() {
    return availableForSale;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_FOR_SALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableForSale(KeyStatsDataObjectFundAvailableForSale availableForSale) {
    this.availableForSale = availableForSale;
  }


  public KeyStatsDataObjectFund averageSpread(KeyStatsDataObjectFundAverageSpread averageSpread) {
    this.averageSpread = averageSpread;
    return this;
  }

   /**
   * Get averageSpread
   * @return averageSpread
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVERAGE_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundAverageSpread getAverageSpread() {
    return averageSpread;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageSpread(KeyStatsDataObjectFundAverageSpread averageSpread) {
    this.averageSpread = averageSpread;
  }


  public KeyStatsDataObjectFund currencyIso(KeyStatsDataObjectFundCurrencyIso currencyIso) {
    this.currencyIso = currencyIso;
    return this;
  }

   /**
   * Get currencyIso
   * @return currencyIso
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundCurrencyIso getCurrencyIso() {
    return currencyIso;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyIso(KeyStatsDataObjectFundCurrencyIso currencyIso) {
    this.currencyIso = currencyIso;
  }


  public KeyStatsDataObjectFund dailyTradingVol(KeyStatsDataObjectFundDailyTradingVol dailyTradingVol) {
    this.dailyTradingVol = dailyTradingVol;
    return this;
  }

   /**
   * Get dailyTradingVol
   * @return dailyTradingVol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_TRADING_VOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundDailyTradingVol getDailyTradingVol() {
    return dailyTradingVol;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_TRADING_VOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyTradingVol(KeyStatsDataObjectFundDailyTradingVol dailyTradingVol) {
    this.dailyTradingVol = dailyTradingVol;
  }


  public KeyStatsDataObjectFund distributionYield(KeyStatsDataObjectFundDistributionYield distributionYield) {
    this.distributionYield = distributionYield;
    return this;
  }

   /**
   * Get distributionYield
   * @return distributionYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundDistributionYield getDistributionYield() {
    return distributionYield;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributionYield(KeyStatsDataObjectFundDistributionYield distributionYield) {
    this.distributionYield = distributionYield;
  }


  public KeyStatsDataObjectFund esgCompliance(KeyStatsDataObjectFundEsgCompliance esgCompliance) {
    this.esgCompliance = esgCompliance;
    return this;
  }

   /**
   * Get esgCompliance
   * @return esgCompliance
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESG_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundEsgCompliance getEsgCompliance() {
    return esgCompliance;
  }


  @JsonProperty(JSON_PROPERTY_ESG_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEsgCompliance(KeyStatsDataObjectFundEsgCompliance esgCompliance) {
    this.esgCompliance = esgCompliance;
  }


  public KeyStatsDataObjectFund esgObjective(KeyStatsDataObjectFundEsgObjective esgObjective) {
    this.esgObjective = esgObjective;
    return this;
  }

   /**
   * Get esgObjective
   * @return esgObjective
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESG_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundEsgObjective getEsgObjective() {
    return esgObjective;
  }


  @JsonProperty(JSON_PROPERTY_ESG_OBJECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEsgObjective(KeyStatsDataObjectFundEsgObjective esgObjective) {
    this.esgObjective = esgObjective;
  }


  public KeyStatsDataObjectFund expenseRatio(KeyStatsDataObjectFundExpenseRatio expenseRatio) {
    this.expenseRatio = expenseRatio;
    return this;
  }

   /**
   * Get expenseRatio
   * @return expenseRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPENSE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundExpenseRatio getExpenseRatio() {
    return expenseRatio;
  }


  @JsonProperty(JSON_PROPERTY_EXPENSE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpenseRatio(KeyStatsDataObjectFundExpenseRatio expenseRatio) {
    this.expenseRatio = expenseRatio;
  }


  public KeyStatsDataObjectFund firstNavRecord(KeyStatsDataObjectFundFirstNavRecord firstNavRecord) {
    this.firstNavRecord = firstNavRecord;
    return this;
  }

   /**
   * Get firstNavRecord
   * @return firstNavRecord
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAV_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundFirstNavRecord getFirstNavRecord() {
    return firstNavRecord;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAV_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstNavRecord(KeyStatsDataObjectFundFirstNavRecord firstNavRecord) {
    this.firstNavRecord = firstNavRecord;
  }


  public KeyStatsDataObjectFund fundFlowYTD(KeyStatsDataObjectFundFundFlowYTD fundFlowYTD) {
    this.fundFlowYTD = fundFlowYTD;
    return this;
  }

   /**
   * Get fundFlowYTD
   * @return fundFlowYTD
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUND_FLOW_Y_T_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundFundFlowYTD getFundFlowYTD() {
    return fundFlowYTD;
  }


  @JsonProperty(JSON_PROPERTY_FUND_FLOW_Y_T_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundFlowYTD(KeyStatsDataObjectFundFundFlowYTD fundFlowYTD) {
    this.fundFlowYTD = fundFlowYTD;
  }


  public KeyStatsDataObjectFund inceptionDateFund(KeyStatsDataObjectFundInceptionDateFund inceptionDateFund) {
    this.inceptionDateFund = inceptionDateFund;
    return this;
  }

   /**
   * Get inceptionDateFund
   * @return inceptionDateFund
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCEPTION_DATE_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundInceptionDateFund getInceptionDateFund() {
    return inceptionDateFund;
  }


  @JsonProperty(JSON_PROPERTY_INCEPTION_DATE_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInceptionDateFund(KeyStatsDataObjectFundInceptionDateFund inceptionDateFund) {
    this.inceptionDateFund = inceptionDateFund;
  }


  public KeyStatsDataObjectFund inceptionDateShare(KeyStatsDataObjectFundInceptionDateShare inceptionDateShare) {
    this.inceptionDateShare = inceptionDateShare;
    return this;
  }

   /**
   * Get inceptionDateShare
   * @return inceptionDateShare
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCEPTION_DATE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundInceptionDateShare getInceptionDateShare() {
    return inceptionDateShare;
  }


  @JsonProperty(JSON_PROPERTY_INCEPTION_DATE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInceptionDateShare(KeyStatsDataObjectFundInceptionDateShare inceptionDateShare) {
    this.inceptionDateShare = inceptionDateShare;
  }


  public KeyStatsDataObjectFund meta(KeyStatsDataObjectFundMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(KeyStatsDataObjectFundMeta meta) {
    this.meta = meta;
  }


  public KeyStatsDataObjectFund outstandingShare(KeyStatsDataObjectFundOutstandingShare outstandingShare) {
    this.outstandingShare = outstandingShare;
    return this;
  }

   /**
   * Get outstandingShare
   * @return outstandingShare
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTSTANDING_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundOutstandingShare getOutstandingShare() {
    return outstandingShare;
  }


  @JsonProperty(JSON_PROPERTY_OUTSTANDING_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutstandingShare(KeyStatsDataObjectFundOutstandingShare outstandingShare) {
    this.outstandingShare = outstandingShare;
  }


  public KeyStatsDataObjectFund sfdrClassification(KeyStatsDataObjectFundSfdrClassification sfdrClassification) {
    this.sfdrClassification = sfdrClassification;
    return this;
  }

   /**
   * Get sfdrClassification
   * @return sfdrClassification
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SFDR_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsDataObjectFundSfdrClassification getSfdrClassification() {
    return sfdrClassification;
  }


  @JsonProperty(JSON_PROPERTY_SFDR_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSfdrClassification(KeyStatsDataObjectFundSfdrClassification sfdrClassification) {
    this.sfdrClassification = sfdrClassification;
  }


  /**
   * Return true if this KeyStatsDataObjectFund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsDataObjectFund keyStatsDataObjectFund = (KeyStatsDataObjectFund) o;
    return Objects.equals(this.aumFundMonth, keyStatsDataObjectFund.aumFundMonth) &&
        Objects.equals(this.aumShareDaily, keyStatsDataObjectFund.aumShareDaily) &&
        Objects.equals(this.availableForSale, keyStatsDataObjectFund.availableForSale) &&
        Objects.equals(this.averageSpread, keyStatsDataObjectFund.averageSpread) &&
        Objects.equals(this.currencyIso, keyStatsDataObjectFund.currencyIso) &&
        Objects.equals(this.dailyTradingVol, keyStatsDataObjectFund.dailyTradingVol) &&
        Objects.equals(this.distributionYield, keyStatsDataObjectFund.distributionYield) &&
        Objects.equals(this.esgCompliance, keyStatsDataObjectFund.esgCompliance) &&
        Objects.equals(this.esgObjective, keyStatsDataObjectFund.esgObjective) &&
        Objects.equals(this.expenseRatio, keyStatsDataObjectFund.expenseRatio) &&
        Objects.equals(this.firstNavRecord, keyStatsDataObjectFund.firstNavRecord) &&
        Objects.equals(this.fundFlowYTD, keyStatsDataObjectFund.fundFlowYTD) &&
        Objects.equals(this.inceptionDateFund, keyStatsDataObjectFund.inceptionDateFund) &&
        Objects.equals(this.inceptionDateShare, keyStatsDataObjectFund.inceptionDateShare) &&
        Objects.equals(this.meta, keyStatsDataObjectFund.meta) &&
        Objects.equals(this.outstandingShare, keyStatsDataObjectFund.outstandingShare) &&
        Objects.equals(this.sfdrClassification, keyStatsDataObjectFund.sfdrClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aumFundMonth, aumShareDaily, availableForSale, averageSpread, currencyIso, dailyTradingVol, distributionYield, esgCompliance, esgObjective, expenseRatio, firstNavRecord, fundFlowYTD, inceptionDateFund, inceptionDateShare, meta, outstandingShare, sfdrClassification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsDataObjectFund {\n");
    sb.append("    aumFundMonth: ").append(toIndentedString(aumFundMonth)).append("\n");
    sb.append("    aumShareDaily: ").append(toIndentedString(aumShareDaily)).append("\n");
    sb.append("    availableForSale: ").append(toIndentedString(availableForSale)).append("\n");
    sb.append("    averageSpread: ").append(toIndentedString(averageSpread)).append("\n");
    sb.append("    currencyIso: ").append(toIndentedString(currencyIso)).append("\n");
    sb.append("    dailyTradingVol: ").append(toIndentedString(dailyTradingVol)).append("\n");
    sb.append("    distributionYield: ").append(toIndentedString(distributionYield)).append("\n");
    sb.append("    esgCompliance: ").append(toIndentedString(esgCompliance)).append("\n");
    sb.append("    esgObjective: ").append(toIndentedString(esgObjective)).append("\n");
    sb.append("    expenseRatio: ").append(toIndentedString(expenseRatio)).append("\n");
    sb.append("    firstNavRecord: ").append(toIndentedString(firstNavRecord)).append("\n");
    sb.append("    fundFlowYTD: ").append(toIndentedString(fundFlowYTD)).append("\n");
    sb.append("    inceptionDateFund: ").append(toIndentedString(inceptionDateFund)).append("\n");
    sb.append("    inceptionDateShare: ").append(toIndentedString(inceptionDateShare)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    outstandingShare: ").append(toIndentedString(outstandingShare)).append("\n");
    sb.append("    sfdrClassification: ").append(toIndentedString(sfdrClassification)).append("\n");
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

