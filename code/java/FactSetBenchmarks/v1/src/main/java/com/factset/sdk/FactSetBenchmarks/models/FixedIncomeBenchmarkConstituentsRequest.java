/*
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetBenchmarks.models;

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
import com.factset.sdk.FactSetBenchmarks.JSON;


/**
 * FixedIncomeBenchmarkConstituentsRequest
 */
@JsonPropertyOrder({
  FixedIncomeBenchmarkConstituentsRequest.JSON_PROPERTY_IDS,
  FixedIncomeBenchmarkConstituentsRequest.JSON_PROPERTY_DATE,
  FixedIncomeBenchmarkConstituentsRequest.JSON_PROPERTY_CURRENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FixedIncomeBenchmarkConstituentsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public FixedIncomeBenchmarkConstituentsRequest() { 
  }

  @JsonCreator
  public FixedIncomeBenchmarkConstituentsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public FixedIncomeBenchmarkConstituentsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FixedIncomeBenchmarkConstituentsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Fixed Income Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error.
   * @return ids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"LHMN0001\"]", required = true, value = "Fixed Income Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public FixedIncomeBenchmarkConstituentsRequest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date of holding expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-08-06", value = "Date of holding expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public FixedIncomeBenchmarkConstituentsRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency for response.
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency for response.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this fixedIncomeBenchmarkConstituentsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedIncomeBenchmarkConstituentsRequest fixedIncomeBenchmarkConstituentsRequest = (FixedIncomeBenchmarkConstituentsRequest) o;
    return Objects.equals(this.ids, fixedIncomeBenchmarkConstituentsRequest.ids) &&
        Objects.equals(this.date, fixedIncomeBenchmarkConstituentsRequest.date) &&
        Objects.equals(this.currency, fixedIncomeBenchmarkConstituentsRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, date, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedIncomeBenchmarkConstituentsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

