# StockMovementItem

Model for stock movement data item.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **str** | Title of the company summary | 
**content** | **str** | Detailed content of the company summary | 
**generated_timestamp** | **datetime** | Timestamp when the summary was generated in ISO 8601 format (YYYY-MM-DDTHH:MM:SSZ) | 
**references** | [**[Reference]**](Reference.md) | List of references cited in the content | 
**competitors** | [**[Competitor]**](Competitor.md) | List of competitor companies and their performance | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


