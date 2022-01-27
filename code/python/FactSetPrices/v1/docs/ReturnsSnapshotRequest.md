# ReturnsSnapshotRequest

Returns Snapshot Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdsMax2000**](IdsMax2000.md) |  | 
**date** | **str** | The date in **YYYY-MM-DD** format. This controls the perspective dates to the calculate the returns. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**currency** | **str** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**dividend_adjust** | [**DividendAdjustSnapshot**](DividendAdjustSnapshot.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


