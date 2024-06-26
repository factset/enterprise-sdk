/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20015DataNestedRegions;
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
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Details of a region.
 */
@ApiModel(description = "Details of a region.")
@JsonPropertyOrder({
  InlineResponse20015Data.JSON_PROPERTY_CODE,
  InlineResponse20015Data.JSON_PROPERTY_NAME,
  InlineResponse20015Data.JSON_PROPERTY_TYPE,
  InlineResponse20015Data.JSON_PROPERTY_NESTED_REGIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InlineResponse20015Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  /**
   * Type of the region.
   */
  public enum TypeEnum {
    CONTINENT("continent"),
    
    COUNTRY("country"),
    
    SUBDIVISION("subdivision"),
    
    MISC("misc"),
    
    COMPOUND("compound");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<TypeEnum> type = JsonNullable.<TypeEnum>undefined();

  public static final String JSON_PROPERTY_NESTED_REGIONS = "nestedRegions";
  private java.util.List<InlineResponse20015DataNestedRegions> nestedRegions = null;

  public InlineResponse20015Data() { 
  }

  public InlineResponse20015Data code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public InlineResponse20015Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the region.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the region.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public InlineResponse20015Data type(TypeEnum type) {
    this.type = JsonNullable.<TypeEnum>of(type);
    return this;
  }

   /**
   * Type of the region.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of the region.")
  @JsonIgnore

  public TypeEnum getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<TypeEnum> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<TypeEnum> type) {
    this.type = type;
  }

  public void setType(TypeEnum type) {
    this.type = JsonNullable.<TypeEnum>of(type);
  }


  public InlineResponse20015Data nestedRegions(java.util.List<InlineResponse20015DataNestedRegions> nestedRegions) {
    this.nestedRegions = nestedRegions;
    return this;
  }

  public InlineResponse20015Data addNestedRegionsItem(InlineResponse20015DataNestedRegions nestedRegionsItem) {
    if (this.nestedRegions == null) {
      this.nestedRegions = new java.util.ArrayList<>();
    }
    this.nestedRegions.add(nestedRegionsItem);
    return this;
  }

   /**
   * Nested regions of this region.
   * @return nestedRegions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Nested regions of this region.")
  @JsonProperty(JSON_PROPERTY_NESTED_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20015DataNestedRegions> getNestedRegions() {
    return nestedRegions;
  }


  @JsonProperty(JSON_PROPERTY_NESTED_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNestedRegions(java.util.List<InlineResponse20015DataNestedRegions> nestedRegions) {
    this.nestedRegions = nestedRegions;
  }


  /**
   * Return true if this inline_response_200_15_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015Data inlineResponse20015Data = (InlineResponse20015Data) o;
    return equalsNullable(this.code, inlineResponse20015Data.code) &&
        equalsNullable(this.name, inlineResponse20015Data.name) &&
        equalsNullable(this.type, inlineResponse20015Data.type) &&
        Objects.equals(this.nestedRegions, inlineResponse20015Data.nestedRegions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(name), hashCodeNullable(type), nestedRegions);
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
    sb.append("class InlineResponse20015Data {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nestedRegions: ").append(toIndentedString(nestedRegions)).append("\n");
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

