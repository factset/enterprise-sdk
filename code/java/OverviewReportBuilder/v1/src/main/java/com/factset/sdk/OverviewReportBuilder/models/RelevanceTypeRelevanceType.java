/*
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.RelevanceTypeRelevanceTypeC;
import com.factset.sdk.OverviewReportBuilder.models.RelevanceTypeRelevanceTypeP;
import com.factset.sdk.OverviewReportBuilder.models.RelevanceTypeRelevanceTypeS;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;


/**
 * Relevance type of company. Only applicable in /supply-chain-relationship. 
 */
@ApiModel(description = "Relevance type of company. Only applicable in /supply-chain-relationship. ")
@JsonPropertyOrder({
  RelevanceTypeRelevanceType.JSON_PROPERTY_C,
  RelevanceTypeRelevanceType.JSON_PROPERTY_P,
  RelevanceTypeRelevanceType.JSON_PROPERTY_S
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RelevanceTypeRelevanceType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_C = "C";
  private RelevanceTypeRelevanceTypeC C;

  public static final String JSON_PROPERTY_P = "P";
  private RelevanceTypeRelevanceTypeP P;

  public static final String JSON_PROPERTY_S = "S";
  private RelevanceTypeRelevanceTypeS S;

  public RelevanceTypeRelevanceType() { 
  }

  public RelevanceTypeRelevanceType C(RelevanceTypeRelevanceTypeC C) {
    this.C = C;
    return this;
  }

   /**
   * Get C
   * @return C
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelevanceTypeRelevanceTypeC getC() {
    return C;
  }


  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC(RelevanceTypeRelevanceTypeC C) {
    this.C = C;
  }


  public RelevanceTypeRelevanceType P(RelevanceTypeRelevanceTypeP P) {
    this.P = P;
    return this;
  }

   /**
   * Get P
   * @return P
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelevanceTypeRelevanceTypeP getP() {
    return P;
  }


  @JsonProperty(JSON_PROPERTY_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP(RelevanceTypeRelevanceTypeP P) {
    this.P = P;
  }


  public RelevanceTypeRelevanceType S(RelevanceTypeRelevanceTypeS S) {
    this.S = S;
    return this;
  }

   /**
   * Get S
   * @return S
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelevanceTypeRelevanceTypeS getS() {
    return S;
  }


  @JsonProperty(JSON_PROPERTY_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setS(RelevanceTypeRelevanceTypeS S) {
    this.S = S;
  }


  /**
   * Return true if this relevanceType_relevanceType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelevanceTypeRelevanceType relevanceTypeRelevanceType = (RelevanceTypeRelevanceType) o;
    return Objects.equals(this.C, relevanceTypeRelevanceType.C) &&
        Objects.equals(this.P, relevanceTypeRelevanceType.P) &&
        Objects.equals(this.S, relevanceTypeRelevanceType.S);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C, P, S);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevanceTypeRelevanceType {\n");
    sb.append("    C: ").append(toIndentedString(C)).append("\n");
    sb.append("    P: ").append(toIndentedString(P)).append("\n");
    sb.append("    S: ").append(toIndentedString(S)).append("\n");
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

