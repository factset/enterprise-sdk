/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

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
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * A complex type that specifies bulk configuration options.
 */
@ApiModel(description = "A complex type that specifies bulk configuration options.")
@JsonPropertyOrder({
  ServiceProviderConfigBulk.JSON_PROPERTY_SUPPORTED,
  ServiceProviderConfigBulk.JSON_PROPERTY_MAX_OPERATIONS,
  ServiceProviderConfigBulk.JSON_PROPERTY_MAX_PAYLOAD_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ServiceProviderConfigBulk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUPPORTED = "supported";
  private Boolean supported;

  public static final String JSON_PROPERTY_MAX_OPERATIONS = "maxOperations";
  private Integer maxOperations;

  public static final String JSON_PROPERTY_MAX_PAYLOAD_SIZE = "maxPayloadSize";
  private Integer maxPayloadSize;

  public ServiceProviderConfigBulk() { 
  }

  @JsonCreator
  public ServiceProviderConfigBulk(
    @JsonProperty(JSON_PROPERTY_SUPPORTED) Boolean supported, 
    @JsonProperty(JSON_PROPERTY_MAX_OPERATIONS) Integer maxOperations, 
    @JsonProperty(JSON_PROPERTY_MAX_PAYLOAD_SIZE) Integer maxPayloadSize
  ) {
    this();
    this.supported = supported;
    this.maxOperations = maxOperations;
    this.maxPayloadSize = maxPayloadSize;
  }

   /**
   * A Boolean value specifying whether or not the operation is supported.
   * @return supported
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "A Boolean value specifying whether or not the operation is supported.")
  @JsonProperty(JSON_PROPERTY_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSupported() {
    return supported;
  }




   /**
   * An integer value specifying the maximum number of operations.
   * @return maxOperations
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "An integer value specifying the maximum number of operations.")
  @JsonProperty(JSON_PROPERTY_MAX_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxOperations() {
    return maxOperations;
  }




   /**
   * An integer value specifying the maximum payload size in bytes.
   * @return maxPayloadSize
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "An integer value specifying the maximum payload size in bytes.")
  @JsonProperty(JSON_PROPERTY_MAX_PAYLOAD_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxPayloadSize() {
    return maxPayloadSize;
  }




  /**
   * Return true if this ServiceProviderConfig_bulk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProviderConfigBulk serviceProviderConfigBulk = (ServiceProviderConfigBulk) o;
    return Objects.equals(this.supported, serviceProviderConfigBulk.supported) &&
        Objects.equals(this.maxOperations, serviceProviderConfigBulk.maxOperations) &&
        Objects.equals(this.maxPayloadSize, serviceProviderConfigBulk.maxPayloadSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, maxOperations, maxPayloadSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProviderConfigBulk {\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    maxOperations: ").append(toIndentedString(maxOperations)).append("\n");
    sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
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

