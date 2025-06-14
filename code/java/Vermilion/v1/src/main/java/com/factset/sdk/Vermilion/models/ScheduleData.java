/*
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vermilion.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vermilion.JSON;


/**
 * Details of an individual schedule.
 */
@ApiModel(description = "Details of an individual schedule.")
@JsonPropertyOrder({
  ScheduleData.JSON_PROPERTY_SCHEDULE_ID,
  ScheduleData.JSON_PROPERTY_NAME,
  ScheduleData.JSON_PROPERTY_DEFINITION_NAME,
  ScheduleData.JSON_PROPERTY_STATUS,
  ScheduleData.JSON_PROPERTY_SCHEDULE_GROUP,
  ScheduleData.JSON_PROPERTY_REPORT_DATE,
  ScheduleData.JSON_PROPERTY_NO_OF_TASKS,
  ScheduleData.JSON_PROPERTY_BUSINESS_CALENDAR,
  ScheduleData.JSON_PROPERTY_OWNER,
  ScheduleData.JSON_PROPERTY_NOTES,
  ScheduleData.JSON_PROPERTY_FINISH_DATE,
  ScheduleData.JSON_PROPERTY_START_DATE,
  ScheduleData.JSON_PROPERTY_LAST_UPDATED_BY,
  ScheduleData.JSON_PROPERTY_LAST_UPDATED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScheduleData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEDULE_ID = "scheduleId";
  private Integer scheduleId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFINITION_NAME = "definitionName";
  private String definitionName;

  /**
   * Status of the Schedule.
   */
  public enum StatusEnum {
    INITIALISED("INITIALISED"),
    
    RUNNING("RUNNING"),
    
    CANCELLED("CANCELLED"),
    
    SUSPENDED("SUSPENDED"),
    
    FINISHED("FINISHED"),
    
    CLOSED("CLOSED"),
    
    GENERATING_TASKS("GENERATING_TASKS");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SCHEDULE_GROUP = "scheduleGroup";
  private String scheduleGroup;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private String reportDate;

  public static final String JSON_PROPERTY_NO_OF_TASKS = "noOfTasks";
  private Integer noOfTasks;

  public static final String JSON_PROPERTY_BUSINESS_CALENDAR = "businessCalendar";
  private String businessCalendar;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_FINISH_DATE = "finishDate";
  private String finishDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private String lastUpdated;

  public ScheduleData() { 
  }

  public ScheduleData scheduleId(Integer scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Unique identifier of the Schedule.
   * @return scheduleId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Schedule.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduleId() {
    return scheduleId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleId(Integer scheduleId) {
    this.scheduleId = scheduleId;
  }


  public ScheduleData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Schedule.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the Schedule.")
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


  public ScheduleData definitionName(String definitionName) {
    this.definitionName = definitionName;
    return this;
  }

   /**
   * Name of Schedule Definition from which the Schedule has been generated.
   * @return definitionName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of Schedule Definition from which the Schedule has been generated.")
  @JsonProperty(JSON_PROPERTY_DEFINITION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefinitionName() {
    return definitionName;
  }


  @JsonProperty(JSON_PROPERTY_DEFINITION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefinitionName(String definitionName) {
    this.definitionName = definitionName;
  }


  public ScheduleData status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Schedule.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Status of the Schedule.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ScheduleData scheduleGroup(String scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
    return this;
  }

   /**
   * Group of the Schedule.
   * @return scheduleGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Group of the Schedule.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheduleGroup() {
    return scheduleGroup;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleGroup(String scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
  }


  public ScheduleData reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * The timestamp of the report date in epoch format for a specific Schedule
   * @return reportDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the report date in epoch format for a specific Schedule")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportDate() {
    return reportDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }


  public ScheduleData noOfTasks(Integer noOfTasks) {
    this.noOfTasks = noOfTasks;
    return this;
  }

   /**
   * No of tasks generated for the Schedule
   * @return noOfTasks
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "No of tasks generated for the Schedule")
  @JsonProperty(JSON_PROPERTY_NO_OF_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoOfTasks() {
    return noOfTasks;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfTasks(Integer noOfTasks) {
    this.noOfTasks = noOfTasks;
  }


  public ScheduleData businessCalendar(String businessCalendar) {
    this.businessCalendar = businessCalendar;
    return this;
  }

   /**
   * Name of Business Calender used in the Schedule
   * @return businessCalendar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of Business Calender used in the Schedule")
  @JsonProperty(JSON_PROPERTY_BUSINESS_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessCalendar() {
    return businessCalendar;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessCalendar(String businessCalendar) {
    this.businessCalendar = businessCalendar;
  }


  public ScheduleData owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner role used in the Schedule
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Owner role used in the Schedule")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ScheduleData notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes of the Schedule
   * @return notes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Notes of the Schedule")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ScheduleData finishDate(String finishDate) {
    this.finishDate = finishDate;
    return this;
  }

   /**
   * The timestamp of the Finish Date in epoch format of the Schedule
   * @return finishDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the Finish Date in epoch format of the Schedule")
  @JsonProperty(JSON_PROPERTY_FINISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinishDate() {
    return finishDate;
  }


  @JsonProperty(JSON_PROPERTY_FINISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishDate(String finishDate) {
    this.finishDate = finishDate;
  }


  public ScheduleData startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The timestamp of the Start Date in epoch format of the Schedule
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the Start Date in epoch format of the Schedule")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ScheduleData lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Indicates the username of the person who last updated Schedule
   * @return lastUpdatedBy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates the username of the person who last updated Schedule")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public ScheduleData lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp of the most recent update in epoch format for a specific Schedule
   * @return lastUpdated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the most recent update in epoch format for a specific Schedule")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  /**
   * Return true if this ScheduleData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleData scheduleData = (ScheduleData) o;
    return Objects.equals(this.scheduleId, scheduleData.scheduleId) &&
        Objects.equals(this.name, scheduleData.name) &&
        Objects.equals(this.definitionName, scheduleData.definitionName) &&
        Objects.equals(this.status, scheduleData.status) &&
        Objects.equals(this.scheduleGroup, scheduleData.scheduleGroup) &&
        Objects.equals(this.reportDate, scheduleData.reportDate) &&
        Objects.equals(this.noOfTasks, scheduleData.noOfTasks) &&
        Objects.equals(this.businessCalendar, scheduleData.businessCalendar) &&
        Objects.equals(this.owner, scheduleData.owner) &&
        Objects.equals(this.notes, scheduleData.notes) &&
        Objects.equals(this.finishDate, scheduleData.finishDate) &&
        Objects.equals(this.startDate, scheduleData.startDate) &&
        Objects.equals(this.lastUpdatedBy, scheduleData.lastUpdatedBy) &&
        Objects.equals(this.lastUpdated, scheduleData.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, name, definitionName, status, scheduleGroup, reportDate, noOfTasks, businessCalendar, owner, notes, finishDate, startDate, lastUpdatedBy, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleData {\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    definitionName: ").append(toIndentedString(definitionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduleGroup: ").append(toIndentedString(scheduleGroup)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    noOfTasks: ").append(toIndentedString(noOfTasks)).append("\n");
    sb.append("    businessCalendar: ").append(toIndentedString(businessCalendar)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

