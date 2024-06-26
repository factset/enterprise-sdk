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
 * Covenant Detail for a Fixed Income security.
 */
@ApiModel(description = "Covenant Detail for a Fixed Income security.")
@JsonPropertyOrder({
  CovenantDetail.JSON_PROPERTY_REQUEST_ID,
  CovenantDetail.JSON_PROPERTY_FSYM_ID,
  CovenantDetail.JSON_PROPERTY_FIN_COV_TYPE,
  CovenantDetail.JSON_PROPERTY_FIN_COV_DESC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CovenantDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_FIN_COV_TYPE = "finCovType";
  private String finCovType;

  public static final String JSON_PROPERTY_FIN_COV_DESC = "finCovDesc";
  private String finCovDesc;

  public CovenantDetail() { 
  }

  public CovenantDetail requestId(String requestId) {
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


  public CovenantDetail fsymId(String fsymId) {
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


  public CovenantDetail finCovType(String finCovType) {
    this.finCovType = finCovType;
    return this;
  }

   /**
   * Covenant Type
   * @return finCovType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Covenant Type")
  @JsonProperty(JSON_PROPERTY_FIN_COV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinCovType() {
    return finCovType;
  }


  @JsonProperty(JSON_PROPERTY_FIN_COV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinCovType(String finCovType) {
    this.finCovType = finCovType;
  }


  public CovenantDetail finCovDesc(String finCovDesc) {
    this.finCovDesc = finCovDesc;
    return this;
  }

   /**
   * Description
   * @return finCovDesc
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Description")
  @JsonProperty(JSON_PROPERTY_FIN_COV_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinCovDesc() {
    return finCovDesc;
  }


  @JsonProperty(JSON_PROPERTY_FIN_COV_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinCovDesc(String finCovDesc) {
    this.finCovDesc = finCovDesc;
  }


  /**
   * Return true if this covenantDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovenantDetail covenantDetail = (CovenantDetail) o;
    return Objects.equals(this.requestId, covenantDetail.requestId) &&
        Objects.equals(this.fsymId, covenantDetail.fsymId) &&
        Objects.equals(this.finCovType, covenantDetail.finCovType) &&
        Objects.equals(this.finCovDesc, covenantDetail.finCovDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, finCovType, finCovDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovenantDetail {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    finCovType: ").append(toIndentedString(finCovType)).append("\n");
    sb.append("    finCovDesc: ").append(toIndentedString(finCovDesc)).append("\n");
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

