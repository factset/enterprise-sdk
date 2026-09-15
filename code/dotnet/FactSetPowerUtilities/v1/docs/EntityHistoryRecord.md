# FactSet.SDK.FactSetPowerUtilities.Model.EntityHistoryRecord
An entity or security history record, combining security-to-entity identifier mappings with entity ownership structure history.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FactsetEntityId** | **string** | FactSet entity identifier. | [optional] 
**FactsetSecurityId** | **string** | FactSet security identifier, if this record maps a security to an entity. | [optional] 
**FactsetParentEntityId** | **string** | FactSet identifier for the immediate majority owner of this entity&#39;s equity, if this record reflects ownership structure. | [optional] 
**FactsetUltParentEntityId** | **string** | FactSet identifier for the ultimate owner of this entity&#39;s equity, if this record reflects ownership structure. | [optional] 
**Depth** | **int?** | Position of the entity within its ownership tree. 1 &#x3D; ultimate parent, 2 &#x3D; one level below the ultimate parent, etc. | [optional] 
**StartDate** | **DateTime?** | Effective start date of this record. | [optional] 
**EndDate** | **DateTime?** | Effective end date of this record. Null if the record is currently active. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

