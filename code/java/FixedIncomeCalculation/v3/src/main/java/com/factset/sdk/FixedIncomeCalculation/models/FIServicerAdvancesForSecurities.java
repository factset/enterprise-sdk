/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
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
 * FIServicerAdvancesForSecurities
 */
@JsonPropertyOrder({
  FIServicerAdvancesForSecurities.JSON_PROPERTY_PRINCIPAL,
  FIServicerAdvancesForSecurities.JSON_PROPERTY_INTEREST,
  FIServicerAdvancesForSecurities.JSON_PROPERTY_ADVANCE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIServicerAdvancesForSecurities implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private Double principal;

  public static final String JSON_PROPERTY_INTEREST = "interest";
  private Double interest;

  /**
   * Advance Type
   */
  public enum AdvanceTypeEnum {
    ADVANCES_ALL("Advances All"),
    
    ADVANCES_ALL_BUT_NEWLY_LIQDTD("Advances All But Newly Liqdtd"),
    
    DOES_NOT_ADVANCE("Does Not Advance"),
    
    PRINCIPAL_ONLY("Principal Only"),
    
    INTEREST_ONLY("Interest Only");

    private String value;

    AdvanceTypeEnum(String value) {
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
    public static AdvanceTypeEnum fromValue(String value) {
      for (AdvanceTypeEnum b : AdvanceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADVANCE_TYPE = "advanceType";
  private AdvanceTypeEnum advanceType;

  public FIServicerAdvancesForSecurities() { 
  }

  public FIServicerAdvancesForSecurities principal(Double principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Principal
   * @return principal
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Principal")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipal(Double principal) {
    this.principal = principal;
  }


  public FIServicerAdvancesForSecurities interest(Double interest) {
    this.interest = interest;
    return this;
  }

   /**
   * Interest
   * @return interest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Interest")
  @JsonProperty(JSON_PROPERTY_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getInterest() {
    return interest;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterest(Double interest) {
    this.interest = interest;
  }


  public FIServicerAdvancesForSecurities advanceType(AdvanceTypeEnum advanceType) {
    this.advanceType = advanceType;
    return this;
  }

   /**
   * Advance Type
   * @return advanceType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Advance Type")
  @JsonProperty(JSON_PROPERTY_ADVANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdvanceTypeEnum getAdvanceType() {
    return advanceType;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvanceType(AdvanceTypeEnum advanceType) {
    this.advanceType = advanceType;
  }


  /**
   * Return true if this FIServicerAdvancesForSecurities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIServicerAdvancesForSecurities fiServicerAdvancesForSecurities = (FIServicerAdvancesForSecurities) o;
    return Objects.equals(this.principal, fiServicerAdvancesForSecurities.principal) &&
        Objects.equals(this.interest, fiServicerAdvancesForSecurities.interest) &&
        Objects.equals(this.advanceType, fiServicerAdvancesForSecurities.advanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, interest, advanceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIServicerAdvancesForSecurities {\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    advanceType: ").append(toIndentedString(advanceType)).append("\n");
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

