# FactSet.SDK.FactSetConcordance.Model.PeopleTask
People Match object showing the decision reached for each Entity. 

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
**HasResult** | **bool?** | Whether the result is available. | [optional] 
**TaskAction** | **string** | Action status for the Concordance Task process. | [optional] 
**InputFile** | **string** | The input file is posted as a file object in the form.  | [optional] 
**EntityColumn** | **string** | Full name corresponding to the matched entity. | [optional] 
**Status** | **string** | Status of the Concordance Task. If the value is \&quot;SUCCESS\&quot;, you can move to the subsequent /entity-decisions endpoint to retrieve the results. | [optional] 
**SuffixColumn** | **string** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**TaskSubmitTime** | **DateTime?** | Time the Task was submitted in UTC. | [optional] 
**TaskId** | **int?** | The task identifier | [optional] 
**TaskName** | **string** | The task name | [optional] 
**UniverseId** | **int?** | The universe identifier | [optional] 
**UniverseName** | **string** | Full name of the person associated with the &#x60;userSerial&#x60;.  | [optional] 
**UserSerial** | **string** | user-serial of the person who initiated the entity task. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

