# CostsFeesRequest

Cost and Fees Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**CostsFeesIds**](CostsFeesIds.md) |  | 
**date** | **str** | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**currency** | **str** | The ISO3 currency control for the requested fund. | [optional]  if omitted the server will use the default value of "LOCAL"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


