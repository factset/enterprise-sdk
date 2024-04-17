/*
 * FactSet Ownership API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOwnershipReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.CurrencyCodeCurrencyCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetOwnershipReportBuilder.JSON;


/**
 * CurrencyCode
 */
@JsonPropertyOrder({
  CurrencyCode.JSON_PROPERTY_CURRENCY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CurrencyCode implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private CurrencyCodeCurrencyCode currencyCode;

  public CurrencyCode() { 
  }

  public CurrencyCode currencyCode(CurrencyCodeCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrencyCodeCurrencyCode getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(CurrencyCodeCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * Return true if this currencyCode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyCode currencyCode = (CurrencyCode) o;
    return Objects.equals(this.currencyCode, currencyCode.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyCode {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

