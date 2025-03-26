/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
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
import com.factset.sdk.ProcuretoPayAPISCIM.models.LocationResourceReference;
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
 * FederationResourceLocation
 */
@JsonPropertyOrder({
  FederationResourceLocation.JSON_PROPERTY_VALUE,
  FederationResourceLocation.JSON_PROPERTY_$_REF,
  FederationResourceLocation.JSON_PROPERTY_DISPLAY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FederationResourceLocation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_$_REF = "$ref";
  private String $ref;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public FederationResourceLocation() { 
  }

  @JsonCreator
  public FederationResourceLocation(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) String value
  ) {
    this();
    this.value = value;
  }

  public FederationResourceLocation value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Identifier of the Location.
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1598276", required = true, value = "Identifier of the Location.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public FederationResourceLocation $ref(String $ref) {
    this.$ref = $ref;
    return this;
  }

   /**
   * The URI corresponding to a SCIM resource that is this Location.
   * @return $ref
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://api.factset.com/scim/v2/Locations/1598276", value = "The URI corresponding to a SCIM resource that is this Location.")
  @JsonProperty(JSON_PROPERTY_$_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get$Ref() {
    return $ref;
  }


  @JsonProperty(JSON_PROPERTY_$_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set$Ref(String $ref) {
    this.$ref = $ref;
  }


  public FederationResourceLocation display(String display) {
    this.display = display;
    return this;
  }

   /**
   * A human-readable name, primarily used for display purposes.
   * @return display
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FIN Wealth Management", value = "A human-readable name, primarily used for display purposes.")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(String display) {
    this.display = display;
  }


  /**
   * Return true if this FederationResourceLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederationResourceLocation federationResourceLocation = (FederationResourceLocation) o;
    return Objects.equals(this.value, federationResourceLocation.value) &&
        Objects.equals(this.$ref, federationResourceLocation.$ref) &&
        Objects.equals(this.display, federationResourceLocation.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, $ref, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederationResourceLocation {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

