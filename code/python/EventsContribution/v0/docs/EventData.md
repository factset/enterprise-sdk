# EventData

Event Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | ID that corresponds to the event. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 
**title** | **str** | Title of the event to be displayed | 
**start_datetime** | **datetime** | Start date and time of the event | 
**symbols** | [**[SymbolData]**](SymbolData.md) |  | 
**agenda_url** | **str** | The meeting agenda which can be a document file or a webpage. | [optional] 
**participants** | [**[ParticipantsData]**](ParticipantsData.md) |  | [optional] 
**location** | [**LocationData**](LocationData.md) |  | [optional] 
**registration_info** | [**RegistrationInfoData**](RegistrationInfoData.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


