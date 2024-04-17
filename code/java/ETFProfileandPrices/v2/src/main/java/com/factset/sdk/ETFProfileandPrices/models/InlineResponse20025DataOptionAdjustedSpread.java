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
 * Option-adjusted spread (OAS) value of the ETP; measurement of the yield spread calculated after removing any embedded options providing users with a spread of an option-free bond.
 */
@ApiModel(description = "Option-adjusted spread (OAS) value of the ETP; measurement of the yield spread calculated after removing any embedded options providing users with a spread of an option-free bond.")
@JsonPropertyOrder({
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE0,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE0_TO100,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE100_TO200,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE200_TO300,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE300_TO400,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE400_TO500,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE500_TO600,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE600_TO700,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE700_TO800,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE800_TO900,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE900_TO1000,
  InlineResponse20025DataOptionAdjustedSpread.JSON_PROPERTY_RANGE1000_PLUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20025DataOptionAdjustedSpread implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RANGE0 = "range0";
  private BigDecimal range0;

  public static final String JSON_PROPERTY_RANGE0_TO100 = "range0To100";
  private BigDecimal range0To100;

  public static final String JSON_PROPERTY_RANGE100_TO200 = "range100To200";
  private BigDecimal range100To200;

  public static final String JSON_PROPERTY_RANGE200_TO300 = "range200To300";
  private BigDecimal range200To300;

  public static final String JSON_PROPERTY_RANGE300_TO400 = "range300To400";
  private BigDecimal range300To400;

  public static final String JSON_PROPERTY_RANGE400_TO500 = "range400To500";
  private BigDecimal range400To500;

  public static final String JSON_PROPERTY_RANGE500_TO600 = "range500To600";
  private BigDecimal range500To600;

  public static final String JSON_PROPERTY_RANGE600_TO700 = "range600To700";
  private BigDecimal range600To700;

  public static final String JSON_PROPERTY_RANGE700_TO800 = "range700To800";
  private BigDecimal range700To800;

  public static final String JSON_PROPERTY_RANGE800_TO900 = "range800To900";
  private BigDecimal range800To900;

  public static final String JSON_PROPERTY_RANGE900_TO1000 = "range900To1000";
  private BigDecimal range900To1000;

  public static final String JSON_PROPERTY_RANGE1000_PLUS = "range1000Plus";
  private BigDecimal range1000Plus;

  public InlineResponse20025DataOptionAdjustedSpread() { 
  }

  public InlineResponse20025DataOptionAdjustedSpread range0(BigDecimal range0) {
    this.range0 = range0;
    return this;
  }

   /**
   * OAS value of the ETP.
   * @return range0
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS value of the ETP.")
  @JsonProperty(JSON_PROPERTY_RANGE0)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange0() {
    return range0;
  }


  @JsonProperty(JSON_PROPERTY_RANGE0)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange0(BigDecimal range0) {
    this.range0 = range0;
  }


  public InlineResponse20025DataOptionAdjustedSpread range0To100(BigDecimal range0To100) {
    this.range0To100 = range0To100;
    return this;
  }

   /**
   * OAS weight of the ETP ranges between 0 to 99.9.
   * @return range0To100
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETP ranges between 0 to 99.9.")
  @JsonProperty(JSON_PROPERTY_RANGE0_TO100)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange0To100() {
    return range0To100;
  }


  @JsonProperty(JSON_PROPERTY_RANGE0_TO100)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange0To100(BigDecimal range0To100) {
    this.range0To100 = range0To100;
  }


  public InlineResponse20025DataOptionAdjustedSpread range100To200(BigDecimal range100To200) {
    this.range100To200 = range100To200;
    return this;
  }

   /**
   * OAS weight of the ETP ranges between 100 to 199.99.
   * @return range100To200
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETP ranges between 100 to 199.99.")
  @JsonProperty(JSON_PROPERTY_RANGE100_TO200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange100To200() {
    return range100To200;
  }


  @JsonProperty(JSON_PROPERTY_RANGE100_TO200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange100To200(BigDecimal range100To200) {
    this.range100To200 = range100To200;
  }


  public InlineResponse20025DataOptionAdjustedSpread range200To300(BigDecimal range200To300) {
    this.range200To300 = range200To300;
    return this;
  }

   /**
   * OAS weight of the ETP ranges between 200 to 299.99.
   * @return range200To300
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETP ranges between 200 to 299.99.")
  @JsonProperty(JSON_PROPERTY_RANGE200_TO300)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange200To300() {
    return range200To300;
  }


  @JsonProperty(JSON_PROPERTY_RANGE200_TO300)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange200To300(BigDecimal range200To300) {
    this.range200To300 = range200To300;
  }


  public InlineResponse20025DataOptionAdjustedSpread range300To400(BigDecimal range300To400) {
    this.range300To400 = range300To400;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 300 to 399.99.
   * @return range300To400
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 300 to 399.99.")
  @JsonProperty(JSON_PROPERTY_RANGE300_TO400)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange300To400() {
    return range300To400;
  }


  @JsonProperty(JSON_PROPERTY_RANGE300_TO400)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange300To400(BigDecimal range300To400) {
    this.range300To400 = range300To400;
  }


  public InlineResponse20025DataOptionAdjustedSpread range400To500(BigDecimal range400To500) {
    this.range400To500 = range400To500;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 400 to 499.99.
   * @return range400To500
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 400 to 499.99.")
  @JsonProperty(JSON_PROPERTY_RANGE400_TO500)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange400To500() {
    return range400To500;
  }


  @JsonProperty(JSON_PROPERTY_RANGE400_TO500)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange400To500(BigDecimal range400To500) {
    this.range400To500 = range400To500;
  }


  public InlineResponse20025DataOptionAdjustedSpread range500To600(BigDecimal range500To600) {
    this.range500To600 = range500To600;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 500 to 599.99.
   * @return range500To600
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 500 to 599.99.")
  @JsonProperty(JSON_PROPERTY_RANGE500_TO600)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange500To600() {
    return range500To600;
  }


  @JsonProperty(JSON_PROPERTY_RANGE500_TO600)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange500To600(BigDecimal range500To600) {
    this.range500To600 = range500To600;
  }


  public InlineResponse20025DataOptionAdjustedSpread range600To700(BigDecimal range600To700) {
    this.range600To700 = range600To700;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 600 to 699.99.
   * @return range600To700
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 600 to 699.99.")
  @JsonProperty(JSON_PROPERTY_RANGE600_TO700)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange600To700() {
    return range600To700;
  }


  @JsonProperty(JSON_PROPERTY_RANGE600_TO700)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange600To700(BigDecimal range600To700) {
    this.range600To700 = range600To700;
  }


  public InlineResponse20025DataOptionAdjustedSpread range700To800(BigDecimal range700To800) {
    this.range700To800 = range700To800;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 700 to 799.99.
   * @return range700To800
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 700 to 799.99.")
  @JsonProperty(JSON_PROPERTY_RANGE700_TO800)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange700To800() {
    return range700To800;
  }


  @JsonProperty(JSON_PROPERTY_RANGE700_TO800)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange700To800(BigDecimal range700To800) {
    this.range700To800 = range700To800;
  }


  public InlineResponse20025DataOptionAdjustedSpread range800To900(BigDecimal range800To900) {
    this.range800To900 = range800To900;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 800 to 899.99.
   * @return range800To900
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 800 to 899.99.")
  @JsonProperty(JSON_PROPERTY_RANGE800_TO900)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange800To900() {
    return range800To900;
  }


  @JsonProperty(JSON_PROPERTY_RANGE800_TO900)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange800To900(BigDecimal range800To900) {
    this.range800To900 = range800To900;
  }


  public InlineResponse20025DataOptionAdjustedSpread range900To1000(BigDecimal range900To1000) {
    this.range900To1000 = range900To1000;
    return this;
  }

   /**
   * OAS weight of the ETF ranges between 900 to 999.99.
   * @return range900To1000
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges between 900 to 999.99.")
  @JsonProperty(JSON_PROPERTY_RANGE900_TO1000)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange900To1000() {
    return range900To1000;
  }


  @JsonProperty(JSON_PROPERTY_RANGE900_TO1000)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange900To1000(BigDecimal range900To1000) {
    this.range900To1000 = range900To1000;
  }


  public InlineResponse20025DataOptionAdjustedSpread range1000Plus(BigDecimal range1000Plus) {
    this.range1000Plus = range1000Plus;
    return this;
  }

   /**
   * OAS weight of the ETF ranges above 1000.
   * @return range1000Plus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "OAS weight of the ETF ranges above 1000.")
  @JsonProperty(JSON_PROPERTY_RANGE1000_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRange1000Plus() {
    return range1000Plus;
  }


  @JsonProperty(JSON_PROPERTY_RANGE1000_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange1000Plus(BigDecimal range1000Plus) {
    this.range1000Plus = range1000Plus;
  }


  /**
   * Return true if this inline_response_200_25_data_optionAdjustedSpread object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025DataOptionAdjustedSpread inlineResponse20025DataOptionAdjustedSpread = (InlineResponse20025DataOptionAdjustedSpread) o;
    return Objects.equals(this.range0, inlineResponse20025DataOptionAdjustedSpread.range0) &&
        Objects.equals(this.range0To100, inlineResponse20025DataOptionAdjustedSpread.range0To100) &&
        Objects.equals(this.range100To200, inlineResponse20025DataOptionAdjustedSpread.range100To200) &&
        Objects.equals(this.range200To300, inlineResponse20025DataOptionAdjustedSpread.range200To300) &&
        Objects.equals(this.range300To400, inlineResponse20025DataOptionAdjustedSpread.range300To400) &&
        Objects.equals(this.range400To500, inlineResponse20025DataOptionAdjustedSpread.range400To500) &&
        Objects.equals(this.range500To600, inlineResponse20025DataOptionAdjustedSpread.range500To600) &&
        Objects.equals(this.range600To700, inlineResponse20025DataOptionAdjustedSpread.range600To700) &&
        Objects.equals(this.range700To800, inlineResponse20025DataOptionAdjustedSpread.range700To800) &&
        Objects.equals(this.range800To900, inlineResponse20025DataOptionAdjustedSpread.range800To900) &&
        Objects.equals(this.range900To1000, inlineResponse20025DataOptionAdjustedSpread.range900To1000) &&
        Objects.equals(this.range1000Plus, inlineResponse20025DataOptionAdjustedSpread.range1000Plus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range0, range0To100, range100To200, range200To300, range300To400, range400To500, range500To600, range600To700, range700To800, range800To900, range900To1000, range1000Plus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025DataOptionAdjustedSpread {\n");
    sb.append("    range0: ").append(toIndentedString(range0)).append("\n");
    sb.append("    range0To100: ").append(toIndentedString(range0To100)).append("\n");
    sb.append("    range100To200: ").append(toIndentedString(range100To200)).append("\n");
    sb.append("    range200To300: ").append(toIndentedString(range200To300)).append("\n");
    sb.append("    range300To400: ").append(toIndentedString(range300To400)).append("\n");
    sb.append("    range400To500: ").append(toIndentedString(range400To500)).append("\n");
    sb.append("    range500To600: ").append(toIndentedString(range500To600)).append("\n");
    sb.append("    range600To700: ").append(toIndentedString(range600To700)).append("\n");
    sb.append("    range700To800: ").append(toIndentedString(range700To800)).append("\n");
    sb.append("    range800To900: ").append(toIndentedString(range800To900)).append("\n");
    sb.append("    range900To1000: ").append(toIndentedString(range900To1000)).append("\n");
    sb.append("    range1000Plus: ").append(toIndentedString(range1000Plus)).append("\n");
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

