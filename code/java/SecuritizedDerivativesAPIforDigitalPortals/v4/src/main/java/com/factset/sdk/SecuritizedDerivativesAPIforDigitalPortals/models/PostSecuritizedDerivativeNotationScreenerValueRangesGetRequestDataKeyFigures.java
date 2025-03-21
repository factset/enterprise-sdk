/*
 * Securitized Derivatives API For Digital Portals
 * Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.  
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Key figures specific to securitized derivatives; based on ask prices.
 */
@ApiModel(description = "Key figures specific to securitized derivatives; based on ask prices.")
@JsonPropertyOrder({
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_BONUS_YIELD,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_SIDEWAYS_YIELD,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_MAXIMUM_YIELD,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_AGIO,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_DISCOUNT,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_BREAK_EVEN,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_SPREAD,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_DELTA,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_THETA_ONE_WEEK,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_VEGA,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_LEVERAGE,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_OMEGA,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_IMPLIED_VOLATILITY,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_INTRINSIC_VALUE,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_TIME_VALUE,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_OUTPERFORMANCE_POINT,
  PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.JSON_PROPERTY_PARITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BONUS_YIELD = "bonusYield";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield bonusYield;

  public static final String JSON_PROPERTY_SIDEWAYS_YIELD = "sidewaysYield";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield sidewaysYield;

  public static final String JSON_PROPERTY_MAXIMUM_YIELD = "maximumYield";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield maximumYield;

  public static final String JSON_PROPERTY_AGIO = "agio";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio agio;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount discount;

  public static final String JSON_PROPERTY_BREAK_EVEN = "breakEven";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven breakEven;

  public static final String JSON_PROPERTY_SPREAD = "spread";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread spread;

  public static final String JSON_PROPERTY_DELTA = "delta";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta delta;

  public static final String JSON_PROPERTY_THETA_ONE_WEEK = "thetaOneWeek";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek thetaOneWeek;

  public static final String JSON_PROPERTY_VEGA = "vega";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega vega;

  public static final String JSON_PROPERTY_LEVERAGE = "leverage";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage leverage;

  public static final String JSON_PROPERTY_OMEGA = "omega";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega omega;

  public static final String JSON_PROPERTY_IMPLIED_VOLATILITY = "impliedVolatility";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility impliedVolatility;

  public static final String JSON_PROPERTY_INTRINSIC_VALUE = "intrinsicValue";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue intrinsicValue;

  public static final String JSON_PROPERTY_TIME_VALUE = "timeValue";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue timeValue;

  public static final String JSON_PROPERTY_OUTPERFORMANCE_POINT = "outperformancePoint";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint outperformancePoint;

  public static final String JSON_PROPERTY_PARITY = "parity";
  private PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity parity;

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures() { 
  }

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures bonusYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield bonusYield) {
    this.bonusYield = bonusYield;
    return this;
  }

   /**
   * Get bonusYield
   * @return bonusYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BONUS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield getBonusYield() {
    return bonusYield;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield bonusYield) {
    this.bonusYield = bonusYield;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures sidewaysYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield sidewaysYield) {
    this.sidewaysYield = sidewaysYield;
    return this;
  }

   /**
   * Get sidewaysYield
   * @return sidewaysYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIDEWAYS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield getSidewaysYield() {
    return sidewaysYield;
  }


  @JsonProperty(JSON_PROPERTY_SIDEWAYS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidewaysYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield sidewaysYield) {
    this.sidewaysYield = sidewaysYield;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures maximumYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield maximumYield) {
    this.maximumYield = maximumYield;
    return this;
  }

   /**
   * Get maximumYield
   * @return maximumYield
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield getMaximumYield() {
    return maximumYield;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumYield(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield maximumYield) {
    this.maximumYield = maximumYield;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures agio(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio agio) {
    this.agio = agio;
    return this;
  }

   /**
   * Get agio
   * @return agio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio getAgio() {
    return agio;
  }


  @JsonProperty(JSON_PROPERTY_AGIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgio(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio agio) {
    this.agio = agio;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures discount(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount discount) {
    this.discount = discount;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures breakEven(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven breakEven) {
    this.breakEven = breakEven;
    return this;
  }

   /**
   * Get breakEven
   * @return breakEven
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREAK_EVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven getBreakEven() {
    return breakEven;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_EVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakEven(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven breakEven) {
    this.breakEven = breakEven;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures spread(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread spread) {
    this.spread = spread;
    return this;
  }

   /**
   * Get spread
   * @return spread
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread getSpread() {
    return spread;
  }


  @JsonProperty(JSON_PROPERTY_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpread(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread spread) {
    this.spread = spread;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures delta(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta getDelta() {
    return delta;
  }


  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelta(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta delta) {
    this.delta = delta;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures thetaOneWeek(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek thetaOneWeek) {
    this.thetaOneWeek = thetaOneWeek;
    return this;
  }

   /**
   * Get thetaOneWeek
   * @return thetaOneWeek
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THETA_ONE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek getThetaOneWeek() {
    return thetaOneWeek;
  }


  @JsonProperty(JSON_PROPERTY_THETA_ONE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThetaOneWeek(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek thetaOneWeek) {
    this.thetaOneWeek = thetaOneWeek;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures vega(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega vega) {
    this.vega = vega;
    return this;
  }

   /**
   * Get vega
   * @return vega
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega getVega() {
    return vega;
  }


  @JsonProperty(JSON_PROPERTY_VEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVega(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega vega) {
    this.vega = vega;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures leverage(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage getLeverage() {
    return leverage;
  }


  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeverage(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage leverage) {
    this.leverage = leverage;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures omega(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega omega) {
    this.omega = omega;
    return this;
  }

   /**
   * Get omega
   * @return omega
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OMEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega getOmega() {
    return omega;
  }


  @JsonProperty(JSON_PROPERTY_OMEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOmega(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega omega) {
    this.omega = omega;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures impliedVolatility(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * Get impliedVolatility
   * @return impliedVolatility
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility getImpliedVolatility() {
    return impliedVolatility;
  }


  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpliedVolatility(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures intrinsicValue(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue intrinsicValue) {
    this.intrinsicValue = intrinsicValue;
    return this;
  }

   /**
   * Get intrinsicValue
   * @return intrinsicValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTRINSIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue getIntrinsicValue() {
    return intrinsicValue;
  }


  @JsonProperty(JSON_PROPERTY_INTRINSIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntrinsicValue(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue intrinsicValue) {
    this.intrinsicValue = intrinsicValue;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures timeValue(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue timeValue) {
    this.timeValue = timeValue;
    return this;
  }

   /**
   * Get timeValue
   * @return timeValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue getTimeValue() {
    return timeValue;
  }


  @JsonProperty(JSON_PROPERTY_TIME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeValue(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue timeValue) {
    this.timeValue = timeValue;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures outperformancePoint(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint outperformancePoint) {
    this.outperformancePoint = outperformancePoint;
    return this;
  }

   /**
   * Get outperformancePoint
   * @return outperformancePoint
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint getOutperformancePoint() {
    return outperformancePoint;
  }


  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutperformancePoint(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint outperformancePoint) {
    this.outperformancePoint = outperformancePoint;
  }


  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures parity(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity parity) {
    this.parity = parity;
    return this;
  }

   /**
   * Get parity
   * @return parity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity getParity() {
    return parity;
  }


  @JsonProperty(JSON_PROPERTY_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParity(PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity parity) {
    this.parity = parity;
  }


  /**
   * Return true if this PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest_data_keyFigures object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures = (PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures) o;
    return Objects.equals(this.bonusYield, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.bonusYield) &&
        Objects.equals(this.sidewaysYield, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.sidewaysYield) &&
        Objects.equals(this.maximumYield, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.maximumYield) &&
        Objects.equals(this.agio, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.agio) &&
        Objects.equals(this.discount, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.discount) &&
        Objects.equals(this.breakEven, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.breakEven) &&
        Objects.equals(this.spread, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.spread) &&
        Objects.equals(this.delta, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.delta) &&
        Objects.equals(this.thetaOneWeek, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.thetaOneWeek) &&
        Objects.equals(this.vega, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.vega) &&
        Objects.equals(this.leverage, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.leverage) &&
        Objects.equals(this.omega, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.omega) &&
        Objects.equals(this.impliedVolatility, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.impliedVolatility) &&
        Objects.equals(this.intrinsicValue, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.intrinsicValue) &&
        Objects.equals(this.timeValue, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.timeValue) &&
        Objects.equals(this.outperformancePoint, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.outperformancePoint) &&
        Objects.equals(this.parity, postSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.parity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonusYield, sidewaysYield, maximumYield, agio, discount, breakEven, spread, delta, thetaOneWeek, vega, leverage, omega, impliedVolatility, intrinsicValue, timeValue, outperformancePoint, parity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures {\n");
    sb.append("    bonusYield: ").append(toIndentedString(bonusYield)).append("\n");
    sb.append("    sidewaysYield: ").append(toIndentedString(sidewaysYield)).append("\n");
    sb.append("    maximumYield: ").append(toIndentedString(maximumYield)).append("\n");
    sb.append("    agio: ").append(toIndentedString(agio)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    breakEven: ").append(toIndentedString(breakEven)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    thetaOneWeek: ").append(toIndentedString(thetaOneWeek)).append("\n");
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    omega: ").append(toIndentedString(omega)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    intrinsicValue: ").append(toIndentedString(intrinsicValue)).append("\n");
    sb.append("    timeValue: ").append(toIndentedString(timeValue)).append("\n");
    sb.append("    outperformancePoint: ").append(toIndentedString(outperformancePoint)).append("\n");
    sb.append("    parity: ").append(toIndentedString(parity)).append("\n");
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

