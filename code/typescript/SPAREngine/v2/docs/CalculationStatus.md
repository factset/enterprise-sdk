# sparengine.CalculationStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** |  | [optional] 
**units** | **Number** | Number of calculation units in batch. | [optional] 
**pa** | [**{String: CalculationUnitStatus}**](CalculationUnitStatus.md) | List of statuses for PA calculation units. | [optional] 
**spar** | [**{String: CalculationUnitStatus}**](CalculationUnitStatus.md) | List of statuses for SPAR calculation units. | [optional] 
**vault** | [**{String: CalculationUnitStatus}**](CalculationUnitStatus.md) | List of statuses for Vault calculation units. | [optional] 
**pub** | [**{String: CalculationUnitStatus}**](CalculationUnitStatus.md) | List of statuses for Publisher calculation units. | [optional] 



## Enum: StatusEnum


* `Queued` (value: `"Queued"`)

* `Executing` (value: `"Executing"`)

* `Completed` (value: `"Completed"`)

* `Cancelled` (value: `"Cancelled"`)




