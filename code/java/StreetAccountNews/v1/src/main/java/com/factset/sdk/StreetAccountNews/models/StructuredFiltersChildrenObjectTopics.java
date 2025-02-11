/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StreetAccountNews.models.StructuredFiltersChildrenObjectTopicsNested;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * Elements of structured filters children topics object.
 */
@ApiModel(description = "Elements of structured filters children topics object.")
@JsonPropertyOrder({
  StructuredFiltersChildrenObjectTopics.JSON_PROPERTY_NAME,
  StructuredFiltersChildrenObjectTopics.JSON_PROPERTY_CHILDREN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StructuredFiltersChildrenObjectTopics implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private java.util.List<StructuredFiltersChildrenObjectTopicsNested> children = null;

  public StructuredFiltersChildrenObjectTopics() { 
  }

  public StructuredFiltersChildrenObjectTopics name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the children.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The name of the children.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public StructuredFiltersChildrenObjectTopics children(java.util.List<StructuredFiltersChildrenObjectTopicsNested> children) {
    this.children = children;
    return this;
  }

  public StructuredFiltersChildrenObjectTopics addChildrenItem(StructuredFiltersChildrenObjectTopicsNested childrenItem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * An array of children objects.
   * @return children
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An array of children objects.")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StructuredFiltersChildrenObjectTopicsNested> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(java.util.List<StructuredFiltersChildrenObjectTopicsNested> children) {
    this.children = children;
  }


  /**
   * Return true if this StructuredFiltersChildrenObjectTopics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredFiltersChildrenObjectTopics structuredFiltersChildrenObjectTopics = (StructuredFiltersChildrenObjectTopics) o;
    return Objects.equals(this.name, structuredFiltersChildrenObjectTopics.name) &&
        Objects.equals(this.children, structuredFiltersChildrenObjectTopics.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredFiltersChildrenObjectTopics {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

