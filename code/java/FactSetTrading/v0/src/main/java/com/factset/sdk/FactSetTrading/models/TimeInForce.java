/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

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
import com.factset.sdk.FactSetTrading.JSON;


/**
 * TimeInForce
 */
@JsonPropertyOrder({
  TimeInForce.JSON_PROPERTY_TIF,
  TimeInForce.JSON_PROPERTY_EXPIRE_DATE,
  TimeInForce.JSON_PROPERTY_EXPIRE_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimeInForce implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Time in force: if GTD, then Expire Time or Expire Date is a required field
   */
  public enum TifEnum {
    DAY("DAY"),
    
    GTC("GTC"),
    
    OPG("OPG"),
    
    IOC("IOC"),
    
    FOK("FOK"),
    
    GTX("GTX"),
    
    GTD("GTD"),
    
    ATC("ATC");

    private String value;

    TifEnum(String value) {
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
    public static TifEnum fromValue(String value) {
      for (TifEnum b : TifEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TIF = "tif";
  private TifEnum tif;

  public static final String JSON_PROPERTY_EXPIRE_DATE = "expireDate";
  private JsonNullable<String> expireDate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPIRE_TIME = "expireTime";
  private JsonNullable<String> expireTime = JsonNullable.<String>undefined();

  public TimeInForce() { 
  }

  public TimeInForce tif(TifEnum tif) {
    this.tif = tif;
    return this;
  }

   /**
   * Time in force: if GTD, then Expire Time or Expire Date is a required field
   * @return tif
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in force: if GTD, then Expire Time or Expire Date is a required field")
  @JsonProperty(JSON_PROPERTY_TIF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TifEnum getTif() {
    return tif;
  }


  @JsonProperty(JSON_PROPERTY_TIF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTif(TifEnum tif) {
    this.tif = tif;
  }


  public TimeInForce expireDate(String expireDate) {
    this.expireDate = JsonNullable.<String>of(expireDate);
    return this;
  }

   /**
   * Expire date in YYYYMMDD format expressed in UTC
   * @return expireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expire date in YYYYMMDD format expressed in UTC")
  @JsonIgnore

  public String getExpireDate() {
        return expireDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExpireDate_JsonNullable() {
    return expireDate;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRE_DATE)
  public void setExpireDate_JsonNullable(JsonNullable<String> expireDate) {
    this.expireDate = expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = JsonNullable.<String>of(expireDate);
  }


  public TimeInForce expireTime(String expireTime) {
    this.expireTime = JsonNullable.<String>of(expireTime);
    return this;
  }

   /**
   * Expire time in YYYYMMDD-HH:MM:SS format expressed in UTC
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expire time in YYYYMMDD-HH:MM:SS format expressed in UTC")
  @JsonIgnore

  public String getExpireTime() {
        return expireTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExpireTime_JsonNullable() {
    return expireTime;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  public void setExpireTime_JsonNullable(JsonNullable<String> expireTime) {
    this.expireTime = expireTime;
  }

  public void setExpireTime(String expireTime) {
    this.expireTime = JsonNullable.<String>of(expireTime);
  }


  /**
   * Return true if this TimeInForce object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeInForce timeInForce = (TimeInForce) o;
    return Objects.equals(this.tif, timeInForce.tif) &&
        equalsNullable(this.expireDate, timeInForce.expireDate) &&
        equalsNullable(this.expireTime, timeInForce.expireTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tif, hashCodeNullable(expireDate), hashCodeNullable(expireTime));
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
    sb.append("class TimeInForce {\n");
    sb.append("    tif: ").append(toIndentedString(tif)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
