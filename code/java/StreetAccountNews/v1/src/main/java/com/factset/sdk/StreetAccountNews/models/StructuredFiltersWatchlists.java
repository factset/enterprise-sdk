/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StreetAccountNews.models.StructuredFiltersWatchlistsObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * Structured FiltersWatchlists Object
 */
@ApiModel(description = "Structured FiltersWatchlists Object")
@JsonPropertyOrder({
  StructuredFiltersWatchlists.JSON_PROPERTY_WATCHLISTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StructuredFiltersWatchlists implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WATCHLISTS = "watchlists";
  private java.util.List<StructuredFiltersWatchlistsObject> watchlists = null;

  public StructuredFiltersWatchlists() { 
  }

  public StructuredFiltersWatchlists watchlists(java.util.List<StructuredFiltersWatchlistsObject> watchlists) {
    this.watchlists = watchlists;
    return this;
  }

  public StructuredFiltersWatchlists addWatchlistsItem(StructuredFiltersWatchlistsObject watchlistsItem) {
    if (this.watchlists == null) {
      this.watchlists = new java.util.ArrayList<>();
    }
    this.watchlists.add(watchlistsItem);
    return this;
  }

   /**
   * Get watchlists
   * @return watchlists
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WATCHLISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StructuredFiltersWatchlistsObject> getWatchlists() {
    return watchlists;
  }


  @JsonProperty(JSON_PROPERTY_WATCHLISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatchlists(java.util.List<StructuredFiltersWatchlistsObject> watchlists) {
    this.watchlists = watchlists;
  }


  /**
   * Return true if this StructuredFiltersWatchlists object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFiltersWatchlists structuredFiltersWatchlists = (StructuredFiltersWatchlists) o;
    return Objects.equals(this.watchlists, structuredFiltersWatchlists.watchlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFiltersWatchlists {\n");
    sb.append("    watchlists: ").append(toIndentedString(watchlists)).append("\n");
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

