/*
 * Security-Modeling API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SecurityModeling.models;

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
import com.factset.sdk.SecurityModeling.JSON;


/**
 * SMFields
 */
@JsonPropertyOrder({
  SMFields.JSON_PROPERTY_SECURITY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SMFields implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets securityType
   */
  public enum SecurityTypeEnum {
    BOND("Bond"),
    
    CCF("CCF");

    private String value;

    SecurityTypeEnum(String value) {
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
    public static SecurityTypeEnum fromValue(String value) {
      for (SecurityTypeEnum b : SecurityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SECURITY_TYPE = "securityType";
  private SecurityTypeEnum securityType;

  public SMFields() { 
  }

  @JsonCreator
  public SMFields(
    @JsonProperty(value=JSON_PROPERTY_SECURITY_TYPE, required=true) SecurityTypeEnum securityType
  ) {
    this();
    this.securityType = securityType;
  }

  public SMFields securityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * Get securityType
   * @return securityType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SecurityTypeEnum getSecurityType() {
    return securityType;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurityType(SecurityTypeEnum securityType) {
    this.securityType = securityType;
  }


  /**
   * Return true if this SMFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMFields smFields = (SMFields) o;
    return Objects.equals(this.securityType, smFields.securityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMFields {\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
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

