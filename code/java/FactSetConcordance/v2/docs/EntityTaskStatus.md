

# EntityTaskStatus

Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **Integer** | Identifier denoting a specific Concordance task submitted by the user. |  [optional]
**taskName** | **String** | User-defined name for the task used to name the output file. |  [optional]
**taskAction** | **String** | Action status for the Concordance Task process. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. |  [optional]
**inputFile** | **String** | The input file is posted as a file object in the form.  |  [optional]
**clientIdColumn** | **String** | Name of the column in the input file that contains a unique identifier supplied by the user. |  [optional]
**nameColumn** | **String** | Name of the column in the input file that contains the entity name to be matched. |  [optional]
**countryColumn** | **String** | Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match.  |  [optional]
**stateColumn** | **String** | Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match.  |  [optional]
**urlColumn** | **String** | Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match.  |  [optional]
**hasResult** | **Boolean** | Flag denoting the taskId has a result. |  [optional]
**taskSubmitTime** | **OffsetDateTime** | Time the Task was submitted in UTC. |  [optional]
**message** | **String** | Textual message for the status. |  [optional]
**inputCount** | **Integer** | Number of records in the Input File. |  [optional]
**mappedCount** | **Integer** | Number of records with status of MAPPED the Input File. |  [optional]
**unmappedCount** | **Integer** | Number of records with status of UNMAPPED the Input File. |  [optional]
**indeterminateCount** | **Integer** | Number of records with status of INDETERMINATE the Input File. |  [optional]
**processStartTime** | **OffsetDateTime** | Process start time in UTC. |  [optional]
**processDuration** | **Double** | Process duration in seconds. |  [optional]
**tryCount** | **Integer** | Number of tries made so far for the request. |  [optional]
**decisionRate** | **Double** | Percentage of mapped entities in the Input File. |  [optional]
**error** | **String** |  |  [optional]
**errorTitle** | **String** |  |  [optional]
**includeEntityType** | **java.util.List&lt;String&gt;** | Requested Entity types to include.  |  [optional]
**excludeEntityType** | **java.util.List&lt;String&gt;** | Requested Entity types to exclude.  |  [optional]
**includeEntitySubType** | **java.util.List&lt;String&gt;** | Requested Entity subtypes to include.  |  [optional]
**excludeEntitySubType** | **java.util.List&lt;String&gt;** | Requested Entity subtypes to exclude.  |  [optional]
**userSerial** | **String** | user-serial of the person who initiated the entity task. |  [optional]
**userFullName** | **String** | Full name of the person associated with the &#x60;userSerial&#x60;.  |  [optional]
**universeId** | **Integer** | The universe id this task was submitted to.  |  [optional]
**universeName** | **String** | The name of the universe this task was submitted to.  |  [optional]



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


