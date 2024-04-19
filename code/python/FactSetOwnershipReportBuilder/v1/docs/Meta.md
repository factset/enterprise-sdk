# Meta

Standard Ownership response meta object.  Contains metadata about the response at the root level.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier which was requested by the client | [optional] 
**currency** | **str, none_type** | The currency ISO of the data which was returned | [optional] 
**fsym_id** | **str, none_type** | The resolved fsymId that corresponds to the provided requestId | [optional] 
**no_data** | **bool, none_type** | Indicator of whether FactSet had data for this request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


