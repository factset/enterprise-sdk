# FactSet.SDK.FactSetConcordance.Model.UniverseMeta
Metadata about a single universe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UniverseId** | **int?** | The universe identifier | [optional] 
**UniverseName** | **string** | The user specified universe name | [optional] 
**UniverseDescription** | **string** | The user specified universe description | [optional] 
**UniverseType** | **string** | The user specified universe type. | [optional] 
**SelfManaged** | **bool?** | False if the universe is managed by FactSet Managed Service, True otherwise | [optional] 
**CreatedBy** | **string** | The user who created the universe | [optional] 
**CreatedOn** | **DateTime?** | When the universe was created | [optional] 
**UpdatedBy** | **string** | The user who most recently updated the universe metadata | [optional] 
**UpdatedOn** | **DateTime?** | When the universe metadata was most recently updated | [optional] 
**AutoRemap** | **bool** | When &#x60;true&#x60;, allows automatic re-evaluation and overwriting of existing mappings in the universe when new metadata is submitted. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

