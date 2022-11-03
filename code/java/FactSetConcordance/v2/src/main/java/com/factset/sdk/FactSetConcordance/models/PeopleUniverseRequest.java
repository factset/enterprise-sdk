/*
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetConcordance.models;

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
import com.factset.sdk.FactSetConcordance.JSON;


/**
 * PeopleUniverseRequest
 */
@JsonPropertyOrder({
  PeopleUniverseRequest.JSON_PROPERTY_UNIVERSE_ID,
  PeopleUniverseRequest.JSON_PROPERTY_OFFSET,
  PeopleUniverseRequest.JSON_PROPERTY_LIMIT,
  PeopleUniverseRequest.JSON_PROPERTY_MAP_STATUS,
  PeopleUniverseRequest.JSON_PROPERTY_CLIENT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleUniverseRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIVERSE_ID = "universeId";
  private Integer universeId;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  /**
   * Gets or Sets mapStatus
   */
  public enum MapStatusEnum {
    MAPPED("MAPPED"),
    
    UNMAPPED("UNMAPPED"),
    
    INDETERMINATE("INDETERMINATE");

    private String value;

    MapStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MapStatusEnum fromValue(String value) {
      for (MapStatusEnum b : MapStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MAP_STATUS = "mapStatus";
  private java.util.List<MapStatusEnum> mapStatus = null;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private java.util.List<String> clientId = null;

  public PeopleUniverseRequest() { 
  }

  @JsonCreator
  public PeopleUniverseRequest(
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE_ID, required=true) Integer universeId
  ) {
    this();
    this.universeId = universeId;
  }

  public PeopleUniverseRequest universeId(Integer universeId) {
    this.universeId = universeId;
    return this;
  }

   /**
   * the id of the universe that entities come from
   * @return universeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "the id of the universe that entities come from")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUniverseId() {
    return universeId;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniverseId(Integer universeId) {
    this.universeId = universeId;
  }


  public PeopleUniverseRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * starting row of the universe
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "starting row of the universe")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public PeopleUniverseRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limits the number of records in the response.
   * maximum: 10000
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Limits the number of records in the response.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PeopleUniverseRequest mapStatus(java.util.List<MapStatusEnum> mapStatus) {
    this.mapStatus = mapStatus;
    return this;
  }

  public PeopleUniverseRequest addMapStatusItem(MapStatusEnum mapStatusItem) {
    if (this.mapStatus == null) {
      this.mapStatus = new java.util.ArrayList<>();
    }
    this.mapStatus.add(mapStatusItem);
    return this;
  }

   /**
   * Filter by the People Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
   * @return mapStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"MAPPED\"]", value = "Filter by the People Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping. ")
  @JsonProperty(JSON_PROPERTY_MAP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<MapStatusEnum> getMapStatus() {
    return mapStatus;
  }


  @JsonProperty(JSON_PROPERTY_MAP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapStatus(java.util.List<MapStatusEnum> mapStatus) {
    this.mapStatus = mapStatus;
  }


  public PeopleUniverseRequest clientId(java.util.List<String> clientId) {
    this.clientId = clientId;
    return this;
  }

  public PeopleUniverseRequest addClientIdItem(String clientIdItem) {
    if (this.clientId == null) {
      this.clientId = new java.util.ArrayList<>();
    }
    this.clientId.add(clientIdItem);
    return this;
  }

   /**
   * fetch only the mappings that has client id included in the specified list.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abc-123\",\"dfg-456\"]", value = "fetch only the mappings that has client id included in the specified list.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(java.util.List<String> clientId) {
    this.clientId = clientId;
  }


  /**
   * Return true if this PeopleUniverseRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleUniverseRequest peopleUniverseRequest = (PeopleUniverseRequest) o;
    return Objects.equals(this.universeId, peopleUniverseRequest.universeId) &&
        Objects.equals(this.offset, peopleUniverseRequest.offset) &&
        Objects.equals(this.limit, peopleUniverseRequest.limit) &&
        Objects.equals(this.mapStatus, peopleUniverseRequest.mapStatus) &&
        Objects.equals(this.clientId, peopleUniverseRequest.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(universeId, offset, limit, mapStatus, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleUniverseRequest {\n");
    sb.append("    universeId: ").append(toIndentedString(universeId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    mapStatus: ").append(toIndentedString(mapStatus)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

