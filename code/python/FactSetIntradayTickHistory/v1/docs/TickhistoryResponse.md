# TickhistoryResponse

response for tick history

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requested_id** | **str** | Request Identification String. | [optional] 
**requested_symbol** | **str** | Single Requested Symbol or Security. | [optional] 
**requested_fields** | [**[Fields]**](Fields.md) | Array of requested fields  | [optional] 
**request_key** | **str** |  | [optional] 
**error_code** | **str** |  | [optional] 
**error_description** | **str** | Brief description of error response. Blank if successful. | [optional] 
**field_names** | **str** | Requested Field Names | [optional] 
**field_ids** | **float** | Requested Field ID numbers &#39;FID&#39;. Found in Data Service Manual. | [optional] 
**key** | **str** | Requested Symbol Key, where :D represented delayed data. | [optional] 
**values** | **float** | Array of field values. Each value is returned for requested interval query. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


