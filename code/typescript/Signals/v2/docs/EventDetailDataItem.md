# signals.EventDetailDataItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The id that was requested. This can be a ticker, cusip or factset entity id. | 
**signalId** | **String** | Signal Id for this event. e.g. dilutionTrigger | 
**signalName** | **String** | Signal Name for this event. e.g. dilutionTrigger | 
**theme** | **String** | Theme name of the signal for this event. e.g. Debt Capital Structure | 
**source** | **String** | Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore | 
**eventId** | **String** | A unique id for this event. | 
**eventDate** | **Date** | The UTC date/time of the event in ISO 8601 format. | 
**summary** | **String** | One sentence summary of the event. | 
**userRelevanceScore** | **Number** | Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy. | 
**created** | **Date** | Date/Time in UTC the event was first recorded in our data store. | 
**updated** | **Date** | Date/Time in UTC the event was last updated. | 
**details** | **{String: Object}** | Signal specific event properties. | 


