

# EventHeadlineDataItem

Return object that includes details about an event headline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The id that was requested. This can be a ticker, cusip or factset entity id. | 
**companyName** | **String** | Name of the company reported in signal. Omitted if null. |  [optional]
**signalId** | **String** | Signal Id for this event. e.g. dilutionTrigger | 
**signalName** | **String** | Signal Name for this event. e.g. dilutionTrigger | 
**theme** | **String** | Theme name of the signal for this event. e.g. Debt Capital Structure | 
**source** | **String** | Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore | 
**eventId** | **java.util.UUID** | A unique id for this event. | 
**eventDate** | **LocalDate** | The UTC date/time of the event in ISO 8601 format. | 
**summary** | **String** | One sentence summary of the event. | 
**userRelevanceScore** | **Float** | Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy. | 
**created** | **OffsetDateTime** | Date/Time in UTC the event was first recorded in our data store. |  [optional]


## Implemented Interfaces

* Serializable


