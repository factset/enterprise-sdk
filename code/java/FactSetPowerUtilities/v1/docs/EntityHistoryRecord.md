

# EntityHistoryRecord

An entity or security history record, combining security-to-entity identifier mappings with entity ownership structure history.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetEntityId** | **String** | FactSet entity identifier. |  [optional]
**factsetSecurityId** | **String** | FactSet security identifier, if this record maps a security to an entity. |  [optional]
**factsetParentEntityId** | **String** | FactSet identifier for the immediate majority owner of this entity&#39;s equity, if this record reflects ownership structure. |  [optional]
**factsetUltParentEntityId** | **String** | FactSet identifier for the ultimate owner of this entity&#39;s equity, if this record reflects ownership structure. |  [optional]
**depth** | **Integer** | Position of the entity within its ownership tree. 1 &#x3D; ultimate parent, 2 &#x3D; one level below the ultimate parent, etc. |  [optional]
**startDate** | **LocalDate** | Effective start date of this record. |  [optional]
**endDate** | **LocalDate** | Effective end date of this record. Null if the record is currently active. |  [optional]


## Implemented Interfaces

* Serializable


