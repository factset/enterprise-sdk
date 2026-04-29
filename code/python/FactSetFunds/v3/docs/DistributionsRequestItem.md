# DistributionsRequestItem

Request to get fund distributions (current or historical). If only IDs and currency are provided, returns current distributions. If startDate, endDate, or frequency are provided, returns historical distributions.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**distribution_type** | [**DistributionType**](DistributionType.md) |  | [optional] 
**currency** | **str** | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional]  if omitted the server will use the default value of "USD"
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint | [optional] 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**split_adjust** | [**SplitAdjust**](SplitAdjust.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


