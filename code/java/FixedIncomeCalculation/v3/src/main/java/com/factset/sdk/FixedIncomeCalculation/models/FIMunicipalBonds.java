/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FIMunicipalBonds
 */
@JsonPropertyOrder({
  FIMunicipalBonds.JSON_PROPERTY_IGNORE_SINKING_FUND,
  FIMunicipalBonds.JSON_PROPERTY_USE_ANTICIPATED_SINK_SCHEDULE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIMunicipalBonds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IGNORE_SINKING_FUND = "ignoreSinkingFund";
  private JsonNullable<Boolean> ignoreSinkingFund = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USE_ANTICIPATED_SINK_SCHEDULE = "useAnticipatedSinkSchedule";
  private JsonNullable<Boolean> useAnticipatedSinkSchedule = JsonNullable.<Boolean>undefined();

  public FIMunicipalBonds() { 
  }

  public FIMunicipalBonds ignoreSinkingFund(Boolean ignoreSinkingFund) {
    this.ignoreSinkingFund = JsonNullable.<Boolean>of(ignoreSinkingFund);
    return this;
  }

   /**
   * Ignore Sinking Fund Schedule
   * @return ignoreSinkingFund
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ignore Sinking Fund Schedule")
  @JsonIgnore

  public Boolean getIgnoreSinkingFund() {
        return ignoreSinkingFund.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IGNORE_SINKING_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIgnoreSinkingFund_JsonNullable() {
    return ignoreSinkingFund;
  }
  
  @JsonProperty(JSON_PROPERTY_IGNORE_SINKING_FUND)
  public void setIgnoreSinkingFund_JsonNullable(JsonNullable<Boolean> ignoreSinkingFund) {
    this.ignoreSinkingFund = ignoreSinkingFund;
  }

  public void setIgnoreSinkingFund(Boolean ignoreSinkingFund) {
    this.ignoreSinkingFund = JsonNullable.<Boolean>of(ignoreSinkingFund);
  }


  public FIMunicipalBonds useAnticipatedSinkSchedule(Boolean useAnticipatedSinkSchedule) {
    this.useAnticipatedSinkSchedule = JsonNullable.<Boolean>of(useAnticipatedSinkSchedule);
    return this;
  }

   /**
   * Anticipate Sink Schedule
   * @return useAnticipatedSinkSchedule
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Anticipate Sink Schedule")
  @JsonIgnore

  public Boolean getUseAnticipatedSinkSchedule() {
        return useAnticipatedSinkSchedule.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USE_ANTICIPATED_SINK_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getUseAnticipatedSinkSchedule_JsonNullable() {
    return useAnticipatedSinkSchedule;
  }
  
  @JsonProperty(JSON_PROPERTY_USE_ANTICIPATED_SINK_SCHEDULE)
  public void setUseAnticipatedSinkSchedule_JsonNullable(JsonNullable<Boolean> useAnticipatedSinkSchedule) {
    this.useAnticipatedSinkSchedule = useAnticipatedSinkSchedule;
  }

  public void setUseAnticipatedSinkSchedule(Boolean useAnticipatedSinkSchedule) {
    this.useAnticipatedSinkSchedule = JsonNullable.<Boolean>of(useAnticipatedSinkSchedule);
  }


  /**
   * Return true if this FIMunicipalBonds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIMunicipalBonds fiMunicipalBonds = (FIMunicipalBonds) o;
    return equalsNullable(this.ignoreSinkingFund, fiMunicipalBonds.ignoreSinkingFund) &&
        equalsNullable(this.useAnticipatedSinkSchedule, fiMunicipalBonds.useAnticipatedSinkSchedule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ignoreSinkingFund), hashCodeNullable(useAnticipatedSinkSchedule));
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
    sb.append("class FIMunicipalBonds {\n");
    sb.append("    ignoreSinkingFund: ").append(toIndentedString(ignoreSinkingFund)).append("\n");
    sb.append("    useAnticipatedSinkSchedule: ").append(toIndentedString(useAnticipatedSinkSchedule)).append("\n");
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

