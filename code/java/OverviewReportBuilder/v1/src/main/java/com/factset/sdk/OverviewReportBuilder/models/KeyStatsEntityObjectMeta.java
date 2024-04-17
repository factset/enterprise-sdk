/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectMetaSources;
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
 * KeyStatsEntityObjectMeta
 */
@JsonPropertyOrder({
  KeyStatsEntityObjectMeta.JSON_PROPERTY_SOURCES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class KeyStatsEntityObjectMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private KeyStatsEntityObjectMetaSources sources;

  public KeyStatsEntityObjectMeta() { 
  }

  public KeyStatsEntityObjectMeta sources(KeyStatsEntityObjectMetaSources sources) {
    this.sources = sources;
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyStatsEntityObjectMetaSources getSources() {
    return sources;
  }


  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSources(KeyStatsEntityObjectMetaSources sources) {
    this.sources = sources;
  }


  /**
   * Return true if this KeyStatsEntityObject_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyStatsEntityObjectMeta keyStatsEntityObjectMeta = (KeyStatsEntityObjectMeta) o;
    return Objects.equals(this.sources, keyStatsEntityObjectMeta.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStatsEntityObjectMeta {\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

