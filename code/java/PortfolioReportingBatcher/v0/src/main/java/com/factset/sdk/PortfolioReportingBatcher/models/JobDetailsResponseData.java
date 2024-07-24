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
import com.factset.sdk.PortfolioReportingBatcher.models.AccountsForJobAddProp;
import com.factset.sdk.PortfolioReportingBatcher.models.RunsForJob;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PortfolioReportingBatcher.JSON;


/**
 * The main object in the jobDetailsResponse schema
 */
@ApiModel(description = "The main object in the jobDetailsResponse schema")
@JsonPropertyOrder({
  JobDetailsResponseData.JSON_PROPERTY_ACCOUNTS,
  JobDetailsResponseData.JSON_PROPERTY_DOCUMENTS,
  JobDetailsResponseData.JSON_PROPERTY_RUNS,
  JobDetailsResponseData.JSON_PROPERTY_TASKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class JobDetailsResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private java.util.Map<String, java.util.List<AccountsForJobAddProp>> accounts = null;

  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private java.util.Map<String, java.util.List<String>> documents = null;

  public static final String JSON_PROPERTY_RUNS = "runs";
  private java.util.List<RunsForJob> runs = null;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private java.util.List<String> tasks = null;

  public JobDetailsResponseData() { 
  }

  public JobDetailsResponseData accounts(java.util.Map<String, java.util.List<AccountsForJobAddProp>> accounts) {
    this.accounts = accounts;
    return this;
  }

  public JobDetailsResponseData putAccountsItem(String key, java.util.List<AccountsForJobAddProp> accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.HashMap<>();
    }
    this.accounts.put(key, accountsItem);
    return this;
  }

   /**
   * Please note for PI jobs you will only see portfolioId
   * @return accounts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"my_task_1\":[{\"includeParent\":true,\"isSplit\":true,\"latestComponentsOnly\":true,\"level\":\"string\",\"portfolioId\":\"string\"}]}", value = "Please note for PI jobs you will only see portfolioId")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, java.util.List<AccountsForJobAddProp>> getAccounts() {
    return accounts;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccounts(java.util.Map<String, java.util.List<AccountsForJobAddProp>> accounts) {
    this.accounts = accounts;
  }


  public JobDetailsResponseData documents(java.util.Map<String, java.util.List<String>> documents) {
    this.documents = documents;
    return this;
  }

  public JobDetailsResponseData putDocumentsItem(String key, java.util.List<String> documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.HashMap<>();
    }
    this.documents.put(key, documentsItem);
    return this;
  }

   /**
   * Shows the documents for each job where relevant with a collection of tasks under each document
   * @return documents
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"my_task_1\":[\"Client:/equity/long_short/my PA document\"],\"my_task_2\":[\"Client:/equity/long_only/my PA document\",\"Client:/equity/long_short/my other PA document\"]}", value = "Shows the documents for each job where relevant with a collection of tasks under each document")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, java.util.List<String>> getDocuments() {
    return documents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(java.util.Map<String, java.util.List<String>> documents) {
    this.documents = documents;
  }


  public JobDetailsResponseData runs(java.util.List<RunsForJob> runs) {
    this.runs = runs;
    return this;
  }

  public JobDetailsResponseData addRunsItem(RunsForJob runsItem) {
    if (this.runs == null) {
      this.runs = new java.util.ArrayList<>();
    }
    this.runs.add(runsItem);
    return this;
  }

   /**
   * An array of information for each run
   * @return runs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An array of information for each run")
  @JsonProperty(JSON_PROPERTY_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<RunsForJob> getRuns() {
    return runs;
  }


  @JsonProperty(JSON_PROPERTY_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuns(java.util.List<RunsForJob> runs) {
    this.runs = runs;
  }


  public JobDetailsResponseData tasks(java.util.List<String> tasks) {
    this.tasks = tasks;
    return this;
  }

  public JobDetailsResponseData addTasksItem(String tasksItem) {
    if (this.tasks == null) {
      this.tasks = new java.util.ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * A list of tasks for the given job
   * @return tasks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"my_task_1\"]", value = "A list of tasks for the given job")
  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getTasks() {
    return tasks;
  }


  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTasks(java.util.List<String> tasks) {
    this.tasks = tasks;
  }


  /**
   * Return true if this jobDetailsResponse_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailsResponseData jobDetailsResponseData = (JobDetailsResponseData) o;
    return Objects.equals(this.accounts, jobDetailsResponseData.accounts) &&
        Objects.equals(this.documents, jobDetailsResponseData.documents) &&
        Objects.equals(this.runs, jobDetailsResponseData.runs) &&
        Objects.equals(this.tasks, jobDetailsResponseData.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, documents, runs, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailsResponseData {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

