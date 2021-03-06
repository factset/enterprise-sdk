/*
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetConcordance.models;

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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetConcordance.JSON;


/**
 * People Match object showing the decision reached for each Entity. 
 */
@ApiModel(description = "People Match object showing the decision reached for each Entity. ")
@JsonPropertyOrder({
  PeopleTask.JSON_PROPERTY_CLIENT_ID_COLUMN,
  PeopleTask.JSON_PROPERTY_PERSON_NAME_COLUMN,
  PeopleTask.JSON_PROPERTY_FIRST_NAME_COLUMN,
  PeopleTask.JSON_PROPERTY_LAST_NAME_COLUMN,
  PeopleTask.JSON_PROPERTY_MIDDLE_NAME_COLUMN,
  PeopleTask.JSON_PROPERTY_PRIORITY_COLUMN,
  PeopleTask.JSON_PROPERTY_SALUTATION_COLUMN,
  PeopleTask.JSON_PROPERTY_HAS_RESULT,
  PeopleTask.JSON_PROPERTY_TASK_ACTION,
  PeopleTask.JSON_PROPERTY_INPUT_FILE,
  PeopleTask.JSON_PROPERTY_ENTITY_COLUMN,
  PeopleTask.JSON_PROPERTY_STATUS,
  PeopleTask.JSON_PROPERTY_SUFFIX_COLUMN,
  PeopleTask.JSON_PROPERTY_TASK_SUBMIT_TIME,
  PeopleTask.JSON_PROPERTY_TASK_ID,
  PeopleTask.JSON_PROPERTY_TASK_NAME,
  PeopleTask.JSON_PROPERTY_UNIVERSE_ID,
  PeopleTask.JSON_PROPERTY_UNIVERSE_NAME,
  PeopleTask.JSON_PROPERTY_USER_SERIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleTask implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CLIENT_ID_COLUMN = "clientIdColumn";
  private JsonNullable<String> clientIdColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERSON_NAME_COLUMN = "personNameColumn";
  private JsonNullable<String> personNameColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME_COLUMN = "firstNameColumn";
  private JsonNullable<String> firstNameColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME_COLUMN = "lastNameColumn";
  private JsonNullable<String> lastNameColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIDDLE_NAME_COLUMN = "middleNameColumn";
  private JsonNullable<String> middleNameColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIORITY_COLUMN = "priorityColumn";
  private JsonNullable<String> priorityColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SALUTATION_COLUMN = "salutationColumn";
  private JsonNullable<String> salutationColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_RESULT = "hasResult";
  private JsonNullable<Boolean> hasResult = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TASK_ACTION = "taskAction";
  private JsonNullable<String> taskAction = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INPUT_FILE = "inputFile";
  private JsonNullable<String> inputFile = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTITY_COLUMN = "entityColumn";
  private JsonNullable<String> entityColumn = JsonNullable.<String>undefined();

  /**
   * Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    BAD_REQUEST("BAD_REQUEST"),
    
    ABORTED("ABORTED");

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
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<StatusEnum> status = JsonNullable.<StatusEnum>undefined();

  public static final String JSON_PROPERTY_SUFFIX_COLUMN = "suffixColumn";
  private JsonNullable<String> suffixColumn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TASK_SUBMIT_TIME = "taskSubmitTime";
  private JsonNullable<OffsetDateTime> taskSubmitTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private JsonNullable<Integer> taskId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TASK_NAME = "taskName";
  private JsonNullable<String> taskName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIVERSE_ID = "universeId";
  private JsonNullable<Integer> universeId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UNIVERSE_NAME = "universeName";
  private JsonNullable<String> universeName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_SERIAL = "userSerial";
  private JsonNullable<String> userSerial = JsonNullable.<String>undefined();

  public PeopleTask() { 
  }

  public PeopleTask clientIdColumn(String clientIdColumn) {
    this.clientIdColumn = JsonNullable.<String>of(clientIdColumn);
    return this;
  }

   /**
   * The number of columns of client. 
   * @return clientIdColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "id1", value = "The number of columns of client. ")
  @JsonIgnore

  public String getClientIdColumn() {
        return clientIdColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLIENT_ID_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getClientIdColumn_JsonNullable() {
    return clientIdColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_CLIENT_ID_COLUMN)
  public void setClientIdColumn_JsonNullable(JsonNullable<String> clientIdColumn) {
    this.clientIdColumn = clientIdColumn;
  }

  public void setClientIdColumn(String clientIdColumn) {
    this.clientIdColumn = JsonNullable.<String>of(clientIdColumn);
  }


  public PeopleTask personNameColumn(String personNameColumn) {
    this.personNameColumn = JsonNullable.<String>of(personNameColumn);
    return this;
  }

   /**
   * The person name as provided in request.
   * @return personNameColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Phil Snow", value = "The person name as provided in request.")
  @JsonIgnore

  public String getPersonNameColumn() {
        return personNameColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON_NAME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPersonNameColumn_JsonNullable() {
    return personNameColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON_NAME_COLUMN)
  public void setPersonNameColumn_JsonNullable(JsonNullable<String> personNameColumn) {
    this.personNameColumn = personNameColumn;
  }

  public void setPersonNameColumn(String personNameColumn) {
    this.personNameColumn = JsonNullable.<String>of(personNameColumn);
  }


  public PeopleTask firstNameColumn(String firstNameColumn) {
    this.firstNameColumn = JsonNullable.<String>of(firstNameColumn);
    return this;
  }

   /**
   * The first name of the client.
   * @return firstNameColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Frederick", value = "The first name of the client.")
  @JsonIgnore

  public String getFirstNameColumn() {
        return firstNameColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstNameColumn_JsonNullable() {
    return firstNameColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME_COLUMN)
  public void setFirstNameColumn_JsonNullable(JsonNullable<String> firstNameColumn) {
    this.firstNameColumn = firstNameColumn;
  }

  public void setFirstNameColumn(String firstNameColumn) {
    this.firstNameColumn = JsonNullable.<String>of(firstNameColumn);
  }


  public PeopleTask lastNameColumn(String lastNameColumn) {
    this.lastNameColumn = JsonNullable.<String>of(lastNameColumn);
    return this;
  }

   /**
   * The last name of the person.
   * @return lastNameColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Snow", value = "The last name of the person.")
  @JsonIgnore

  public String getLastNameColumn() {
        return lastNameColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastNameColumn_JsonNullable() {
    return lastNameColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME_COLUMN)
  public void setLastNameColumn_JsonNullable(JsonNullable<String> lastNameColumn) {
    this.lastNameColumn = lastNameColumn;
  }

  public void setLastNameColumn(String lastNameColumn) {
    this.lastNameColumn = JsonNullable.<String>of(lastNameColumn);
  }


  public PeopleTask middleNameColumn(String middleNameColumn) {
    this.middleNameColumn = JsonNullable.<String>of(middleNameColumn);
    return this;
  }

   /**
   * The middle name of the client.
   * @return middleNameColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Philip", value = "The middle name of the client.")
  @JsonIgnore

  public String getMiddleNameColumn() {
        return middleNameColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMiddleNameColumn_JsonNullable() {
    return middleNameColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME_COLUMN)
  public void setMiddleNameColumn_JsonNullable(JsonNullable<String> middleNameColumn) {
    this.middleNameColumn = middleNameColumn;
  }

  public void setMiddleNameColumn(String middleNameColumn) {
    this.middleNameColumn = JsonNullable.<String>of(middleNameColumn);
  }


  public PeopleTask priorityColumn(String priorityColumn) {
    this.priorityColumn = JsonNullable.<String>of(priorityColumn);
    return this;
  }

   /**
   * The middle name of the client.
   * @return priorityColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The middle name of the client.")
  @JsonIgnore

  public String getPriorityColumn() {
        return priorityColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPriorityColumn_JsonNullable() {
    return priorityColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITY_COLUMN)
  public void setPriorityColumn_JsonNullable(JsonNullable<String> priorityColumn) {
    this.priorityColumn = priorityColumn;
  }

  public void setPriorityColumn(String priorityColumn) {
    this.priorityColumn = JsonNullable.<String>of(priorityColumn);
  }


  public PeopleTask salutationColumn(String salutationColumn) {
    this.salutationColumn = JsonNullable.<String>of(salutationColumn);
    return this;
  }

   /**
   * The salutation of the person.
   * @return salutationColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mr", value = "The salutation of the person.")
  @JsonIgnore

  public String getSalutationColumn() {
        return salutationColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SALUTATION_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSalutationColumn_JsonNullable() {
    return salutationColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_SALUTATION_COLUMN)
  public void setSalutationColumn_JsonNullable(JsonNullable<String> salutationColumn) {
    this.salutationColumn = salutationColumn;
  }

  public void setSalutationColumn(String salutationColumn) {
    this.salutationColumn = JsonNullable.<String>of(salutationColumn);
  }


  public PeopleTask hasResult(Boolean hasResult) {
    this.hasResult = JsonNullable.<Boolean>of(hasResult);
    return this;
  }

   /**
   * Whether the result is available.
   * @return hasResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the result is available.")
  @JsonIgnore

  public Boolean getHasResult() {
        return hasResult.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getHasResult_JsonNullable() {
    return hasResult;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_RESULT)
  public void setHasResult_JsonNullable(JsonNullable<Boolean> hasResult) {
    this.hasResult = hasResult;
  }

  public void setHasResult(Boolean hasResult) {
    this.hasResult = JsonNullable.<Boolean>of(hasResult);
  }


  public PeopleTask taskAction(String taskAction) {
    this.taskAction = JsonNullable.<String>of(taskAction);
    return this;
  }

   /**
   * Action status for the Concordance Task process.
   * @return taskAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "processfile", value = "Action status for the Concordance Task process.")
  @JsonIgnore

  public String getTaskAction() {
        return taskAction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaskAction_JsonNullable() {
    return taskAction;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_ACTION)
  public void setTaskAction_JsonNullable(JsonNullable<String> taskAction) {
    this.taskAction = taskAction;
  }

  public void setTaskAction(String taskAction) {
    this.taskAction = JsonNullable.<String>of(taskAction);
  }


  public PeopleTask inputFile(String inputFile) {
    this.inputFile = JsonNullable.<String>of(inputFile);
    return this;
  }

   /**
   * The input file is posted as a file object in the form. 
   * @return inputFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test31.csv", value = "The input file is posted as a file object in the form. ")
  @JsonIgnore

  public String getInputFile() {
        return inputFile.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInputFile_JsonNullable() {
    return inputFile;
  }
  
  @JsonProperty(JSON_PROPERTY_INPUT_FILE)
  public void setInputFile_JsonNullable(JsonNullable<String> inputFile) {
    this.inputFile = inputFile;
  }

  public void setInputFile(String inputFile) {
    this.inputFile = JsonNullable.<String>of(inputFile);
  }


  public PeopleTask entityColumn(String entityColumn) {
    this.entityColumn = JsonNullable.<String>of(entityColumn);
    return this;
  }

   /**
   * Full name corresponding to the matched entity.
   * @return entityColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FACTSET RESEARCH SYSTEMS INC.", value = "Full name corresponding to the matched entity.")
  @JsonIgnore

  public String getEntityColumn() {
        return entityColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEntityColumn_JsonNullable() {
    return entityColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY_COLUMN)
  public void setEntityColumn_JsonNullable(JsonNullable<String> entityColumn) {
    this.entityColumn = entityColumn;
  }

  public void setEntityColumn(String entityColumn) {
    this.entityColumn = JsonNullable.<String>of(entityColumn);
  }


  public PeopleTask status(StatusEnum status) {
    this.status = JsonNullable.<StatusEnum>of(status);
    return this;
  }

   /**
   * Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the Concordance Task. If the value is \"SUCCESS\", you can move to the subsequent /entity-decisions endpoint to retrieve the results.")
  @JsonIgnore

  public StatusEnum getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StatusEnum> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<StatusEnum> status) {
    this.status = status;
  }

  public void setStatus(StatusEnum status) {
    this.status = JsonNullable.<StatusEnum>of(status);
  }


  public PeopleTask suffixColumn(String suffixColumn) {
    this.suffixColumn = JsonNullable.<String>of(suffixColumn);
    return this;
  }

   /**
   * Name of the column in the input file that contains the person&#39;s suffix. 
   * @return suffixColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suffix", value = "Name of the column in the input file that contains the person's suffix. ")
  @JsonIgnore

  public String getSuffixColumn() {
        return suffixColumn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUFFIX_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSuffixColumn_JsonNullable() {
    return suffixColumn;
  }
  
  @JsonProperty(JSON_PROPERTY_SUFFIX_COLUMN)
  public void setSuffixColumn_JsonNullable(JsonNullable<String> suffixColumn) {
    this.suffixColumn = suffixColumn;
  }

  public void setSuffixColumn(String suffixColumn) {
    this.suffixColumn = JsonNullable.<String>of(suffixColumn);
  }


  public PeopleTask taskSubmitTime(OffsetDateTime taskSubmitTime) {
    this.taskSubmitTime = JsonNullable.<OffsetDateTime>of(taskSubmitTime);
    return this;
  }

   /**
   * Time the Task was submitted in UTC.
   * @return taskSubmitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-24T22:02:21Z", value = "Time the Task was submitted in UTC.")
  @JsonIgnore

  public OffsetDateTime getTaskSubmitTime() {
        return taskSubmitTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_SUBMIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getTaskSubmitTime_JsonNullable() {
    return taskSubmitTime;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_SUBMIT_TIME)
  public void setTaskSubmitTime_JsonNullable(JsonNullable<OffsetDateTime> taskSubmitTime) {
    this.taskSubmitTime = taskSubmitTime;
  }

  public void setTaskSubmitTime(OffsetDateTime taskSubmitTime) {
    this.taskSubmitTime = JsonNullable.<OffsetDateTime>of(taskSubmitTime);
  }


  public PeopleTask taskId(Integer taskId) {
    this.taskId = JsonNullable.<Integer>of(taskId);
    return this;
  }

   /**
   * The task identifier
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31", value = "The task identifier")
  @JsonIgnore

  public Integer getTaskId() {
        return taskId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTaskId_JsonNullable() {
    return taskId;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  public void setTaskId_JsonNullable(JsonNullable<Integer> taskId) {
    this.taskId = taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = JsonNullable.<Integer>of(taskId);
  }


  public PeopleTask taskName(String taskName) {
    this.taskName = JsonNullable.<String>of(taskName);
    return this;
  }

   /**
   * The task name
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Analysis1", value = "The task name")
  @JsonIgnore

  public String getTaskName() {
        return taskName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaskName_JsonNullable() {
    return taskName;
  }
  
  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  public void setTaskName_JsonNullable(JsonNullable<String> taskName) {
    this.taskName = taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = JsonNullable.<String>of(taskName);
  }


  public PeopleTask universeId(Integer universeId) {
    this.universeId = JsonNullable.<Integer>of(universeId);
    return this;
  }

   /**
   * The universe identifier
   * @return universeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The universe identifier")
  @JsonIgnore

  public Integer getUniverseId() {
        return universeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUniverseId_JsonNullable() {
    return universeId;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  public void setUniverseId_JsonNullable(JsonNullable<Integer> universeId) {
    this.universeId = universeId;
  }

  public void setUniverseId(Integer universeId) {
    this.universeId = JsonNullable.<Integer>of(universeId);
  }


  public PeopleTask universeName(String universeName) {
    this.universeName = JsonNullable.<String>of(universeName);
    return this;
  }

   /**
   * Full name of the person associated with the &#x60;userSerial&#x60;. 
   * @return universeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Smith", value = "Full name of the person associated with the `userSerial`. ")
  @JsonIgnore

  public String getUniverseName() {
        return universeName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUniverseName_JsonNullable() {
    return universeName;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  public void setUniverseName_JsonNullable(JsonNullable<String> universeName) {
    this.universeName = universeName;
  }

  public void setUniverseName(String universeName) {
    this.universeName = JsonNullable.<String>of(universeName);
  }


  public PeopleTask userSerial(String userSerial) {
    this.userSerial = JsonNullable.<String>of(userSerial);
    return this;
  }

   /**
   * user-serial of the person who initiated the entity task.
   * @return userSerial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FDSQAR_C-000000", value = "user-serial of the person who initiated the entity task.")
  @JsonIgnore

  public String getUserSerial() {
        return userSerial.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_SERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserSerial_JsonNullable() {
    return userSerial;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_SERIAL)
  public void setUserSerial_JsonNullable(JsonNullable<String> userSerial) {
    this.userSerial = userSerial;
  }

  public void setUserSerial(String userSerial) {
    this.userSerial = JsonNullable.<String>of(userSerial);
  }


  /**
   * Return true if this PeopleTask object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleTask peopleTask = (PeopleTask) o;
    return equalsNullable(this.clientIdColumn, peopleTask.clientIdColumn) &&
        equalsNullable(this.personNameColumn, peopleTask.personNameColumn) &&
        equalsNullable(this.firstNameColumn, peopleTask.firstNameColumn) &&
        equalsNullable(this.lastNameColumn, peopleTask.lastNameColumn) &&
        equalsNullable(this.middleNameColumn, peopleTask.middleNameColumn) &&
        equalsNullable(this.priorityColumn, peopleTask.priorityColumn) &&
        equalsNullable(this.salutationColumn, peopleTask.salutationColumn) &&
        equalsNullable(this.hasResult, peopleTask.hasResult) &&
        equalsNullable(this.taskAction, peopleTask.taskAction) &&
        equalsNullable(this.inputFile, peopleTask.inputFile) &&
        equalsNullable(this.entityColumn, peopleTask.entityColumn) &&
        equalsNullable(this.status, peopleTask.status) &&
        equalsNullable(this.suffixColumn, peopleTask.suffixColumn) &&
        equalsNullable(this.taskSubmitTime, peopleTask.taskSubmitTime) &&
        equalsNullable(this.taskId, peopleTask.taskId) &&
        equalsNullable(this.taskName, peopleTask.taskName) &&
        equalsNullable(this.universeId, peopleTask.universeId) &&
        equalsNullable(this.universeName, peopleTask.universeName) &&
        equalsNullable(this.userSerial, peopleTask.userSerial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(clientIdColumn), hashCodeNullable(personNameColumn), hashCodeNullable(firstNameColumn), hashCodeNullable(lastNameColumn), hashCodeNullable(middleNameColumn), hashCodeNullable(priorityColumn), hashCodeNullable(salutationColumn), hashCodeNullable(hasResult), hashCodeNullable(taskAction), hashCodeNullable(inputFile), hashCodeNullable(entityColumn), hashCodeNullable(status), hashCodeNullable(suffixColumn), hashCodeNullable(taskSubmitTime), hashCodeNullable(taskId), hashCodeNullable(taskName), hashCodeNullable(universeId), hashCodeNullable(universeName), hashCodeNullable(userSerial));
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
    sb.append("class PeopleTask {\n");
    sb.append("    clientIdColumn: ").append(toIndentedString(clientIdColumn)).append("\n");
    sb.append("    personNameColumn: ").append(toIndentedString(personNameColumn)).append("\n");
    sb.append("    firstNameColumn: ").append(toIndentedString(firstNameColumn)).append("\n");
    sb.append("    lastNameColumn: ").append(toIndentedString(lastNameColumn)).append("\n");
    sb.append("    middleNameColumn: ").append(toIndentedString(middleNameColumn)).append("\n");
    sb.append("    priorityColumn: ").append(toIndentedString(priorityColumn)).append("\n");
    sb.append("    salutationColumn: ").append(toIndentedString(salutationColumn)).append("\n");
    sb.append("    hasResult: ").append(toIndentedString(hasResult)).append("\n");
    sb.append("    taskAction: ").append(toIndentedString(taskAction)).append("\n");
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    entityColumn: ").append(toIndentedString(entityColumn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suffixColumn: ").append(toIndentedString(suffixColumn)).append("\n");
    sb.append("    taskSubmitTime: ").append(toIndentedString(taskSubmitTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    universeId: ").append(toIndentedString(universeId)).append("\n");
    sb.append("    universeName: ").append(toIndentedString(universeName)).append("\n");
    sb.append("    userSerial: ").append(toIndentedString(userSerial)).append("\n");
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

