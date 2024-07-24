/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PAEngine.models.PAComponentData;
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
import com.factset.sdk.PAEngine.JSON;


/**
 * TemplatedPAComponentUpdateParameters
 */
@JsonPropertyOrder({
  TemplatedPAComponentUpdateParameters.JSON_PROPERTY_PARENT_TEMPLATE_ID,
  TemplatedPAComponentUpdateParameters.JSON_PROPERTY_DESCRIPTION,
  TemplatedPAComponentUpdateParameters.JSON_PROPERTY_COMPONENT_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TemplatedPAComponentUpdateParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PARENT_TEMPLATE_ID = "parentTemplateId";
  private JsonNullable<String> parentTemplateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPONENT_DATA = "componentData";
  private PAComponentData componentData;

  public TemplatedPAComponentUpdateParameters() { 
  }

  public TemplatedPAComponentUpdateParameters parentTemplateId(String parentTemplateId) {
    this.parentTemplateId = JsonNullable.<String>of(parentTemplateId);
    return this;
  }

   /**
   * Parent template id
   * @return parentTemplateId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Parent template id")
  @JsonIgnore

  public String getParentTemplateId() {
        return parentTemplateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentTemplateId_JsonNullable() {
    return parentTemplateId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_TEMPLATE_ID)
  public void setParentTemplateId_JsonNullable(JsonNullable<String> parentTemplateId) {
    this.parentTemplateId = parentTemplateId;
  }

  public void setParentTemplateId(String parentTemplateId) {
    this.parentTemplateId = JsonNullable.<String>of(parentTemplateId);
  }


  public TemplatedPAComponentUpdateParameters description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Component description.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Component description.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public TemplatedPAComponentUpdateParameters componentData(PAComponentData componentData) {
    this.componentData = componentData;
    return this;
  }

   /**
   * Get componentData
   * @return componentData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPONENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PAComponentData getComponentData() {
    return componentData;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentData(PAComponentData componentData) {
    this.componentData = componentData;
  }


  /**
   * Return true if this TemplatedPAComponentUpdateParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatedPAComponentUpdateParameters templatedPAComponentUpdateParameters = (TemplatedPAComponentUpdateParameters) o;
    return equalsNullable(this.parentTemplateId, templatedPAComponentUpdateParameters.parentTemplateId) &&
        equalsNullable(this.description, templatedPAComponentUpdateParameters.description) &&
        Objects.equals(this.componentData, templatedPAComponentUpdateParameters.componentData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(parentTemplateId), hashCodeNullable(description), componentData);
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
    sb.append("class TemplatedPAComponentUpdateParameters {\n");
    sb.append("    parentTemplateId: ").append(toIndentedString(parentTemplateId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentData: ").append(toIndentedString(componentData)).append("\n");
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

