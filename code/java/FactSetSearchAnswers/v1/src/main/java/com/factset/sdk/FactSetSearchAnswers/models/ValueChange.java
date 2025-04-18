/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.ChangeColor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * ValueChange
 */
@JsonPropertyOrder({
  ValueChange.JSON_PROPERTY_ABSOLUTE_CHANGE,
  ValueChange.JSON_PROPERTY_PERCENTAGE_CHANGE,
  ValueChange.JSON_PROPERTY_COLOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValueChange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE_CHANGE = "absoluteChange";
  private String absoluteChange;

  public static final String JSON_PROPERTY_PERCENTAGE_CHANGE = "percentageChange";
  private String percentageChange;

  public static final String JSON_PROPERTY_COLOR = "color";
  private ChangeColor color;

  public ValueChange() { 
  }

  public ValueChange absoluteChange(String absoluteChange) {
    this.absoluteChange = absoluteChange;
    return this;
  }

   /**
   * Get absoluteChange
   * @return absoluteChange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbsoluteChange() {
    return absoluteChange;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsoluteChange(String absoluteChange) {
    this.absoluteChange = absoluteChange;
  }


  public ValueChange percentageChange(String percentageChange) {
    this.percentageChange = percentageChange;
    return this;
  }

   /**
   * Get percentageChange
   * @return percentageChange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPercentageChange() {
    return percentageChange;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentageChange(String percentageChange) {
    this.percentageChange = percentageChange;
  }


  public ValueChange color(ChangeColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChangeColor getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(ChangeColor color) {
    this.color = color;
  }


  /**
   * Return true if this ValueChange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueChange valueChange = (ValueChange) o;
    return Objects.equals(this.absoluteChange, valueChange.absoluteChange) &&
        Objects.equals(this.percentageChange, valueChange.percentageChange) &&
        Objects.equals(this.color, valueChange.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteChange, percentageChange, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueChange {\n");
    sb.append("    absoluteChange: ").append(toIndentedString(absoluteChange)).append("\n");
    sb.append("    percentageChange: ").append(toIndentedString(percentageChange)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

