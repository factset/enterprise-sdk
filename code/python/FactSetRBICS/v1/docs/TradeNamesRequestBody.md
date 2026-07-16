# TradeNamesRequestBody

TradeNames Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**TradeNamesIds**](TradeNamesIds.md) |  | 
**as_of_date** | **date** | Effective date for data expressed in YYYY-MM-DD format. This means the as of date will be in between the start and end date returned. Note that it&#39;s possible the end date returned can be null, meaning the tradeName is still active. If no date is requested, the default behavior is to return the latest active data.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


