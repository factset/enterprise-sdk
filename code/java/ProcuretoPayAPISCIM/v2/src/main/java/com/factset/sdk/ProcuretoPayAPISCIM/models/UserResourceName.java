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
 * The components of the user&#39;s real name. Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.
 */
@ApiModel(description = "The components of the user's real name. Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.")
@JsonPropertyOrder({
  UserResourceName.JSON_PROPERTY_FAMILY_NAME,
  UserResourceName.JSON_PROPERTY_GIVEN_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserResourceName implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public UserResourceName() { 
  }

  @JsonCreator
  public UserResourceName(
    @JsonProperty(value=JSON_PROPERTY_FAMILY_NAME, required=true) String familyName, 
    @JsonProperty(value=JSON_PROPERTY_GIVEN_NAME, required=true) String givenName
  ) {
    this();
    this.familyName = familyName;
    this.givenName = givenName;
  }

  public UserResourceName familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * The family name of the User, or last name in most Western languages (e.g., &#39;Jensen&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).
   * @return familyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Doe", required = true, value = "The family name of the User, or last name in most Western languages (e.g., 'Jensen' given the full name 'Ms. Barbara J Jensen, III').")
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public UserResourceName givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The given name of the User, or first name in most Western languages (e.g., &#39;Barbara&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).
   * @return givenName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John", required = true, value = "The given name of the User, or first name in most Western languages (e.g., 'Barbara' given the full name 'Ms. Barbara J Jensen, III').")
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  /**
   * Return true if this UserResource_name object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResourceName userResourceName = (UserResourceName) o;
    return Objects.equals(this.familyName, userResourceName.familyName) &&
        Objects.equals(this.givenName, userResourceName.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResourceName {\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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
