/*
 * FactSet Capital Structure Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CapitalStructureReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.CapitalStructureReportBuilder.models.InterimAmtOutChgInterimAmtOutChg;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.CapitalStructureReportBuilder.JSON;


/**
 * InterimAmtOutChg
 */
@JsonPropertyOrder({
  InterimAmtOutChg.JSON_PROPERTY_INTERIM_AMT_OUT_CHG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InterimAmtOutChg implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTERIM_AMT_OUT_CHG = "interimAmtOutChg";
  private InterimAmtOutChgInterimAmtOutChg interimAmtOutChg;

  public InterimAmtOutChg() { 
  }

  public InterimAmtOutChg interimAmtOutChg(InterimAmtOutChgInterimAmtOutChg interimAmtOutChg) {
    this.interimAmtOutChg = interimAmtOutChg;
    return this;
  }

   /**
   * Get interimAmtOutChg
   * @return interimAmtOutChg
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERIM_AMT_OUT_CHG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterimAmtOutChgInterimAmtOutChg getInterimAmtOutChg() {
    return interimAmtOutChg;
  }


  @JsonProperty(JSON_PROPERTY_INTERIM_AMT_OUT_CHG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterimAmtOutChg(InterimAmtOutChgInterimAmtOutChg interimAmtOutChg) {
    this.interimAmtOutChg = interimAmtOutChg;
  }


  /**
   * Return true if this interimAmtOutChg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterimAmtOutChg interimAmtOutChg = (InterimAmtOutChg) o;
    return Objects.equals(this.interimAmtOutChg, interimAmtOutChg.interimAmtOutChg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interimAmtOutChg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterimAmtOutChg {\n");
    sb.append("    interimAmtOutChg: ").append(toIndentedString(interimAmtOutChg)).append("\n");
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

