/*
 * Tick History
 * <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetIntradayTickHistory.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetIntradayTickHistory.JSON;


/**
 * Intervals
 */
@JsonPropertyOrder({
  Intervals.JSON_PROPERTY_0,
  Intervals.JSON_PROPERTY_1_S,
  Intervals.JSON_PROPERTY_5_S,
  Intervals.JSON_PROPERTY_10_S,
  Intervals.JSON_PROPERTY_15_S,
  Intervals.JSON_PROPERTY_30_S,
  Intervals.JSON_PROPERTY_1_M,
  Intervals.JSON_PROPERTY_2_M,
  Intervals.JSON_PROPERTY_5_M,
  Intervals.JSON_PROPERTY_10_M,
  Intervals.JSON_PROPERTY_15_M,
  Intervals.JSON_PROPERTY_30_M,
  Intervals.JSON_PROPERTY_1_H
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Intervals implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_0 = "0";
  private String _0;

  public static final String JSON_PROPERTY_1_S = "1S";
  private String _1S;

  public static final String JSON_PROPERTY_5_S = "5S";
  private String _5S;

  public static final String JSON_PROPERTY_10_S = "10S";
  private String _10S;

  public static final String JSON_PROPERTY_15_S = "15S";
  private String _15S;

  public static final String JSON_PROPERTY_30_S = "30S";
  private String _30S;

  public static final String JSON_PROPERTY_1_M = "1M";
  private String _1M;

  public static final String JSON_PROPERTY_2_M = "2M";
  private String _2M;

  public static final String JSON_PROPERTY_5_M = "5M";
  private String _5M;

  public static final String JSON_PROPERTY_10_M = "10M";
  private String _10M;

  public static final String JSON_PROPERTY_15_M = "15M";
  private String _15M;

  public static final String JSON_PROPERTY_30_M = "30M";
  private String _30M;

  public static final String JSON_PROPERTY_1_H = "1H";
  private String _1H;

  public Intervals() { 
  }

  public Intervals _0(String _0) {
    this._0 = _0;
    return this;
  }

   /**
   * Every Tick. Max days requested &#x3D; 1
   * @return _0
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Every Tick. Max days requested = 1")
  @JsonProperty(JSON_PROPERTY_0)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get0() {
    return _0;
  }


  @JsonProperty(JSON_PROPERTY_0)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set0(String _0) {
    this._0 = _0;
  }


  public Intervals _1S(String _1S) {
    this._1S = _1S;
    return this;
  }

   /**
   * 1 Second. Max days requested &#x3D; 1
   * @return _1S
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "1 Second. Max days requested = 1")
  @JsonProperty(JSON_PROPERTY_1_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get1S() {
    return _1S;
  }


  @JsonProperty(JSON_PROPERTY_1_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set1S(String _1S) {
    this._1S = _1S;
  }


  public Intervals _5S(String _5S) {
    this._5S = _5S;
    return this;
  }

   /**
   * 5 Seconds. Max days requested &#x3D; 1
   * @return _5S
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "5 Seconds. Max days requested = 1")
  @JsonProperty(JSON_PROPERTY_5_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get5S() {
    return _5S;
  }


  @JsonProperty(JSON_PROPERTY_5_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set5S(String _5S) {
    this._5S = _5S;
  }


  public Intervals _10S(String _10S) {
    this._10S = _10S;
    return this;
  }

   /**
   * 10 Seconds. Max days requested &#x3D; 1
   * @return _10S
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "10 Seconds. Max days requested = 1")
  @JsonProperty(JSON_PROPERTY_10_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get10S() {
    return _10S;
  }


  @JsonProperty(JSON_PROPERTY_10_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set10S(String _10S) {
    this._10S = _10S;
  }


  public Intervals _15S(String _15S) {
    this._15S = _15S;
    return this;
  }

   /**
   * 15 Seconds. Max days requested &#x3D; 1
   * @return _15S
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "15 Seconds. Max days requested = 1")
  @JsonProperty(JSON_PROPERTY_15_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get15S() {
    return _15S;
  }


  @JsonProperty(JSON_PROPERTY_15_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set15S(String _15S) {
    this._15S = _15S;
  }


  public Intervals _30S(String _30S) {
    this._30S = _30S;
    return this;
  }

   /**
   * 30 Seconds. Max days requested &#x3D; 15
   * @return _30S
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "30 Seconds. Max days requested = 15")
  @JsonProperty(JSON_PROPERTY_30_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get30S() {
    return _30S;
  }


  @JsonProperty(JSON_PROPERTY_30_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set30S(String _30S) {
    this._30S = _30S;
  }


  public Intervals _1M(String _1M) {
    this._1M = _1M;
    return this;
  }

   /**
   * 1 Minute. Max days requested &#x3D; 30
   * @return _1M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "1 Minute. Max days requested = 30")
  @JsonProperty(JSON_PROPERTY_1_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get1M() {
    return _1M;
  }


  @JsonProperty(JSON_PROPERTY_1_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set1M(String _1M) {
    this._1M = _1M;
  }


  public Intervals _2M(String _2M) {
    this._2M = _2M;
    return this;
  }

   /**
   * 2 Minutes. Max days requested &#x3D; 60
   * @return _2M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "2 Minutes. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_2_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get2M() {
    return _2M;
  }


  @JsonProperty(JSON_PROPERTY_2_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set2M(String _2M) {
    this._2M = _2M;
  }


  public Intervals _5M(String _5M) {
    this._5M = _5M;
    return this;
  }

   /**
   * 5 Minutes. Max days requested &#x3D; 60
   * @return _5M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "5 Minutes. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_5_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get5M() {
    return _5M;
  }


  @JsonProperty(JSON_PROPERTY_5_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set5M(String _5M) {
    this._5M = _5M;
  }


  public Intervals _10M(String _10M) {
    this._10M = _10M;
    return this;
  }

   /**
   * 10 Minutes. Max days requested &#x3D; 60
   * @return _10M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "10 Minutes. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_10_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get10M() {
    return _10M;
  }


  @JsonProperty(JSON_PROPERTY_10_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set10M(String _10M) {
    this._10M = _10M;
  }


  public Intervals _15M(String _15M) {
    this._15M = _15M;
    return this;
  }

   /**
   * 15 Minutes. Max days requested &#x3D; 60
   * @return _15M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "15 Minutes. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_15_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get15M() {
    return _15M;
  }


  @JsonProperty(JSON_PROPERTY_15_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set15M(String _15M) {
    this._15M = _15M;
  }


  public Intervals _30M(String _30M) {
    this._30M = _30M;
    return this;
  }

   /**
   * 30 Minutes. Max days requested &#x3D; 60
   * @return _30M
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "30 Minutes. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_30_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get30M() {
    return _30M;
  }


  @JsonProperty(JSON_PROPERTY_30_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set30M(String _30M) {
    this._30M = _30M;
  }


  public Intervals _1H(String _1H) {
    this._1H = _1H;
    return this;
  }

   /**
   * 1 Hour. Max days requested &#x3D; 60
   * @return _1H
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "1 Hour. Max days requested = 60")
  @JsonProperty(JSON_PROPERTY_1_H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get1H() {
    return _1H;
  }


  @JsonProperty(JSON_PROPERTY_1_H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set1H(String _1H) {
    this._1H = _1H;
  }


  /**
   * Return true if this intervals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intervals intervals = (Intervals) o;
    return Objects.equals(this._0, intervals._0) &&
        Objects.equals(this._1S, intervals._1S) &&
        Objects.equals(this._5S, intervals._5S) &&
        Objects.equals(this._10S, intervals._10S) &&
        Objects.equals(this._15S, intervals._15S) &&
        Objects.equals(this._30S, intervals._30S) &&
        Objects.equals(this._1M, intervals._1M) &&
        Objects.equals(this._2M, intervals._2M) &&
        Objects.equals(this._5M, intervals._5M) &&
        Objects.equals(this._10M, intervals._10M) &&
        Objects.equals(this._15M, intervals._15M) &&
        Objects.equals(this._30M, intervals._30M) &&
        Objects.equals(this._1H, intervals._1H);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, _1S, _5S, _10S, _15S, _30S, _1M, _2M, _5M, _10M, _15M, _30M, _1H);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intervals {\n");
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    _1S: ").append(toIndentedString(_1S)).append("\n");
    sb.append("    _5S: ").append(toIndentedString(_5S)).append("\n");
    sb.append("    _10S: ").append(toIndentedString(_10S)).append("\n");
    sb.append("    _15S: ").append(toIndentedString(_15S)).append("\n");
    sb.append("    _30S: ").append(toIndentedString(_30S)).append("\n");
    sb.append("    _1M: ").append(toIndentedString(_1M)).append("\n");
    sb.append("    _2M: ").append(toIndentedString(_2M)).append("\n");
    sb.append("    _5M: ").append(toIndentedString(_5M)).append("\n");
    sb.append("    _10M: ").append(toIndentedString(_10M)).append("\n");
    sb.append("    _15M: ").append(toIndentedString(_15M)).append("\n");
    sb.append("    _30M: ").append(toIndentedString(_30M)).append("\n");
    sb.append("    _1H: ").append(toIndentedString(_1H)).append("\n");
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

