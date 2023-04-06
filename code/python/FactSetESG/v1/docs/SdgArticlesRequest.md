# SdgArticlesRequest

SDG Articles Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**PaiIds**](PaiIds.md) |  | 
**start_date** | **str** | The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
**end_date** | **str** | The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | 
**categories** | [**SdgArticlesCategories**](SdgArticlesCategories.md) |  | [optional] 
**fields** | [**ArticlesFields**](ArticlesFields.md) |  | [optional] 
**date_of** | [**DateOf**](DateOf.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


