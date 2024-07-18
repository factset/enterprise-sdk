/*
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.8.0
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
 * UpdateUniverseRequest
 */
@JsonPropertyOrder({
  UpdateUniverseRequest.JSON_PROPERTY_UNIVERSE_NAME,
  UpdateUniverseRequest.JSON_PROPERTY_UNIVERSE_DESCRIPTION,
  UpdateUniverseRequest.JSON_PROPERTY_UNIVERSE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UpdateUniverseRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIVERSE_NAME = "universeName";
  private String universeName;

  public static final String JSON_PROPERTY_UNIVERSE_DESCRIPTION = "universeDescription";
  private String universeDescription;

  public static final String JSON_PROPERTY_UNIVERSE_ID = "universeId";
  private Integer universeId;

  public UpdateUniverseRequest() { 
  }

  @JsonCreator
  public UpdateUniverseRequest(
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE_ID, required=true) Integer universeId
  ) {
    this();
    this.universeId = universeId;
  }

  public UpdateUniverseRequest universeName(String universeName) {
    this.universeName = universeName;
    return this;
  }

   /**
   * Universe name
   * @return universeName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "My Universe", value = "Universe name")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniverseName() {
    return universeName;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniverseName(String universeName) {
    this.universeName = universeName;
  }


  public UpdateUniverseRequest universeDescription(String universeDescription) {
    this.universeDescription = universeDescription;
    return this;
  }

   /**
   * Universe description
   * @return universeDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "This is my universe", value = "Universe description")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniverseDescription() {
    return universeDescription;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniverseDescription(String universeDescription) {
    this.universeDescription = universeDescription;
  }


  public UpdateUniverseRequest universeId(Integer universeId) {
    this.universeId = universeId;
    return this;
  }

   /**
   * Universe identifier
   * @return universeId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Universe identifier")
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


  /**
   * Return true if this UpdateUniverseRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUniverseRequest updateUniverseRequest = (UpdateUniverseRequest) o;
    return Objects.equals(this.universeName, updateUniverseRequest.universeName) &&
        Objects.equals(this.universeDescription, updateUniverseRequest.universeDescription) &&
        Objects.equals(this.universeId, updateUniverseRequest.universeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(universeName, universeDescription, universeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUniverseRequest {\n");
    sb.append("    universeName: ").append(toIndentedString(universeName)).append("\n");
    sb.append("    universeDescription: ").append(toIndentedString(universeDescription)).append("\n");
    sb.append("    universeId: ").append(toIndentedString(universeId)).append("\n");
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

