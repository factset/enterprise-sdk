/*
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeNews.models;

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
import com.factset.sdk.RealTimeNews.JSON;


/**
 * Error status for the requested identifier.
 */
@ApiModel(description = "Error status for the requested identifier.")
@JsonPropertyOrder({
  PostNewsArticleListByIndexDataIdentifiersItemsStatus.JSON_PROPERTY_CODE,
  PostNewsArticleListByIndexDataIdentifiersItemsStatus.JSON_PROPERTY_IDENTIFIER,
  PostNewsArticleListByIndexDataIdentifiersItemsStatus.JSON_PROPERTY_DETAILS,
  PostNewsArticleListByIndexDataIdentifiersItemsStatus.JSON_PROPERTY_ENCRYPTED_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PostNewsArticleListByIndexDataIdentifiersItemsStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Code of the error condition. | Value | Description | | --- | --- | | none | No error. | | parameter | The provided identifier does not refer to a valid listing level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |  
   */
  public enum CodeEnum {
    NONE("none"),
    
    PARAMETER("parameter"),
    
    ENTITLEMENT("entitlement"),
    
    IDENTIFIERMAPPING("identifierMapping");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<CodeEnum> code = JsonNullable.<CodeEnum>undefined();

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private JsonNullable<String> identifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETAILS = "details";
  private JsonNullable<String> details = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCRYPTED_DETAILS = "encryptedDetails";
  private JsonNullable<String> encryptedDetails = JsonNullable.<String>undefined();

  public PostNewsArticleListByIndexDataIdentifiersItemsStatus() { 
  }

  public PostNewsArticleListByIndexDataIdentifiersItemsStatus code(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
    return this;
  }

   /**
   * Code of the error condition. | Value | Description | | --- | --- | | none | No error. | | parameter | The provided identifier does not refer to a valid listing level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |  
   * @return code
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "none", value = "Code of the error condition. | Value | Description | | --- | --- | | none | No error. | | parameter | The provided identifier does not refer to a valid listing level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |  ")
  @JsonIgnore

  public CodeEnum getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CodeEnum> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<CodeEnum> code) {
    this.code = code;
  }

  public void setCode(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
  }


  public PostNewsArticleListByIndexDataIdentifiersItemsStatus identifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
    return this;
  }

   /**
   * Provided identifier.
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Provided identifier.")
  @JsonIgnore

  public String getIdentifier() {
        return identifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdentifier_JsonNullable() {
    return identifier;
  }
  
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  public void setIdentifier_JsonNullable(JsonNullable<String> identifier) {
    this.identifier = identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
  }


  public PostNewsArticleListByIndexDataIdentifiersItemsStatus details(String details) {
    this.details = JsonNullable.<String>of(details);
    return this;
  }

   /**
   * A human-readable, unstructured explanation specific to this occurrence of the problem.
   * @return details
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "A human-readable, unstructured explanation specific to this occurrence of the problem.")
  @JsonIgnore

  public String getDetails() {
        return details.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDetails_JsonNullable() {
    return details;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAILS)
  public void setDetails_JsonNullable(JsonNullable<String> details) {
    this.details = details;
  }

  public void setDetails(String details) {
    this.details = JsonNullable.<String>of(details);
  }


  public PostNewsArticleListByIndexDataIdentifiersItemsStatus encryptedDetails(String encryptedDetails) {
    this.encryptedDetails = JsonNullable.<String>of(encryptedDetails);
    return this;
  }

   /**
   * Base64-encoded internal details about the error.
   * @return encryptedDetails
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Lorem ipsum", value = "Base64-encoded internal details about the error.")
  @JsonIgnore

  public String getEncryptedDetails() {
        return encryptedDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPTED_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEncryptedDetails_JsonNullable() {
    return encryptedDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_DETAILS)
  public void setEncryptedDetails_JsonNullable(JsonNullable<String> encryptedDetails) {
    this.encryptedDetails = encryptedDetails;
  }

  public void setEncryptedDetails(String encryptedDetails) {
    this.encryptedDetails = JsonNullable.<String>of(encryptedDetails);
  }


  /**
   * Return true if this PostNewsArticleListByIndexDataIdentifiersItems_status object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNewsArticleListByIndexDataIdentifiersItemsStatus postNewsArticleListByIndexDataIdentifiersItemsStatus = (PostNewsArticleListByIndexDataIdentifiersItemsStatus) o;
    return equalsNullable(this.code, postNewsArticleListByIndexDataIdentifiersItemsStatus.code) &&
        equalsNullable(this.identifier, postNewsArticleListByIndexDataIdentifiersItemsStatus.identifier) &&
        equalsNullable(this.details, postNewsArticleListByIndexDataIdentifiersItemsStatus.details) &&
        equalsNullable(this.encryptedDetails, postNewsArticleListByIndexDataIdentifiersItemsStatus.encryptedDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(identifier), hashCodeNullable(details), hashCodeNullable(encryptedDetails));
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
    sb.append("class PostNewsArticleListByIndexDataIdentifiersItemsStatus {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    encryptedDetails: ").append(toIndentedString(encryptedDetails)).append("\n");
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

