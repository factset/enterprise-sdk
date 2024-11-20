/*
 * FactSet RIBCS
 * FactSet Revere Business Industry Classification System (RBICS) is a comprehensive structured taxonomy to classify companies by what they primarily do. It delivers a granular view for investors by classifying companies using a bottom-up approach according to the products and services they provide. By combining this approach with a top-level grouping based on companies' behavior similarities and stock co-movement, FactSet RBICS delivers unprecedented precision for 1,400+ sector groups.  RBICS Focus is a six level classification which highlights the companys main business. It is based on the company business line/s that stand for majority of a the revenue that the company generates. Updated monthly. For more details, visit [Online Assitant Page #20710](https://oa.apps.factset.com/pages/20710).<p><b>Rate limit is set to 40 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetRBICS.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetRBICS.models.EntityFocus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetRBICS.JSON;


/**
 * Entity Focus Response
 */
@ApiModel(description = "Entity Focus Response")
@JsonPropertyOrder({
  EntityFocusResponse.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityFocusResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<EntityFocus> data = null;

  public EntityFocusResponse() { 
  }

  public EntityFocusResponse data(java.util.List<EntityFocus> data) {
    this.data = data;
    return this;
  }

  public EntityFocusResponse addDataItem(EntityFocus dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of Entity Focus Objects
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Array of Entity Focus Objects")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<EntityFocus> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<EntityFocus> data) {
    this.data = data;
  }


  /**
   * Return true if this entityFocusResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityFocusResponse entityFocusResponse = (EntityFocusResponse) o;
    return Objects.equals(this.data, entityFocusResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFocusResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

