# factsetconcordance.PeopleTask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientIdColumn** | **String** | The number of columns of client.  | [optional] 
**personNameColumn** | **String** | The person name as provided in request. | [optional] 
**firstNameColumn** | **String** | The first name of the client. | [optional] 
**lastNameColumn** | **String** | The last name of the person. | [optional] 
**middleNameColumn** | **String** | The middle name of the client. | [optional] 
**priorityColumn** | **String** | The middle name of the client. | [optional] 
**salutationColumn** | **String** | The salutation of the person. | [optional] 
**hasResult** | **Boolean** | Whether the result is available. | [optional] 
**taskAction** | **String** | Action status for the Concordance Task process. | [optional] 
**inputFile** | **String** | The input file is posted as a file object in the form.  | [optional] 
**entityColumn** | **String** | Full name corresponding to the matched entity. | [optional] 
**status** | **String** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**suffixColumn** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**taskSubmitTime** | **Date** | Time the Task was submitted in UTC. | [optional] 
**taskId** | **Number** | The task identifier | [optional] 
**taskName** | **String** | The task name | [optional] 
**universeId** | **Number** | The universe identifier | [optional] 
**universeName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**userSerial** | **String** | user-serial of the person who initiated the entity task. | [optional] 



## Enum: StatusEnum


* `PENDING` (value: `"PENDING"`)

* `IN_PROGRESS` (value: `"IN_PROGRESS"`)

* `SUCCESS` (value: `"SUCCESS"`)

* `FAILURE` (value: `"FAILURE"`)

* `BAD_REQUEST` (value: `"BAD_REQUEST"`)

* `ABORTED` (value: `"ABORTED"`)




