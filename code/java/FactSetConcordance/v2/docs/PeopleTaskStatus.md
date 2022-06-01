

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
**middleNameColumn** | **String** | Name of the column in the input file that contains the middle name.  |  [optional]
**personNameColumn** | **String** | Name of the column in the input file that contains the person name.  |  [optional]
**priorityColumn** | **String** | Name of the column in the input file that contains the priority.  |  [optional]
**processStartTime** | **OffsetDateTime** | Process start time in UTC. |  [optional]
**processDuration** | **Double** | Process duration in seconds. |  [optional]
**salutationColumn** | **String** | Name of the column in the input file that contains the person&#39;s salutation.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. |  [optional]
**suffixColumn** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  |  [optional]
**taskAction** | **String** | Action status for the Concordance Task process. |  [optional]
**taskId** | **Integer** | Identifier denoting a specific Concordance task submitted by the user. |  [optional]
**taskName** | **String** | User-defined name for the task used to name the output file. |  [optional]
**taskSubmitTime** | **OffsetDateTime** | Time the Task was submitted in UTC. |  [optional]
**universeId** | **Integer** | The universe identifier |  [optional]
**universeName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**userSerial** | **String** | user-serial of the person who initiated the entity task. |  [optional]



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


