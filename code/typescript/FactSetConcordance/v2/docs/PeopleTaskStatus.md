# factsetconcordance.PeopleTaskStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientIdColumn** | **String** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**decisionRate** | **Number** | Percentage of mapped entities in the Input File. | [optional] 
**entityColumn** | **String** | Name of the column of the entity.  | [optional] 
**firstNameColumn** | **String** | Name of the column in the input file that contains the first name. | [optional] 
**hasResult** | **Boolean** | Whether the result is available. | [optional] 
**inputCount** | **Number** | Number of records in the Input File. | [optional] 
**inputFile** | **String** | The input file is posted as a file object in the form.  | [optional] 
**lastNameColumn** | **String** | Name of the column in the input file that contains the first name.  | [optional] 
**mappedCount** | **Number** | Number of records with status of MAPPED the Input File. | [optional] 
**unmappedCount** | **Number** | Number of records with status of UNMAPPED the Input File. | [optional] 
**tryCount** | **Number** | Number of tries made so far for the request. | [optional] 
**message** | **String** | Textual message for the status. | [optional] 
**middleNameColumn** | **String** | Name of the column in the input file that contains the middle name.  | [optional] 
**personNameColumn** | **String** | Name of the column in the input file that contains the person name.  | [optional] 
**priorityColumn** | **String** | Name of the column in the input file that contains the priority.  | [optional] 
**processStartTime** | **Date** | Process start time in UTC. | [optional] 
**processDuration** | **Number** | Process duration in seconds. | [optional] 
**error** | **String** |  | [optional] 
**errorTitle** | **String** |  | [optional] 
**indeterminateCount** | **Number** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**salutationColumn** | **String** | Name of the column in the input file that contains the person&#39;s salutation.  | [optional] 
**status** | **String** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**suffixColumn** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**taskAction** | **String** | Action status for the Concordance Task process. | [optional] 
**taskId** | **Number** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**taskName** | **String** | User-defined name for the task used to name the output file. | [optional] 
**taskSubmitTime** | **Date** | Time the Task was submitted in UTC. | [optional] 
**universeId** | **Number** | The universe identifier | [optional] 
**universeName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**userSerial** | **String** | user-serial of the person who initiated the entity task. | [optional] 
**additionalContextColumns** | **[String]** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 



## Enum: StatusEnum


* `PENDING` (value: `"PENDING"`)

* `IN_PROGRESS` (value: `"IN_PROGRESS"`)

* `SUCCESS` (value: `"SUCCESS"`)

* `FAILURE` (value: `"FAILURE"`)

* `BAD_REQUEST` (value: `"BAD_REQUEST"`)

* `ABORTED` (value: `"ABORTED"`)




