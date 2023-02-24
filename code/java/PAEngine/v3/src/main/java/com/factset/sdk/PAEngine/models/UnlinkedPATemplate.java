/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PAEngine.models.PACalculationColumn;
import com.factset.sdk.PAEngine.models.PACalculationDataSources;
import com.factset.sdk.PAEngine.models.PACalculationGroup;
import com.factset.sdk.PAEngine.models.PADateParameters;
import com.factset.sdk.PAEngine.models.PAIdentifier;
import com.factset.sdk.PAEngine.models.TemplateContentTypes;
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
import com.factset.sdk.PAEngine.JSON;


/**
 * UnlinkedPATemplate
 */
@JsonPropertyOrder({
  UnlinkedPATemplate.JSON_PROPERTY_ID,
  UnlinkedPATemplate.JSON_PROPERTY_DIRECTORY,
  UnlinkedPATemplate.JSON_PROPERTY_TEMPLATE_TYPE_ID,
  UnlinkedPATemplate.JSON_PROPERTY_SNAPSHOT,
  UnlinkedPATemplate.JSON_PROPERTY_ACCOUNTS,
  UnlinkedPATemplate.JSON_PROPERTY_BENCHMARKS,
  UnlinkedPATemplate.JSON_PROPERTY_COLUMNS,
  UnlinkedPATemplate.JSON_PROPERTY_DATES,
  UnlinkedPATemplate.JSON_PROPERTY_GROUPS,
  UnlinkedPATemplate.JSON_PROPERTY_DATASOURCES,
  UnlinkedPATemplate.JSON_PROPERTY_CURRENCYISOCODE,
  UnlinkedPATemplate.JSON_PROPERTY_COMPONENTDETAIL,
  UnlinkedPATemplate.JSON_PROPERTY_CONTENT,
  UnlinkedPATemplate.JSON_PROPERTY_DESCRIPTION,
  UnlinkedPATemplate.JSON_PROPERTY_NAME,
  UnlinkedPATemplate.JSON_PROPERTY_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnlinkedPATemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DIRECTORY = "directory";
  private JsonNullable<String> directory = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TEMPLATE_TYPE_ID = "templateTypeId";
  private JsonNullable<String> templateTypeId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SNAPSHOT = "snapshot";
  private Boolean snapshot;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private JsonNullable<java.util.List<PAIdentifier>> accounts = JsonNullable.<java.util.List<PAIdentifier>>undefined();

  public static final String JSON_PROPERTY_BENCHMARKS = "benchmarks";
  private JsonNullable<java.util.List<PAIdentifier>> benchmarks = JsonNullable.<java.util.List<PAIdentifier>>undefined();

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private JsonNullable<java.util.List<PACalculationColumn>> columns = JsonNullable.<java.util.List<PACalculationColumn>>undefined();

  public static final String JSON_PROPERTY_DATES = "dates";
  private PADateParameters dates;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private JsonNullable<java.util.List<PACalculationGroup>> groups = JsonNullable.<java.util.List<PACalculationGroup>>undefined();

  public static final String JSON_PROPERTY_DATASOURCES = "datasources";
  private PACalculationDataSources datasources;

  public static final String JSON_PROPERTY_CURRENCYISOCODE = "currencyisocode";
  private JsonNullable<String> currencyisocode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPONENTDETAIL = "componentdetail";
  private JsonNullable<String> componentdetail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private TemplateContentTypes content;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public UnlinkedPATemplate() { 
  }

  public UnlinkedPATemplate id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Template id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template id.")
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


  public UnlinkedPATemplate directory(String directory) {
    this.directory = JsonNullable.<String>of(directory);
    return this;
  }

   /**
   * Template directory.
   * @return directory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template directory.")
  @JsonIgnore

  public String getDirectory() {
        return directory.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDirectory_JsonNullable() {
    return directory;
  }
  
  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  public void setDirectory_JsonNullable(JsonNullable<String> directory) {
    this.directory = directory;
  }

  public void setDirectory(String directory) {
    this.directory = JsonNullable.<String>of(directory);
  }


  public UnlinkedPATemplate templateTypeId(String templateTypeId) {
    this.templateTypeId = JsonNullable.<String>of(templateTypeId);
    return this;
  }

   /**
   * Template type id
   * @return templateTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template type id")
  @JsonIgnore

  public String getTemplateTypeId() {
        return templateTypeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTemplateTypeId_JsonNullable() {
    return templateTypeId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_TYPE_ID)
  public void setTemplateTypeId_JsonNullable(JsonNullable<String> templateTypeId) {
    this.templateTypeId = templateTypeId;
  }

  public void setTemplateTypeId(String templateTypeId) {
    this.templateTypeId = JsonNullable.<String>of(templateTypeId);
  }


  public UnlinkedPATemplate snapshot(Boolean snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * snapshot.
   * @return snapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "snapshot.")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSnapshot() {
    return snapshot;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshot(Boolean snapshot) {
    this.snapshot = snapshot;
  }


  public UnlinkedPATemplate accounts(java.util.List<PAIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<PAIdentifier>>of(accounts);
    return this;
  }

  public UnlinkedPATemplate addAccountsItem(PAIdentifier accountsItem) {
    if (this.accounts == null || !this.accounts.isPresent()) {
      this.accounts = JsonNullable.<java.util.List<PAIdentifier>>of(new java.util.ArrayList<>());
    }
    try {
      this.accounts.get().add(accountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of accounts")
  @JsonIgnore

  public java.util.List<PAIdentifier> getAccounts() {
        return accounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<PAIdentifier>> getAccounts_JsonNullable() {
    return accounts;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  public void setAccounts_JsonNullable(JsonNullable<java.util.List<PAIdentifier>> accounts) {
    this.accounts = accounts;
  }

  public void setAccounts(java.util.List<PAIdentifier> accounts) {
    this.accounts = JsonNullable.<java.util.List<PAIdentifier>>of(accounts);
  }


  public UnlinkedPATemplate benchmarks(java.util.List<PAIdentifier> benchmarks) {
    this.benchmarks = JsonNullable.<java.util.List<PAIdentifier>>of(benchmarks);
    return this;
  }

  public UnlinkedPATemplate addBenchmarksItem(PAIdentifier benchmarksItem) {
    if (this.benchmarks == null || !this.benchmarks.isPresent()) {
      this.benchmarks = JsonNullable.<java.util.List<PAIdentifier>>of(new java.util.ArrayList<>());
    }
    try {
      this.benchmarks.get().add(benchmarksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of benchmarks
   * @return benchmarks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of benchmarks")
  @JsonIgnore

  public java.util.List<PAIdentifier> getBenchmarks() {
        return benchmarks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<PAIdentifier>> getBenchmarks_JsonNullable() {
    return benchmarks;
  }
  
  @JsonProperty(JSON_PROPERTY_BENCHMARKS)
  public void setBenchmarks_JsonNullable(JsonNullable<java.util.List<PAIdentifier>> benchmarks) {
    this.benchmarks = benchmarks;
  }

  public void setBenchmarks(java.util.List<PAIdentifier> benchmarks) {
    this.benchmarks = JsonNullable.<java.util.List<PAIdentifier>>of(benchmarks);
  }


  public UnlinkedPATemplate columns(java.util.List<PACalculationColumn> columns) {
    this.columns = JsonNullable.<java.util.List<PACalculationColumn>>of(columns);
    return this;
  }

  public UnlinkedPATemplate addColumnsItem(PACalculationColumn columnsItem) {
    if (this.columns == null || !this.columns.isPresent()) {
      this.columns = JsonNullable.<java.util.List<PACalculationColumn>>of(new java.util.ArrayList<>());
    }
    try {
      this.columns.get().add(columnsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of columns for the PA calculation
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of columns for the PA calculation")
  @JsonIgnore

  public java.util.List<PACalculationColumn> getColumns() {
        return columns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<PACalculationColumn>> getColumns_JsonNullable() {
    return columns;
  }
  
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  public void setColumns_JsonNullable(JsonNullable<java.util.List<PACalculationColumn>> columns) {
    this.columns = columns;
  }

  public void setColumns(java.util.List<PACalculationColumn> columns) {
    this.columns = JsonNullable.<java.util.List<PACalculationColumn>>of(columns);
  }


  public UnlinkedPATemplate dates(PADateParameters dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PADateParameters getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(PADateParameters dates) {
    this.dates = dates;
  }


  public UnlinkedPATemplate groups(java.util.List<PACalculationGroup> groups) {
    this.groups = JsonNullable.<java.util.List<PACalculationGroup>>of(groups);
    return this;
  }

  public UnlinkedPATemplate addGroupsItem(PACalculationGroup groupsItem) {
    if (this.groups == null || !this.groups.isPresent()) {
      this.groups = JsonNullable.<java.util.List<PACalculationGroup>>of(new java.util.ArrayList<>());
    }
    try {
      this.groups.get().add(groupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of groupings for the PA calculation
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groupings for the PA calculation")
  @JsonIgnore

  public java.util.List<PACalculationGroup> getGroups() {
        return groups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<PACalculationGroup>> getGroups_JsonNullable() {
    return groups;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUPS)
  public void setGroups_JsonNullable(JsonNullable<java.util.List<PACalculationGroup>> groups) {
    this.groups = groups;
  }

  public void setGroups(java.util.List<PACalculationGroup> groups) {
    this.groups = JsonNullable.<java.util.List<PACalculationGroup>>of(groups);
  }


  public UnlinkedPATemplate datasources(PACalculationDataSources datasources) {
    this.datasources = datasources;
    return this;
  }

   /**
   * Get datasources
   * @return datasources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATASOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PACalculationDataSources getDatasources() {
    return datasources;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasources(PACalculationDataSources datasources) {
    this.datasources = datasources;
  }


  public UnlinkedPATemplate currencyisocode(String currencyisocode) {
    this.currencyisocode = JsonNullable.<String>of(currencyisocode);
    return this;
  }

   /**
   * Currency ISO code for calculation.
   * @return currencyisocode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency ISO code for calculation.")
  @JsonIgnore

  public String getCurrencyisocode() {
        return currencyisocode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrencyisocode_JsonNullable() {
    return currencyisocode;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCYISOCODE)
  public void setCurrencyisocode_JsonNullable(JsonNullable<String> currencyisocode) {
    this.currencyisocode = currencyisocode;
  }

  public void setCurrencyisocode(String currencyisocode) {
    this.currencyisocode = JsonNullable.<String>of(currencyisocode);
  }


  public UnlinkedPATemplate componentdetail(String componentdetail) {
    this.componentdetail = JsonNullable.<String>of(componentdetail);
    return this;
  }

   /**
   * PA storage type. It can be GROUPS or TOTALS or SECURITIES.
   * @return componentdetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PA storage type. It can be GROUPS or TOTALS or SECURITIES.")
  @JsonIgnore

  public String getComponentdetail() {
        return componentdetail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPONENTDETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComponentdetail_JsonNullable() {
    return componentdetail;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPONENTDETAIL)
  public void setComponentdetail_JsonNullable(JsonNullable<String> componentdetail) {
    this.componentdetail = componentdetail;
  }

  public void setComponentdetail(String componentdetail) {
    this.componentdetail = JsonNullable.<String>of(componentdetail);
  }


  public UnlinkedPATemplate content(TemplateContentTypes content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateContentTypes getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(TemplateContentTypes content) {
    this.content = content;
  }


  public UnlinkedPATemplate description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Template description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template description.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public UnlinkedPATemplate name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Template name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template name.")
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


  public UnlinkedPATemplate category(String category) {
    this.category = JsonNullable.<String>of(category);
    return this;
  }

   /**
   * Unlinked template category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template category")
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
   * Return true if this UnlinkedPATemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkedPATemplate unlinkedPATemplate = (UnlinkedPATemplate) o;
    return equalsNullable(this.id, unlinkedPATemplate.id) &&
        equalsNullable(this.directory, unlinkedPATemplate.directory) &&
        equalsNullable(this.templateTypeId, unlinkedPATemplate.templateTypeId) &&
        Objects.equals(this.snapshot, unlinkedPATemplate.snapshot) &&
        equalsNullable(this.accounts, unlinkedPATemplate.accounts) &&
        equalsNullable(this.benchmarks, unlinkedPATemplate.benchmarks) &&
        equalsNullable(this.columns, unlinkedPATemplate.columns) &&
        Objects.equals(this.dates, unlinkedPATemplate.dates) &&
        equalsNullable(this.groups, unlinkedPATemplate.groups) &&
        Objects.equals(this.datasources, unlinkedPATemplate.datasources) &&
        equalsNullable(this.currencyisocode, unlinkedPATemplate.currencyisocode) &&
        equalsNullable(this.componentdetail, unlinkedPATemplate.componentdetail) &&
        Objects.equals(this.content, unlinkedPATemplate.content) &&
        equalsNullable(this.description, unlinkedPATemplate.description) &&
        equalsNullable(this.name, unlinkedPATemplate.name) &&
        equalsNullable(this.category, unlinkedPATemplate.category);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(directory), hashCodeNullable(templateTypeId), snapshot, hashCodeNullable(accounts), hashCodeNullable(benchmarks), hashCodeNullable(columns), dates, hashCodeNullable(groups), datasources, hashCodeNullable(currencyisocode), hashCodeNullable(componentdetail), content, hashCodeNullable(description), hashCodeNullable(name), hashCodeNullable(category));
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
    sb.append("class UnlinkedPATemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    templateTypeId: ").append(toIndentedString(templateTypeId)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    benchmarks: ").append(toIndentedString(benchmarks)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    currencyisocode: ").append(toIndentedString(currencyisocode)).append("\n");
    sb.append("    componentdetail: ").append(toIndentedString(componentdetail)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

