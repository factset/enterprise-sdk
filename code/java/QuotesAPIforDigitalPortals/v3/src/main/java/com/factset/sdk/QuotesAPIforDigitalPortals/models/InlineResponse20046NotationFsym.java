/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20046NotationFsymListing;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20046NotationFsymRegional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Notation-level FactSet identifiers of the financial instrument used primarily in FactSet products other than the MDG.
 */
@ApiModel(description = "Notation-level FactSet identifiers of the financial instrument used primarily in FactSet products other than the MDG.")
@JsonPropertyOrder({
  InlineResponse20046NotationFsym.JSON_PROPERTY_LISTING,
  InlineResponse20046NotationFsym.JSON_PROPERTY_REGIONAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20046NotationFsym implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LISTING = "listing";
  private InlineResponse20046NotationFsymListing listing;

  public static final String JSON_PROPERTY_REGIONAL = "regional";
  private InlineResponse20046NotationFsymRegional regional;

  public InlineResponse20046NotationFsym() { 
  }

  public InlineResponse20046NotationFsym listing(InlineResponse20046NotationFsymListing listing) {
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20046NotationFsymListing getListing() {
    return listing;
  }


  @JsonProperty(JSON_PROPERTY_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListing(InlineResponse20046NotationFsymListing listing) {
    this.listing = listing;
  }


  public InlineResponse20046NotationFsym regional(InlineResponse20046NotationFsymRegional regional) {
    this.regional = regional;
    return this;
  }

   /**
   * Get regional
   * @return regional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20046NotationFsymRegional getRegional() {
    return regional;
  }


  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegional(InlineResponse20046NotationFsymRegional regional) {
    this.regional = regional;
  }


  /**
   * Return true if this inline_response_200_46_notation_fsym object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20046NotationFsym inlineResponse20046NotationFsym = (InlineResponse20046NotationFsym) o;
    return Objects.equals(this.listing, inlineResponse20046NotationFsym.listing) &&
        Objects.equals(this.regional, inlineResponse20046NotationFsym.regional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing, regional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20046NotationFsym {\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
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
