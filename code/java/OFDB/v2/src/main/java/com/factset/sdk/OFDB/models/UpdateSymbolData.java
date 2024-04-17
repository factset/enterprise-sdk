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
import com.factset.sdk.OFDB.models.UpdateSymbolContent;
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
 * UpdateSymbolData
 */
@JsonPropertyOrder({
  UpdateSymbolData.JSON_PROPERTY_CONTENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UpdateSymbolData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private java.util.List<UpdateSymbolContent> content = null;

  public UpdateSymbolData() { 
  }

  public UpdateSymbolData content(java.util.List<UpdateSymbolContent> content) {
    this.content = content;
    return this;
  }

  public UpdateSymbolData addContentItem(UpdateSymbolContent contentItem) {
    if (this.content == null) {
      this.content = new java.util.ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * date must be provided in the case of a 3d ofdb with at least one iterative field
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "date must be provided in the case of a 3d ofdb with at least one iterative field")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<UpdateSymbolContent> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(java.util.List<UpdateSymbolContent> content) {
    this.content = content;
  }


  /**
   * Return true if this UpdateSymbol_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSymbolData updateSymbolData = (UpdateSymbolData) o;
    return Objects.equals(this.content, updateSymbolData.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSymbolData {\n");
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

