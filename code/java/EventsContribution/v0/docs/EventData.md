

# EventData

Event Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | ID that corresponds to the event. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 
**title** | **String** | Title of the event to be displayed | 
**startDatetime** | **OffsetDateTime** | Start date and time of the event | 
**agendaUrl** | **String** | The meeting agenda which can be a document file or a webpage. |  [optional]
**participants** | [**java.util.List&lt;ParticipantsData&gt;**](ParticipantsData.md) |  |  [optional]
**location** | [**LocationData**](LocationData.md) |  |  [optional]
**symbols** | [**java.util.List&lt;SymbolData&gt;**](SymbolData.md) |  | 
**registrationInfo** | [**RegistrationInfoData**](RegistrationInfoData.md) |  |  [optional]


## Implemented Interfaces

* Serializable


