/*
 * Company Logo API
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The Logo API provides access to logos of US, CA and EU listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logos are reviewed/updated twice a year.  The Logo API for Digital Portals seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals). 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CompanyLogo.models;

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
import com.factset.sdk.CompanyLogo.JSON;


/**
 * Medium logo.
 */
@ApiModel(description = "Medium logo.")
@JsonPropertyOrder({
  InlineResponse200DataMedium.JSON_PROPERTY_URL,
  InlineResponse200DataMedium.JSON_PROPERTY_MIME_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200DataMedium implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  public InlineResponse200DataMedium() { 
  }

  public InlineResponse200DataMedium url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

   /**
   * URL of the logo.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "URL of the logo.")
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public InlineResponse200DataMedium mimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
    return this;
  }

   /**
   * MIME type of the logo.
   * @return mimeType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MIME type of the logo.")
  @JsonIgnore

  public String getMimeType() {
        return mimeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMimeType_JsonNullable() {
    return mimeType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  public void setMimeType_JsonNullable(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
  }


  /**
   * Return true if this inline_response_200_data_medium object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataMedium inlineResponse200DataMedium = (InlineResponse200DataMedium) o;
    return equalsNullable(this.url, inlineResponse200DataMedium.url) &&
        equalsNullable(this.mimeType, inlineResponse200DataMedium.mimeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(url), hashCodeNullable(mimeType));
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
    sb.append("class InlineResponse200DataMedium {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

