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
import com.factset.sdk.OpenRisk.models.RiskExclusionInfoExclusionInfo;
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
 * Risk model uncovered security reason
 */
@ApiModel(description = "Risk model uncovered security reason")
@JsonPropertyOrder({
  RiskExclusionInfo.JSON_PROPERTY_COVERED,
  RiskExclusionInfo.JSON_PROPERTY_EXCLUSION_INFO,
  RiskExclusionInfo.JSON_PROPERTY_MODEL_CLASS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RiskExclusionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COVERED = "covered";
  private Boolean covered;

  public static final String JSON_PROPERTY_EXCLUSION_INFO = "exclusionInfo";
  private RiskExclusionInfoExclusionInfo exclusionInfo;

  /**
   * **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
   */
  public enum ModelClassEnum {
    UNKNOWN("Unknown"),
    
    COMPOSITEASSET("CompositeAsset");

    private String value;

    ModelClassEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModelClassEnum fromValue(String value) {
      for (ModelClassEnum b : ModelClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODEL_CLASS = "modelClass";
  private ModelClassEnum modelClass;

  public RiskExclusionInfo() { 
  }

  @JsonCreator
  public RiskExclusionInfo(
    @JsonProperty(value=JSON_PROPERTY_COVERED, required=true) Boolean covered, 
    @JsonProperty(value=JSON_PROPERTY_EXCLUSION_INFO, required=true) RiskExclusionInfoExclusionInfo exclusionInfo, 
    @JsonProperty(value=JSON_PROPERTY_MODEL_CLASS, required=true) ModelClassEnum modelClass
  ) {
    this();
    this.covered = covered;
    this.exclusionInfo = exclusionInfo;
    this.modelClass = modelClass;
  }

  public RiskExclusionInfo covered(Boolean covered) {
    this.covered = covered;
    return this;
  }

   /**
   * Coverage flag. The value will always be false to indicate the security is excluded.
   * @return covered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Coverage flag. The value will always be false to indicate the security is excluded.")
  @JsonProperty(JSON_PROPERTY_COVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCovered() {
    return covered;
  }


  @JsonProperty(JSON_PROPERTY_COVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCovered(Boolean covered) {
    this.covered = covered;
  }


  public RiskExclusionInfo exclusionInfo(RiskExclusionInfoExclusionInfo exclusionInfo) {
    this.exclusionInfo = exclusionInfo;
    return this;
  }

   /**
   * Get exclusionInfo
   * @return exclusionInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUSION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RiskExclusionInfoExclusionInfo getExclusionInfo() {
    return exclusionInfo;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExclusionInfo(RiskExclusionInfoExclusionInfo exclusionInfo) {
    this.exclusionInfo = exclusionInfo;
  }


  public RiskExclusionInfo modelClass(ModelClassEnum modelClass) {
    this.modelClass = modelClass;
    return this;
  }

   /**
   * **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
   * @return modelClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "**(since 1.19.0)** Security asset classification according to the risk model, if available and determinable")
  @JsonProperty(JSON_PROPERTY_MODEL_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModelClassEnum getModelClass() {
    return modelClass;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelClass(ModelClassEnum modelClass) {
    this.modelClass = modelClass;
  }


  /**
   * Return true if this RiskExclusionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskExclusionInfo riskExclusionInfo = (RiskExclusionInfo) o;
    return Objects.equals(this.covered, riskExclusionInfo.covered) &&
        Objects.equals(this.exclusionInfo, riskExclusionInfo.exclusionInfo) &&
        Objects.equals(this.modelClass, riskExclusionInfo.modelClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(covered, exclusionInfo, modelClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskExclusionInfo {\n");
    sb.append("    covered: ").append(toIndentedString(covered)).append("\n");
    sb.append("    exclusionInfo: ").append(toIndentedString(exclusionInfo)).append("\n");
    sb.append("    modelClass: ").append(toIndentedString(modelClass)).append("\n");
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

