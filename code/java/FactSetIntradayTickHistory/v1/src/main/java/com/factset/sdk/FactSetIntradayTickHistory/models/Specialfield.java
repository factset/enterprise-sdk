/*
 * Tick History
 *  <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetIntradayTickHistory.models;

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
import com.factset.sdk.FactSetIntradayTickHistory.JSON;


/**
 * Specialfield
 */
@JsonPropertyOrder({
  Specialfield.JSON_PROPERTY_N_F,
  Specialfield.JSON_PROPERTY_N_A
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Specialfield implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_N_F = "NF";
  private String NF;

  public static final String JSON_PROPERTY_N_A = "NA";
  private Object NA;

  public Specialfield() { 
  }

  public Specialfield NF(String NF) {
    this.NF = NF;
    return this;
  }

   /**
   * **#NF#** - Not found. The requested symbol could not be found by the service.
   * @return NF
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**#NF#** - Not found. The requested symbol could not be found by the service.")
  @JsonProperty(JSON_PROPERTY_N_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNF() {
    return NF;
  }


  @JsonProperty(JSON_PROPERTY_N_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNF(String NF) {
    this.NF = NF;
  }


  public Specialfield NA(Object NA) {
    this.NA = NA;
    return this;
  }

   /**
   * **#NA#** - Not Applicable. The requested field could not be found for the requested symbol. This usually means that the field is not applicable for this type of record.
   * @return NA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**#NA#** - Not Applicable. The requested field could not be found for the requested symbol. This usually means that the field is not applicable for this type of record.")
  @JsonProperty(JSON_PROPERTY_N_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getNA() {
    return NA;
  }


  @JsonProperty(JSON_PROPERTY_N_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNA(Object NA) {
    this.NA = NA;
  }


  /**
   * Return true if this specialfield object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Specialfield specialfield = (Specialfield) o;
    return Objects.equals(this.NF, specialfield.NF) &&
        Objects.equals(this.NA, specialfield.NA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NF, NA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specialfield {\n");
    sb.append("    NF: ").append(toIndentedString(NF)).append("\n");
    sb.append("    NA: ").append(toIndentedString(NA)).append("\n");
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
