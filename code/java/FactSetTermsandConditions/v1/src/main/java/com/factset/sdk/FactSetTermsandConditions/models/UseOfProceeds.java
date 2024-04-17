/*
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTermsandConditions.models;

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
import com.factset.sdk.FactSetTermsandConditions.JSON;


/**
 * Use of Proceeds for a Fixed Income security.
 */
@ApiModel(description = "Use of Proceeds for a Fixed Income security.")
@JsonPropertyOrder({
  UseOfProceeds.JSON_PROPERTY_REQUEST_ID,
  UseOfProceeds.JSON_PROPERTY_FSYM_ID,
  UseOfProceeds.JSON_PROPERTY_USE_OF_PROCEEDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class UseOfProceeds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_USE_OF_PROCEEDS = "useOfProceeds";
  private String useOfProceeds;

  public UseOfProceeds() { 
  }

  public UseOfProceeds requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Security identifier used in the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Security identifier used in the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public UseOfProceeds fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Permanent Security Identifier.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Security Identifier.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public UseOfProceeds useOfProceeds(String useOfProceeds) {
    this.useOfProceeds = useOfProceeds;
    return this;
  }

   /**
   * Use of proceeds.
   * @return useOfProceeds
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Use of proceeds.")
  @JsonProperty(JSON_PROPERTY_USE_OF_PROCEEDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUseOfProceeds() {
    return useOfProceeds;
  }


  @JsonProperty(JSON_PROPERTY_USE_OF_PROCEEDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOfProceeds(String useOfProceeds) {
    this.useOfProceeds = useOfProceeds;
  }


  /**
   * Return true if this useOfProceeds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseOfProceeds useOfProceeds = (UseOfProceeds) o;
    return Objects.equals(this.requestId, useOfProceeds.requestId) &&
        Objects.equals(this.fsymId, useOfProceeds.fsymId) &&
        Objects.equals(this.useOfProceeds, useOfProceeds.useOfProceeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, useOfProceeds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseOfProceeds {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    useOfProceeds: ").append(toIndentedString(useOfProceeds)).append("\n");
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

