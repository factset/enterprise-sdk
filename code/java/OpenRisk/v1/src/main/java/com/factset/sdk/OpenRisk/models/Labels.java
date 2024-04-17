/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.GroupsLabels;
import com.factset.sdk.OpenRisk.models.LabelsFactor;
import com.factset.sdk.OpenRisk.models.LabelsSecurity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * Labeling and index information to be able to reconstruct the calculated data results to the provided inputs from the request. Only contains items relevant to results; will not be present at all if all calculation-levels are &#39;Portfolio&#39;.
 */
@ApiModel(description = "Labeling and index information to be able to reconstruct the calculated data results to the provided inputs from the request. Only contains items relevant to results; will not be present at all if all calculation-levels are 'Portfolio'.")
@JsonPropertyOrder({
  Labels.JSON_PROPERTY_SECURITY,
  Labels.JSON_PROPERTY_FACTOR,
  Labels.JSON_PROPERTY_SECURITY_GROUP,
  Labels.JSON_PROPERTY_FACTOR_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Labels implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITY = "security";
  private LabelsSecurity security;

  public static final String JSON_PROPERTY_FACTOR = "factor";
  private LabelsFactor factor;

  public static final String JSON_PROPERTY_SECURITY_GROUP = "securityGroup";
  private GroupsLabels securityGroup;

  public static final String JSON_PROPERTY_FACTOR_GROUP = "factorGroup";
  private GroupsLabels factorGroup;

  public Labels() { 
  }

  public Labels security(LabelsSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelsSecurity getSecurity() {
    return security;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurity(LabelsSecurity security) {
    this.security = security;
  }


  public Labels factor(LabelsFactor factor) {
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelsFactor getFactor() {
    return factor;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactor(LabelsFactor factor) {
    this.factor = factor;
  }


  public Labels securityGroup(GroupsLabels securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupsLabels getSecurityGroup() {
    return securityGroup;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroup(GroupsLabels securityGroup) {
    this.securityGroup = securityGroup;
  }


  public Labels factorGroup(GroupsLabels factorGroup) {
    this.factorGroup = factorGroup;
    return this;
  }

   /**
   * Get factorGroup
   * @return factorGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupsLabels getFactorGroup() {
    return factorGroup;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorGroup(GroupsLabels factorGroup) {
    this.factorGroup = factorGroup;
  }


  /**
   * Return true if this Labels object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Labels labels = (Labels) o;
    return Objects.equals(this.security, labels.security) &&
        Objects.equals(this.factor, labels.factor) &&
        Objects.equals(this.securityGroup, labels.securityGroup) &&
        Objects.equals(this.factorGroup, labels.factorGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, factor, securityGroup, factorGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Labels {\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    factorGroup: ").append(toIndentedString(factorGroup)).append("\n");
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

