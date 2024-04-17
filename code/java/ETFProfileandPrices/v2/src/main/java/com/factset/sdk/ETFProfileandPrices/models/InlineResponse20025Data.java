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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20025DataAverageLife;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20025DataOptionAdjustedSpread;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Market Aggregates
 */
@ApiModel(description = "Market Aggregates")
@JsonPropertyOrder({
  InlineResponse20025Data.JSON_PROPERTY_AS_OF_DATE,
  InlineResponse20025Data.JSON_PROPERTY_OPTION_ADJUSTED_SPREAD,
  InlineResponse20025Data.JSON_PROPERTY_AVERAGE_LIFE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20025Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_OPTION_ADJUSTED_SPREAD = "optionAdjustedSpread";
  private InlineResponse20025DataOptionAdjustedSpread optionAdjustedSpread;

  public static final String JSON_PROPERTY_AVERAGE_LIFE = "averageLife";
  private InlineResponse20025DataAverageLife averageLife;

  public InlineResponse20025Data() { 
  }

  public InlineResponse20025Data asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Date the analytics data was published. Available for the regions: US, Europe,and Canada.
   * @return asOfDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Date the analytics data was published. Available for the regions: US, Europe,and Canada.")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public InlineResponse20025Data optionAdjustedSpread(InlineResponse20025DataOptionAdjustedSpread optionAdjustedSpread) {
    this.optionAdjustedSpread = optionAdjustedSpread;
    return this;
  }

   /**
   * Get optionAdjustedSpread
   * @return optionAdjustedSpread
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTION_ADJUSTED_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20025DataOptionAdjustedSpread getOptionAdjustedSpread() {
    return optionAdjustedSpread;
  }


  @JsonProperty(JSON_PROPERTY_OPTION_ADJUSTED_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionAdjustedSpread(InlineResponse20025DataOptionAdjustedSpread optionAdjustedSpread) {
    this.optionAdjustedSpread = optionAdjustedSpread;
  }


  public InlineResponse20025Data averageLife(InlineResponse20025DataAverageLife averageLife) {
    this.averageLife = averageLife;
    return this;
  }

   /**
   * Get averageLife
   * @return averageLife
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVERAGE_LIFE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20025DataAverageLife getAverageLife() {
    return averageLife;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_LIFE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageLife(InlineResponse20025DataAverageLife averageLife) {
    this.averageLife = averageLife;
  }


  /**
   * Return true if this inline_response_200_25_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025Data inlineResponse20025Data = (InlineResponse20025Data) o;
    return Objects.equals(this.asOfDate, inlineResponse20025Data.asOfDate) &&
        Objects.equals(this.optionAdjustedSpread, inlineResponse20025Data.optionAdjustedSpread) &&
        Objects.equals(this.averageLife, inlineResponse20025Data.averageLife);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, optionAdjustedSpread, averageLife);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025Data {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    optionAdjustedSpread: ").append(toIndentedString(optionAdjustedSpread)).append("\n");
    sb.append("    averageLife: ").append(toIndentedString(averageLife)).append("\n");
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

