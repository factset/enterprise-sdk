/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StreetAccountNews.models.FlattenedFiltersSectors;
import com.factset.sdk.StreetAccountNews.models.StructuredFiltersSectors;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * FilterSectorsResponseData
 */
@JsonPropertyOrder({
  FilterSectorsResponseData.JSON_PROPERTY_STRUCTURED,
  FilterSectorsResponseData.JSON_PROPERTY_FLATTENED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FilterSectorsResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STRUCTURED = "structured";
  private StructuredFiltersSectors structured;

  public static final String JSON_PROPERTY_FLATTENED = "flattened";
  private FlattenedFiltersSectors flattened;

  public FilterSectorsResponseData() { 
  }

  public FilterSectorsResponseData structured(StructuredFiltersSectors structured) {
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

  public StructuredFiltersSectors getStructured() {
    return structured;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructured(StructuredFiltersSectors structured) {
    this.structured = structured;
  }


  public FilterSectorsResponseData flattened(FlattenedFiltersSectors flattened) {
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

  public FlattenedFiltersSectors getFlattened() {
    return flattened;
  }


  @JsonProperty(JSON_PROPERTY_FLATTENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlattened(FlattenedFiltersSectors flattened) {
    this.flattened = flattened;
  }


  /**
   * Return true if this FilterSectorsResponse_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSectorsResponseData filterSectorsResponseData = (FilterSectorsResponseData) o;
    return Objects.equals(this.structured, filterSectorsResponseData.structured) &&
        Objects.equals(this.flattened, filterSectorsResponseData.flattened);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structured, flattened);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSectorsResponseData {\n");
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

