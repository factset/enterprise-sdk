/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
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
import com.factset.sdk.PAEngine.models.Metadata;
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
 * Section
 */
@JsonPropertyOrder({
  Section.JSON_PROPERTY_METADATA,
  Section.JSON_PROPERTY_TITLE,
  Section.JSON_PROPERTY_CONTENT,
  Section.JSON_PROPERTY_SUB_SECTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Section implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Metadata metadata;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private JsonNullable<String> content = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUB_SECTIONS = "subSections";
  private JsonNullable<java.util.List<Section>> subSections = JsonNullable.<java.util.List<Section>>undefined();

  public Section() { 
  }

  public Section metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Metadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public Section title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Commentary title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Commentary title")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public Section content(String content) {
    this.content = JsonNullable.<String>of(content);
    return this;
  }

   /**
   * Generated commentary content
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Generated commentary content")
  @JsonIgnore

  public String getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<String> content) {
    this.content = content;
  }

  public void setContent(String content) {
    this.content = JsonNullable.<String>of(content);
  }


  public Section subSections(java.util.List<Section> subSections) {
    this.subSections = JsonNullable.<java.util.List<Section>>of(subSections);
    return this;
  }

  public Section addSubSectionsItem(Section subSectionsItem) {
    if (this.subSections == null || !this.subSections.isPresent()) {
      this.subSections = JsonNullable.<java.util.List<Section>>of(new java.util.ArrayList<>());
    }
    try {
      this.subSections.get().add(subSectionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Generated commentary subsections
   * @return subSections
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Generated commentary subsections")
  @JsonIgnore

  public java.util.List<Section> getSubSections() {
        return subSections.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<Section>> getSubSections_JsonNullable() {
    return subSections;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_SECTIONS)
  public void setSubSections_JsonNullable(JsonNullable<java.util.List<Section>> subSections) {
    this.subSections = subSections;
  }

  public void setSubSections(java.util.List<Section> subSections) {
    this.subSections = JsonNullable.<java.util.List<Section>>of(subSections);
  }


  /**
   * Return true if this Section object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.metadata, section.metadata) &&
        equalsNullable(this.title, section.title) &&
        equalsNullable(this.content, section.content) &&
        equalsNullable(this.subSections, section.subSections);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, hashCodeNullable(title), hashCodeNullable(content), hashCodeNullable(subSections));
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
    sb.append("class Section {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    subSections: ").append(toIndentedString(subSections)).append("\n");
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

