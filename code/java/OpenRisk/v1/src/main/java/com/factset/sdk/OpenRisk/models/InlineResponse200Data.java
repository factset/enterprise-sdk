/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

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
import com.factset.sdk.OpenRisk.JSON;


/**
 * InlineResponse200Data
 */
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_AVAILABLE,
  InlineResponse200Data.JSON_PROPERTY_CATEGORY,
  InlineResponse200Data.JSON_PROPERTY_CODE,
  InlineResponse200Data.JSON_PROPERTY_NAME,
  InlineResponse200Data.JSON_PROPERTY_VENDOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Boolean available;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private String vendor;

  public InlineResponse200Data() { 
  }

  @JsonCreator
  public InlineResponse200Data(
    @JsonProperty(value=JSON_PROPERTY_AVAILABLE, required=true) Boolean available, 
    @JsonProperty(value=JSON_PROPERTY_CATEGORY, required=true) String category, 
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) String code, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name, 
    @JsonProperty(value=JSON_PROPERTY_VENDOR, required=true) String vendor
  ) {
    this();
    this.available = available;
    this.category = category;
    this.code = code;
    this.name = name;
    this.vendor = vendor;
  }

  public InlineResponse200Data available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * If the model is available for use
   * @return available
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If the model is available for use")
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public InlineResponse200Data category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Model category
   * @return category
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Model category")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(String category) {
    this.category = category;
  }


  public InlineResponse200Data code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Model code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FDS:GLOBAL_EQUITY_M_V1", required = true, value = "Model code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public InlineResponse200Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Model name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Model name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse200Data vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Model vendor
   * @return vendor
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Model vendor")
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVendor() {
    return vendor;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.available, inlineResponse200Data.available) &&
        Objects.equals(this.category, inlineResponse200Data.category) &&
        Objects.equals(this.code, inlineResponse200Data.code) &&
        Objects.equals(this.name, inlineResponse200Data.name) &&
        Objects.equals(this.vendor, inlineResponse200Data.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, category, code, name, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

