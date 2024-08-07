/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FIConvertibleSettings
 */
@JsonPropertyOrder({
  FIConvertibleSettings.JSON_PROPERTY_EQUITY_PRICE,
  FIConvertibleSettings.JSON_PROPERTY_EQUITY_INDEX_VOLATILITY,
  FIConvertibleSettings.JSON_PROPERTY_EQUITY_DIVIDEND_YIELD,
  FIConvertibleSettings.JSON_PROPERTY_VOLATILITY_CAP_METHOD,
  FIConvertibleSettings.JSON_PROPERTY_VOLATILITY_CAP_METHOD_VALUE,
  FIConvertibleSettings.JSON_PROPERTY_EQUITY_EXCHANGE_RATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIConvertibleSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EQUITY_PRICE = "equityPrice";
  private JsonNullable<Double> equityPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EQUITY_INDEX_VOLATILITY = "equityIndexVolatility";
  private JsonNullable<Double> equityIndexVolatility = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EQUITY_DIVIDEND_YIELD = "equityDividendYield";
  private JsonNullable<Float> equityDividendYield = JsonNullable.<Float>undefined();

  /**
   * Volatility CapMethod
   */
  public enum VolatilityCapMethodEnum {
    NOCAP("noCap"),
    
    SPECIFIEDRATE("specifiedRate"),
    
    MULTIPLIER("multiplier");

    private String value;

    VolatilityCapMethodEnum(String value) {
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
    public static VolatilityCapMethodEnum fromValue(String value) {
      for (VolatilityCapMethodEnum b : VolatilityCapMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_VOLATILITY_CAP_METHOD = "volatilityCapMethod";
  private JsonNullable<VolatilityCapMethodEnum> volatilityCapMethod = JsonNullable.<VolatilityCapMethodEnum>undefined();

  public static final String JSON_PROPERTY_VOLATILITY_CAP_METHOD_VALUE = "volatilityCapMethodValue";
  private JsonNullable<Float> volatilityCapMethodValue = JsonNullable.<Float>undefined();

  public static final String JSON_PROPERTY_EQUITY_EXCHANGE_RATE = "equityExchangeRate";
  private JsonNullable<Float> equityExchangeRate = JsonNullable.<Float>undefined();

  public FIConvertibleSettings() { 
  }

  public FIConvertibleSettings equityPrice(Double equityPrice) {
    this.equityPrice = JsonNullable.<Double>of(equityPrice);
    return this;
  }

   /**
   * Equity Price
   * @return equityPrice
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10.29", value = "Equity Price")
  @JsonIgnore

  public Double getEquityPrice() {
        return equityPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EQUITY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEquityPrice_JsonNullable() {
    return equityPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_EQUITY_PRICE)
  public void setEquityPrice_JsonNullable(JsonNullable<Double> equityPrice) {
    this.equityPrice = equityPrice;
  }

  public void setEquityPrice(Double equityPrice) {
    this.equityPrice = JsonNullable.<Double>of(equityPrice);
  }


  public FIConvertibleSettings equityIndexVolatility(Double equityIndexVolatility) {
    this.equityIndexVolatility = JsonNullable.<Double>of(equityIndexVolatility);
    return this;
  }

   /**
   * Equity Index Volatility
   * @return equityIndexVolatility
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "23.3425948", value = "Equity Index Volatility")
  @JsonIgnore

  public Double getEquityIndexVolatility() {
        return equityIndexVolatility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EQUITY_INDEX_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEquityIndexVolatility_JsonNullable() {
    return equityIndexVolatility;
  }
  
  @JsonProperty(JSON_PROPERTY_EQUITY_INDEX_VOLATILITY)
  public void setEquityIndexVolatility_JsonNullable(JsonNullable<Double> equityIndexVolatility) {
    this.equityIndexVolatility = equityIndexVolatility;
  }

  public void setEquityIndexVolatility(Double equityIndexVolatility) {
    this.equityIndexVolatility = JsonNullable.<Double>of(equityIndexVolatility);
  }


  public FIConvertibleSettings equityDividendYield(Float equityDividendYield) {
    this.equityDividendYield = JsonNullable.<Float>of(equityDividendYield);
    return this;
  }

   /**
   * Equity Dividend Yield
   * @return equityDividendYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.4", value = "Equity Dividend Yield")
  @JsonIgnore

  public Float getEquityDividendYield() {
        return equityDividendYield.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EQUITY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getEquityDividendYield_JsonNullable() {
    return equityDividendYield;
  }
  
  @JsonProperty(JSON_PROPERTY_EQUITY_DIVIDEND_YIELD)
  public void setEquityDividendYield_JsonNullable(JsonNullable<Float> equityDividendYield) {
    this.equityDividendYield = equityDividendYield;
  }

  public void setEquityDividendYield(Float equityDividendYield) {
    this.equityDividendYield = JsonNullable.<Float>of(equityDividendYield);
  }


  public FIConvertibleSettings volatilityCapMethod(VolatilityCapMethodEnum volatilityCapMethod) {
    this.volatilityCapMethod = JsonNullable.<VolatilityCapMethodEnum>of(volatilityCapMethod);
    return this;
  }

   /**
   * Volatility CapMethod
   * @return volatilityCapMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "multiplier", value = "Volatility CapMethod")
  @JsonIgnore

  public VolatilityCapMethodEnum getVolatilityCapMethod() {
        return volatilityCapMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VOLATILITY_CAP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<VolatilityCapMethodEnum> getVolatilityCapMethod_JsonNullable() {
    return volatilityCapMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_VOLATILITY_CAP_METHOD)
  public void setVolatilityCapMethod_JsonNullable(JsonNullable<VolatilityCapMethodEnum> volatilityCapMethod) {
    this.volatilityCapMethod = volatilityCapMethod;
  }

  public void setVolatilityCapMethod(VolatilityCapMethodEnum volatilityCapMethod) {
    this.volatilityCapMethod = JsonNullable.<VolatilityCapMethodEnum>of(volatilityCapMethod);
  }


  public FIConvertibleSettings volatilityCapMethodValue(Float volatilityCapMethodValue) {
    this.volatilityCapMethodValue = JsonNullable.<Float>of(volatilityCapMethodValue);
    return this;
  }

   /**
   * Volatility CapMethod Value - (Required only when volatilityCapMethod is specifiedRate or multiplier)
   * @return volatilityCapMethodValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2.3", value = "Volatility CapMethod Value - (Required only when volatilityCapMethod is specifiedRate or multiplier)")
  @JsonIgnore

  public Float getVolatilityCapMethodValue() {
        return volatilityCapMethodValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VOLATILITY_CAP_METHOD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getVolatilityCapMethodValue_JsonNullable() {
    return volatilityCapMethodValue;
  }
  
  @JsonProperty(JSON_PROPERTY_VOLATILITY_CAP_METHOD_VALUE)
  public void setVolatilityCapMethodValue_JsonNullable(JsonNullable<Float> volatilityCapMethodValue) {
    this.volatilityCapMethodValue = volatilityCapMethodValue;
  }

  public void setVolatilityCapMethodValue(Float volatilityCapMethodValue) {
    this.volatilityCapMethodValue = JsonNullable.<Float>of(volatilityCapMethodValue);
  }


  public FIConvertibleSettings equityExchangeRate(Float equityExchangeRate) {
    this.equityExchangeRate = JsonNullable.<Float>of(equityExchangeRate);
    return this;
  }

   /**
   * Equity Exchange Rate
   * @return equityExchangeRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "13.65", value = "Equity Exchange Rate")
  @JsonIgnore

  public Float getEquityExchangeRate() {
        return equityExchangeRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EQUITY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Float> getEquityExchangeRate_JsonNullable() {
    return equityExchangeRate;
  }
  
  @JsonProperty(JSON_PROPERTY_EQUITY_EXCHANGE_RATE)
  public void setEquityExchangeRate_JsonNullable(JsonNullable<Float> equityExchangeRate) {
    this.equityExchangeRate = equityExchangeRate;
  }

  public void setEquityExchangeRate(Float equityExchangeRate) {
    this.equityExchangeRate = JsonNullable.<Float>of(equityExchangeRate);
  }


  /**
   * Return true if this FIConvertibleSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIConvertibleSettings fiConvertibleSettings = (FIConvertibleSettings) o;
    return equalsNullable(this.equityPrice, fiConvertibleSettings.equityPrice) &&
        equalsNullable(this.equityIndexVolatility, fiConvertibleSettings.equityIndexVolatility) &&
        equalsNullable(this.equityDividendYield, fiConvertibleSettings.equityDividendYield) &&
        equalsNullable(this.volatilityCapMethod, fiConvertibleSettings.volatilityCapMethod) &&
        equalsNullable(this.volatilityCapMethodValue, fiConvertibleSettings.volatilityCapMethodValue) &&
        equalsNullable(this.equityExchangeRate, fiConvertibleSettings.equityExchangeRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(equityPrice), hashCodeNullable(equityIndexVolatility), hashCodeNullable(equityDividendYield), hashCodeNullable(volatilityCapMethod), hashCodeNullable(volatilityCapMethodValue), hashCodeNullable(equityExchangeRate));
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
    sb.append("class FIConvertibleSettings {\n");
    sb.append("    equityPrice: ").append(toIndentedString(equityPrice)).append("\n");
    sb.append("    equityIndexVolatility: ").append(toIndentedString(equityIndexVolatility)).append("\n");
    sb.append("    equityDividendYield: ").append(toIndentedString(equityDividendYield)).append("\n");
    sb.append("    volatilityCapMethod: ").append(toIndentedString(volatilityCapMethod)).append("\n");
    sb.append("    volatilityCapMethodValue: ").append(toIndentedString(volatilityCapMethodValue)).append("\n");
    sb.append("    equityExchangeRate: ").append(toIndentedString(equityExchangeRate)).append("\n");
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

