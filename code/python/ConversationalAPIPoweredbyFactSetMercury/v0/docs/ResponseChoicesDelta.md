# ResponseChoicesDelta

The incremental update to the message content for this chunk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the message (e.g., \&quot;assistant\&quot;). | [optional] 
**content** | **str** | The incremental content for this chunk. | [optional] 
**factset_context** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}, none_type** | Additional FactSet context associated with this chunk, or null if none is available. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


