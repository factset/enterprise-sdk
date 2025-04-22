# FactSet.SDK.FactSetConcordance.Model.PeopleTask
Concordance People Task object. Shows the settings and status of a taskId and some statistics on the matches. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientIdColumn** | **string** | The number of columns of client.  | [optional] 
**PersonNameColumn** | **string** | The person name as provided in request. | [optional] 
**FirstNameColumn** | **string** | The first name of the client. | [optional] 
**LastNameColumn** | **string** | The last name of the person. | [optional] 
**MiddleNameColumn** | **string** | The middle name of the client. | [optional] 
**PriorityColumn** | **string** | The middle name of the client. | [optional] 
**SalutationColumn** | **string** | The salutation of the person. | [optional] 
**AdditionalContextColumns** | **List&lt;string&gt;** | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional] 
**HasResult** | **bool?** | Whether the result is available. | [optional] 
**TaskAction** | **string** | Action status for the Concordance Task process. | [optional] 
**InputFile** | **string** | The input file is posted as a file object in the form.  | [optional] 
**EntityColumn** | **string** | Full name corresponding to the matched entity. | [optional] 
**Status** | **string** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**SuffixColumn** | **string** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**TaskSubmitTime** | **DateTime?** | Time the Task was submitted in UTC. | [optional] 
**UnmappedCount** | **int?** | Number of records with status of UNMAPPED the Input File. | [optional] 
**TryCount** | **int?** | Number of tries made so far for the request. | [optional] 
**DecisionRate** | **double?** | Percentage of mapped entities in the Input File. | [optional] 
**ProcessStartTime** | **DateTime?** | Process start time in UTC. | [optional] 
**ProcessDuration** | **double?** | Process duration in seconds. | [optional] 
**MappedCount** | **int?** | Number of records with status of MAPPED the Input File. | [optional] 
**Message** | **string** | Textual message for the status. | [optional] 
**Error** | **string** |  | [optional] 
**ErrorTitle** | **string** |  | [optional] 
**InputCount** | **int?** | Number of records in the Input File. | [optional] 
**IndeterminateCount** | **int?** | Number of records with status of INDETERMINATE the Input File. | [optional] 
**TaskId** | **int?** | The task identifier | [optional] 
**TaskName** | **string** | The task name | [optional] 
**UniverseId** | **int?** | The universe identifier | [optional] 
**UniverseName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UserFullName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UserSerial** | **string** | user-serial of the person who initiated the people task  | [optional] 
**AutoRemap** | **bool** | When &#x60;true&#x60;, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.**  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

