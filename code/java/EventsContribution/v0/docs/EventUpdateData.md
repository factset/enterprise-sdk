

# EventUpdateData

Event Data Update

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the event to be displayed | 
**startDatetime** | **OffsetDateTime** | Start date and time of the event | 
**agendaUrl** | **String** | The meeting agenda which can be a document file or a webpage. |  [optional]
**participants** | [**java.util.List&lt;ParticipantsData&gt;**](ParticipantsData.md) | Participants of the event. |  [optional]
**location** | [**LocationData**](LocationData.md) |  |  [optional]
**symbols** | [**java.util.List&lt;SymbolData&gt;**](SymbolData.md) | Symbol associated with the event | 
**registrationInfo** | [**RegistrationInfoData**](RegistrationInfoData.md) |  |  [optional]


## Implemented Interfaces

* Serializable


