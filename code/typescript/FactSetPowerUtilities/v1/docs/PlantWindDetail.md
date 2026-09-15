# factsetpowerutilities.PlantWindDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | [**CategoryWind**](CategoryWind.md) |  | 
**turbineCount** | **Number** | Total number of wind turbines. | [optional] 
**turbineManufacturer** | **String** | Predominant wind turbine manufacturer at the unit. | [optional] 
**factsetManufEntityId** | **String** | FactSet entity identifier for the predominant turbine manufacturer. | [optional] 
**turbineModel** | **String** | Predominant wind turbine model designation at the unit. | [optional] 
**hubHeightM** | **Number** | Average turbine hub height in meters. | [optional] 
**sweptAreaM2** | **Number** | Average area swept by the turbine rotor, in square meters. | [optional] 


