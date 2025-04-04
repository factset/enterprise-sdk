/*
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Signals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Signals.models.ErrorItem;
import com.factset.sdk.Signals.models.ScreenMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Signals.JSON;


/**
 * Contains list of entities that matches the request criterion
 */
@ApiModel(description = "Contains list of entities that matches the request criterion")
@JsonPropertyOrder({
  EventsEntities.JSON_PROPERTY_DATA,
  EventsEntities.JSON_PROPERTY_META,
  EventsEntities.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventsEntities implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<String> data = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private ScreenMeta meta;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private java.util.List<ErrorItem> errors = null;

  public EventsEntities() { 
  }

  @JsonCreator
  public EventsEntities(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<String> data, 
    @JsonProperty(value=JSON_PROPERTY_META, required=true) ScreenMeta meta
  ) {
    this();
    this.data = data;
    this.meta = meta;
  }

  public EventsEntities data(java.util.List<String> data) {
    this.data = data;
    return this;
  }

  public EventsEntities addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<String> data) {
    this.data = data;
  }


  public EventsEntities meta(ScreenMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ScreenMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(ScreenMeta meta) {
    this.meta = meta;
  }


  public EventsEntities errors(java.util.List<ErrorItem> errors) {
    this.errors = errors;
    return this;
  }

  public EventsEntities addErrorsItem(ErrorItem errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ErrorItem> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(java.util.List<ErrorItem> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this eventsEntities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsEntities eventsEntities = (EventsEntities) o;
    return Objects.equals(this.data, eventsEntities.data) &&
        Objects.equals(this.meta, eventsEntities.meta) &&
        Objects.equals(this.errors, eventsEntities.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsEntities {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

