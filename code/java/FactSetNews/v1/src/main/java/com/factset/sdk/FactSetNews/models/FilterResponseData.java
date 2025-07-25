/*
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetNews.models.FlattenedFilters;
import com.factset.sdk.FactSetNews.models.StructuredFilters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetNews.JSON;


/**
 * FilterResponseData
 */
@JsonPropertyOrder({
  FilterResponseData.JSON_PROPERTY_STRUCTURED,
  FilterResponseData.JSON_PROPERTY_FLATTENED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilterResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STRUCTURED = "structured";
  private StructuredFilters structured;

  public static final String JSON_PROPERTY_FLATTENED = "flattened";
  private FlattenedFilters flattened;

  public FilterResponseData() { 
  }

  public FilterResponseData structured(StructuredFilters structured) {
    this.structured = structured;
    return this;
  }

   /**
   * Get structured
   * @return structured
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRUCTURED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StructuredFilters getStructured() {
    return structured;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructured(StructuredFilters structured) {
    this.structured = structured;
  }


  public FilterResponseData flattened(FlattenedFilters flattened) {
    this.flattened = flattened;
    return this;
  }

   /**
   * Get flattened
   * @return flattened
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLATTENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FlattenedFilters getFlattened() {
    return flattened;
  }


  @JsonProperty(JSON_PROPERTY_FLATTENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlattened(FlattenedFilters flattened) {
    this.flattened = flattened;
  }


  /**
   * Return true if this FilterResponse_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterResponseData filterResponseData = (FilterResponseData) o;
    return Objects.equals(this.structured, filterResponseData.structured) &&
        Objects.equals(this.flattened, filterResponseData.flattened);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structured, flattened);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterResponseData {\n");
    sb.append("    structured: ").append(toIndentedString(structured)).append("\n");
    sb.append("    flattened: ").append(toIndentedString(flattened)).append("\n");
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

