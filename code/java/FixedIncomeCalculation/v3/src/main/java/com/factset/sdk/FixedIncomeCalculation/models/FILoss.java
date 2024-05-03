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
 * FILoss
 */
@JsonPropertyOrder({
  FILoss.JSON_PROPERTY_LOSS_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FILoss implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LOSS_NAME = "lossName";
  private JsonNullable<String> lossName = JsonNullable.<String>undefined();

  public FILoss() { 
  }

  public FILoss lossName(String lossName) {
    this.lossName = JsonNullable.<String>of(lossName);
    return this;
  }

   /**
   * Loss Name
   * @return lossName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Loss Name")
  @JsonIgnore

  public String getLossName() {
        return lossName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOSS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLossName_JsonNullable() {
    return lossName;
  }
  
  @JsonProperty(JSON_PROPERTY_LOSS_NAME)
  public void setLossName_JsonNullable(JsonNullable<String> lossName) {
    this.lossName = lossName;
  }

  public void setLossName(String lossName) {
    this.lossName = JsonNullable.<String>of(lossName);
  }


  /**
   * Return true if this FILoss object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FILoss fiLoss = (FILoss) o;
    return equalsNullable(this.lossName, fiLoss.lossName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(lossName));
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
    sb.append("class FILoss {\n");
    sb.append("    lossName: ").append(toIndentedString(lossName)).append("\n");
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

