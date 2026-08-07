# ErrorObjectSource

Reference to the request field that caused the error. For POST requests, `pointer` is used (JSON Pointer to the request body field, e.g. `/ids/1`). For GET requests, `parameter` is used (query parameter name, e.g. `ids[3]`). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pointer** | **str** | JSON Pointer (RFC 6901) to the request body field that caused the error. Used for POST requests (e.g., &#x60;/ids/1&#x60; for the second element of the &#x60;ids&#x60; array).  | [optional] 
**parameter** | **str** | Query parameter name that caused the error. Used for GET requests (e.g., &#x60;ids[3]&#x60;).  | [optional] 
**value** | **str** | The actual value that caused the error. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


