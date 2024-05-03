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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FIPrepayLockout
 */
@JsonPropertyOrder({
  FIPrepayLockout.JSON_PROPERTY_POINTS_ABOVE,
  FIPrepayLockout.JSON_PROPERTY_YM_ABOVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIPrepayLockout implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Points Above
   */
  public enum PointsAboveEnum {
    ANY("ANY"),
    
    NO_LOCKOUT("NO_LOCKOUT"),
    
    NUMERIC("NUMERIC");

    private String value;

    PointsAboveEnum(String value) {
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
    public static PointsAboveEnum fromValue(String value) {
      for (PointsAboveEnum b : PointsAboveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_POINTS_ABOVE = "pointsAbove";
  private PointsAboveEnum pointsAbove;

  /**
   * Ym Above
   */
  public enum YmAboveEnum {
    ANY("ANY"),
    
    NO_LOCKOUT("NO_LOCKOUT"),
    
    NUMERIC("NUMERIC");

    private String value;

    YmAboveEnum(String value) {
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
    public static YmAboveEnum fromValue(String value) {
      for (YmAboveEnum b : YmAboveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_YM_ABOVE = "ymAbove";
  private YmAboveEnum ymAbove;

  public FIPrepayLockout() { 
  }

  public FIPrepayLockout pointsAbove(PointsAboveEnum pointsAbove) {
    this.pointsAbove = pointsAbove;
    return this;
  }

   /**
   * Points Above
   * @return pointsAbove
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Points Above")
  @JsonProperty(JSON_PROPERTY_POINTS_ABOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PointsAboveEnum getPointsAbove() {
    return pointsAbove;
  }


  @JsonProperty(JSON_PROPERTY_POINTS_ABOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointsAbove(PointsAboveEnum pointsAbove) {
    this.pointsAbove = pointsAbove;
  }


  public FIPrepayLockout ymAbove(YmAboveEnum ymAbove) {
    this.ymAbove = ymAbove;
    return this;
  }

   /**
   * Ym Above
   * @return ymAbove
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Ym Above")
  @JsonProperty(JSON_PROPERTY_YM_ABOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public YmAboveEnum getYmAbove() {
    return ymAbove;
  }


  @JsonProperty(JSON_PROPERTY_YM_ABOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYmAbove(YmAboveEnum ymAbove) {
    this.ymAbove = ymAbove;
  }


  /**
   * Return true if this FIPrepayLockout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIPrepayLockout fiPrepayLockout = (FIPrepayLockout) o;
    return Objects.equals(this.pointsAbove, fiPrepayLockout.pointsAbove) &&
        Objects.equals(this.ymAbove, fiPrepayLockout.ymAbove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsAbove, ymAbove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIPrepayLockout {\n");
    sb.append("    pointsAbove: ").append(toIndentedString(pointsAbove)).append("\n");
    sb.append("    ymAbove: ").append(toIndentedString(ymAbove)).append("\n");
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

