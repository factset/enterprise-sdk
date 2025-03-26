# procuretopayapiscim.Schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique URI of the schema. When applicable, service providers MUST specify the URI. | [readonly] 
**name** | **String** | The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;. | [readonly] 
**description** | **String** | The schema&#39;s human-readable name.  When applicable, service providers MUST specify the name, e.g., &#39;User&#39;. | [optional] [readonly] 
**attributes** | [**[SchemaAttribute]**](SchemaAttribute.md) | A complex attribute that includes the attributes of a schema. | [readonly] 
**meta** | [**SchemaMeta**](SchemaMeta.md) |  | [optional] 


