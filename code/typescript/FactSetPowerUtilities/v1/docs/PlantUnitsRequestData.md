# factsetpowerutilities.PlantUnitsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryThermal**](CategoryThermal.md) |  | 
**ids** | **[String]** | Array of FactSet power plant and/or plant unit asset identifiers. Accepts both plant IDs (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;) and unit IDs (e.g., &#x60;\&quot;05RLSM-M\&quot;&#x60;). When a plant ID is provided, all units within that plant are returned. | 
**plantStatus** | **String** | Filter results by operational status. | [optional] 
**minCapacityMw** | **Number** | Filter by minimum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity greater than or equal to this value. Note - capacity value is only returned in the Metadata response. | [optional] 
**maxCapacityMw** | **Number** | Filter by maximum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity less than or equal to this value. Note - capacity value is only returned in the Metadata response. | [optional] 



## Enum: PlantStatusEnum


* `Operational` (value: `"Operational"`)

* `Planned` (value: `"Planned"`)

* `Retired` (value: `"Retired"`)

* `Cancelled` (value: `"Cancelled"`)




