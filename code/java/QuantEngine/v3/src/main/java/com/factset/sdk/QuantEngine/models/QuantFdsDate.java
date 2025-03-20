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
 * QuantFdsDate
 */
@JsonPropertyOrder({
  QuantFdsDate.JSON_PROPERTY_START_DATE,
  QuantFdsDate.JSON_PROPERTY_END_DATE,
  QuantFdsDate.JSON_PROPERTY_SOURCE,
  QuantFdsDate.JSON_PROPERTY_FREQUENCY,
  QuantFdsDate.JSON_PROPERTY_CALENDAR,
  QuantFdsDate.JSON_PROPERTY_OVERRIDE_UNIVERSAL_SCREEN_CALENDAR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QuantFdsDate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

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

  public QuantFdsDate() { 
  }

  @JsonCreator
  public QuantFdsDate(
    @JsonProperty(value=JSON_PROPERTY_START_DATE, required=true) String startDate, 
    @JsonProperty(value=JSON_PROPERTY_END_DATE, required=true) String endDate, 
    @JsonProperty(value=JSON_PROPERTY_SOURCE, required=true) SourceEnum source, 
    @JsonProperty(value=JSON_PROPERTY_FREQUENCY, required=true) String frequency, 
    @JsonProperty(value=JSON_PROPERTY_CALENDAR, required=true) String calendar
  ) {
    this();
    this.startDate = startDate;
    this.endDate = endDate;
    this.source = source;
    this.frequency = frequency;
    this.calendar = calendar;
  }

  public QuantFdsDate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "20050701", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public QuantFdsDate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "20050704", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public QuantFdsDate source(SourceEnum source) {
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


  public QuantFdsDate frequency(String frequency) {
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


  public QuantFdsDate calendar(String calendar) {
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


  public QuantFdsDate overrideUniversalScreenCalendar(Boolean overrideUniversalScreenCalendar) {
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
   * Return true if this QuantFdsDate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantFdsDate quantFdsDate = (QuantFdsDate) o;
    return Objects.equals(this.startDate, quantFdsDate.startDate) &&
        Objects.equals(this.endDate, quantFdsDate.endDate) &&
        Objects.equals(this.source, quantFdsDate.source) &&
        Objects.equals(this.frequency, quantFdsDate.frequency) &&
        Objects.equals(this.calendar, quantFdsDate.calendar) &&
        equalsNullable(this.overrideUniversalScreenCalendar, quantFdsDate.overrideUniversalScreenCalendar);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, source, frequency, calendar, hashCodeNullable(overrideUniversalScreenCalendar));
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
    sb.append("class QuantFdsDate {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

