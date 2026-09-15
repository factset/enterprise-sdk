

# UnitsOwnershipDetail

Unit ownership detail record with plant ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | 
**factsetPlantId** | **String** | FactSet unique power plant identifier for the parent plant. | 
**ownerName** | **String** | Owner company name. |  [optional]
**factsetOwnerId** | **String** | FactSet entity identifier for the owner. |  [optional]
**ownershipPercentage** | **Double** | Percentage of the unit owned by this owner. |  [optional]
**factsetUltimateParentEntityId** | **String** | FactSet entity identifier for the ultimate parent of the owner entity. |  [optional]


## Implemented Interfaces

* Serializable


