# FactSet.SDK.Signals.Model.EventHeadlineDataItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The id that was requested. This can be a ticker, cusip or factset entity id. | 
**CompanyName** | **string** | Name of the company reported in signal. Omitted if null. | [optional] 
**SignalId** | **string** | Signal Id for this event. e.g. dilutionTrigger | 
**SignalName** | **string** | Signal Name for this event. e.g. dilutionTrigger | 
**Theme** | **string** | Theme name of the signal for this event. e.g. Debt Capital Structure | 
**Source** | **string** | Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore | 
**EventId** | **Guid** | A unique id for this event. | 
**EventDate** | **DateTime** | The UTC date/time of the event in ISO 8601 format. | 
**Summary** | **string** | One sentence summary of the event. | 
**UserRelevanceScore** | **float** | Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy. | 
**Created** | **DateTime** | Date/Time in UTC the event was first recorded in our data store. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

