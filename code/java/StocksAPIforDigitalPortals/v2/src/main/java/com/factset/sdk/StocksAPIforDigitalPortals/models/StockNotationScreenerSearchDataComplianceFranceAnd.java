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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * StockNotationScreenerSearchDataComplianceFranceAnd
 */
@JsonPropertyOrder({
  StockNotationScreenerSearchDataComplianceFranceAnd.JSON_PROPERTY_ID,
  StockNotationScreenerSearchDataComplianceFranceAnd.JSON_PROPERTY_NEGATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataComplianceFranceAnd implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public StockNotationScreenerSearchDataComplianceFranceAnd() { 
  }

  public StockNotationScreenerSearchDataComplianceFranceAnd id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a compliance property. The compliance properties with &#x60;id&#x3D;4&#x60; (SRD) and &#x60;id&#x3D;10&#x60; (SRD long only) are mutually exclusive.  &amp;#8291;  Examples:  &amp;#8291;  &amp;#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false }, {\&quot;id\&quot;:3, \&quot;negate\&quot;:false}, {\&quot;id\&quot;:4, \&quot;negate\&quot;:false}]}]}}&#x60;  &amp;#8291;  &amp;#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false  }]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false }]}]}}&#x60;  &amp;#8291;  &amp;#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false },{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false},{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}]}}&#x60;
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a compliance property. The compliance properties with `id=4` (SRD) and `id=10` (SRD long only) are mutually exclusive.  &#8291;  Examples:  &#8291;  &#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false }, {\"id\":3, \"negate\":false}, {\"id\":4, \"negate\":false}]}]}}`  &#8291;  &#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false  }]}, {\"and\": [{ \"id\":3, \"negate\":false }]}]}}`  &#8291;  &#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false },{\"id\":10, \"negate\":true}]}, {\"and\": [{ \"id\":3, \"negate\":false},{\"id\":10, \"negate\":true}]}]}}`")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public StockNotationScreenerSearchDataComplianceFranceAnd negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the condition excludes stocks compliant to the compliance property. 
   * @return negate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the condition excludes stocks compliant to the compliance property. ")
  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_compliance_france_and object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataComplianceFranceAnd stockNotationScreenerSearchDataComplianceFranceAnd = (StockNotationScreenerSearchDataComplianceFranceAnd) o;
    return Objects.equals(this.id, stockNotationScreenerSearchDataComplianceFranceAnd.id) &&
        Objects.equals(this.negate, stockNotationScreenerSearchDataComplianceFranceAnd.negate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, negate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataComplianceFranceAnd {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
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

