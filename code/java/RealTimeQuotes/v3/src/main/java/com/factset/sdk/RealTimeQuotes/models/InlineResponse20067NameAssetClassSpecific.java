/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

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
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Asset class-specific instrument names. Sorting requires that a single asset-class has been selected, see parameter &#x60;assetClass.ids&#x60;.
 */
@ApiModel(description = "Asset class-specific instrument names. Sorting requires that a single asset-class has been selected, see parameter `assetClass.ids`.")
@JsonPropertyOrder({
  InlineResponse20067NameAssetClassSpecific.JSON_PROPERTY_LONG,
  InlineResponse20067NameAssetClassSpecific.JSON_PROPERTY_SHORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20067NameAssetClassSpecific implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LONG = "long";
  private JsonNullable<String> _long = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT = "short";
  private JsonNullable<String> _short = JsonNullable.<String>undefined();

  public InlineResponse20067NameAssetClassSpecific() { 
  }

  public InlineResponse20067NameAssetClassSpecific _long(String _long) {
    this._long = JsonNullable.<String>of(_long);
    return this;
  }

   /**
   * Long name.
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Long name.")
  @JsonIgnore

  public String getLong() {
        return _long.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLong_JsonNullable() {
    return _long;
  }
  
  @JsonProperty(JSON_PROPERTY_LONG)
  public void setLong_JsonNullable(JsonNullable<String> _long) {
    this._long = _long;
  }

  public void setLong(String _long) {
    this._long = JsonNullable.<String>of(_long);
  }


  public InlineResponse20067NameAssetClassSpecific _short(String _short) {
    this._short = JsonNullable.<String>of(_short);
    return this;
  }

   /**
   * Short name.
   * @return _short
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name.")
  @JsonIgnore

  public String getShort() {
        return _short.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShort_JsonNullable() {
    return _short;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT)
  public void setShort_JsonNullable(JsonNullable<String> _short) {
    this._short = _short;
  }

  public void setShort(String _short) {
    this._short = JsonNullable.<String>of(_short);
  }


  /**
   * Return true if this inline_response_200_67_name_assetClassSpecific object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20067NameAssetClassSpecific inlineResponse20067NameAssetClassSpecific = (InlineResponse20067NameAssetClassSpecific) o;
    return equalsNullable(this._long, inlineResponse20067NameAssetClassSpecific._long) &&
        equalsNullable(this._short, inlineResponse20067NameAssetClassSpecific._short);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(_long), hashCodeNullable(_short));
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
    sb.append("class InlineResponse20067NameAssetClassSpecific {\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
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
