# FactSet.SDK.FactSetPowerUtilities.Model.UnitsOwnershipDetail
Unit ownership detail record with plant ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**FactsetPlantId** | **string** | FactSet unique power plant identifier for the parent plant. | 
**OwnerName** | **string** | Owner company name. | [optional] 
**FactsetOwnerId** | **string** | FactSet entity identifier for the owner. | [optional] 
**OwnershipPercentage** | **double?** | Percentage of the unit owned by this owner. | [optional] 
**FactsetUltimateParentEntityId** | **string** | FactSet entity identifier for the ultimate parent of the owner entity. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

