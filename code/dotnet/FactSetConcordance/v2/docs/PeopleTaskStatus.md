# FactSet.SDK.FactSetConcordance.Model.PeopleTaskStatus
Concordance People Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientIdColumn** | **string** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**DecisionRate** | **int?** | Percentage of mapped entities in the Input File. | [optional] 
**EntityColumn** | **string** | Name of the column of the entity.  | [optional] 
**FirstNameColumn** | **string** | Name of the column in the input file that contains the first name. | [optional] 
**HasResult** | **bool?** | Whether the result is available. | [optional] 
**InputCount** | **int?** | Number of records in the Input File. | [optional] 
**InputFile** | **string** | The input file is posted as a file object in the form.  | [optional] 
**LastNameColumn** | **string** | Name of the column in the input file that contains the first name.  | [optional] 
**MappedCount** | **int?** | Number of records with status of MAPPED the Input File. | [optional] 
**MiddleNameColumn** | **string** | Name of the column in the input file that contains the middle name.  | [optional] 
**PersonNameColumn** | **string** | Name of the column in the input file that contains the person name.  | [optional] 
**PriorityColumn** | **string** | Name of the column in the input file that contains the priority.  | [optional] 
**ProcessStartTime** | **DateTime?** | Process start time in UTC. | [optional] 
**ProcessDuration** | **double?** | Process duration in seconds. | [optional] 
**SalutationColumn** | **string** | Name of the column in the input file that contains the person&#39;s salutation.  | [optional] 
**Status** | **string** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**SuffixColumn** | **string** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**TaskAction** | **string** | Action status for the Concordance Task process. | [optional] 
**TaskId** | **int?** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**TaskName** | **string** | User-defined name for the task used to name the output file. | [optional] 
**UnmappedCount** | **int?** | Number of records with status of UNMAPPED the Input File. | [optional] 
**TryCount** | **int?** | Number of tries made so far for the request. | [optional] 
**Message** | **string** | Textual message for the status. | [optional] 
**Error** | **string** |  | [optional] 
**ErrorTitle** | **string** |  | [optional] 
**IndeterminateCount** | **int?** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**TaskSubmitTime** | **DateTime?** | Time the Task was submitted in UTC. | [optional] 
**UniverseId** | **int?** | The universe identifier | [optional] 
**UniverseName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UserFullName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UserSerial** | **string** | user-serial of the person who initiated the entity task. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

