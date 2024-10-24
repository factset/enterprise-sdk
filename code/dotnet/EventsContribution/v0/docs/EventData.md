# FactSet.SDK.EventsContribution.Model.EventData
Event Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | ID that corresponds to the event. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 
**Title** | **string** | Title of the event to be displayed | 
**StartDatetime** | **DateTime** | Start date and time of the event | 
**AgendaUrl** | **string** | The meeting agenda which can be a document file or a webpage. | [optional] 
**Participants** | [**List&lt;ParticipantsData&gt;**](ParticipantsData.md) |  | [optional] 
**Location** | [**LocationData**](LocationData.md) |  | [optional] 
**Symbols** | [**List&lt;SymbolData&gt;**](SymbolData.md) |  | 
**RegistrationInfo** | [**RegistrationInfoData**](RegistrationInfoData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

