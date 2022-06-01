# FactSet.SDK.FactSetConcordance.Model.EntityTaskStatus
Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaskId** | **int?** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**TaskName** | **string** | User-defined name for the task used to name the output file. | [optional] 
**TaskAction** | **string** | Action status for the Concordance Task process. | [optional] 
**Status** | **string** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**InputFile** | **string** | The input file is posted as a file object in the form.  | [optional] 
**ClientIdColumn** | **string** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**NameColumn** | **string** | Name of the column in the input file that contains the entity name to be matched. | [optional] 
**CountryColumn** | **string** | Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match.  | [optional] 
**StateColumn** | **string** | Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match.  | [optional] 
**UrlColumn** | **string** | Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match.  | [optional] 
**HasResult** | **bool?** | Flag denoting the taskId has a result. | [optional] 
**TaskSubmitTime** | **DateTime?** | Time the Task was submitted in UTC. | [optional] 
**Message** | **string** | Textual message for the status. | [optional] 
**InputCount** | **int?** | Number of records in the Input File. | [optional] 
**MappedCount** | **int?** | Number of records with status of MAPPED the Input File. | [optional] 
**UnmappedCount** | **int?** | Number of records with status of UNMAPPED the Input File. | [optional] 
**IndeterminateCount** | **int?** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**ProcessStartTime** | **DateTime?** | Process start time in UTC. | [optional] 
**ProcessDuration** | **double?** | Process duration in seconds. | [optional] 
**TryCount** | **int?** | Number of tries made so far for the request. | [optional] 
**DecisionRate** | **double?** | Percentage of mapped entities in the Input File. | [optional] 
**Error** | **string** |  | [optional] 
**ErrorTitle** | **string** |  | [optional] 
**IncludeEntityType** | **List&lt;string&gt;** | Requested Entity types to include.  | [optional] 
**ExcludeEntityType** | **List&lt;string&gt;** | Requested Entity types to exclude.  | [optional] 
**IncludeEntitySubType** | **List&lt;string&gt;** | Requested Entity subtypes to include.  | [optional] 
**ExcludeEntitySubType** | **List&lt;string&gt;** | Requested Entity subtypes to exclude.  | [optional] 
**UserSerial** | **string** | user-serial of the person who initiated the entity task. | [optional] 
**UserFullName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UniverseId** | **int?** | The universe id this task was submitted to.  | [optional] 
**UniverseName** | **string** | The name of the universe this task was submitted to.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

