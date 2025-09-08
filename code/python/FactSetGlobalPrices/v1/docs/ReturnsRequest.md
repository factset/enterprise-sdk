# ReturnsRequest

Returns Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdsMax50**](IdsMax50.md) |  | 
**start_date** | **str** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**end_date** | **str** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**currency** | **str** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]  if omitted the server will use the default value of "LOCAL"
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**dividend_adjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


