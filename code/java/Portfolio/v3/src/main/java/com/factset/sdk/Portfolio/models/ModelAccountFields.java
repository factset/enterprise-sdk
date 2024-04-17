/*
 * ModelAccounts API
 * Allow clients to fetch ModelAccounts Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Portfolio.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Portfolio.models.ModelAccountAdditionalField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Portfolio.JSON;


/**
 * ModelAccountFields
 */
@JsonPropertyOrder({
  ModelAccountFields.JSON_PROPERTY_ITERATIVE,
  ModelAccountFields.JSON_PROPERTY_NON_ITERATIVE,
  ModelAccountFields.JSON_PROPERTY_ADDITIONAL_FIELDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ModelAccountFields implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ITERATIVE = "iterative";
  private java.util.Map<String, java.util.Map<String, java.util.Map<String, String>>> iterative = new java.util.HashMap<>();

  public static final String JSON_PROPERTY_NON_ITERATIVE = "nonIterative";
  private java.util.Map<String, java.util.Map<String, String>> nonIterative = null;

  public static final String JSON_PROPERTY_ADDITIONAL_FIELDS = "additionalFields";
  private java.util.List<ModelAccountAdditionalField> additionalFields = null;

  public ModelAccountFields() { 
  }

  @JsonCreator
  public ModelAccountFields(
    @JsonProperty(value=JSON_PROPERTY_ITERATIVE, required=true) java.util.Map<String, java.util.Map<String, java.util.Map<String, String>>> iterative
  ) {
    this();
    this.iterative = iterative;
  }

  public ModelAccountFields iterative(java.util.Map<String, java.util.Map<String, java.util.Map<String, String>>> iterative) {
    this.iterative = iterative;
    return this;
  }

  public ModelAccountFields putIterativeItem(String key, java.util.Map<String, java.util.Map<String, String>> iterativeItem) {
    this.iterative.put(key, iterativeItem);
    return this;
  }

   /**
   * Get iterative
   * @return iterative
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITERATIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Map<String, java.util.Map<String, java.util.Map<String, String>>> getIterative() {
    return iterative;
  }


  @JsonProperty(JSON_PROPERTY_ITERATIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIterative(java.util.Map<String, java.util.Map<String, java.util.Map<String, String>>> iterative) {
    this.iterative = iterative;
  }


  public ModelAccountFields nonIterative(java.util.Map<String, java.util.Map<String, String>> nonIterative) {
    this.nonIterative = nonIterative;
    return this;
  }

  public ModelAccountFields putNonIterativeItem(String key, java.util.Map<String, String> nonIterativeItem) {
    if (this.nonIterative == null) {
      this.nonIterative = new java.util.HashMap<>();
    }
    this.nonIterative.put(key, nonIterativeItem);
    return this;
  }

   /**
   * Get nonIterative
   * @return nonIterative
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_ITERATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, java.util.Map<String, String>> getNonIterative() {
    return nonIterative;
  }


  @JsonProperty(JSON_PROPERTY_NON_ITERATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonIterative(java.util.Map<String, java.util.Map<String, String>> nonIterative) {
    this.nonIterative = nonIterative;
  }


  public ModelAccountFields additionalFields(java.util.List<ModelAccountAdditionalField> additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

  public ModelAccountFields addAdditionalFieldsItem(ModelAccountAdditionalField additionalFieldsItem) {
    if (this.additionalFields == null) {
      this.additionalFields = new java.util.ArrayList<>();
    }
    this.additionalFields.add(additionalFieldsItem);
    return this;
  }

   /**
   * Get additionalFields
   * @return additionalFields
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ModelAccountAdditionalField> getAdditionalFields() {
    return additionalFields;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalFields(java.util.List<ModelAccountAdditionalField> additionalFields) {
    this.additionalFields = additionalFields;
  }


  /**
   * Return true if this ModelAccountFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAccountFields modelAccountFields = (ModelAccountFields) o;
    return Objects.equals(this.iterative, modelAccountFields.iterative) &&
        Objects.equals(this.nonIterative, modelAccountFields.nonIterative) &&
        Objects.equals(this.additionalFields, modelAccountFields.additionalFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterative, nonIterative, additionalFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAccountFields {\n");
    sb.append("    iterative: ").append(toIndentedString(iterative)).append("\n");
    sb.append("    nonIterative: ").append(toIndentedString(nonIterative)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
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

