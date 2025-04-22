

# PeopleTask

Concordance People Task object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientIdColumn** | **String** | The number of columns of client.  |  [optional]
**personNameColumn** | **String** | The person name as provided in request. |  [optional]
**firstNameColumn** | **String** | The first name of the client. |  [optional]
**lastNameColumn** | **String** | The last name of the person. |  [optional]
**middleNameColumn** | **String** | The middle name of the client. |  [optional]
**priorityColumn** | **String** | The middle name of the client. |  [optional]
**salutationColumn** | **String** | The salutation of the person. |  [optional]
**additionalContextColumns** | **java.util.List&lt;String&gt;** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  |  [optional]
**hasResult** | **Boolean** | Whether the result is available. |  [optional]
**taskAction** | **String** | Action status for the Concordance Task process. |  [optional]
**inputFile** | **String** | The input file is posted as a file object in the form.  |  [optional]
**entityColumn** | **String** | Full name corresponding to the matched entity. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. |  [optional]
**suffixColumn** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  |  [optional]
**taskSubmitTime** | **OffsetDateTime** | Time the Task was submitted in UTC. |  [optional]
**unmappedCount** | **Integer** | Number of records with status of UNMAPPED the Input File. |  [optional]
**tryCount** | **Integer** | Number of tries made so far for the request. |  [optional]
**decisionRate** | **Double** | Percentage of mapped entities in the Input File. |  [optional]
**processStartTime** | **OffsetDateTime** | Process start time in UTC. |  [optional]
**processDuration** | **Double** | Process duration in seconds. |  [optional]
**mappedCount** | **Integer** | Number of records with status of MAPPED the Input File. |  [optional]
**message** | **String** | Textual message for the status. |  [optional]
**error** | **String** |  |  [optional]
**errorTitle** | **String** |  |  [optional]
**inputCount** | **Integer** | Number of records in the Input File. |  [optional]
**indeterminateCount** | **Integer** | Number of records with status of INDETERMINATE the Input File. |  [optional]
**taskId** | **Integer** | The task identifier |  [optional]
**taskName** | **String** | The task name |  [optional]
**universeId** | **Integer** | The universe identifier |  [optional]
**universeName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userSerial** | **String** | user-serial of the person who initiated the people task  |  [optional]
**autoRemap** | **Boolean** | When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  |  [optional]



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


