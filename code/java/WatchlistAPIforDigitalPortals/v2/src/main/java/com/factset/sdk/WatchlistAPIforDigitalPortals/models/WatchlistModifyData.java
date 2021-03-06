/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.WatchlistAPIforDigitalPortals.models;

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
import com.factset.sdk.WatchlistAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  WatchlistModifyData.JSON_PROPERTY_NAME,
  WatchlistModifyData.JSON_PROPERTY_NAME_NEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WatchlistModifyData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAME_NEW = "nameNew";
  private String nameNew;

  public WatchlistModifyData() { 
  }

  @JsonCreator
  public WatchlistModifyData(
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name, 
    @JsonProperty(value=JSON_PROPERTY_NAME_NEW, required=true) String nameNew
  ) {
    this();
    this.name = name;
    this.nameNew = nameNew;
  }

  public WatchlistModifyData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of watchlist
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of watchlist")
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


  public WatchlistModifyData nameNew(String nameNew) {
    this.nameNew = nameNew;
    return this;
  }

   /**
   * New name of watchlist
   * @return nameNew
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "New name of watchlist")
  @JsonProperty(JSON_PROPERTY_NAME_NEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNameNew() {
    return nameNew;
  }


  @JsonProperty(JSON_PROPERTY_NAME_NEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNameNew(String nameNew) {
    this.nameNew = nameNew;
  }


  /**
   * Return true if this _watchlist_modify_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistModifyData watchlistModifyData = (WatchlistModifyData) o;
    return Objects.equals(this.name, watchlistModifyData.name) &&
        Objects.equals(this.nameNew, watchlistModifyData.nameNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistModifyData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameNew: ").append(toIndentedString(nameNew)).append("\n");
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

