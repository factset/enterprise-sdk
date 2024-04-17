/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

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
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * ClientSalesRepresentativeDto
 */
@JsonPropertyOrder({
  ClientSalesRepresentativeDto.JSON_PROPERTY_FULLNAME,
  ClientSalesRepresentativeDto.JSON_PROPERTY_EMAIL_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientSalesRepresentativeDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FULLNAME = "fullname";
  private JsonNullable<String> fullname = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private JsonNullable<String> emailAddress = JsonNullable.<String>undefined();

  public ClientSalesRepresentativeDto() { 
  }

  public ClientSalesRepresentativeDto fullname(String fullname) {
    this.fullname = JsonNullable.<String>of(fullname);
    return this;
  }

   /**
   * Get fullname
   * @return fullname
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFullname() {
        return fullname.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FULLNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFullname_JsonNullable() {
    return fullname;
  }
  
  @JsonProperty(JSON_PROPERTY_FULLNAME)
  public void setFullname_JsonNullable(JsonNullable<String> fullname) {
    this.fullname = fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = JsonNullable.<String>of(fullname);
  }


  public ClientSalesRepresentativeDto emailAddress(String emailAddress) {
    this.emailAddress = JsonNullable.<String>of(emailAddress);
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getEmailAddress() {
        return emailAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmailAddress_JsonNullable() {
    return emailAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  public void setEmailAddress_JsonNullable(JsonNullable<String> emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = JsonNullable.<String>of(emailAddress);
  }


  /**
   * Return true if this ClientSalesRepresentativeDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSalesRepresentativeDto clientSalesRepresentativeDto = (ClientSalesRepresentativeDto) o;
    return equalsNullable(this.fullname, clientSalesRepresentativeDto.fullname) &&
        equalsNullable(this.emailAddress, clientSalesRepresentativeDto.emailAddress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fullname), hashCodeNullable(emailAddress));
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
    sb.append("class ClientSalesRepresentativeDto {\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

