/*
 * FactSet Private Markets API
 * FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPrivateMarkets.models;

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
import com.factset.sdk.FactSetPrivateMarkets.JSON;


/**
 * Entity Match object showing the decision reached for each Entity. 
 */
@ApiModel(description = "Entity Match object showing the decision reached for each Entity. ")
@JsonPropertyOrder({
  EntityMatch.JSON_PROPERTY_ENTITY_ID,
  EntityMatch.JSON_PROPERTY_ENTITY_NAME,
  EntityMatch.JSON_PROPERTY_COUNTRY_CODE,
  EntityMatch.JSON_PROPERTY_ENTITY_TYPE_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityMatch implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private JsonNullable<String> entityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  private JsonNullable<String> entityName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private JsonNullable<String> countryCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE_CODE = "entityTypeCode";
  private JsonNullable<String> entityTypeCode = JsonNullable.<String>undefined();

  public EntityMatch() { 
  }

  public EntityMatch entityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
    return this;
  }

   /**
   * FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) 
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) ")
  @JsonIgnore

  public String getEntityId() {
        return entityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityId_JsonNullable() {
    return entityId;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  public void setEntityId_JsonNullable(JsonNullable<String> entityId) {
    this.entityId = entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = JsonNullable.<String>of(entityId);
  }


  public EntityMatch entityName(String entityName) {
    this.entityName = JsonNullable.<String>of(entityName);
    return this;
  }

   /**
   * Full name corresponding to the matched entity.
   * @return entityName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FactSet Research Systems, Inc.", value = "Full name corresponding to the matched entity.")
  @JsonIgnore

  public String getEntityName() {
        return entityName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityName_JsonNullable() {
    return entityName;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_NAME)
  public void setEntityName_JsonNullable(JsonNullable<String> entityName) {
    this.entityName = entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = JsonNullable.<String>of(entityName);
  }


  public EntityMatch countryCode(String countryCode) {
    this.countryCode = JsonNullable.<String>of(countryCode);
    return this;
  }

   /**
   * ISO2 country code corresponding to the location of the matched entity.
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US", value = "ISO2 country code corresponding to the location of the matched entity.")
  @JsonIgnore

  public String getCountryCode() {
        return countryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountryCode_JsonNullable() {
    return countryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  public void setCountryCode_JsonNullable(JsonNullable<String> countryCode) {
    this.countryCode = countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = JsonNullable.<String>of(countryCode);
  }


  public EntityMatch entityTypeCode(String entityTypeCode) {
    this.entityTypeCode = JsonNullable.<String>of(entityTypeCode);
    return this;
  }

   /**
   * Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.
   * @return entityTypeCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "PUB", value = "Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.")
  @JsonIgnore

  public String getEntityTypeCode() {
        return entityTypeCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityTypeCode_JsonNullable() {
    return entityTypeCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_CODE)
  public void setEntityTypeCode_JsonNullable(JsonNullable<String> entityTypeCode) {
    this.entityTypeCode = entityTypeCode;
  }

  public void setEntityTypeCode(String entityTypeCode) {
    this.entityTypeCode = JsonNullable.<String>of(entityTypeCode);
  }


  /**
   * Return true if this EntityMatch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMatch entityMatch = (EntityMatch) o;
    return equalsNullable(this.entityId, entityMatch.entityId) &&
        equalsNullable(this.entityName, entityMatch.entityName) &&
        equalsNullable(this.countryCode, entityMatch.countryCode) &&
        equalsNullable(this.entityTypeCode, entityMatch.entityTypeCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(entityId), hashCodeNullable(entityName), hashCodeNullable(countryCode), hashCodeNullable(entityTypeCode));
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
    sb.append("class EntityMatch {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    entityTypeCode: ").append(toIndentedString(entityTypeCode)).append("\n");
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

