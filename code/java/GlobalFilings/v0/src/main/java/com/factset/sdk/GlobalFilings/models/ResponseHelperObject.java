/*
 * Global Filings API
 * The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet’s document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  Helper endpoint will provide dynamic information on the parameters of a document request. .
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.GlobalFilings.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.GlobalFilings.models.ResponseHelperObjectCategoriesObject;
import com.factset.sdk.GlobalFilings.models.ResponseHelperObjectFormtypesObject;
import com.factset.sdk.GlobalFilings.models.ResponseHelperObjectSourcesObject;
import com.factset.sdk.GlobalFilings.models.ResponseHelperObjectTimeZonesObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.GlobalFilings.JSON;


/**
 * ResponseHelperObject
 */
@JsonPropertyOrder({
  ResponseHelperObject.JSON_PROPERTY_SOURCES_OBJECT,
  ResponseHelperObject.JSON_PROPERTY_FORMTYPES_OBJECT,
  ResponseHelperObject.JSON_PROPERTY_TIME_ZONES_OBJECT,
  ResponseHelperObject.JSON_PROPERTY_CATEGORIES_OBJECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResponseHelperObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SOURCES_OBJECT = "sourcesObject";
  private ResponseHelperObjectSourcesObject sourcesObject;

  public static final String JSON_PROPERTY_FORMTYPES_OBJECT = "formtypesObject";
  private ResponseHelperObjectFormtypesObject formtypesObject;

  public static final String JSON_PROPERTY_TIME_ZONES_OBJECT = "timeZonesObject";
  private ResponseHelperObjectTimeZonesObject timeZonesObject;

  public static final String JSON_PROPERTY_CATEGORIES_OBJECT = "categoriesObject";
  private ResponseHelperObjectCategoriesObject categoriesObject;

  public ResponseHelperObject() { 
  }

  public ResponseHelperObject sourcesObject(ResponseHelperObjectSourcesObject sourcesObject) {
    this.sourcesObject = sourcesObject;
    return this;
  }

   /**
   * Get sourcesObject
   * @return sourcesObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseHelperObjectSourcesObject getSourcesObject() {
    return sourcesObject;
  }


  @JsonProperty(JSON_PROPERTY_SOURCES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourcesObject(ResponseHelperObjectSourcesObject sourcesObject) {
    this.sourcesObject = sourcesObject;
  }


  public ResponseHelperObject formtypesObject(ResponseHelperObjectFormtypesObject formtypesObject) {
    this.formtypesObject = formtypesObject;
    return this;
  }

   /**
   * Get formtypesObject
   * @return formtypesObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMTYPES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseHelperObjectFormtypesObject getFormtypesObject() {
    return formtypesObject;
  }


  @JsonProperty(JSON_PROPERTY_FORMTYPES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormtypesObject(ResponseHelperObjectFormtypesObject formtypesObject) {
    this.formtypesObject = formtypesObject;
  }


  public ResponseHelperObject timeZonesObject(ResponseHelperObjectTimeZonesObject timeZonesObject) {
    this.timeZonesObject = timeZonesObject;
    return this;
  }

   /**
   * Get timeZonesObject
   * @return timeZonesObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_ZONES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseHelperObjectTimeZonesObject getTimeZonesObject() {
    return timeZonesObject;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZonesObject(ResponseHelperObjectTimeZonesObject timeZonesObject) {
    this.timeZonesObject = timeZonesObject;
  }


  public ResponseHelperObject categoriesObject(ResponseHelperObjectCategoriesObject categoriesObject) {
    this.categoriesObject = categoriesObject;
    return this;
  }

   /**
   * Get categoriesObject
   * @return categoriesObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseHelperObjectCategoriesObject getCategoriesObject() {
    return categoriesObject;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoriesObject(ResponseHelperObjectCategoriesObject categoriesObject) {
    this.categoriesObject = categoriesObject;
  }


  /**
   * Return true if this responseHelperObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHelperObject responseHelperObject = (ResponseHelperObject) o;
    return Objects.equals(this.sourcesObject, responseHelperObject.sourcesObject) &&
        Objects.equals(this.formtypesObject, responseHelperObject.formtypesObject) &&
        Objects.equals(this.timeZonesObject, responseHelperObject.timeZonesObject) &&
        Objects.equals(this.categoriesObject, responseHelperObject.categoriesObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourcesObject, formtypesObject, timeZonesObject, categoriesObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHelperObject {\n");
    sb.append("    sourcesObject: ").append(toIndentedString(sourcesObject)).append("\n");
    sb.append("    formtypesObject: ").append(toIndentedString(formtypesObject)).append("\n");
    sb.append("    timeZonesObject: ").append(toIndentedString(timeZonesObject)).append("\n");
    sb.append("    categoriesObject: ").append(toIndentedString(categoriesObject)).append("\n");
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

