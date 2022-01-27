# SdgScoresRequest

SDG Scores Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**TvlIds**](TvlIds.md) |  | 
**score_types** | [**SdgScoreTypes**](SdgScoreTypes.md) |  | [optional] 
**categories** | [**SdgCategories**](SdgCategories.md) |  | [optional] 
**start_date** | **str** | The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**end_date** | **str** | The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**SdgFrequency**](SdgFrequency.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


