/*
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
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
 * PeopleMappingRequest
 */
@JsonPropertyOrder({
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_ENTITY,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_FIRST_NAME,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_ID,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_LAST_NAME,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_MIDDLE_NAME,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_PERSON_NAME,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_PRIORITY,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_SALUTATION,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_SUFFIX,
  PeopleMappingRequest.JSON_PROPERTY_CLIENT_ADDITIONAL_CONTEXT,
  PeopleMappingRequest.JSON_PROPERTY_PERSON_ID,
  PeopleMappingRequest.JSON_PROPERTY_UNIVERSE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PeopleMappingRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CLIENT_ENTITY = "clientEntity";
  private String clientEntity;

  public static final String JSON_PROPERTY_CLIENT_FIRST_NAME = "clientFirstName";
  private String clientFirstName;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_LAST_NAME = "clientLastName";
  private String clientLastName;

  public static final String JSON_PROPERTY_CLIENT_MIDDLE_NAME = "clientMiddleName";
  private String clientMiddleName;

  public static final String JSON_PROPERTY_CLIENT_PERSON_NAME = "clientPersonName";
  private String clientPersonName;

  public static final String JSON_PROPERTY_CLIENT_PRIORITY = "clientPriority";
  private String clientPriority;

  public static final String JSON_PROPERTY_CLIENT_SALUTATION = "clientSalutation";
  private String clientSalutation;

  public static final String JSON_PROPERTY_CLIENT_SUFFIX = "clientSuffix";
  private String clientSuffix;

  public static final String JSON_PROPERTY_CLIENT_ADDITIONAL_CONTEXT = "clientAdditionalContext";
  private java.util.Map<String, String> clientAdditionalContext = null;

  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private String personId;

  public static final String JSON_PROPERTY_UNIVERSE_ID = "universeId";
  private Integer universeId;

  public PeopleMappingRequest() { 
  }

  @JsonCreator
  public PeopleMappingRequest(
    @JsonProperty(value=JSON_PROPERTY_CLIENT_ID, required=true) String clientId, 
    @JsonProperty(value=JSON_PROPERTY_UNIVERSE_ID, required=true) Integer universeId
  ) {
    this();
    this.clientId = clientId;
    this.universeId = universeId;
  }

  public PeopleMappingRequest clientEntity(String clientEntity) {
    this.clientEntity = clientEntity;
    return this;
  }

   /**
   * Used to describe the company of the person
   * @return clientEntity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Microsoft", value = "Used to describe the company of the person")
  @JsonProperty(JSON_PROPERTY_CLIENT_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientEntity() {
    return clientEntity;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientEntity(String clientEntity) {
    this.clientEntity = clientEntity;
  }


  public PeopleMappingRequest clientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
    return this;
  }

   /**
   * Used to describe the first name of the person
   * @return clientFirstName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "William", value = "Used to describe the first name of the person")
  @JsonProperty(JSON_PROPERTY_CLIENT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientFirstName() {
    return clientFirstName;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
  }


  public PeopleMappingRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.
   * @return clientId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BGA-123", required = true, value = "A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PeopleMappingRequest clientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
    return this;
  }

   /**
   * Used to describe the last name of the person.
   * @return clientLastName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Gates", value = "Used to describe the last name of the person.")
  @JsonProperty(JSON_PROPERTY_CLIENT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientLastName() {
    return clientLastName;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
  }


  public PeopleMappingRequest clientMiddleName(String clientMiddleName) {
    this.clientMiddleName = clientMiddleName;
    return this;
  }

   /**
   * Used to describe the middle name of the person.
   * @return clientMiddleName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Henry", value = "Used to describe the middle name of the person.")
  @JsonProperty(JSON_PROPERTY_CLIENT_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientMiddleName() {
    return clientMiddleName;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientMiddleName(String clientMiddleName) {
    this.clientMiddleName = clientMiddleName;
  }


  public PeopleMappingRequest clientPersonName(String clientPersonName) {
    this.clientPersonName = clientPersonName;
    return this;
  }

   /**
   * Used to describe the name of the person
   * @return clientPersonName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Bill Gates", value = "Used to describe the name of the person")
  @JsonProperty(JSON_PROPERTY_CLIENT_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientPersonName() {
    return clientPersonName;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientPersonName(String clientPersonName) {
    this.clientPersonName = clientPersonName;
  }


  public PeopleMappingRequest clientPriority(String clientPriority) {
    this.clientPriority = clientPriority;
    return this;
  }

   /**
   * Used to indicate the priority of the person
   * @return clientPriority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "HIGH", value = "Used to indicate the priority of the person")
  @JsonProperty(JSON_PROPERTY_CLIENT_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientPriority() {
    return clientPriority;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientPriority(String clientPriority) {
    this.clientPriority = clientPriority;
  }


  public PeopleMappingRequest clientSalutation(String clientSalutation) {
    this.clientSalutation = clientSalutation;
    return this;
  }

   /**
   * Used to indicate the salutation of the person
   * @return clientSalutation
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Mr", value = "Used to indicate the salutation of the person")
  @JsonProperty(JSON_PROPERTY_CLIENT_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSalutation() {
    return clientSalutation;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSalutation(String clientSalutation) {
    this.clientSalutation = clientSalutation;
  }


  public PeopleMappingRequest clientSuffix(String clientSuffix) {
    this.clientSuffix = clientSuffix;
    return this;
  }

   /**
   * Used to indicate the suffix for the person&#39;s name
   * @return clientSuffix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "III", value = "Used to indicate the suffix for the person's name")
  @JsonProperty(JSON_PROPERTY_CLIENT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSuffix() {
    return clientSuffix;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSuffix(String clientSuffix) {
    this.clientSuffix = clientSuffix;
  }


  public PeopleMappingRequest clientAdditionalContext(java.util.Map<String, String> clientAdditionalContext) {
    this.clientAdditionalContext = clientAdditionalContext;
    return this;
  }

  public PeopleMappingRequest putClientAdditionalContextItem(String key, String clientAdditionalContextItem) {
    if (this.clientAdditionalContext == null) {
      this.clientAdditionalContext = new java.util.HashMap<>();
    }
    this.clientAdditionalContext.put(key, clientAdditionalContextItem);
    return this;
  }

   /**
   * Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records. 
   * @return clientAdditionalContext
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"Address\":\"123 Main St\",\"Phone\":\"555-555-5555\",\"City\":\"New York\"}", value = "Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records. ")
  @JsonProperty(JSON_PROPERTY_CLIENT_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getClientAdditionalContext() {
    return clientAdditionalContext;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAdditionalContext(java.util.Map<String, String> clientAdditionalContext) {
    this.clientAdditionalContext = clientAdditionalContext;
  }


  public PeopleMappingRequest personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * A unique identifier used to identify a person.
   * @return personId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "00118X-E", value = "A unique identifier used to identify a person.")
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonId() {
    return personId;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public PeopleMappingRequest universeId(Integer universeId) {
    this.universeId = universeId;
    return this;
  }

   /**
   * A unique identifier supplied to a person to save the data into his/her universe.
   * @return universeId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "A unique identifier supplied to a person to save the data into his/her universe.")
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
   * Return true if this PeopleMappingRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleMappingRequest peopleMappingRequest = (PeopleMappingRequest) o;
    return Objects.equals(this.clientEntity, peopleMappingRequest.clientEntity) &&
        Objects.equals(this.clientFirstName, peopleMappingRequest.clientFirstName) &&
        Objects.equals(this.clientId, peopleMappingRequest.clientId) &&
        Objects.equals(this.clientLastName, peopleMappingRequest.clientLastName) &&
        Objects.equals(this.clientMiddleName, peopleMappingRequest.clientMiddleName) &&
        Objects.equals(this.clientPersonName, peopleMappingRequest.clientPersonName) &&
        Objects.equals(this.clientPriority, peopleMappingRequest.clientPriority) &&
        Objects.equals(this.clientSalutation, peopleMappingRequest.clientSalutation) &&
        Objects.equals(this.clientSuffix, peopleMappingRequest.clientSuffix) &&
        Objects.equals(this.clientAdditionalContext, peopleMappingRequest.clientAdditionalContext) &&
        Objects.equals(this.personId, peopleMappingRequest.personId) &&
        Objects.equals(this.universeId, peopleMappingRequest.universeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientEntity, clientFirstName, clientId, clientLastName, clientMiddleName, clientPersonName, clientPriority, clientSalutation, clientSuffix, clientAdditionalContext, personId, universeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleMappingRequest {\n");
    sb.append("    clientEntity: ").append(toIndentedString(clientEntity)).append("\n");
    sb.append("    clientFirstName: ").append(toIndentedString(clientFirstName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientLastName: ").append(toIndentedString(clientLastName)).append("\n");
    sb.append("    clientMiddleName: ").append(toIndentedString(clientMiddleName)).append("\n");
    sb.append("    clientPersonName: ").append(toIndentedString(clientPersonName)).append("\n");
    sb.append("    clientPriority: ").append(toIndentedString(clientPriority)).append("\n");
    sb.append("    clientSalutation: ").append(toIndentedString(clientSalutation)).append("\n");
    sb.append("    clientSuffix: ").append(toIndentedString(clientSuffix)).append("\n");
    sb.append("    clientAdditionalContext: ").append(toIndentedString(clientAdditionalContext)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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

