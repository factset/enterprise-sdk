# IndexSnapshotRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IndexIds**](IndexIds.md) |  | 
**date** | **str** | Date of holding expressed in YYYY-MM-DD format. | [optional] 
**return_type** | [**ReturnType**](ReturnType.md) |  | [optional] 
**currency** | **str** | Currency for response. | [optional] 
**calendar** | **str** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional]  if omitted the server will use the default value of "FIVEDAY"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


