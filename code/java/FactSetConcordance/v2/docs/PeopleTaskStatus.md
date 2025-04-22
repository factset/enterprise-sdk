

# PeopleTaskStatus

Concordance People Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientIdColumn** | **String** | Name of the column in the input file that contains a unique identifier supplied by the user. |  [optional]
**decisionRate** | **Integer** | Percentage of mapped entities in the Input File. |  [optional]
**entityColumn** | **String** | Name of the column of the entity.  |  [optional]
**firstNameColumn** | **String** | Name of the column in the input file that contains the first name. |  [optional]
**hasResult** | **Boolean** | Whether the result is available. |  [optional]
**inputCount** | **Integer** | Number of records in the Input File. |  [optional]
**inputFile** | **String** | The input file is posted as a file object in the form.  |  [optional]
**lastNameColumn** | **String** | Name of the column in the input file that contains the first name.  |  [optional]
**mappedCount** | **Integer** | Number of records with status of MAPPED the Input File. |  [optional]
**unmappedCount** | **Integer** | Number of records with status of UNMAPPED the Input File. |  [optional]
**tryCount** | **Integer** | Number of tries made so far for the request. |  [optional]
**message** | **String** | Textual message for the status. |  [optional]
**middleNameColumn** | **String** | Name of the column in the input file that contains the middle name.  |  [optional]
**personNameColumn** | **String** | Name of the column in the input file that contains the person name.  |  [optional]
**priorityColumn** | **String** | Name of the column in the input file that contains the priority.  |  [optional]
**processStartTime** | **OffsetDateTime** | Process start time in UTC. |  [optional]
**processDuration** | **Double** | Process duration in seconds. |  [optional]
**error** | **String** |  |  [optional]
**errorTitle** | **String** |  |  [optional]
**indeterminateCount** | **Integer** | Number of records with status of INDETERMINATE the Input File. |  [optional]
**salutationColumn** | **String** | Name of the column in the input file that contains the person&#39;s salutation.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. |  [optional]
**suffixColumn** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  |  [optional]
**taskAction** | **String** | Action status for the Concordance Task process. |  [optional]
**autoRemap** | **Boolean** | When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  |  [optional]
**taskId** | **Integer** | Identifier denoting a specific Concordance task submitted by the user. |  [optional]
**taskName** | **String** | User-defined name for the task used to name the output file. |  [optional]
**taskSubmitTime** | **OffsetDateTime** | Time the Task was submitted in UTC. |  [optional]
**universeId** | **Integer** | The universe identifier |  [optional]
**universeName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userSerial** | **String** | user-serial of the person who initiated the entity task. |  [optional]
**additionalContextColumns** | **java.util.List&lt;String&gt;** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
BAD_REQUEST | &quot;BAD_REQUEST&quot;
ABORTED | &quot;ABORTED&quot;


## Implemented Interfaces

* Serializable


