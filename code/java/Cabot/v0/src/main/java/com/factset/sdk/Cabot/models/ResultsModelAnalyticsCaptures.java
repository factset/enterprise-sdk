/*
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Cabot.models;

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
import com.factset.sdk.Cabot.JSON;


/**
 * ResultsModelAnalyticsCaptures
 */
@JsonPropertyOrder({
  ResultsModelAnalyticsCaptures.JSON_PROPERTY_DOWNSIDE,
  ResultsModelAnalyticsCaptures.JSON_PROPERTY_UPSIDE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResultsModelAnalyticsCaptures implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DOWNSIDE = "downside";
  private BigDecimal downside;

  public static final String JSON_PROPERTY_UPSIDE = "upside";
  private BigDecimal upside;

  public ResultsModelAnalyticsCaptures() { 
  }

  public ResultsModelAnalyticsCaptures downside(BigDecimal downside) {
    this.downside = downside;
    return this;
  }

   /**
   * Downside capture is typically viewed as a defensive characteristic or an intuitive measure of risk management. Values of less than 100% indicate that the portfolio returns generally go down less than does the market.
   * @return downside
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Downside capture is typically viewed as a defensive characteristic or an intuitive measure of risk management. Values of less than 100% indicate that the portfolio returns generally go down less than does the market.")
  @JsonProperty(JSON_PROPERTY_DOWNSIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDownside() {
    return downside;
  }


  @JsonProperty(JSON_PROPERTY_DOWNSIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownside(BigDecimal downside) {
    this.downside = downside;
  }


  public ResultsModelAnalyticsCaptures upside(BigDecimal upside) {
    this.upside = upside;
    return this;
  }

   /**
   * Upside capture quantifies how well the portfolio returns rise in comparison to a market up tick. A value greater than 100% indicates the portfolio captures gains at a rate disproportional to the market.
   * @return upside
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Upside capture quantifies how well the portfolio returns rise in comparison to a market up tick. A value greater than 100% indicates the portfolio captures gains at a rate disproportional to the market.")
  @JsonProperty(JSON_PROPERTY_UPSIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpside() {
    return upside;
  }


  @JsonProperty(JSON_PROPERTY_UPSIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpside(BigDecimal upside) {
    this.upside = upside;
  }


  /**
   * Return true if this ResultsModelAnalytics_captures object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsModelAnalyticsCaptures resultsModelAnalyticsCaptures = (ResultsModelAnalyticsCaptures) o;
    return Objects.equals(this.downside, resultsModelAnalyticsCaptures.downside) &&
        Objects.equals(this.upside, resultsModelAnalyticsCaptures.upside);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downside, upside);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsModelAnalyticsCaptures {\n");
    sb.append("    downside: ").append(toIndentedString(downside)).append("\n");
    sb.append("    upside: ").append(toIndentedString(upside)).append("\n");
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

