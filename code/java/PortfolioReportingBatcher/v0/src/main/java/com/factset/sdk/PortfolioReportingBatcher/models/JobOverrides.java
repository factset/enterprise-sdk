/*
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.2.0
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
import com.factset.sdk.PortfolioReportingBatcher.models.Calendar;
import com.factset.sdk.PortfolioReportingBatcher.models.Frequency;
import com.factset.sdk.PortfolioReportingBatcher.models.JobOverridesCombinationsRoot;
import com.factset.sdk.PortfolioReportingBatcher.models.JobOverridesDates;
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
import com.factset.sdk.PortfolioReportingBatcher.JSON;


/**
 * If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.
 */
@ApiModel(description = "If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.")
@JsonPropertyOrder({
  JobOverrides.JSON_PROPERTY_CALENDAR,
  JobOverrides.JSON_PROPERTY_COMBINATIONS,
  JobOverrides.JSON_PROPERTY_DATES,
  JobOverrides.JSON_PROPERTY_FREQUENCY,
  JobOverrides.JSON_PROPERTY_RUN_AS_OF_DATE,
  JobOverrides.JSON_PROPERTY_RUN_AS_SERIAL_NUMBER,
  JobOverrides.JSON_PROPERTY_TASKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobOverrides implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CALENDAR = "calendar";
  private Calendar calendar = Calendar.FIVEDAY;

  public static final String JSON_PROPERTY_COMBINATIONS = "combinations";
  private java.util.List<JobOverridesCombinationsRoot> combinations = null;

  public static final String JSON_PROPERTY_DATES = "dates";
  private JobOverridesDates dates;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.DAILY;

  public static final String JSON_PROPERTY_RUN_AS_OF_DATE = "runAsOfDate";
  private LocalDate runAsOfDate;

  public static final String JSON_PROPERTY_RUN_AS_SERIAL_NUMBER = "runAsSerialNumber";
  private String runAsSerialNumber;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private java.util.List<String> tasks = null;

  public JobOverrides() { 
  }

  public JobOverrides calendar(Calendar calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Calendar getCalendar() {
    return calendar;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }


  public JobOverrides combinations(java.util.List<JobOverridesCombinationsRoot> combinations) {
    this.combinations = combinations;
    return this;
  }

  public JobOverrides addCombinationsItem(JobOverridesCombinationsRoot combinationsItem) {
    if (this.combinations == null) {
      this.combinations = new java.util.ArrayList<>();
    }
    this.combinations.add(combinationsItem);
    return this;
  }

   /**
   * An array of date account combinations
   * @return combinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of date account combinations")
  @JsonProperty(JSON_PROPERTY_COMBINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<JobOverridesCombinationsRoot> getCombinations() {
    return combinations;
  }


  @JsonProperty(JSON_PROPERTY_COMBINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinations(java.util.List<JobOverridesCombinationsRoot> combinations) {
    this.combinations = combinations;
  }


  public JobOverrides dates(JobOverridesDates dates) {
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

  public JobOverridesDates getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(JobOverridesDates dates) {
    this.dates = dates;
  }


  public JobOverrides frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  public JobOverrides runAsOfDate(LocalDate runAsOfDate) {
    this.runAsOfDate = runAsOfDate;
    return this;
  }

   /**
   * PUB
   * @return runAsOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PUB")
  @JsonProperty(JSON_PROPERTY_RUN_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getRunAsOfDate() {
    return runAsOfDate;
  }


  @JsonProperty(JSON_PROPERTY_RUN_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunAsOfDate(LocalDate runAsOfDate) {
    this.runAsOfDate = runAsOfDate;
  }


  public JobOverrides runAsSerialNumber(String runAsSerialNumber) {
    this.runAsSerialNumber = runAsSerialNumber;
    return this;
  }

   /**
   * The FactSet serial number which has the credentials wanted to run the job
   * @return runAsSerialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The FactSet serial number which has the credentials wanted to run the job")
  @JsonProperty(JSON_PROPERTY_RUN_AS_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRunAsSerialNumber() {
    return runAsSerialNumber;
  }


  @JsonProperty(JSON_PROPERTY_RUN_AS_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunAsSerialNumber(String runAsSerialNumber) {
    this.runAsSerialNumber = runAsSerialNumber;
  }


  public JobOverrides tasks(java.util.List<String> tasks) {
    this.tasks = tasks;
    return this;
  }

  public JobOverrides addTasksItem(String tasksItem) {
    if (this.tasks == null) {
      this.tasks = new java.util.ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Used only for jobs where type is PA
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used only for jobs where type is PA")
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
   * Return true if this jobOverrides object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobOverrides jobOverrides = (JobOverrides) o;
    return Objects.equals(this.calendar, jobOverrides.calendar) &&
        Objects.equals(this.combinations, jobOverrides.combinations) &&
        Objects.equals(this.dates, jobOverrides.dates) &&
        Objects.equals(this.frequency, jobOverrides.frequency) &&
        Objects.equals(this.runAsOfDate, jobOverrides.runAsOfDate) &&
        Objects.equals(this.runAsSerialNumber, jobOverrides.runAsSerialNumber) &&
        Objects.equals(this.tasks, jobOverrides.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendar, combinations, dates, frequency, runAsOfDate, runAsSerialNumber, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobOverrides {\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    runAsOfDate: ").append(toIndentedString(runAsOfDate)).append("\n");
    sb.append("    runAsSerialNumber: ").append(toIndentedString(runAsSerialNumber)).append("\n");
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

