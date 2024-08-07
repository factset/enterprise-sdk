/*
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.UniversalScreening.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.UniversalScreening.JSON;


/**
 * Object containing screen data
 */
@ApiModel(description = "Object containing screen data")
@JsonPropertyOrder({
  ScreenCalcParametersData.JSON_PROPERTY_BACKTEST_DATE,
  ScreenCalcParametersData.JSON_PROPERTY_GLOBAL_VARIABLES_MAP,
  ScreenCalcParametersData.JSON_PROPERTY_LEGACY_UNIVERSE_TYPE,
  ScreenCalcParametersData.JSON_PROPERTY_SCREEN_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScreenCalcParametersData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BACKTEST_DATE = "backtestDate";
  private JsonNullable<String> backtestDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GLOBAL_VARIABLES_MAP = "globalVariablesMap";
  private java.util.Map<String, String> globalVariablesMap = null;

  /**
   * Universe type to open a Screen 1.0 document with\\ &#x60;equity&#x60;: Uses the equity universe from the Screen 1.0 document.\\ &#x60;debt&#x60;: Uses the debt universe from the Screen 1.0 document.\\ &#x60;fund&#x60;: Uses the fund universe from the Screen 1.0 document.
   */
  public enum LegacyUniverseTypeEnum {
    EQUITY("equity"),
    
    DEBT("debt"),
    
    FUND("fund");

    private String value;

    LegacyUniverseTypeEnum(String value) {
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
    public static LegacyUniverseTypeEnum fromValue(String value) {
      for (LegacyUniverseTypeEnum b : LegacyUniverseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_LEGACY_UNIVERSE_TYPE = "legacyUniverseType";
  private JsonNullable<LegacyUniverseTypeEnum> legacyUniverseType = JsonNullable.<LegacyUniverseTypeEnum>of(LegacyUniverseTypeEnum.EQUITY);

  public static final String JSON_PROPERTY_SCREEN_NAME = "screenName";
  private String screenName;

  public ScreenCalcParametersData() { 
  }

  @JsonCreator
  public ScreenCalcParametersData(
    @JsonProperty(value=JSON_PROPERTY_SCREEN_NAME, required=true) String screenName
  ) {
    this();
    this.screenName = screenName;
  }

  public ScreenCalcParametersData backtestDate(String backtestDate) {
    this.backtestDate = JsonNullable.<String>of(backtestDate);
    return this;
  }

   /**
   * Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires addtional access to use.
   * @return backtestDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "20040412", value = "Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires addtional access to use.")
  @JsonIgnore

  public String getBacktestDate() {
        return backtestDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BACKTEST_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBacktestDate_JsonNullable() {
    return backtestDate;
  }
  
  @JsonProperty(JSON_PROPERTY_BACKTEST_DATE)
  public void setBacktestDate_JsonNullable(JsonNullable<String> backtestDate) {
    this.backtestDate = backtestDate;
  }

  public void setBacktestDate(String backtestDate) {
    this.backtestDate = JsonNullable.<String>of(backtestDate);
  }


  public ScreenCalcParametersData globalVariablesMap(java.util.Map<String, String> globalVariablesMap) {
    this.globalVariablesMap = globalVariablesMap;
    return this;
  }

  public ScreenCalcParametersData putGlobalVariablesMapItem(String key, String globalVariablesMapItem) {
    if (this.globalVariablesMap == null) {
      this.globalVariablesMap = new java.util.HashMap<>();
    }
    this.globalVariablesMap.put(key, globalVariablesMapItem);
    return this;
  }

   /**
   * Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty.
   * @return globalVariablesMap
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty.")
  @JsonProperty(JSON_PROPERTY_GLOBAL_VARIABLES_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getGlobalVariablesMap() {
    return globalVariablesMap;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_VARIABLES_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalVariablesMap(java.util.Map<String, String> globalVariablesMap) {
    this.globalVariablesMap = globalVariablesMap;
  }


  public ScreenCalcParametersData legacyUniverseType(LegacyUniverseTypeEnum legacyUniverseType) {
    this.legacyUniverseType = JsonNullable.<LegacyUniverseTypeEnum>of(legacyUniverseType);
    return this;
  }

   /**
   * Universe type to open a Screen 1.0 document with\\ &#x60;equity&#x60;: Uses the equity universe from the Screen 1.0 document.\\ &#x60;debt&#x60;: Uses the debt universe from the Screen 1.0 document.\\ &#x60;fund&#x60;: Uses the fund universe from the Screen 1.0 document.
   * @return legacyUniverseType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "equity", value = "Universe type to open a Screen 1.0 document with\\ `equity`: Uses the equity universe from the Screen 1.0 document.\\ `debt`: Uses the debt universe from the Screen 1.0 document.\\ `fund`: Uses the fund universe from the Screen 1.0 document.")
  @JsonIgnore

  public LegacyUniverseTypeEnum getLegacyUniverseType() {
        return legacyUniverseType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEGACY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LegacyUniverseTypeEnum> getLegacyUniverseType_JsonNullable() {
    return legacyUniverseType;
  }
  
  @JsonProperty(JSON_PROPERTY_LEGACY_UNIVERSE_TYPE)
  public void setLegacyUniverseType_JsonNullable(JsonNullable<LegacyUniverseTypeEnum> legacyUniverseType) {
    this.legacyUniverseType = legacyUniverseType;
  }

  public void setLegacyUniverseType(LegacyUniverseTypeEnum legacyUniverseType) {
    this.legacyUniverseType = JsonNullable.<LegacyUniverseTypeEnum>of(legacyUniverseType);
  }


  public ScreenCalcParametersData screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }

   /**
   * File path to a valid screen
   * @return screenName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SAMPLE_SCREENS:KPI_AIR.USWEB", required = true, value = "File path to a valid screen")
  @JsonProperty(JSON_PROPERTY_SCREEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScreenName() {
    return screenName;
  }


  @JsonProperty(JSON_PROPERTY_SCREEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }


  /**
   * Return true if this ScreenCalcParameters_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenCalcParametersData screenCalcParametersData = (ScreenCalcParametersData) o;
    return equalsNullable(this.backtestDate, screenCalcParametersData.backtestDate) &&
        Objects.equals(this.globalVariablesMap, screenCalcParametersData.globalVariablesMap) &&
        equalsNullable(this.legacyUniverseType, screenCalcParametersData.legacyUniverseType) &&
        Objects.equals(this.screenName, screenCalcParametersData.screenName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(backtestDate), globalVariablesMap, hashCodeNullable(legacyUniverseType), screenName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenCalcParametersData {\n");
    sb.append("    backtestDate: ").append(toIndentedString(backtestDate)).append("\n");
    sb.append("    globalVariablesMap: ").append(toIndentedString(globalVariablesMap)).append("\n");
    sb.append("    legacyUniverseType: ").append(toIndentedString(legacyUniverseType)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
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

