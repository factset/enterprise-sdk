/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

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
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * An object containing basic information about the peer of the queried company
 */
@ApiModel(description = "An object containing basic information about the peer of the queried company")
@JsonPropertyOrder({
  PeerListItem.JSON_PROPERTY_ID,
  PeerListItem.JSON_PROPERTY_NAME,
  PeerListItem.JSON_PROPERTY_TICKER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PeerListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public PeerListItem() { 
  }

  @JsonCreator
  public PeerListItem(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name, 
    @JsonProperty(value=JSON_PROPERTY_TICKER, required=true) String ticker
  ) {
    this();
    this.id = id;
    this.name = name;
    this.ticker = ticker;
  }

  public PeerListItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The FactSet Entity ID of the peer
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The FactSet Entity ID of the peer")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PeerListItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the peer
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the peer")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PeerListItem ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker of the peer
   * @return ticker
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ticker of the peer")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  /**
   * Return true if this PeerListItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerListItem peerListItem = (PeerListItem) o;
    return Objects.equals(this.id, peerListItem.id) &&
        Objects.equals(this.name, peerListItem.name) &&
        Objects.equals(this.ticker, peerListItem.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ticker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

