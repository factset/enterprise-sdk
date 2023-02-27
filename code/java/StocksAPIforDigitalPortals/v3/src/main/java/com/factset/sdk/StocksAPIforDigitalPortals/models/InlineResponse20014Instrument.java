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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014InstrumentCompany;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014InstrumentIndustryClassification;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20014InstrumentNsin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200DataFsym;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Instrument data of the notation.
 */
@ApiModel(description = "Instrument data of the notation.")
@JsonPropertyOrder({
  InlineResponse20014Instrument.JSON_PROPERTY_ID,
  InlineResponse20014Instrument.JSON_PROPERTY_NAME,
  InlineResponse20014Instrument.JSON_PROPERTY_SHORT_NAME,
  InlineResponse20014Instrument.JSON_PROPERTY_ISIN,
  InlineResponse20014Instrument.JSON_PROPERTY_NSIN,
  InlineResponse20014Instrument.JSON_PROPERTY_FSYM,
  InlineResponse20014Instrument.JSON_PROPERTY_STOCK_TYPE,
  InlineResponse20014Instrument.JSON_PROPERTY_INDUSTRY_CLASSIFICATION,
  InlineResponse20014Instrument.JSON_PROPERTY_COMPANY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private JsonNullable<String> shortName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISIN = "isin";
  private JsonNullable<String> isin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20014InstrumentNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse200DataFsym fsym;

  /**
   * Type of stock.
   */
  public enum StockTypeEnum {
    COMMON("common"),
    
    PREFERRED("preferred"),
    
    DEPOSITORYRECEIPT("depositoryReceipt"),
    
    OTHER("other");

    private String value;

    StockTypeEnum(String value) {
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
    public static StockTypeEnum fromValue(String value) {
      for (StockTypeEnum b : StockTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STOCK_TYPE = "stockType";
  private JsonNullable<StockTypeEnum> stockType = JsonNullable.<StockTypeEnum>undefined();

  public static final String JSON_PROPERTY_INDUSTRY_CLASSIFICATION = "industryClassification";
  private InlineResponse20014InstrumentIndustryClassification industryClassification;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private InlineResponse20014InstrumentCompany company;

  public InlineResponse20014Instrument() { 
  }

  public InlineResponse20014Instrument id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20014Instrument name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the instrument.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the instrument.")
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


  public InlineResponse20014Instrument shortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
    return this;
  }

   /**
   * Short name of the instrument.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name of the instrument.")
  @JsonIgnore

  public String getShortName() {
        return shortName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShortName_JsonNullable() {
    return shortName;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  public void setShortName_JsonNullable(JsonNullable<String> shortName) {
    this.shortName = shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
  }


  public InlineResponse20014Instrument isin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
    return this;
  }

   /**
   * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.")
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


  public InlineResponse20014Instrument nsin(InlineResponse20014InstrumentNsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014InstrumentNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20014InstrumentNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20014Instrument fsym(InlineResponse200DataFsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse200DataFsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20014Instrument stockType(StockTypeEnum stockType) {
    this.stockType = JsonNullable.<StockTypeEnum>of(stockType);
    return this;
  }

   /**
   * Type of stock.
   * @return stockType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of stock.")
  @JsonIgnore

  public StockTypeEnum getStockType() {
        return stockType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STOCK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StockTypeEnum> getStockType_JsonNullable() {
    return stockType;
  }
  
  @JsonProperty(JSON_PROPERTY_STOCK_TYPE)
  public void setStockType_JsonNullable(JsonNullable<StockTypeEnum> stockType) {
    this.stockType = stockType;
  }

  public void setStockType(StockTypeEnum stockType) {
    this.stockType = JsonNullable.<StockTypeEnum>of(stockType);
  }


  public InlineResponse20014Instrument industryClassification(InlineResponse20014InstrumentIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
    return this;
  }

   /**
   * Get industryClassification
   * @return industryClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014InstrumentIndustryClassification getIndustryClassification() {
    return industryClassification;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryClassification(InlineResponse20014InstrumentIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
  }


  public InlineResponse20014Instrument company(InlineResponse20014InstrumentCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014InstrumentCompany getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(InlineResponse20014InstrumentCompany company) {
    this.company = company;
  }


  /**
   * Return true if this inline_response_200_14_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Instrument inlineResponse20014Instrument = (InlineResponse20014Instrument) o;
    return equalsNullable(this.id, inlineResponse20014Instrument.id) &&
        equalsNullable(this.name, inlineResponse20014Instrument.name) &&
        equalsNullable(this.shortName, inlineResponse20014Instrument.shortName) &&
        equalsNullable(this.isin, inlineResponse20014Instrument.isin) &&
        Objects.equals(this.nsin, inlineResponse20014Instrument.nsin) &&
        Objects.equals(this.fsym, inlineResponse20014Instrument.fsym) &&
        equalsNullable(this.stockType, inlineResponse20014Instrument.stockType) &&
        Objects.equals(this.industryClassification, inlineResponse20014Instrument.industryClassification) &&
        Objects.equals(this.company, inlineResponse20014Instrument.company);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), hashCodeNullable(shortName), hashCodeNullable(isin), nsin, fsym, hashCodeNullable(stockType), industryClassification, company);
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
    sb.append("class InlineResponse20014Instrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
    sb.append("    industryClassification: ").append(toIndentedString(industryClassification)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
