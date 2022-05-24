# EventHeadlineDataItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The id that was requested. This can be a ticker, cusip or factset entity id. | 
**signal_id** | **str** | Signal Id for this event. e.g. dilutionTrigger | 
**signal_name** | **str** | Signal Name for this event. e.g. dilutionTrigger | 
**theme** | **str** | Theme name of the signal for this event. e.g. Debt Capital Structure | 
**source** | **str** | Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore | 
**event_id** | **str** | A unique id for this event. | 
**event_date** | **date** | The UTC date/time of the event in ISO 8601 format. | 
**summary** | **str** | One sentence summary of the event. | 
**user_relevance_score** | **float** | Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy. | 
**created** | **datetime** | Date/Time in UTC the event was first recorded in our data store. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


