/*
 * FactSet Capital Structure Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CapitalStructureReportBuilder.models;

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
import com.factset.sdk.CapitalStructureReportBuilder.JSON;


/**
 * String with frequency of a data series. Allowed values: - \&quot;D\&quot; (daily) - \&quot;W\&quot; (weekly) - \&quot;AW\&quot; (actual weekly) - \&quot;M\&quot; (monthly) - \&quot;AM\&quot; (actual monthly) - \&quot;Q\&quot; (quarterly) - \&quot;FQ\&quot; (fiscal quarterly) - \&quot;CQ\&quot; (calendar quarterly) - \&quot;AQ\&quot; (actual quarterly) - \&quot;Y\&quot; (yearly) - \&quot;FY\&quot; (fiscal yearly) - \&quot;CY\&quot; (calendar yearly) - \&quot;AY\&quot; (actual yearly) - \&quot;MTD\&quot; (month-to-date) - \&quot;QTD\&quot; (quarter-to-date) - \&quot;YTD\&quot; (year-to-date) - \&quot;FYTD\&quot; (fiscal-year-to-date) - \&quot;CYTD\&quot; (calendar-year-to-date) 
 */
@ApiModel(description = "String with frequency of a data series. Allowed values: - \"D\" (daily) - \"W\" (weekly) - \"AW\" (actual weekly) - \"M\" (monthly) - \"AM\" (actual monthly) - \"Q\" (quarterly) - \"FQ\" (fiscal quarterly) - \"CQ\" (calendar quarterly) - \"AQ\" (actual quarterly) - \"Y\" (yearly) - \"FY\" (fiscal yearly) - \"CY\" (calendar yearly) - \"AY\" (actual yearly) - \"MTD\" (month-to-date) - \"QTD\" (quarter-to-date) - \"YTD\" (year-to-date) - \"FYTD\" (fiscal-year-to-date) - \"CYTD\" (calendar-year-to-date) ")
@JsonPropertyOrder({
  FrequencyFrequency.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FrequencyFrequency implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets value
   */
  public enum ValueEnum {
    D("D"),
    
    W("W"),
    
    AW("AW"),
    
    M("M"),
    
    AM("AM"),
    
    Q("Q"),
    
    FQ("FQ"),
    
    CQ("CQ"),
    
    AQ("AQ"),
    
    Y("Y"),
    
    FY("FY"),
    
    CY("CY"),
    
    AY("AY"),
    
    MTD("MTD"),
    
    QTD("QTD"),
    
    YTD("YTD"),
    
    FYTD("FYTD"),
    
    CYTD("CYTD");

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

  public FrequencyFrequency() { 
  }

  public FrequencyFrequency value(ValueEnum value) {
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
   * Return true if this frequency_frequency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequencyFrequency frequencyFrequency = (FrequencyFrequency) o;
    return Objects.equals(this.value, frequencyFrequency.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyFrequency {\n");
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

