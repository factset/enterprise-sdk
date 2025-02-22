/*
 * ID Lookup API
 * The ID Lookup API is a fuzzy search service that allows users to resolve symbols but are unable to find them elsewhere. The ID Lookup API allows users to search for entities in a wide variety of ways including, but not limited to, tickers, CUSIPs, URLs, a company’s brands, names and descriptions. The API does not require a complete query and will return different lists of results with each additional character, which enables users to iterate and adjust queries to return the desired results. Each search query returns a list of suggestions that can include every entity type offered by the API based on a matching and ranking algorithm.   The API response returns multiple different symbols that map to both internal FactSet identifiers like security or entity IDs as well as external identifiers like exchange tickers, Morningstar symbols and ISINs. This gives users flexibility in mapping identifiers across the FactSet universe.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IDLookup.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IDLookup.models.ResponseDetailsUnderlying;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IDLookup.JSON;


/**
 * Response Details Object
 */
@ApiModel(description = "Response Details Object")
@JsonPropertyOrder({
  ResponseDetails.JSON_PROPERTY_DATASET,
  ResponseDetails.JSON_PROPERTY_ID,
  ResponseDetails.JSON_PROPERTY_ID_TYPE,
  ResponseDetails.JSON_PROPERTY_NAME,
  ResponseDetails.JSON_PROPERTY_ISSUER_NAME,
  ResponseDetails.JSON_PROPERTY_ENTITY_ID,
  ResponseDetails.JSON_PROPERTY_UNDERLYING,
  ResponseDetails.JSON_PROPERTY_FSYM_REGIONAL_ID,
  ResponseDetails.JSON_PROPERTY_FSYM_LISTING_ID,
  ResponseDetails.JSON_PROPERTY_FSYM_UNDERLYING_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ResponseDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATASET = "dataset";
  private String dataset;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Type of the identifier. * &#x60;symbol&#x60;: The value in symbol is associated with the name of the related dataset. It is the only value that should be passed back to any FactSet services to retrieve data. Example: M-US.   * &#x60;tickerRegion&#x60;: FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). Example: MKSXX-US.   * &#x60;tickerExchange&#x60;: FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544). Example: N3ZWW5.FI-CEP.    * &#x60;entityId&#x60;: FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Example: 000F9X-E. 
   */
  public enum IdTypeEnum {
    SYMBOL("symbol"),
    
    ENTITYID("entityId"),
    
    TICKERREGION("tickerRegion"),
    
    TICKEREXCHANGE("tickerExchange");

    private String value;

    IdTypeEnum(String value) {
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
    public static IdTypeEnum fromValue(String value) {
      for (IdTypeEnum b : IdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private IdTypeEnum idType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ISSUER_NAME = "issuerName";
  private String issuerName;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_UNDERLYING = "underlying";
  private ResponseDetailsUnderlying underlying;

  public static final String JSON_PROPERTY_FSYM_REGIONAL_ID = "fsymRegionalId";
  private String fsymRegionalId;

  public static final String JSON_PROPERTY_FSYM_LISTING_ID = "fsymListingId";
  private String fsymListingId;

  public static final String JSON_PROPERTY_FSYM_UNDERLYING_ID = "fsymUnderlyingId";
  private String fsymUnderlyingId;

  public ResponseDetails() { 
  }

  @JsonCreator
  public ResponseDetails(
    @JsonProperty(value=JSON_PROPERTY_DATASET, required=true) String dataset, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name
  ) {
    this();
    this.dataset = dataset;
    this.name = name;
  }

  public ResponseDetails dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * Type of dataset.
   * @return dataset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "equities", required = true, value = "Type of dataset.")
  @JsonProperty(JSON_PROPERTY_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataset() {
    return dataset;
  }


  @JsonProperty(JSON_PROPERTY_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataset(String dataset) {
    this.dataset = dataset;
  }


  public ResponseDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a market security pertaining to the dataset .
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Identifier of a market security pertaining to the dataset .")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ResponseDetails idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Type of the identifier. * &#x60;symbol&#x60;: The value in symbol is associated with the name of the related dataset. It is the only value that should be passed back to any FactSet services to retrieve data. Example: M-US.   * &#x60;tickerRegion&#x60;: FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). Example: MKSXX-US.   * &#x60;tickerExchange&#x60;: FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544). Example: N3ZWW5.FI-CEP.    * &#x60;entityId&#x60;: FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Example: 000F9X-E. 
   * @return idType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "symbol", value = "Type of the identifier. * `symbol`: The value in symbol is associated with the name of the related dataset. It is the only value that should be passed back to any FactSet services to retrieve data. Example: M-US.   * `tickerRegion`: FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). Example: MKSXX-US.   * `tickerExchange`: FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544). Example: N3ZWW5.FI-CEP.    * `entityId`: FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Example: 000F9X-E. ")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdTypeEnum getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  public ResponseDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the related dataset.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Factset Research Systems Inc", required = true, value = "Name of the related dataset.")
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


  public ResponseDetails issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of the issuer.
   * @return issuerName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SentinelOne, Inc.", value = "Name of the issuer.")
  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerName() {
    return issuerName;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public ResponseDetails entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). 
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "000F9X-E", value = "FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). ")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public ResponseDetails underlying(ResponseDetailsUnderlying underlying) {
    this.underlying = underlying;
    return this;
  }

   /**
   * Get underlying
   * @return underlying
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseDetailsUnderlying getUnderlying() {
    return underlying;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlying(ResponseDetailsUnderlying underlying) {
    this.underlying = underlying;
  }


  public ResponseDetails fsymRegionalId(String fsymRegionalId) {
    this.fsymRegionalId = fsymRegionalId;
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).
   * @return fsymRegionalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "LHRR0T-R", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).")
  @JsonProperty(JSON_PROPERTY_FSYM_REGIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymRegionalId() {
    return fsymRegionalId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_REGIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymRegionalId(String fsymRegionalId) {
    this.fsymRegionalId = fsymRegionalId;
  }


  public ResponseDetails fsymListingId(String fsymListingId) {
    this.fsymListingId = fsymListingId;
    return this;
  }

   /**
   * FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading.
   * @return fsymListingId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "NSXGVV-L", value = "FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading.")
  @JsonProperty(JSON_PROPERTY_FSYM_LISTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymListingId() {
    return fsymListingId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_LISTING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymListingId(String fsymListingId) {
    this.fsymListingId = fsymListingId;
  }


  public ResponseDetails fsymUnderlyingId(String fsymUnderlyingId) {
    this.fsymUnderlyingId = fsymUnderlyingId;
    return this;
  }

   /**
   * FactSet Underlying Id
   * @return fsymUnderlyingId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "A", value = "FactSet Underlying Id")
  @JsonProperty(JSON_PROPERTY_FSYM_UNDERLYING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymUnderlyingId() {
    return fsymUnderlyingId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_UNDERLYING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymUnderlyingId(String fsymUnderlyingId) {
    this.fsymUnderlyingId = fsymUnderlyingId;
  }


  /**
   * Return true if this responseDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDetails responseDetails = (ResponseDetails) o;
    return Objects.equals(this.dataset, responseDetails.dataset) &&
        Objects.equals(this.id, responseDetails.id) &&
        Objects.equals(this.idType, responseDetails.idType) &&
        Objects.equals(this.name, responseDetails.name) &&
        Objects.equals(this.issuerName, responseDetails.issuerName) &&
        Objects.equals(this.entityId, responseDetails.entityId) &&
        Objects.equals(this.underlying, responseDetails.underlying) &&
        Objects.equals(this.fsymRegionalId, responseDetails.fsymRegionalId) &&
        Objects.equals(this.fsymListingId, responseDetails.fsymListingId) &&
        Objects.equals(this.fsymUnderlyingId, responseDetails.fsymUnderlyingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, id, idType, name, issuerName, entityId, underlying, fsymRegionalId, fsymListingId, fsymUnderlyingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDetails {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    fsymRegionalId: ").append(toIndentedString(fsymRegionalId)).append("\n");
    sb.append("    fsymListingId: ").append(toIndentedString(fsymListingId)).append("\n");
    sb.append("    fsymUnderlyingId: ").append(toIndentedString(fsymUnderlyingId)).append("\n");
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

