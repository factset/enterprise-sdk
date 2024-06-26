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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataBrand;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataCreateRedeem;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataCurrency;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataDocumentation;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataExchange;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataFinancialReport;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataIndex;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataInsight;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataIssuer;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse200DataTrading;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Profile.
 */
@ApiModel(description = "Profile.")
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_AS_OF_DATE,
  InlineResponse200Data.JSON_PROPERTY_HOLDINGS_DATE,
  InlineResponse200Data.JSON_PROPERTY_SYMBOL,
  InlineResponse200Data.JSON_PROPERTY_EXCHANGE,
  InlineResponse200Data.JSON_PROPERTY_NAME,
  InlineResponse200Data.JSON_PROPERTY_ISSUER,
  InlineResponse200Data.JSON_PROPERTY_BRAND,
  InlineResponse200Data.JSON_PROPERTY_LAUNCH_DATE,
  InlineResponse200Data.JSON_PROPERTY_DESCRIPTION,
  InlineResponse200Data.JSON_PROPERTY_WEBSITE,
  InlineResponse200Data.JSON_PROPERTY_DOMICILE,
  InlineResponse200Data.JSON_PROPERTY_STATUS,
  InlineResponse200Data.JSON_PROPERTY_CURRENCY,
  InlineResponse200Data.JSON_PROPERTY_INDEX,
  InlineResponse200Data.JSON_PROPERTY_FINANCIAL_REPORT,
  InlineResponse200Data.JSON_PROPERTY_CREATE_REDEEM,
  InlineResponse200Data.JSON_PROPERTY_AUM,
  InlineResponse200Data.JSON_PROPERTY_TRADING,
  InlineResponse200Data.JSON_PROPERTY_DOCUMENTATION,
  InlineResponse200Data.JSON_PROPERTY_INSIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_HOLDINGS_DATE = "holdingsDate";
  private LocalDate holdingsDate;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  private InlineResponse200DataExchange exchange;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private InlineResponse200DataIssuer issuer;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private InlineResponse200DataBrand brand;

  public static final String JSON_PROPERTY_LAUNCH_DATE = "launchDate";
  private LocalDate launchDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_DOMICILE = "domicile";
  private String domicile;

  /**
   * Staus of the ETP. This data is available for all the regions.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    DELISTED("Delisted"),
    
    NOT_TRADING_YET("Not trading yet");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse200DataCurrency currency;

  public static final String JSON_PROPERTY_INDEX = "index";
  private InlineResponse200DataIndex index;

  public static final String JSON_PROPERTY_FINANCIAL_REPORT = "financialReport";
  private InlineResponse200DataFinancialReport financialReport;

  public static final String JSON_PROPERTY_CREATE_REDEEM = "createRedeem";
  private InlineResponse200DataCreateRedeem createRedeem;

  public static final String JSON_PROPERTY_AUM = "aum";
  private BigDecimal aum;

  public static final String JSON_PROPERTY_TRADING = "trading";
  private InlineResponse200DataTrading trading;

  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  private InlineResponse200DataDocumentation documentation;

  public static final String JSON_PROPERTY_INSIGHT = "insight";
  private InlineResponse200DataInsight insight;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Date data was published. This data is available only for US region.
   * @return asOfDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date data was published. This data is available only for US region.")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public InlineResponse200Data holdingsDate(LocalDate holdingsDate) {
    this.holdingsDate = holdingsDate;
    return this;
  }

   /**
   * The as of data for holdings statistics. This data available only for US region
   * @return holdingsDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The as of data for holdings statistics. This data available only for US region")
  @JsonProperty(JSON_PROPERTY_HOLDINGS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getHoldingsDate() {
    return holdingsDate;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldingsDate(LocalDate holdingsDate) {
    this.holdingsDate = holdingsDate;
  }


  public InlineResponse200Data symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Ticker of the ETP. This data is available for all region.
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ticker of the ETP. This data is available for all region.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public InlineResponse200Data exchange(InlineResponse200DataExchange exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataExchange getExchange() {
    return exchange;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchange(InlineResponse200DataExchange exchange) {
    this.exchange = exchange;
  }


  public InlineResponse200Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the ETP. This data is available for all the regions.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the ETP. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse200Data issuer(InlineResponse200DataIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataIssuer getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(InlineResponse200DataIssuer issuer) {
    this.issuer = issuer;
  }


  public InlineResponse200Data brand(InlineResponse200DataBrand brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataBrand getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(InlineResponse200DataBrand brand) {
    this.brand = brand;
  }


  public InlineResponse200Data launchDate(LocalDate launchDate) {
    this.launchDate = launchDate;
    return this;
  }

   /**
   * Launch date of the ETP. This data is available for all the regions.
   * @return launchDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Launch date of the ETP. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_LAUNCH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getLaunchDate() {
    return launchDate;
  }


  @JsonProperty(JSON_PROPERTY_LAUNCH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaunchDate(LocalDate launchDate) {
    this.launchDate = launchDate;
  }


  public InlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of the ETP. This data is available for all the regions.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A brief description of the ETP. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public InlineResponse200Data website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Link to the ETP&#39;s homepage. This data is available for the US and Canada region.
   * @return website
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Link to the ETP's homepage. This data is available for the US and Canada region.")
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  public InlineResponse200Data domicile(String domicile) {
    this.domicile = domicile;
    return this;
  }

   /**
   * ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2.
   * @return domicile
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2.")
  @JsonProperty(JSON_PROPERTY_DOMICILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomicile() {
    return domicile;
  }


  @JsonProperty(JSON_PROPERTY_DOMICILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomicile(String domicile) {
    this.domicile = domicile;
  }


  public InlineResponse200Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Staus of the ETP. This data is available for all the regions.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Staus of the ETP. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public InlineResponse200Data currency(InlineResponse200DataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse200DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse200Data index(InlineResponse200DataIndex index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataIndex getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(InlineResponse200DataIndex index) {
    this.index = index;
  }


  public InlineResponse200Data financialReport(InlineResponse200DataFinancialReport financialReport) {
    this.financialReport = financialReport;
    return this;
  }

   /**
   * Get financialReport
   * @return financialReport
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINANCIAL_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataFinancialReport getFinancialReport() {
    return financialReport;
  }


  @JsonProperty(JSON_PROPERTY_FINANCIAL_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancialReport(InlineResponse200DataFinancialReport financialReport) {
    this.financialReport = financialReport;
  }


  public InlineResponse200Data createRedeem(InlineResponse200DataCreateRedeem createRedeem) {
    this.createRedeem = createRedeem;
    return this;
  }

   /**
   * Get createRedeem
   * @return createRedeem
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_REDEEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataCreateRedeem getCreateRedeem() {
    return createRedeem;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_REDEEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateRedeem(InlineResponse200DataCreateRedeem createRedeem) {
    this.createRedeem = createRedeem;
  }


  public InlineResponse200Data aum(BigDecimal aum) {
    this.aum = aum;
    return this;
  }

   /**
   * The market value of the total assets that a individual ETP manages on behalf of it&#39;s investors. This data is available for all the regions.
   * @return aum
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The market value of the total assets that a individual ETP manages on behalf of it's investors. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_AUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAum() {
    return aum;
  }


  @JsonProperty(JSON_PROPERTY_AUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAum(BigDecimal aum) {
    this.aum = aum;
  }


  public InlineResponse200Data trading(InlineResponse200DataTrading trading) {
    this.trading = trading;
    return this;
  }

   /**
   * Get trading
   * @return trading
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataTrading getTrading() {
    return trading;
  }


  @JsonProperty(JSON_PROPERTY_TRADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrading(InlineResponse200DataTrading trading) {
    this.trading = trading;
  }


  public InlineResponse200Data documentation(InlineResponse200DataDocumentation documentation) {
    this.documentation = documentation;
    return this;
  }

   /**
   * Get documentation
   * @return documentation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataDocumentation getDocumentation() {
    return documentation;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentation(InlineResponse200DataDocumentation documentation) {
    this.documentation = documentation;
  }


  public InlineResponse200Data insight(InlineResponse200DataInsight insight) {
    this.insight = insight;
    return this;
  }

   /**
   * Get insight
   * @return insight
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataInsight getInsight() {
    return insight;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsight(InlineResponse200DataInsight insight) {
    this.insight = insight;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.asOfDate, inlineResponse200Data.asOfDate) &&
        Objects.equals(this.holdingsDate, inlineResponse200Data.holdingsDate) &&
        Objects.equals(this.symbol, inlineResponse200Data.symbol) &&
        Objects.equals(this.exchange, inlineResponse200Data.exchange) &&
        Objects.equals(this.name, inlineResponse200Data.name) &&
        Objects.equals(this.issuer, inlineResponse200Data.issuer) &&
        Objects.equals(this.brand, inlineResponse200Data.brand) &&
        Objects.equals(this.launchDate, inlineResponse200Data.launchDate) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.website, inlineResponse200Data.website) &&
        Objects.equals(this.domicile, inlineResponse200Data.domicile) &&
        Objects.equals(this.status, inlineResponse200Data.status) &&
        Objects.equals(this.currency, inlineResponse200Data.currency) &&
        Objects.equals(this.index, inlineResponse200Data.index) &&
        Objects.equals(this.financialReport, inlineResponse200Data.financialReport) &&
        Objects.equals(this.createRedeem, inlineResponse200Data.createRedeem) &&
        Objects.equals(this.aum, inlineResponse200Data.aum) &&
        Objects.equals(this.trading, inlineResponse200Data.trading) &&
        Objects.equals(this.documentation, inlineResponse200Data.documentation) &&
        Objects.equals(this.insight, inlineResponse200Data.insight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, holdingsDate, symbol, exchange, name, issuer, brand, launchDate, description, website, domicile, status, currency, index, financialReport, createRedeem, aum, trading, documentation, insight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    holdingsDate: ").append(toIndentedString(holdingsDate)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    launchDate: ").append(toIndentedString(launchDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    domicile: ").append(toIndentedString(domicile)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    financialReport: ").append(toIndentedString(financialReport)).append("\n");
    sb.append("    createRedeem: ").append(toIndentedString(createRedeem)).append("\n");
    sb.append("    aum: ").append(toIndentedString(aum)).append("\n");
    sb.append("    trading: ").append(toIndentedString(trading)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    insight: ").append(toIndentedString(insight)).append("\n");
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

