/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
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
 * LocationResourceMeta
 */
@JsonPropertyOrder({
  LocationResourceMeta.JSON_PROPERTY_RESOURCE_TYPE,
  LocationResourceMeta.JSON_PROPERTY_CREATED,
  LocationResourceMeta.JSON_PROPERTY_LAST_MODIFIED,
  LocationResourceMeta.JSON_PROPERTY_LOCATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LocationResourceMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private String resourceType;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private String lastModified;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public LocationResourceMeta() { 
  }

  public LocationResourceMeta resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Location", value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public LocationResourceMeta created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2019-02-11T08:44:19+00:00", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(String created) {
    this.created = created;
  }


  public LocationResourceMeta lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-01-12T03:11:13+00:00", value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public LocationResourceMeta location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://api.factset.com/scim/v2/Locations/1598276", value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * Return true if this LocationResource_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationResourceMeta locationResourceMeta = (LocationResourceMeta) o;
    return Objects.equals(this.resourceType, locationResourceMeta.resourceType) &&
        Objects.equals(this.created, locationResourceMeta.created) &&
        Objects.equals(this.lastModified, locationResourceMeta.lastModified) &&
        Objects.equals(this.location, locationResourceMeta.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, created, lastModified, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationResourceMeta {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

