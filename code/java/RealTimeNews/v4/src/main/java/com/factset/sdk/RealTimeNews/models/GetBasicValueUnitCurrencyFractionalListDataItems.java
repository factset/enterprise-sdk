/*
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeNews.models.GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeNews.JSON;


/**
 * A list of objects. For semantical context see the description of the parent array.
 */
@ApiModel(description = "A list of objects. For semantical context see the description of the parent array.")
@JsonPropertyOrder({
  GetBasicValueUnitCurrencyFractionalListDataItems.JSON_PROPERTY_ID,
  GetBasicValueUnitCurrencyFractionalListDataItems.JSON_PROPERTY_CODE,
  GetBasicValueUnitCurrencyFractionalListDataItems.JSON_PROPERTY_NAME,
  GetBasicValueUnitCurrencyFractionalListDataItems.JSON_PROPERTY_FACTOR,
  GetBasicValueUnitCurrencyFractionalListDataItems.JSON_PROPERTY_MAIN_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class GetBasicValueUnitCurrencyFractionalListDataItems implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FACTOR = "factor";
  private JsonNullable<BigDecimal> factor = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MAIN_CURRENCY = "mainCurrency";
  private GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency mainCurrency;

  public GetBasicValueUnitCurrencyFractionalListDataItems() { 
  }

  public GetBasicValueUnitCurrencyFractionalListDataItems id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the fractional currency, which is a value unit.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Identifier of the fractional currency, which is a value unit.")
  @JsonIgnore

  public BigDecimal getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<BigDecimal> id) {
    this.id = id;
  }

  public void setId(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
  }


  public GetBasicValueUnitCurrencyFractionalListDataItems code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public GetBasicValueUnitCurrencyFractionalListDataItems name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the fractional currency.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Name of the fractional currency.")
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


  public GetBasicValueUnitCurrencyFractionalListDataItems factor(BigDecimal factor) {
    this.factor = JsonNullable.<BigDecimal>of(factor);
    return this;
  }

   /**
   * Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.
   * @return factor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "4.04", value = "Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.")
  @JsonIgnore

  public BigDecimal getFactor() {
        return factor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getFactor_JsonNullable() {
    return factor;
  }
  
  @JsonProperty(JSON_PROPERTY_FACTOR)
  public void setFactor_JsonNullable(JsonNullable<BigDecimal> factor) {
    this.factor = factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = JsonNullable.<BigDecimal>of(factor);
  }


  public GetBasicValueUnitCurrencyFractionalListDataItems mainCurrency(GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency mainCurrency) {
    this.mainCurrency = mainCurrency;
    return this;
  }

   /**
   * Get mainCurrency
   * @return mainCurrency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAIN_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency getMainCurrency() {
    return mainCurrency;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainCurrency(GetBasicValueUnitCurrencyFractionalListDataItemsMainCurrency mainCurrency) {
    this.mainCurrency = mainCurrency;
  }


  /**
   * Return true if this GetBasicValueUnitCurrencyFractionalListDataItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBasicValueUnitCurrencyFractionalListDataItems getBasicValueUnitCurrencyFractionalListDataItems = (GetBasicValueUnitCurrencyFractionalListDataItems) o;
    return equalsNullable(this.id, getBasicValueUnitCurrencyFractionalListDataItems.id) &&
        equalsNullable(this.code, getBasicValueUnitCurrencyFractionalListDataItems.code) &&
        equalsNullable(this.name, getBasicValueUnitCurrencyFractionalListDataItems.name) &&
        equalsNullable(this.factor, getBasicValueUnitCurrencyFractionalListDataItems.factor) &&
        Objects.equals(this.mainCurrency, getBasicValueUnitCurrencyFractionalListDataItems.mainCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(factor), mainCurrency);
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
    sb.append("class GetBasicValueUnitCurrencyFractionalListDataItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    mainCurrency: ").append(toIndentedString(mainCurrency)).append("\n");
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

