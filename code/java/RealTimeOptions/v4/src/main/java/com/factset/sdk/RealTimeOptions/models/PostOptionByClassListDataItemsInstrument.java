/*
 * Real-Time Options API
 * The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api). 
 *
 * The version of the OpenAPI document: 4.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeOptions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListDataItemsInstrumentExercise;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListDataItemsInstrumentLifeCycle;
import com.factset.sdk.RealTimeOptions.models.PostOptionByClassListDataItemsInstrumentStrikePrice;
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
import com.factset.sdk.RealTimeOptions.JSON;


/**
 * instrument
 */
@ApiModel(description = "instrument")
@JsonPropertyOrder({
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_ID,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_NORMALIZED_SYMBOL,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_NAME,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_EXERCISE,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_STRIKE_PRICE,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_LIFE_CYCLE,
  PostOptionByClassListDataItemsInstrument.JSON_PROPERTY_CONTRACT_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostOptionByClassListDataItemsInstrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NORMALIZED_SYMBOL = "normalizedSymbol";
  private JsonNullable<String> normalizedSymbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private PostOptionByClassListDataItemsInstrumentExercise exercise;

  public static final String JSON_PROPERTY_STRIKE_PRICE = "strikePrice";
  private PostOptionByClassListDataItemsInstrumentStrikePrice strikePrice;

  public static final String JSON_PROPERTY_LIFE_CYCLE = "lifeCycle";
  private PostOptionByClassListDataItemsInstrumentLifeCycle lifeCycle;

  public static final String JSON_PROPERTY_CONTRACT_SIZE = "contractSize";
  private JsonNullable<BigDecimal> contractSize = JsonNullable.<BigDecimal>undefined();

  public PostOptionByClassListDataItemsInstrument() { 
  }

  public PostOptionByClassListDataItemsInstrument id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "209485", value = "Identifier of the instrument.")
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


  public PostOptionByClassListDataItemsInstrument normalizedSymbol(String normalizedSymbol) {
    this.normalizedSymbol = JsonNullable.<String>of(normalizedSymbol);
    return this;
  }

   /**
   * Symbol of the option, as normalized by FactSet.
   * @return normalizedSymbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Symbol of the option, as normalized by FactSet.")
  @JsonIgnore

  public String getNormalizedSymbol() {
        return normalizedSymbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NORMALIZED_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNormalizedSymbol_JsonNullable() {
    return normalizedSymbol;
  }
  
  @JsonProperty(JSON_PROPERTY_NORMALIZED_SYMBOL)
  public void setNormalizedSymbol_JsonNullable(JsonNullable<String> normalizedSymbol) {
    this.normalizedSymbol = normalizedSymbol;
  }

  public void setNormalizedSymbol(String normalizedSymbol) {
    this.normalizedSymbol = JsonNullable.<String>of(normalizedSymbol);
  }


  public PostOptionByClassListDataItemsInstrument name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the option.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Name of the option.")
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


  public PostOptionByClassListDataItemsInstrument exercise(PostOptionByClassListDataItemsInstrumentExercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassListDataItemsInstrumentExercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(PostOptionByClassListDataItemsInstrumentExercise exercise) {
    this.exercise = exercise;
  }


  public PostOptionByClassListDataItemsInstrument strikePrice(PostOptionByClassListDataItemsInstrumentStrikePrice strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRIKE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassListDataItemsInstrumentStrikePrice getStrikePrice() {
    return strikePrice;
  }


  @JsonProperty(JSON_PROPERTY_STRIKE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrikePrice(PostOptionByClassListDataItemsInstrumentStrikePrice strikePrice) {
    this.strikePrice = strikePrice;
  }


  public PostOptionByClassListDataItemsInstrument lifeCycle(PostOptionByClassListDataItemsInstrumentLifeCycle lifeCycle) {
    this.lifeCycle = lifeCycle;
    return this;
  }

   /**
   * Get lifeCycle
   * @return lifeCycle
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostOptionByClassListDataItemsInstrumentLifeCycle getLifeCycle() {
    return lifeCycle;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifeCycle(PostOptionByClassListDataItemsInstrumentLifeCycle lifeCycle) {
    this.lifeCycle = lifeCycle;
  }


  public PostOptionByClassListDataItemsInstrument contractSize(BigDecimal contractSize) {
    this.contractSize = JsonNullable.<BigDecimal>of(contractSize);
    return this;
  }

   /**
   * Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.
   * @return contractSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.01", value = "Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying.")
  @JsonIgnore

  public BigDecimal getContractSize() {
        return contractSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTRACT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getContractSize_JsonNullable() {
    return contractSize;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTRACT_SIZE)
  public void setContractSize_JsonNullable(JsonNullable<BigDecimal> contractSize) {
    this.contractSize = contractSize;
  }

  public void setContractSize(BigDecimal contractSize) {
    this.contractSize = JsonNullable.<BigDecimal>of(contractSize);
  }


  /**
   * Return true if this PostOptionByClassListDataItems_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOptionByClassListDataItemsInstrument postOptionByClassListDataItemsInstrument = (PostOptionByClassListDataItemsInstrument) o;
    return equalsNullable(this.id, postOptionByClassListDataItemsInstrument.id) &&
        equalsNullable(this.normalizedSymbol, postOptionByClassListDataItemsInstrument.normalizedSymbol) &&
        equalsNullable(this.name, postOptionByClassListDataItemsInstrument.name) &&
        Objects.equals(this.exercise, postOptionByClassListDataItemsInstrument.exercise) &&
        Objects.equals(this.strikePrice, postOptionByClassListDataItemsInstrument.strikePrice) &&
        Objects.equals(this.lifeCycle, postOptionByClassListDataItemsInstrument.lifeCycle) &&
        equalsNullable(this.contractSize, postOptionByClassListDataItemsInstrument.contractSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(normalizedSymbol), hashCodeNullable(name), exercise, strikePrice, lifeCycle, hashCodeNullable(contractSize));
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
    sb.append("class PostOptionByClassListDataItemsInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    normalizedSymbol: ").append(toIndentedString(normalizedSymbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    contractSize: ").append(toIndentedString(contractSize)).append("\n");
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

