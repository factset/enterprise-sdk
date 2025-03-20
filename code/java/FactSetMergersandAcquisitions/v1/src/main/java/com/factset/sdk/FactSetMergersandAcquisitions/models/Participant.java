/*
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetMergersandAcquisitions.models;

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
import com.factset.sdk.FactSetMergersandAcquisitions.JSON;


/**
 * Participant Object
 */
@ApiModel(description = "Participant Object")
@JsonPropertyOrder({
  Participant.JSON_PROPERTY_FSYM_ID,
  Participant.JSON_PROPERTY_NAME,
  Participant.JSON_PROPERTY_INDUSTRY,
  Participant.JSON_PROPERTY_ULTIMATE_PARENT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Participant implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private JsonNullable<String> industry = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ULTIMATE_PARENT_ID = "ultimateParentId";
  private JsonNullable<String> ultimateParentId = JsonNullable.<String>undefined();

  public Participant() { 
  }

  @JsonCreator
  public Participant(
    @JsonProperty(value=JSON_PROPERTY_FSYM_ID, required=true) String fsymId
  ) {
    this();
    this.fsymId = fsymId;
  }

  public Participant fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
   * @return fsymId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "000N1N-E", required = true, value = "FactSet Permanent Identifier of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).")
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


  public Participant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Entity name of the participant.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "International Business Machines Corp.", value = "Entity name of the participant.")
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


  public Participant industry(String industry) {
    this.industry = JsonNullable.<String>of(industry);
    return this;
  }

   /**
   * Industry of the participant based on the FactSet Industry Classification system.
   * @return industry
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Information Technology Services", value = "Industry of the participant based on the FactSet Industry Classification system.")
  @JsonIgnore

  public String getIndustry() {
        return industry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIndustry_JsonNullable() {
    return industry;
  }
  
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  public void setIndustry_JsonNullable(JsonNullable<String> industry) {
    this.industry = industry;
  }

  public void setIndustry(String industry) {
    this.industry = JsonNullable.<String>of(industry);
  }


  public Participant ultimateParentId(String ultimateParentId) {
    this.ultimateParentId = JsonNullable.<String>of(ultimateParentId);
    return this;
  }

   /**
   * FactSet Permanent Identifier of the ultimate parent of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
   * @return ultimateParentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "000N1N-E", value = "FactSet Permanent Identifier of the ultimate parent of the participant. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).")
  @JsonIgnore

  public String getUltimateParentId() {
        return ultimateParentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ULTIMATE_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUltimateParentId_JsonNullable() {
    return ultimateParentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ULTIMATE_PARENT_ID)
  public void setUltimateParentId_JsonNullable(JsonNullable<String> ultimateParentId) {
    this.ultimateParentId = ultimateParentId;
  }

  public void setUltimateParentId(String ultimateParentId) {
    this.ultimateParentId = JsonNullable.<String>of(ultimateParentId);
  }


  /**
   * Return true if this Participant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.fsymId, participant.fsymId) &&
        Objects.equals(this.name, participant.name) &&
        equalsNullable(this.industry, participant.industry) &&
        equalsNullable(this.ultimateParentId, participant.ultimateParentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, name, hashCodeNullable(industry), hashCodeNullable(ultimateParentId));
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
    sb.append("class Participant {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    ultimateParentId: ").append(toIndentedString(ultimateParentId)).append("\n");
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

