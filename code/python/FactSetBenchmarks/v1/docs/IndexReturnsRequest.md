# IndexReturnsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IndexIds**](IndexIds.md) |  | 
**start_date** | **str** | Requested start date expressed in YYYY-MM-DD format. | 
**end_date** | **str** | Requested end date for Range expressed in YYYY-MM-DD format. | 
**return_type** | [**ReturnType**](ReturnType.md) |  | [optional] 
**hedge_type** | [**HedgeType**](HedgeType.md) |  | [optional] 
**currency** | **str** | Currency for response. Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**calendar** | **str** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional]  if omitted the server will use the default value of "FIVEDAY"
**implied_date** | [**ImpliedDate**](ImpliedDate.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


