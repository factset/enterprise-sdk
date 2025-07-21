# FinancialsRequestBody

Financials request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**PrivateMarketIds**](PrivateMarketIds.md) |  | 
**metrics** | [**FinancialsMetrics**](FinancialsMetrics.md) |  | 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


