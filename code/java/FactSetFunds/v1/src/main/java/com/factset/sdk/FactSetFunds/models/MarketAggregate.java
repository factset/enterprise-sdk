/*
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFunds.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFunds.JSON;


/**
 * MarketAggregate
 */
@JsonPropertyOrder({
  MarketAggregate.JSON_PROPERTY_FSYM_ID,
  MarketAggregate.JSON_PROPERTY_DATE,
  MarketAggregate.JSON_PROPERTY_COUPON_RATE,
  MarketAggregate.JSON_PROPERTY_COUPON_CURVE_DURATION,
  MarketAggregate.JSON_PROPERTY_EFFECTIVE_DURATION,
  MarketAggregate.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class MarketAggregate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_COUPON_RATE = "couponRate";
  private JsonNullable<Double> couponRate = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COUPON_CURVE_DURATION = "couponCurveDuration";
  private JsonNullable<Double> couponCurveDuration = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EFFECTIVE_DURATION = "effectiveDuration";
  private JsonNullable<Double> effectiveDuration = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public MarketAggregate() { 
  }

  public MarketAggregate fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FNK7XP-S", value = "FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.")
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


  public MarketAggregate date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date of the NAV in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri Feb 26 00:00:00 UTC 2021", value = "The date of the NAV in YYYY-MM-DD format.")
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


  public MarketAggregate couponRate(Double couponRate) {
    this.couponRate = JsonNullable.<Double>of(couponRate);
    return this;
  }

   /**
   * Coupon Rate.
   * @return couponRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3.29161081", value = "Coupon Rate.")
  @JsonIgnore

  public Double getCouponRate() {
        return couponRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUPON_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCouponRate_JsonNullable() {
    return couponRate;
  }
  
  @JsonProperty(JSON_PROPERTY_COUPON_RATE)
  public void setCouponRate_JsonNullable(JsonNullable<Double> couponRate) {
    this.couponRate = couponRate;
  }

  public void setCouponRate(Double couponRate) {
    this.couponRate = JsonNullable.<Double>of(couponRate);
  }


  public MarketAggregate couponCurveDuration(Double couponCurveDuration) {
    this.couponCurveDuration = JsonNullable.<Double>of(couponCurveDuration);
    return this;
  }

   /**
   * Coupon Curve Duration.
   * @return couponCurveDuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6.086715474", value = "Coupon Curve Duration.")
  @JsonIgnore

  public Double getCouponCurveDuration() {
        return couponCurveDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUPON_CURVE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCouponCurveDuration_JsonNullable() {
    return couponCurveDuration;
  }
  
  @JsonProperty(JSON_PROPERTY_COUPON_CURVE_DURATION)
  public void setCouponCurveDuration_JsonNullable(JsonNullable<Double> couponCurveDuration) {
    this.couponCurveDuration = couponCurveDuration;
  }

  public void setCouponCurveDuration(Double couponCurveDuration) {
    this.couponCurveDuration = JsonNullable.<Double>of(couponCurveDuration);
  }


  public MarketAggregate effectiveDuration(Double effectiveDuration) {
    this.effectiveDuration = JsonNullable.<Double>of(effectiveDuration);
    return this;
  }

   /**
   * Effective Duration.
   * @return effectiveDuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6.0715073738", value = "Effective Duration.")
  @JsonIgnore

  public Double getEffectiveDuration() {
        return effectiveDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEffectiveDuration_JsonNullable() {
    return effectiveDuration;
  }
  
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DURATION)
  public void setEffectiveDuration_JsonNullable(JsonNullable<Double> effectiveDuration) {
    this.effectiveDuration = effectiveDuration;
  }

  public void setEffectiveDuration(Double effectiveDuration) {
    this.effectiveDuration = JsonNullable.<Double>of(effectiveDuration);
  }


  public MarketAggregate requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested Id sent as input.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MABAX", value = "The requested Id sent as input.")
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


  /**
   * Return true if this marketAggregate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketAggregate marketAggregate = (MarketAggregate) o;
    return equalsNullable(this.fsymId, marketAggregate.fsymId) &&
        equalsNullable(this.date, marketAggregate.date) &&
        equalsNullable(this.couponRate, marketAggregate.couponRate) &&
        equalsNullable(this.couponCurveDuration, marketAggregate.couponCurveDuration) &&
        equalsNullable(this.effectiveDuration, marketAggregate.effectiveDuration) &&
        Objects.equals(this.requestId, marketAggregate.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(couponRate), hashCodeNullable(couponCurveDuration), hashCodeNullable(effectiveDuration), requestId);
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
    sb.append("class MarketAggregate {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    couponRate: ").append(toIndentedString(couponRate)).append("\n");
    sb.append("    couponCurveDuration: ").append(toIndentedString(couponCurveDuration)).append("\n");
    sb.append("    effectiveDuration: ").append(toIndentedString(effectiveDuration)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

