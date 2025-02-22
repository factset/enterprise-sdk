/*
 * Company Logo API
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The logo API provides access to logos for a global universe of listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logo collection and maintenance takes into account IPOs, M&A notifications, and further consistency check mechanisms.  The Company Logo API seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).   
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CompanyLogo.models;

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
import com.factset.sdk.CompanyLogo.JSON;


/**
 * The status member contains the status code of the response.
 */
@ApiModel(description = "The status member contains the status code of the response.")
@JsonPropertyOrder({
  StatusObject.JSON_PROPERTY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StatusObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private BigDecimal code;

  public StatusObject() { 
  }

  @JsonCreator
  public StatusObject(
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) BigDecimal code
  ) {
    this();
    this.code = code;
  }

  public StatusObject code(BigDecimal code) {
    this.code = code;
    return this;
  }

   /**
   * The HTTP status code of the response, mirroring the code from the Status-Line of the HTTP response message (see [RFC2616] section 6.1).
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "The HTTP status code of the response, mirroring the code from the Status-Line of the HTTP response message (see [RFC2616] section 6.1).")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(BigDecimal code) {
    this.code = code;
  }


  /**
   * Return true if this StatusObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusObject statusObject = (StatusObject) o;
    return Objects.equals(this.code, statusObject.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusObject {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

