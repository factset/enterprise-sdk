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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
import com.factset.sdk.FactSetRBICS.JSON;


/**
 * EntityFocus
 */
@JsonPropertyOrder({
  EntityFocus.JSON_PROPERTY_REQUEST_ID,
  EntityFocus.JSON_PROPERTY_FSYM_ID,
  EntityFocus.JSON_PROPERTY_FIRST_DATE,
  EntityFocus.JSON_PROPERTY_LAST_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityFocus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_FIRST_DATE = "firstDate";
  private String firstDate;

  public static final String JSON_PROPERTY_LAST_DATE = "lastDate";
  private String lastDate;

  public EntityFocus() { 
  }

  @JsonCreator
  public EntityFocus(
    @JsonProperty(value=JSON_PROPERTY_REQUEST_ID, required=true) String requestId, 
    @JsonProperty(value=JSON_PROPERTY_FSYM_ID, required=true) String fsymId, 
    @JsonProperty(value=JSON_PROPERTY_FIRST_DATE, required=true) String firstDate, 
    @JsonProperty(value=JSON_PROPERTY_LAST_DATE, required=true) String lastDate
  ) {
    this();
    this.requestId = requestId;
    this.fsymId = fsymId;
    this.firstDate = firstDate;
    this.lastDate = lastDate;
  }

  public EntityFocus requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Company identifier used in request.
   * @return requestId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "AAPL", required = true, value = "Company identifier used in request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public EntityFocus fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Company identifier being classified.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "000C7F-E", required = true, value = "FactSet Company identifier being classified.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public EntityFocus firstDate(String firstDate) {
    this.firstDate = firstDate;
    return this;
  }

   /**
   * First date of the classification.
   * @return firstDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2008-08-26T00:00:00.000", required = true, value = "First date of the classification.")
  @JsonProperty(JSON_PROPERTY_FIRST_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstDate() {
    return firstDate;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstDate(String firstDate) {
    this.firstDate = firstDate;
  }


  public EntityFocus lastDate(String lastDate) {
    this.lastDate = lastDate;
    return this;
  }

   /**
   * Date when the classification became no longer valid.
   * @return lastDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2016-09-07T14:00:00.000", required = true, value = "Date when the classification became no longer valid.")
  @JsonProperty(JSON_PROPERTY_LAST_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastDate() {
    return lastDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastDate(String lastDate) {
    this.lastDate = lastDate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public EntityFocus putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this entityFocus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityFocus entityFocus = (EntityFocus) o;
    return Objects.equals(this.requestId, entityFocus.requestId) &&
        Objects.equals(this.fsymId, entityFocus.fsymId) &&
        Objects.equals(this.firstDate, entityFocus.firstDate) &&
        Objects.equals(this.lastDate, entityFocus.lastDate)&&
        Objects.equals(this.additionalProperties, entityFocus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, firstDate, lastDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFocus {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

