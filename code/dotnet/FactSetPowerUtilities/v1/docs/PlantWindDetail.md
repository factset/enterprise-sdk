# FactSet.SDK.FactSetPowerUtilities.Model.PlantWindDetail
Wind plant technical specification detail record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**Category** | **CategoryWind** |  | 
**TurbineCount** | **int?** | Total number of wind turbines. | [optional] 
**TurbineManufacturer** | **string** | Predominant wind turbine manufacturer at the unit. | [optional] 
**FactsetManufEntityId** | **string** | FactSet entity identifier for the predominant turbine manufacturer. | [optional] 
**TurbineModel** | **string** | Predominant wind turbine model designation at the unit. | [optional] 
**HubHeightM** | **double?** | Average turbine hub height in meters. | [optional] 
**SweptAreaM2** | **double?** | Average area swept by the turbine rotor, in square meters. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

