/*
 * TickHistory
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTickHistory.models;

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
import com.factset.sdk.FactSetTickHistory.JSON;


/**
 * If the value is true, it indicates additional results are available. False represents that this is the last set of results for this request.
 */
@ApiModel(description = "If the value is true, it indicates additional results are available. False represents that this is the last set of results for this request.")
@JsonPropertyOrder({
  Partial.JSON_PROPERTY_IS_PARTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Partial implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_PARTIAL = "isPartial";
  private Boolean isPartial;

  public Partial() { 
  }

  public Partial isPartial(Boolean isPartial) {
    this.isPartial = isPartial;
    return this;
  }

   /**
   * Get isPartial
   * @return isPartial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPartial() {
    return isPartial;
  }


  @JsonProperty(JSON_PROPERTY_IS_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPartial(Boolean isPartial) {
    this.isPartial = isPartial;
  }


  /**
   * Return true if this partial object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partial partial = (Partial) o;
    return Objects.equals(this.isPartial, partial.isPartial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPartial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partial {\n");
    sb.append("    isPartial: ").append(toIndentedString(isPartial)).append("\n");
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

