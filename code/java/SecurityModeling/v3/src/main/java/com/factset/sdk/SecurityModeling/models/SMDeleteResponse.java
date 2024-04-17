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
import com.factset.sdk.SecurityModeling.models.SMError;
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
import com.factset.sdk.SecurityModeling.JSON;


/**
 * SMDeleteResponse
 */
@JsonPropertyOrder({
  SMDeleteResponse.JSON_PROPERTY_SECURITY_NAME,
  SMDeleteResponse.JSON_PROPERTY_STATUS,
  SMDeleteResponse.JSON_PROPERTY_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SMDeleteResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITY_NAME = "securityName";
  private JsonNullable<String> securityName = JsonNullable.<String>undefined();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    FAILURE("failure");

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

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<java.util.List<SMError>> errors = JsonNullable.<java.util.List<SMError>>undefined();

  public SMDeleteResponse() { 
  }

  public SMDeleteResponse securityName(String securityName) {
    this.securityName = JsonNullable.<String>of(securityName);
    return this;
  }

   /**
   * Get securityName
   * @return securityName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSecurityName() {
        return securityName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSecurityName_JsonNullable() {
    return securityName;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_NAME)
  public void setSecurityName_JsonNullable(JsonNullable<String> securityName) {
    this.securityName = securityName;
  }

  public void setSecurityName(String securityName) {
    this.securityName = JsonNullable.<String>of(securityName);
  }


  public SMDeleteResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SMDeleteResponse errors(java.util.List<SMError> errors) {
    this.errors = JsonNullable.<java.util.List<SMError>>of(errors);
    return this;
  }

  public SMDeleteResponse addErrorsItem(SMError errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<java.util.List<SMError>>of(new java.util.ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<SMError> getErrors() {
        return errors.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<SMError>> getErrors_JsonNullable() {
    return errors;
  }
  
  @JsonProperty(JSON_PROPERTY_ERRORS)
  public void setErrors_JsonNullable(JsonNullable<java.util.List<SMError>> errors) {
    this.errors = errors;
  }

  public void setErrors(java.util.List<SMError> errors) {
    this.errors = JsonNullable.<java.util.List<SMError>>of(errors);
  }


  /**
   * Return true if this SMDeleteResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMDeleteResponse smDeleteResponse = (SMDeleteResponse) o;
    return equalsNullable(this.securityName, smDeleteResponse.securityName) &&
        Objects.equals(this.status, smDeleteResponse.status) &&
        equalsNullable(this.errors, smDeleteResponse.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(securityName), status, hashCodeNullable(errors));
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
    sb.append("class SMDeleteResponse {\n");
    sb.append("    securityName: ").append(toIndentedString(securityName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

