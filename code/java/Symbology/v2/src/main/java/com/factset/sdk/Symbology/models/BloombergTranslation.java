/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

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
import com.factset.sdk.Symbology.JSON;


/**
 * Symbol Translation data object.
 */
@ApiModel(description = "Symbol Translation data object.")
@JsonPropertyOrder({
  BloombergTranslation.JSON_PROPERTY_FSYM_ID,
  BloombergTranslation.JSON_PROPERTY_NAME,
  BloombergTranslation.JSON_PROPERTY_BBG_SECURITY_ID,
  BloombergTranslation.JSON_PROPERTY_BBG_COMPOSITE_ID,
  BloombergTranslation.JSON_PROPERTY_BBG_LISTING_ID,
  BloombergTranslation.JSON_PROPERTY_BBG_TICKER_LISTING,
  BloombergTranslation.JSON_PROPERTY_BBG_TICKER_COMPOSITE,
  BloombergTranslation.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BloombergTranslation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BBG_SECURITY_ID = "bbgSecurityId";
  private String bbgSecurityId;

  public static final String JSON_PROPERTY_BBG_COMPOSITE_ID = "bbgCompositeId";
  private String bbgCompositeId;

  public static final String JSON_PROPERTY_BBG_LISTING_ID = "bbgListingId";
  private String bbgListingId;

  public static final String JSON_PROPERTY_BBG_TICKER_LISTING = "bbgTickerListing";
  private String bbgTickerListing;

  public static final String JSON_PROPERTY_BBG_TICKER_COMPOSITE = "bbgTickerComposite";
  private String bbgTickerComposite;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public BloombergTranslation() { 
  }

  public BloombergTranslation fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "NSXGVV-L", value = "FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public BloombergTranslation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Proper Name of company or issuer.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Costco Wholesale Corporation", value = "Proper Name of company or issuer.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BloombergTranslation bbgSecurityId(String bbgSecurityId) {
    this.bbgSecurityId = bbgSecurityId;
    return this;
  }

   /**
   * Bloomberg Security Identifier.
   * @return bbgSecurityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BBG001S9KRQ7", value = "Bloomberg Security Identifier.")
  @JsonProperty(JSON_PROPERTY_BBG_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgSecurityId() {
    return bbgSecurityId;
  }


  @JsonProperty(JSON_PROPERTY_BBG_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgSecurityId(String bbgSecurityId) {
    this.bbgSecurityId = bbgSecurityId;
  }


  public BloombergTranslation bbgCompositeId(String bbgCompositeId) {
    this.bbgCompositeId = bbgCompositeId;
    return this;
  }

   /**
   * Bloomberg Security Identifier.
   * @return bbgCompositeId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BBG000F6H8W8", value = "Bloomberg Security Identifier.")
  @JsonProperty(JSON_PROPERTY_BBG_COMPOSITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgCompositeId() {
    return bbgCompositeId;
  }


  @JsonProperty(JSON_PROPERTY_BBG_COMPOSITE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgCompositeId(String bbgCompositeId) {
    this.bbgCompositeId = bbgCompositeId;
  }


  public BloombergTranslation bbgListingId(String bbgListingId) {
    this.bbgListingId = bbgListingId;
    return this;
  }

   /**
   * Bloomberg Security Identifier.
   * @return bbgListingId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BBG000F6HLL1", value = "Bloomberg Security Identifier.")
  @JsonProperty(JSON_PROPERTY_BBG_LISTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgListingId() {
    return bbgListingId;
  }


  @JsonProperty(JSON_PROPERTY_BBG_LISTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgListingId(String bbgListingId) {
    this.bbgListingId = bbgListingId;
  }


  public BloombergTranslation bbgTickerListing(String bbgTickerListing) {
    this.bbgTickerListing = bbgTickerListing;
    return this;
  }

   /**
   * Bloomberg Security Identifier.
   * @return bbgTickerListing
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "COST UW", value = "Bloomberg Security Identifier.")
  @JsonProperty(JSON_PROPERTY_BBG_TICKER_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgTickerListing() {
    return bbgTickerListing;
  }


  @JsonProperty(JSON_PROPERTY_BBG_TICKER_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgTickerListing(String bbgTickerListing) {
    this.bbgTickerListing = bbgTickerListing;
  }


  public BloombergTranslation bbgTickerComposite(String bbgTickerComposite) {
    this.bbgTickerComposite = bbgTickerComposite;
    return this;
  }

   /**
   * Bloomberg Security Identifier.
   * @return bbgTickerComposite
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "COST US", value = "Bloomberg Security Identifier.")
  @JsonProperty(JSON_PROPERTY_BBG_TICKER_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgTickerComposite() {
    return bbgTickerComposite;
  }


  @JsonProperty(JSON_PROPERTY_BBG_TICKER_COMPOSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgTickerComposite(String bbgTickerComposite) {
    this.bbgTickerComposite = bbgTickerComposite;
  }


  public BloombergTranslation requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier specified in the request
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "COST", value = "Identifier specified in the request")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this bloombergTranslation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BloombergTranslation bloombergTranslation = (BloombergTranslation) o;
    return Objects.equals(this.fsymId, bloombergTranslation.fsymId) &&
        Objects.equals(this.name, bloombergTranslation.name) &&
        Objects.equals(this.bbgSecurityId, bloombergTranslation.bbgSecurityId) &&
        Objects.equals(this.bbgCompositeId, bloombergTranslation.bbgCompositeId) &&
        Objects.equals(this.bbgListingId, bloombergTranslation.bbgListingId) &&
        Objects.equals(this.bbgTickerListing, bloombergTranslation.bbgTickerListing) &&
        Objects.equals(this.bbgTickerComposite, bloombergTranslation.bbgTickerComposite) &&
        Objects.equals(this.requestId, bloombergTranslation.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, name, bbgSecurityId, bbgCompositeId, bbgListingId, bbgTickerListing, bbgTickerComposite, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BloombergTranslation {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bbgSecurityId: ").append(toIndentedString(bbgSecurityId)).append("\n");
    sb.append("    bbgCompositeId: ").append(toIndentedString(bbgCompositeId)).append("\n");
    sb.append("    bbgListingId: ").append(toIndentedString(bbgListingId)).append("\n");
    sb.append("    bbgTickerListing: ").append(toIndentedString(bbgTickerListing)).append("\n");
    sb.append("    bbgTickerComposite: ").append(toIndentedString(bbgTickerComposite)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

