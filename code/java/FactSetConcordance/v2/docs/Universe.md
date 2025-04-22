

# Universe

Metadata about a single universe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universeId** | **Integer** | The universe identifier |  [optional]
**universeName** | **String** | The user specified universe name |  [optional]
**universeDescription** | **String** | The user specified universe description |  [optional]
**universeType** | **String** | The user specified universe entity. |  [optional]
**selfManaged** | **Boolean** | False if the universe is managed by FactSet Managed Service, True otherwise |  [optional]
**createdBy** | **String** | The user who created the universe |  [optional]
**createdOn** | **OffsetDateTime** | When the universe was created |  [optional]
**updatedBy** | **String** | The user who most recently updated the universe metadata |  [optional]
**updatedOn** | **OffsetDateTime** | When the universe metadata was most recently updated |  [optional]
**autoRemap** | **Boolean** | When &#x60;true&#x60;, allows automatic re-evaluation and overwriting of existing mappings in the universe when new metadata is submitted. |  [optional]


## Implemented Interfaces

* Serializable


