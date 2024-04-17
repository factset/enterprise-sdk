/*
 * FactSet Estimates Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimatesReportBuilder.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimatesReportBuilder.JSON;


/**
 * Describes data based on source or kind of value - ACTUAL - Historical data collected directly from a press release or a median consensus from brokers after a report date. - ESTIMATE - Forward looking average of broker estimates within a specific time horizon. - GUIDANCE - Forward looking indication or estimate of future performance issued by the company itself. - DETAIL - Indicates data that is more granular and may be secondary in focus. - MAIN - Indicates data is of more impactful or higher importance and may want to be emphasized. - SECTION - Indicates data that is used in sectioning rows in group level STACH format. 
 */
@ApiModel(description = "Describes data based on source or kind of value - ACTUAL - Historical data collected directly from a press release or a median consensus from brokers after a report date. - ESTIMATE - Forward looking average of broker estimates within a specific time horizon. - GUIDANCE - Forward looking indication or estimate of future performance issued by the company itself. - DETAIL - Indicates data that is more granular and may be secondary in focus. - MAIN - Indicates data is of more impactful or higher importance and may want to be emphasized. - SECTION - Indicates data that is used in sectioning rows in group level STACH format. ")
@JsonPropertyOrder({
  CategoryCategory.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CategoryCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets value
   */
  public enum ValueEnum {
    ACTUAL("ACTUAL"),
    
    ESTIMATE("ESTIMATE"),
    
    GUIDANCE("GUIDANCE"),
    
    EXCLUDED("EXCLUDED"),
    
    CHANGE("CHANGE"),
    
    DETAIL("DETAIL"),
    
    MAIN("MAIN"),
    
    SECTION("SECTION");

    private String value;

    ValueEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE = "value";
  private ValueEnum value;

  public CategoryCategory() { 
  }

  public CategoryCategory value(ValueEnum value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueEnum getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(ValueEnum value) {
    this.value = value;
  }


  /**
   * Return true if this category_category object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryCategory categoryCategory = (CategoryCategory) o;
    return Objects.equals(this.value, categoryCategory.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryCategory {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

