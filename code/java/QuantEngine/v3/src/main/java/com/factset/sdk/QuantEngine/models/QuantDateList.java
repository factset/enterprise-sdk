/*
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuantEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuantEngine.models.QuantDate;
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
import com.factset.sdk.QuantEngine.JSON;


/**
 * QuantDateList
 */
@JsonPropertyOrder({
  QuantDateList.JSON_PROPERTY_DATES,
  QuantDateList.JSON_PROPERTY_SOURCE,
  QuantDateList.JSON_PROPERTY_FREQUENCY,
  QuantDateList.JSON_PROPERTY_CALENDAR,
  QuantDateList.JSON_PROPERTY_OVERRIDE_UNIVERSAL_SCREEN_CALENDAR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QuantDateList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATES = "dates";
  private JsonNullable<java.util.List<String>> dates = JsonNullable.<java.util.List<String>>undefined();

  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    FDSDATE("FdsDate"),
    
    DATELIST("DateList");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceEnum source;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private String frequency;

  public static final String JSON_PROPERTY_CALENDAR = "calendar";
  private String calendar;

  public static final String JSON_PROPERTY_OVERRIDE_UNIVERSAL_SCREEN_CALENDAR = "overrideUniversalScreenCalendar";
  private JsonNullable<Boolean> overrideUniversalScreenCalendar = JsonNullable.<Boolean>undefined();

  public QuantDateList() { 
  }

  @JsonCreator
  public QuantDateList(
    @JsonProperty(value=JSON_PROPERTY_SOURCE, required=true) SourceEnum source, 
    @JsonProperty(value=JSON_PROPERTY_FREQUENCY, required=true) String frequency, 
    @JsonProperty(value=JSON_PROPERTY_CALENDAR, required=true) String calendar
  ) {
    this();
    this.source = source;
    this.frequency = frequency;
    this.calendar = calendar;
  }

  public QuantDateList dates(java.util.List<String> dates) {
    this.dates = JsonNullable.<java.util.List<String>>of(dates);
    return this;
  }

  public QuantDateList addDatesItem(String datesItem) {
    if (this.dates == null || !this.dates.isPresent()) {
      this.dates = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.dates.get().add(datesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getDates() {
        return dates.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getDates_JsonNullable() {
    return dates;
  }
  
  @JsonProperty(JSON_PROPERTY_DATES)
  public void setDates_JsonNullable(JsonNullable<java.util.List<String>> dates) {
    this.dates = dates;
  }

  public void setDates(java.util.List<String> dates) {
    this.dates = JsonNullable.<java.util.List<String>>of(dates);
  }


  public QuantDateList source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FdsDate", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SourceEnum getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  public QuantDateList frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "D", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public QuantDateList calendar(String calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FIVEDAY", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCalendar() {
    return calendar;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCalendar(String calendar) {
    this.calendar = calendar;
  }


  public QuantDateList overrideUniversalScreenCalendar(Boolean overrideUniversalScreenCalendar) {
    this.overrideUniversalScreenCalendar = JsonNullable.<Boolean>of(overrideUniversalScreenCalendar);
    return this;
  }

   /**
   * Get overrideUniversalScreenCalendar
   * @return overrideUniversalScreenCalendar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getOverrideUniversalScreenCalendar() {
        return overrideUniversalScreenCalendar.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OVERRIDE_UNIVERSAL_SCREEN_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getOverrideUniversalScreenCalendar_JsonNullable() {
    return overrideUniversalScreenCalendar;
  }
  
  @JsonProperty(JSON_PROPERTY_OVERRIDE_UNIVERSAL_SCREEN_CALENDAR)
  public void setOverrideUniversalScreenCalendar_JsonNullable(JsonNullable<Boolean> overrideUniversalScreenCalendar) {
    this.overrideUniversalScreenCalendar = overrideUniversalScreenCalendar;
  }

  public void setOverrideUniversalScreenCalendar(Boolean overrideUniversalScreenCalendar) {
    this.overrideUniversalScreenCalendar = JsonNullable.<Boolean>of(overrideUniversalScreenCalendar);
  }


  /**
   * Return true if this QuantDateList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantDateList quantDateList = (QuantDateList) o;
    return equalsNullable(this.dates, quantDateList.dates) &&
        Objects.equals(this.source, quantDateList.source) &&
        Objects.equals(this.frequency, quantDateList.frequency) &&
        Objects.equals(this.calendar, quantDateList.calendar) &&
        equalsNullable(this.overrideUniversalScreenCalendar, quantDateList.overrideUniversalScreenCalendar);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dates), source, frequency, calendar, hashCodeNullable(overrideUniversalScreenCalendar));
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
    sb.append("class QuantDateList {\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    overrideUniversalScreenCalendar: ").append(toIndentedString(overrideUniversalScreenCalendar)).append("\n");
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

