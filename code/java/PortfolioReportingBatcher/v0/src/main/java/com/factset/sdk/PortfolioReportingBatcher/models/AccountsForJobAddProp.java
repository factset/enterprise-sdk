/*
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application.
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PortfolioReportingBatcher.models;

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
import com.factset.sdk.PortfolioReportingBatcher.JSON;


/**
 * The details of the account under the task in the object key
 */
@ApiModel(description = "The details of the account under the task in the object key")
@JsonPropertyOrder({
  AccountsForJobAddProp.JSON_PROPERTY_INCLUDE_PARENT,
  AccountsForJobAddProp.JSON_PROPERTY_IS_SPLIT,
  AccountsForJobAddProp.JSON_PROPERTY_LATEST_COMPONENTS_ONLY,
  AccountsForJobAddProp.JSON_PROPERTY_LEVEL,
  AccountsForJobAddProp.JSON_PROPERTY_PORTFOLIO_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class AccountsForJobAddProp implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INCLUDE_PARENT = "includeParent";
  private JsonNullable<Boolean> includeParent = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_SPLIT = "isSplit";
  private JsonNullable<Boolean> isSplit = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LATEST_COMPONENTS_ONLY = "latestComponentsOnly";
  private JsonNullable<Boolean> latestComponentsOnly = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LEVEL = "level";
  private JsonNullable<String> level = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORTFOLIO_ID = "portfolioId";
  private String portfolioId;

  public AccountsForJobAddProp() { 
  }

  public AccountsForJobAddProp includeParent(Boolean includeParent) {
    this.includeParent = JsonNullable.<Boolean>of(includeParent);
    return this;
  }

   /**
   * Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true
   * @return includeParent
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true")
  @JsonIgnore

  public Boolean getIncludeParent() {
        return includeParent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDE_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIncludeParent_JsonNullable() {
    return includeParent;
  }
  
  @JsonProperty(JSON_PROPERTY_INCLUDE_PARENT)
  public void setIncludeParent_JsonNullable(JsonNullable<Boolean> includeParent) {
    this.includeParent = includeParent;
  }

  public void setIncludeParent(Boolean includeParent) {
    this.includeParent = JsonNullable.<Boolean>of(includeParent);
  }


  public AccountsForJobAddProp isSplit(Boolean isSplit) {
    this.isSplit = JsonNullable.<Boolean>of(isSplit);
    return this;
  }

   /**
   * Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run
   * @return isSplit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the portfolio's components if any would be treated as individual portfolios when the job is run")
  @JsonIgnore

  public Boolean getIsSplit() {
        return isSplit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsSplit_JsonNullable() {
    return isSplit;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_SPLIT)
  public void setIsSplit_JsonNullable(JsonNullable<Boolean> isSplit) {
    this.isSplit = isSplit;
  }

  public void setIsSplit(Boolean isSplit) {
    this.isSplit = JsonNullable.<Boolean>of(isSplit);
  }


  public AccountsForJobAddProp latestComponentsOnly(Boolean latestComponentsOnly) {
    this.latestComponentsOnly = JsonNullable.<Boolean>of(latestComponentsOnly);
    return this;
  }

   /**
   * When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest.
   * @return latestComponentsOnly
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \"Latest,\" it will not return components where the end date occurs before Latest.")
  @JsonIgnore

  public Boolean getLatestComponentsOnly() {
        return latestComponentsOnly.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LATEST_COMPONENTS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getLatestComponentsOnly_JsonNullable() {
    return latestComponentsOnly;
  }
  
  @JsonProperty(JSON_PROPERTY_LATEST_COMPONENTS_ONLY)
  public void setLatestComponentsOnly_JsonNullable(JsonNullable<Boolean> latestComponentsOnly) {
    this.latestComponentsOnly = latestComponentsOnly;
  }

  public void setLatestComponentsOnly(Boolean latestComponentsOnly) {
    this.latestComponentsOnly = JsonNullable.<Boolean>of(latestComponentsOnly);
  }


  public AccountsForJobAddProp level(String level) {
    this.level = JsonNullable.<String>of(level);
    return this;
  }

   /**
   * The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down.
   * @return level
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \"1\" means only the first level will be expanded. \"all\" will be the value if all levels are expanded down.")
  @JsonIgnore

  public String getLevel() {
        return level.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLevel_JsonNullable() {
    return level;
  }
  
  @JsonProperty(JSON_PROPERTY_LEVEL)
  public void setLevel_JsonNullable(JsonNullable<String> level) {
    this.level = level;
  }

  public void setLevel(String level) {
    this.level = JsonNullable.<String>of(level);
  }


  public AccountsForJobAddProp portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The full file path including portfolio name and type
   * @return portfolioId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The full file path including portfolio name and type")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortfolioId() {
    return portfolioId;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }


  /**
   * Return true if this accountsForJobAddProp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsForJobAddProp accountsForJobAddProp = (AccountsForJobAddProp) o;
    return equalsNullable(this.includeParent, accountsForJobAddProp.includeParent) &&
        equalsNullable(this.isSplit, accountsForJobAddProp.isSplit) &&
        equalsNullable(this.latestComponentsOnly, accountsForJobAddProp.latestComponentsOnly) &&
        equalsNullable(this.level, accountsForJobAddProp.level) &&
        Objects.equals(this.portfolioId, accountsForJobAddProp.portfolioId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(includeParent), hashCodeNullable(isSplit), hashCodeNullable(latestComponentsOnly), hashCodeNullable(level), portfolioId);
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
    sb.append("class AccountsForJobAddProp {\n");
    sb.append("    includeParent: ").append(toIndentedString(includeParent)).append("\n");
    sb.append("    isSplit: ").append(toIndentedString(isSplit)).append("\n");
    sb.append("    latestComponentsOnly: ").append(toIndentedString(latestComponentsOnly)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

