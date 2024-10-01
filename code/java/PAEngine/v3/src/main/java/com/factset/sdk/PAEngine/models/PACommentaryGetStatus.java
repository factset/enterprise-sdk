/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import com.factset.sdk.PAEngine.JSON;


/**
 * PACommentaryGetStatus
 */
@JsonPropertyOrder({
  PACommentaryGetStatus.JSON_PROPERTY_CALCULATIONID,
  PACommentaryGetStatus.JSON_PROPERTY_UNITID,
  PACommentaryGetStatus.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PACommentaryGetStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CALCULATIONID = "calculationid";
  private JsonNullable<String> calculationid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNITID = "unitid";
  private JsonNullable<String> unitid = JsonNullable.<String>undefined();

  /**
   * The status of commentary generation.
   */
  public enum StatusEnum {
    EXECUTING("Executing"),
    
    SUCCESS("Success");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public PACommentaryGetStatus() { 
  }

  public PACommentaryGetStatus calculationid(String calculationid) {
    this.calculationid = JsonNullable.<String>of(calculationid);
    return this;
  }

   /**
   * Calculation id.
   * @return calculationid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation id.")
  @JsonIgnore

  public String getCalculationid() {
        return calculationid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALCULATIONID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCalculationid_JsonNullable() {
    return calculationid;
  }
  
  @JsonProperty(JSON_PROPERTY_CALCULATIONID)
  public void setCalculationid_JsonNullable(JsonNullable<String> calculationid) {
    this.calculationid = calculationid;
  }

  public void setCalculationid(String calculationid) {
    this.calculationid = JsonNullable.<String>of(calculationid);
  }


  public PACommentaryGetStatus unitid(String unitid) {
    this.unitid = JsonNullable.<String>of(unitid);
    return this;
  }

   /**
   * Calculation unit id.
   * @return unitid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Calculation unit id.")
  @JsonIgnore

  public String getUnitid() {
        return unitid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNITID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnitid_JsonNullable() {
    return unitid;
  }
  
  @JsonProperty(JSON_PROPERTY_UNITID)
  public void setUnitid_JsonNullable(JsonNullable<String> unitid) {
    this.unitid = unitid;
  }

  public void setUnitid(String unitid) {
    this.unitid = JsonNullable.<String>of(unitid);
  }


  public PACommentaryGetStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of commentary generation.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The status of commentary generation.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this PACommentaryGetStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PACommentaryGetStatus paCommentaryGetStatus = (PACommentaryGetStatus) o;
    return equalsNullable(this.calculationid, paCommentaryGetStatus.calculationid) &&
        equalsNullable(this.unitid, paCommentaryGetStatus.unitid) &&
        Objects.equals(this.status, paCommentaryGetStatus.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(calculationid), hashCodeNullable(unitid), status);
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
    sb.append("class PACommentaryGetStatus {\n");
    sb.append("    calculationid: ").append(toIndentedString(calculationid)).append("\n");
    sb.append("    unitid: ").append(toIndentedString(unitid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

