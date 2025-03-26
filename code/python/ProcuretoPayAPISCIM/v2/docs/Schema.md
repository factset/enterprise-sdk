# Schema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The unique URI of the schema. When applicable, service providers MUST specify the URI. | [readonly] 
**name** | **str** | The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;. | [readonly] 
**attributes** | [**[SchemaAttribute]**](SchemaAttribute.md) | A complex attribute that includes the attributes of a schema. | [readonly] 
**description** | **str** | The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;. | [optional] [readonly] 
**meta** | [**SchemaMeta**](SchemaMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


