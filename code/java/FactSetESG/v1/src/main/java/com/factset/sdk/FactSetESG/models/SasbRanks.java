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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetESG.JSON;


/**
 * SasbRanks
 */
@JsonPropertyOrder({
  SasbRanks.JSON_PROPERTY_DATE,
  SasbRanks.JSON_PROPERTY_FSYM_ID,
  SasbRanks.JSON_PROPERTY_REQUEST_ID,
  SasbRanks.JSON_PROPERTY_SASB_CATEGORY,
  SasbRanks.JSON_PROPERTY_SASB_RANK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SasbRanks implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_SASB_CATEGORY = "sasbCategory";
  private JsonNullable<String> sasbCategory = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SASB_RANK = "sasbRank";
  private JsonNullable<String> sasbRank = JsonNullable.<String>undefined();

  public SasbRanks() { 
  }

  public SasbRanks date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * Date for the period requested expressed in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed Sep 30 00:00:00 UTC 2020", value = "Date for the period requested expressed in YYYY-MM-DD format.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public SasbRanks fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "000BJT-E", value = "FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public SasbRanks requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ADBE-US", value = "Identifier that was used for the request.")
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


  public SasbRanks sasbCategory(String sasbCategory) {
    this.sasbCategory = JsonNullable.<String>of(sasbCategory);
    return this;
  }

   /**
   * The specific SASB &#39;category&#39; the Rank is referring to.
   * @return sasbCategory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ALLCATEGORIES", value = "The specific SASB 'category' the Rank is referring to.")
  @JsonIgnore

  public String getSasbCategory() {
        return sasbCategory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SASB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSasbCategory_JsonNullable() {
    return sasbCategory;
  }
  
  @JsonProperty(JSON_PROPERTY_SASB_CATEGORY)
  public void setSasbCategory_JsonNullable(JsonNullable<String> sasbCategory) {
    this.sasbCategory = sasbCategory;
  }

  public void setSasbCategory(String sasbCategory) {
    this.sasbCategory = JsonNullable.<String>of(sasbCategory);
  }


  public SasbRanks sasbRank(String sasbRank) {
    this.sasbRank = JsonNullable.<String>of(sasbRank);
    return this;
  }

   /**
   * The SASB Rank for the given category in Proper format.   |Rank|Industry Percentile Range (%)|   |---|---|   |Leader|90 - 100|   |Above Average|70 - 89.9|   |Average|30 - 69.9|   |Below Average|10 - 29.9|   |Laggard|0 - 9.9| 
   * @return sasbRank
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Average", value = "The SASB Rank for the given category in Proper format.   |Rank|Industry Percentile Range (%)|   |---|---|   |Leader|90 - 100|   |Above Average|70 - 89.9|   |Average|30 - 69.9|   |Below Average|10 - 29.9|   |Laggard|0 - 9.9| ")
  @JsonIgnore

  public String getSasbRank() {
        return sasbRank.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SASB_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSasbRank_JsonNullable() {
    return sasbRank;
  }
  
  @JsonProperty(JSON_PROPERTY_SASB_RANK)
  public void setSasbRank_JsonNullable(JsonNullable<String> sasbRank) {
    this.sasbRank = sasbRank;
  }

  public void setSasbRank(String sasbRank) {
    this.sasbRank = JsonNullable.<String>of(sasbRank);
  }


  /**
   * Return true if this sasbRanks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasbRanks sasbRanks = (SasbRanks) o;
    return equalsNullable(this.date, sasbRanks.date) &&
        equalsNullable(this.fsymId, sasbRanks.fsymId) &&
        Objects.equals(this.requestId, sasbRanks.requestId) &&
        equalsNullable(this.sasbCategory, sasbRanks.sasbCategory) &&
        equalsNullable(this.sasbRank, sasbRanks.sasbRank);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(date), hashCodeNullable(fsymId), requestId, hashCodeNullable(sasbCategory), hashCodeNullable(sasbRank));
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
    sb.append("class SasbRanks {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sasbCategory: ").append(toIndentedString(sasbCategory)).append("\n");
    sb.append("    sasbRank: ").append(toIndentedString(sasbRank)).append("\n");
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

