/*
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetESG.models;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetESG.JSON;


/**
 * Spotlights
 */
@JsonPropertyOrder({
  Spotlights.JSON_PROPERTY_DATE,
  Spotlights.JSON_PROPERTY_FSYM_ID,
  Spotlights.JSON_PROPERTY_REQUEST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Spotlights implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public Spotlights() { 
  }

  @JsonCreator
  public Spotlights(
    @JsonProperty(value=JSON_PROPERTY_DATE, required=true) LocalDate date, 
    @JsonProperty(value=JSON_PROPERTY_FSYM_ID, required=true) String fsymId, 
    @JsonProperty(value=JSON_PROPERTY_REQUEST_ID, required=true) String requestId
  ) {
    this();
    this.date = date;
    this.fsymId = fsymId;
    this.requestId = requestId;
  }

  public Spotlights date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Ending date for the period requested expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sat May 02 00:00:00 UTC 2020", required = true, value = "Ending date for the period requested expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public Spotlights fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "001MF1-E", required = true, value = "FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public Spotlights requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "US0231351067", required = true, value = "Identifier that was used for the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Spotlights putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this Spotlights object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spotlights spotlights = (Spotlights) o;
    return Objects.equals(this.date, spotlights.date) &&
        Objects.equals(this.fsymId, spotlights.fsymId) &&
        Objects.equals(this.requestId, spotlights.requestId)&&
        Objects.equals(this.additionalProperties, spotlights.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, fsymId, requestId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spotlights {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

