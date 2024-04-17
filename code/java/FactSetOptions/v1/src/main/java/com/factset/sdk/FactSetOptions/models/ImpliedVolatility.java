/*
 * FactSet Options API
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOptions.models;

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
import com.factset.sdk.FactSetOptions.JSON;


/**
 * Volatility Response fields
 */
@ApiModel(description = "Volatility Response fields")
@JsonPropertyOrder({
  ImpliedVolatility.JSON_PROPERTY_IMPLIED_VOLATILITY,
  ImpliedVolatility.JSON_PROPERTY_DATE,
  ImpliedVolatility.JSON_PROPERTY_FSYM_ID,
  ImpliedVolatility.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ImpliedVolatility implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IMPLIED_VOLATILITY = "impliedVolatility";
  private JsonNullable<Double> impliedVolatility = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public ImpliedVolatility() { 
  }

  public ImpliedVolatility impliedVolatility(Double impliedVolatility) {
    this.impliedVolatility = JsonNullable.<Double>of(impliedVolatility);
    return this;
  }

   /**
   * The estimated volatility of a security&#39;s price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option&#39;s premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options. 
   * @return impliedVolatility
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "61.744664", value = "The estimated volatility of a security's price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option's premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options. ")
  @JsonIgnore

  public Double getImpliedVolatility() {
        return impliedVolatility.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getImpliedVolatility_JsonNullable() {
    return impliedVolatility;
  }
  
  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  public void setImpliedVolatility_JsonNullable(JsonNullable<Double> impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }

  public void setImpliedVolatility(Double impliedVolatility) {
    this.impliedVolatility = JsonNullable.<Double>of(impliedVolatility);
  }


  public ImpliedVolatility date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date the data is as of in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Fri May 07 00:00:00 UTC 2021", value = "The date the data is as of in YYYY-MM-DD format.")
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


  public ImpliedVolatility fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#CD33M", value = "FactSet's Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)")
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


  public ImpliedVolatility requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested identifier submitted in the query.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#CD33M-USA", value = "The requested identifier submitted in the query.")
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
   * Return true if this impliedVolatility object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpliedVolatility impliedVolatility = (ImpliedVolatility) o;
    return equalsNullable(this.impliedVolatility, impliedVolatility.impliedVolatility) &&
        equalsNullable(this.date, impliedVolatility.date) &&
        equalsNullable(this.fsymId, impliedVolatility.fsymId) &&
        Objects.equals(this.requestId, impliedVolatility.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(impliedVolatility), hashCodeNullable(date), hashCodeNullable(fsymId), requestId);
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
    sb.append("class ImpliedVolatility {\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
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

