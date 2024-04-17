/*
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OFDB.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OFDB.models.AddDatesContent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OFDB.JSON;


/**
 * UpdateDatesData
 */
@JsonPropertyOrder({
  UpdateDatesData.JSON_PROPERTY_DATE,
  UpdateDatesData.JSON_PROPERTY_CONTENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UpdateDatesData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private Integer date;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private java.util.List<AddDatesContent> content = null;

  public UpdateDatesData() { 
  }

  public UpdateDatesData date(Integer date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(Integer date) {
    this.date = date;
  }


  public UpdateDatesData content(java.util.List<AddDatesContent> content) {
    this.content = content;
    return this;
  }

  public UpdateDatesData addContentItem(AddDatesContent contentItem) {
    if (this.content == null) {
      this.content = new java.util.ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<AddDatesContent> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(java.util.List<AddDatesContent> content) {
    this.content = content;
  }


  /**
   * Return true if this UpdateDates_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDatesData updateDatesData = (UpdateDatesData) o;
    return Objects.equals(this.date, updateDatesData.date) &&
        Objects.equals(this.content, updateDatesData.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDatesData {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

