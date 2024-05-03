/*
 * Style Performance and Risk Analysis (SPAR) Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPAREngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SPAREngine.models.SPARIdentifier;
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
import com.factset.sdk.SPAREngine.JSON;


/**
 * SPARComponent
 */
@JsonPropertyOrder({
  SPARComponent.JSON_PROPERTY_ID,
  SPARComponent.JSON_PROPERTY_ACCOUNTS,
  SPARComponent.JSON_PROPERTY_BENCHMARKS,
  SPARComponent.JSON_PROPERTY_CURRENCY_ISO_CODE,
  SPARComponent.JSON_PROPERTY_PATH,
  SPARComponent.JSON_PROPERTY_NAME,
  SPARComponent.JSON_PROPERTY_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SPARComponent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private JsonNullable<java.util.List<SPARIdentifier>> accounts = JsonNullable.<java.util.List<SPARIdentifier>>undefined();

  public static final String JSON_PROPERTY_BENCHMARKS = "benchmarks";
  private SPARIdentifier benchmarks;

  public static final String JSON_PROPERTY_CURRENCY_ISO_CODE = "currencyIsoCode";
  private JsonNullable<String> currencyIsoCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PATH = "path";
  private JsonNullable<String> path = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public SPARComponent() { 
  }

  public SPARComponent id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Component identifier.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Component identifier.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public SPARComponent accounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(accounts);
    return this;
  }

  public SPARComponent addAccountsItem(SPARIdentifier accountsItem) {
    if (this.accounts == null || !this.accounts.isPresent()) {
      this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(new java.util.ArrayList<>());
    }
    try {
      this.accounts.get().add(accountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of accounts in SPAR document.
   * @return accounts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of accounts in SPAR document.")
  @JsonIgnore

  public java.util.List<SPARIdentifier> getAccounts() {
        return accounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<SPARIdentifier>> getAccounts_JsonNullable() {
    return accounts;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  public void setAccounts_JsonNullable(JsonNullable<java.util.List<SPARIdentifier>> accounts) {
    this.accounts = accounts;
  }

  public void setAccounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<SPARIdentifier>>of(accounts);
  }


  public SPARComponent benchmarks(SPARIdentifier benchmarks) {
    this.benchmarks = benchmarks;
    return this;
  }

   /**
   * Get benchmarks
   * @return benchmarks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SPARIdentifier getBenchmarks() {
    return benchmarks;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarks(SPARIdentifier benchmarks) {
    this.benchmarks = benchmarks;
  }


  public SPARComponent currencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = JsonNullable.<String>of(currencyIsoCode);
    return this;
  }

   /**
   * CurrencyCode in SPAR document.
   * @return currencyIsoCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "CurrencyCode in SPAR document.")
  @JsonIgnore

  public String getCurrencyIsoCode() {
        return currencyIsoCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrencyIsoCode_JsonNullable() {
    return currencyIsoCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY_ISO_CODE)
  public void setCurrencyIsoCode_JsonNullable(JsonNullable<String> currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }

  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = JsonNullable.<String>of(currencyIsoCode);
  }


  public SPARComponent path(String path) {
    this.path = JsonNullable.<String>of(path);
    return this;
  }

   /**
   * The path to the document
   * @return path
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The path to the document")
  @JsonIgnore

  public String getPath() {
        return path.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPath_JsonNullable() {
    return path;
  }
  
  @JsonProperty(JSON_PROPERTY_PATH)
  public void setPath_JsonNullable(JsonNullable<String> path) {
    this.path = path;
  }

  public void setPath(String path) {
    this.path = JsonNullable.<String>of(path);
  }


  public SPARComponent name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Component name.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Component name.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public SPARComponent category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

   /**
   * Component category.
   * @return category
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Component category.")
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  /**
   * Return true if this SPARComponent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SPARComponent spARComponent = (SPARComponent) o;
    return equalsNullable(this.id, spARComponent.id) &&
        equalsNullable(this.accounts, spARComponent.accounts) &&
        Objects.equals(this.benchmarks, spARComponent.benchmarks) &&
        equalsNullable(this.currencyIsoCode, spARComponent.currencyIsoCode) &&
        equalsNullable(this.path, spARComponent.path) &&
        equalsNullable(this.name, spARComponent.name) &&
        equalsNullable(this.category, spARComponent.category);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(accounts), benchmarks, hashCodeNullable(currencyIsoCode), hashCodeNullable(path), hashCodeNullable(name), hashCodeNullable(category));
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
    sb.append("class SPARComponent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    benchmarks: ").append(toIndentedString(benchmarks)).append("\n");
    sb.append("    currencyIsoCode: ").append(toIndentedString(currencyIsoCode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

