/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.ErrorItem;
import com.factset.sdk.OpenRisk.models.StatCalculationLevel;
import com.factset.sdk.OpenRisk.models.StatCalculationSettings;
import com.factset.sdk.OpenRisk.models.StatResultValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * Risk statistic calculation result
 */
@ApiModel(description = "Risk statistic calculation result")
@JsonPropertyOrder({
  StatResult.JSON_PROPERTY_STAT,
  StatResult.JSON_PROPERTY_LEVEL,
  StatResult.JSON_PROPERTY_SETTINGS,
  StatResult.JSON_PROPERTY_VALUE,
  StatResult.JSON_PROPERTY_ERROR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class StatResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STAT = "stat";
  private String stat;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private StatCalculationLevel level;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private StatCalculationSettings settings;

  public static final String JSON_PROPERTY_VALUE = "value";
  private StatResultValue value;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ErrorItem error;

  public StatResult() { 
  }

  @JsonCreator
  public StatResult(
    @JsonProperty(value=JSON_PROPERTY_STAT, required=true) String stat, 
    @JsonProperty(value=JSON_PROPERTY_LEVEL, required=true) StatCalculationLevel level
  ) {
    this();
    this.stat = stat;
    this.level = level;
  }

  public StatResult stat(String stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Name of the stat
   * @return stat
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the stat")
  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStat() {
    return stat;
  }


  @JsonProperty(JSON_PROPERTY_STAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStat(String stat) {
    this.stat = stat;
  }


  public StatResult level(StatCalculationLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatCalculationLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLevel(StatCalculationLevel level) {
    this.level = level;
  }


  public StatResult settings(StatCalculationSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatCalculationSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(StatCalculationSettings settings) {
    this.settings = settings;
  }


  public StatResult value(StatResultValue value) {
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

  public StatResultValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(StatResultValue value) {
    this.value = value;
  }


  public StatResult error(ErrorItem error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorItem getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(ErrorItem error) {
    this.error = error;
  }


  /**
   * Return true if this StatResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatResult statResult = (StatResult) o;
    return Objects.equals(this.stat, statResult.stat) &&
        Objects.equals(this.level, statResult.level) &&
        Objects.equals(this.settings, statResult.settings) &&
        Objects.equals(this.value, statResult.value) &&
        Objects.equals(this.error, statResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stat, level, settings, value, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatResult {\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

