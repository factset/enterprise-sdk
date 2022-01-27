# Input


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | English plain text to extract named entities from.  Maxiumum of 10,000 characters. | 
**filter_entities** | **bool** | Drop lower probability entities using machine learning filtering rules | [optional]  if omitted the server will use the default value of True
**enable_id_lookup** | **bool** | Retrieve FactSet IDs for entities | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


