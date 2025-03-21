/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.RankedTableRow;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * RankedTable
 */
@JsonPropertyOrder({
  RankedTable.JSON_PROPERTY_HEADERS,
  RankedTable.JSON_PROPERTY_ROWS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RankedTable implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private java.util.List<String> headers = null;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private java.util.List<RankedTableRow> rows = new java.util.ArrayList<>();

  public RankedTable() { 
  }

  @JsonCreator
  public RankedTable(
    @JsonProperty(value=JSON_PROPERTY_ROWS, required=true) java.util.List<RankedTableRow> rows
  ) {
    this();
    this.rows = rows;
  }

  public RankedTable headers(java.util.List<String> headers) {
    this.headers = headers;
    return this;
  }

  public RankedTable addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new java.util.ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(java.util.List<String> headers) {
    this.headers = headers;
  }


  public RankedTable rows(java.util.List<RankedTableRow> rows) {
    this.rows = rows;
    return this;
  }

  public RankedTable addRowsItem(RankedTableRow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<RankedTableRow> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRows(java.util.List<RankedTableRow> rows) {
    this.rows = rows;
  }


  /**
   * Return true if this RankedTable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankedTable rankedTable = (RankedTable) o;
    return Objects.equals(this.headers, rankedTable.headers) &&
        Objects.equals(this.rows, rankedTable.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankedTable {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

