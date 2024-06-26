/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ETFProfileandPrices.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Beta.
 */
@ApiModel(description = "Beta.")
@JsonPropertyOrder({
  InlineResponse20012DataBeta.JSON_PROPERTY_VALUE,
  InlineResponse20012DataBeta.JSON_PROPERTY_UP,
  InlineResponse20012DataBeta.JSON_PROPERTY_DOWN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20012DataBeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_UP = "up";
  private BigDecimal up;

  public static final String JSON_PROPERTY_DOWN = "down";
  private BigDecimal down;

  public InlineResponse20012DataBeta() { 
  }

  public InlineResponse20012DataBeta value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The sensitivity of the returns of the fund to the movement of the FactSet designated &#39;segment benchmark&#39;. Beta of 1.0 means magnitude of fund returns equals that of segment benchmark returns. Available for the regions: US.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The sensitivity of the returns of the fund to the movement of the FactSet designated 'segment benchmark'. Beta of 1.0 means magnitude of fund returns equals that of segment benchmark returns. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public InlineResponse20012DataBeta up(BigDecimal up) {
    this.up = up;
    return this;
  }

   /**
   * A comparison of a fund&#39;s return to the FactSet-designated benchmark&#39;s for days when the benchmark is up. Ideally down beta is less than or equal to overall beta. Available for the regions: US.
   * @return up
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A comparison of a fund's return to the FactSet-designated benchmark's for days when the benchmark is up. Ideally down beta is less than or equal to overall beta. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUp() {
    return up;
  }


  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUp(BigDecimal up) {
    this.up = up;
  }


  public InlineResponse20012DataBeta down(BigDecimal down) {
    this.down = down;
    return this;
  }

   /**
   * A comparison of a fund&#39;s return to the FactSet-designated benchmark&#39;s for days when the benchmark is down. Ideally down beta is less than or equal to overall beta. Available for the regions: US.
   * @return down
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A comparison of a fund's return to the FactSet-designated benchmark's for days when the benchmark is down. Ideally down beta is less than or equal to overall beta. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDown() {
    return down;
  }


  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDown(BigDecimal down) {
    this.down = down;
  }


  /**
   * Return true if this inline_response_200_12_data_beta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DataBeta inlineResponse20012DataBeta = (InlineResponse20012DataBeta) o;
    return Objects.equals(this.value, inlineResponse20012DataBeta.value) &&
        Objects.equals(this.up, inlineResponse20012DataBeta.up) &&
        Objects.equals(this.down, inlineResponse20012DataBeta.down);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, up, down);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DataBeta {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
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

