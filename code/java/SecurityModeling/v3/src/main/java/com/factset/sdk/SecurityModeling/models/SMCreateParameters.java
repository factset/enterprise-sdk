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
import com.factset.sdk.SecurityModeling.models.OneOfSMFields;
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
 * SMCreateParameters
 */
@JsonPropertyOrder({
  SMCreateParameters.JSON_PROPERTY_SECURITY_NAME,
  SMCreateParameters.JSON_PROPERTY_LOCATION,
  SMCreateParameters.JSON_PROPERTY_ASOFDATE,
  SMCreateParameters.JSON_PROPERTY_FIELDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SMCreateParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITY_NAME = "securityName";
  private String securityName;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ASOFDATE = "asofdate";
  private JsonNullable<String> asofdate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private OneOfSMFields fields;

  public SMCreateParameters() { 
  }

  @JsonCreator
  public SMCreateParameters(
    @JsonProperty(value=JSON_PROPERTY_SECURITY_NAME, required=true) String securityName, 
    @JsonProperty(value=JSON_PROPERTY_FIELDS, required=true) OneOfSMFields fields
  ) {
    this();
    this.securityName = securityName;
    this.fields = fields;
  }

  public SMCreateParameters securityName(String securityName) {
    this.securityName = securityName;
    return this;
  }

   /**
   * Get securityName
   * @return securityName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecurityName() {
    return securityName;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurityName(String securityName) {
    this.securityName = securityName;
  }


  public SMCreateParameters location(String location) {
    this.location = JsonNullable.<String>of(location);
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocation_JsonNullable() {
    return location;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATION)
  public void setLocation_JsonNullable(JsonNullable<String> location) {
    this.location = location;
  }

  public void setLocation(String location) {
    this.location = JsonNullable.<String>of(location);
  }


  public SMCreateParameters asofdate(String asofdate) {
    this.asofdate = JsonNullable.<String>of(asofdate);
    return this;
  }

   /**
   * Get asofdate
   * @return asofdate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getAsofdate() {
        return asofdate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASOFDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAsofdate_JsonNullable() {
    return asofdate;
  }
  
  @JsonProperty(JSON_PROPERTY_ASOFDATE)
  public void setAsofdate_JsonNullable(JsonNullable<String> asofdate) {
    this.asofdate = asofdate;
  }

  public void setAsofdate(String asofdate) {
    this.asofdate = JsonNullable.<String>of(asofdate);
  }


  public SMCreateParameters fields(OneOfSMFields fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OneOfSMFields getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFields(OneOfSMFields fields) {
    this.fields = fields;
  }


  /**
   * Return true if this SMCreateParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMCreateParameters smCreateParameters = (SMCreateParameters) o;
    return Objects.equals(this.securityName, smCreateParameters.securityName) &&
        equalsNullable(this.location, smCreateParameters.location) &&
        equalsNullable(this.asofdate, smCreateParameters.asofdate) &&
        Objects.equals(this.fields, smCreateParameters.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityName, hashCodeNullable(location), hashCodeNullable(asofdate), fields);
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
    sb.append("class SMCreateParameters {\n");
    sb.append("    securityName: ").append(toIndentedString(securityName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    asofdate: ").append(toIndentedString(asofdate)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

