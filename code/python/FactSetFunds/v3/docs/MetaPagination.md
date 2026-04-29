# MetaPagination

Object defining the pagination attributes for an endpoint request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | The maximum number of records to return. The default is 20. | [optional]  if omitted the server will use the default value of 20
**offset** | **int** | The number of records to skip before the first record to return. The default is 0. | [optional]  if omitted the server will use the default value of 0
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


