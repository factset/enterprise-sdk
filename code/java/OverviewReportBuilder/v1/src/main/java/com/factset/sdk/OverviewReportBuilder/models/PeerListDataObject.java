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
import com.factset.sdk.OverviewReportBuilder.models.PeerListDataObjectMeta;
import com.factset.sdk.OverviewReportBuilder.models.PeerListItem;
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
 * A list of all of the company&#39;s peers
 */
@ApiModel(description = "A list of all of the company's peers")
@JsonPropertyOrder({
  PeerListDataObject.JSON_PROPERTY_META,
  PeerListDataObject.JSON_PROPERTY_PEERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PeerListDataObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_META = "meta";
  private PeerListDataObjectMeta meta;

  public static final String JSON_PROPERTY_PEERS = "peers";
  private java.util.List<PeerListItem> peers = new java.util.ArrayList<>();

  public PeerListDataObject() { 
  }

  @JsonCreator
  public PeerListDataObject(
    @JsonProperty(value=JSON_PROPERTY_PEERS, required=true) java.util.List<PeerListItem> peers
  ) {
    this();
    this.peers = peers;
  }

  public PeerListDataObject meta(PeerListDataObjectMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeerListDataObjectMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PeerListDataObjectMeta meta) {
    this.meta = meta;
  }


  public PeerListDataObject peers(java.util.List<PeerListItem> peers) {
    this.peers = peers;
    return this;
  }

  public PeerListDataObject addPeersItem(PeerListItem peersItem) {
    this.peers.add(peersItem);
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PEERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<PeerListItem> getPeers() {
    return peers;
  }


  @JsonProperty(JSON_PROPERTY_PEERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeers(java.util.List<PeerListItem> peers) {
    this.peers = peers;
  }


  /**
   * Return true if this PeerListDataObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerListDataObject peerListDataObject = (PeerListDataObject) o;
    return Objects.equals(this.meta, peerListDataObject.meta) &&
        Objects.equals(this.peers, peerListDataObject.peers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, peers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerListDataObject {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
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

