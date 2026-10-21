# NextStep

A serialized list of 'action' items associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**[NextStepItem]**](NextStepItem.md) | List of NextStep action items | 
**type** | **str** | Datatype contained in this data object | defaults to "NextStep"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


