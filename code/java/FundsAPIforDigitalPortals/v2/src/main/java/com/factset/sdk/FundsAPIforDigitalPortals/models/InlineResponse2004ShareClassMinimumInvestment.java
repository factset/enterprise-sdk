/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

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
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Minimum investment when purchasing shares of the share class. The minimum investment is expressed in the currency of the share class, see attribute &#x60;shareClass.currency&#x60;.
 */
@ApiModel(description = "Minimum investment when purchasing shares of the share class. The minimum investment is expressed in the currency of the share class, see attribute `shareClass.currency`.")
@JsonPropertyOrder({
  InlineResponse2004ShareClassMinimumInvestment.JSON_PROPERTY_INITIAL,
  InlineResponse2004ShareClassMinimumInvestment.JSON_PROPERTY_SUBSEQUENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004ShareClassMinimumInvestment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INITIAL = "initial";
  private BigDecimal initial;

  public static final String JSON_PROPERTY_SUBSEQUENT = "subsequent";
  private BigDecimal subsequent;

  public InlineResponse2004ShareClassMinimumInvestment() { 
  }

  public InlineResponse2004ShareClassMinimumInvestment initial(BigDecimal initial) {
    this.initial = initial;
    return this;
  }

   /**
   * Initial investment accepted for establishing a new account.
   * @return initial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Initial investment accepted for establishing a new account.")
  @JsonProperty(JSON_PROPERTY_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInitial() {
    return initial;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitial(BigDecimal initial) {
    this.initial = initial;
  }


  public InlineResponse2004ShareClassMinimumInvestment subsequent(BigDecimal subsequent) {
    this.subsequent = subsequent;
    return this;
  }

   /**
   * Subsequent investment for an already established account.
   * @return subsequent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subsequent investment for an already established account.")
  @JsonProperty(JSON_PROPERTY_SUBSEQUENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSubsequent() {
    return subsequent;
  }


  @JsonProperty(JSON_PROPERTY_SUBSEQUENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsequent(BigDecimal subsequent) {
    this.subsequent = subsequent;
  }


  /**
   * Return true if this inline_response_200_4_shareClass_minimumInvestment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004ShareClassMinimumInvestment inlineResponse2004ShareClassMinimumInvestment = (InlineResponse2004ShareClassMinimumInvestment) o;
    return Objects.equals(this.initial, inlineResponse2004ShareClassMinimumInvestment.initial) &&
        Objects.equals(this.subsequent, inlineResponse2004ShareClassMinimumInvestment.subsequent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initial, subsequent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004ShareClassMinimumInvestment {\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    subsequent: ").append(toIndentedString(subsequent)).append("\n");
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
