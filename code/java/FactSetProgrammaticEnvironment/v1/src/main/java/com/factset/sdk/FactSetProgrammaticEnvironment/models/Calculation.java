/*
 * FPE API
 * FactSet Programmatic Environment (FPE) API is an API for users to interact with FPE programmatically, streamlining path from research to production.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetProgrammaticEnvironment.models;

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
import com.factset.sdk.FactSetProgrammaticEnvironment.JSON;


/**
 * Calculation
 */
@JsonPropertyOrder({
  Calculation.JSON_PROPERTY_SCRIPT,
  Calculation.JSON_PROPERTY_NOTEBOOK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Calculation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCRIPT = "script";
  private String script;

  public static final String JSON_PROPERTY_NOTEBOOK = "notebook";
  private String notebook;

  public Calculation() { 
  }

  public Calculation script(String script) {
    this.script = script;
    return this;
  }

   /**
   * The python script that will be executed
   * @return script
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The python script that will be executed")
  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScript() {
    return script;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScript(String script) {
    this.script = script;
  }


  public Calculation notebook(String notebook) {
    this.notebook = notebook;
    return this;
  }

   /**
   * Notebook file to be executed. Only notebooks in the Client directory are currently supported.
   * @return notebook
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Notebook file to be executed. Only notebooks in the Client directory are currently supported.")
  @JsonProperty(JSON_PROPERTY_NOTEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotebook() {
    return notebook;
  }


  @JsonProperty(JSON_PROPERTY_NOTEBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotebook(String notebook) {
    this.notebook = notebook;
  }


  /**
   * Return true if this Calculation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calculation calculation = (Calculation) o;
    return Objects.equals(this.script, calculation.script) &&
        Objects.equals(this.notebook, calculation.notebook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, notebook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calculation {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    notebook: ").append(toIndentedString(notebook)).append("\n");
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

