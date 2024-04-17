/*
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
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
 * PostStockNotationScreenerSearchRequestDataComplianceFranceAnd
 */
@JsonPropertyOrder({
  PostStockNotationScreenerSearchRequestDataComplianceFranceAnd.JSON_PROPERTY_ID,
  PostStockNotationScreenerSearchRequestDataComplianceFranceAnd.JSON_PROPERTY_NEGATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostStockNotationScreenerSearchRequestDataComplianceFranceAnd implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Identifier of a compliance property. The compliance properties with &#x60;id&#x3D;4&#x60; (SRD) and &#x60;id&#x3D;10&#x60; (SRD long only) are mutually exclusive.  &amp;#8291;  Examples:  &amp;#8291;  &amp;#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false }, {\&quot;id\&quot;:3, \&quot;negate\&quot;:false}, {\&quot;id\&quot;:4, \&quot;negate\&quot;:false}]}]}}&#x60;  &amp;#8291;  &amp;#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false  }]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false }]}]}}&#x60;  &amp;#8291;  &amp;#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false },{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false},{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}]}}&#x60;
   */
  public enum IdEnum {
    NUMBER_2(new BigDecimal("2")),
    
    NUMBER_3(new BigDecimal("3")),
    
    NUMBER_4(new BigDecimal("4")),
    
    NUMBER_10(new BigDecimal("10"));

    private BigDecimal value;

    IdEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdEnum fromValue(BigDecimal value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ID = "id";
  private IdEnum id;

  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public PostStockNotationScreenerSearchRequestDataComplianceFranceAnd() { 
  }

  public PostStockNotationScreenerSearchRequestDataComplianceFranceAnd id(IdEnum id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a compliance property. The compliance properties with &#x60;id&#x3D;4&#x60; (SRD) and &#x60;id&#x3D;10&#x60; (SRD long only) are mutually exclusive.  &amp;#8291;  Examples:  &amp;#8291;  &amp;#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false }, {\&quot;id\&quot;:3, \&quot;negate\&quot;:false}, {\&quot;id\&quot;:4, \&quot;negate\&quot;:false}]}]}}&#x60;  &amp;#8291;  &amp;#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false  }]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false }]}]}}&#x60;  &amp;#8291;  &amp;#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  &#x60;\&quot;compliance\&quot;:{ \&quot;france\&quot;: { \&quot;or\&quot;: [{ \&quot;and\&quot;: [{ \&quot;id\&quot;:2, \&quot;negate\&quot;:false },{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}, {\&quot;and\&quot;: [{ \&quot;id\&quot;:3, \&quot;negate\&quot;:false},{\&quot;id\&quot;:10, \&quot;negate\&quot;:true}]}]}}&#x60;
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a compliance property. The compliance properties with `id=4` (SRD) and `id=10` (SRD long only) are mutually exclusive.  &#8291;  Examples:  &#8291;  &#8291;1. Retrieve only stocks which are compliant to all of the following: PEA, PEAPME, and SRD  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false }, {\"id\":3, \"negate\":false}, {\"id\":4, \"negate\":false}]}]}}`  &#8291;  &#8291;2. Retrieve only stocks which are compliant to PEA or to PEAPME  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false  }]}, {\"and\": [{ \"id\":3, \"negate\":false }]}]}}`  &#8291;  &#8291;3. Retrieve only stocks which are compliant to PEA or to PEAPME, but are not compliant to SRD long only.  `\"compliance\":{ \"france\": { \"or\": [{ \"and\": [{ \"id\":2, \"negate\":false },{\"id\":10, \"negate\":true}]}, {\"and\": [{ \"id\":3, \"negate\":false},{\"id\":10, \"negate\":true}]}]}}`")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdEnum getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(IdEnum id) {
    this.id = id;
  }


  public PostStockNotationScreenerSearchRequestDataComplianceFranceAnd negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the condition excludes stocks compliant to the compliance property. 
   * @return negate
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this PostStockNotationScreenerSearchRequest_data_compliance_france_and object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStockNotationScreenerSearchRequestDataComplianceFranceAnd postStockNotationScreenerSearchRequestDataComplianceFranceAnd = (PostStockNotationScreenerSearchRequestDataComplianceFranceAnd) o;
    return Objects.equals(this.id, postStockNotationScreenerSearchRequestDataComplianceFranceAnd.id) &&
        Objects.equals(this.negate, postStockNotationScreenerSearchRequestDataComplianceFranceAnd.negate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, negate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStockNotationScreenerSearchRequestDataComplianceFranceAnd {\n");
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

