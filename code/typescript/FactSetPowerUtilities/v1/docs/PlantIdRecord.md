# factsetpowerutilities.PlantIdRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetPlantId** | **String** | FactSet unique power plant asset identifier (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;). | [optional] 
**plantName** | **String** | Official plant name. | [optional] 
**isoCode** | **String** | ISO/TSO market code. | [optional] 
**primaryFuelType** | **String** | Primary fuel type. | [optional] 
**country** | **String** | Country name. | [optional] 
**region** | **String** | Geographic region where the plant is located (e.g., a US state). | [optional] 
**nearestCity** | **String** | Nearest city to the plant. Approximate, not necessarily the plant&#39;s exact municipality. | [optional] 
**continent** | **String** | Continent where the plant is located. | [optional] 
**latitude** | **Number** | Plant latitude in decimal degrees (WGS-84). | [optional] 
**longitude** | **Number** | Plant longitude in decimal degrees (WGS-84). | [optional] 
**latLongPrecision** | **String** | Indicates the precision of the reported coordinates. | [optional] 
**plantStatus** | **String** | Operational status of the plant. | [optional] 
**capacityMw** | **Number** | Total nameplate (installed) generating capacity in megawatts (MW AC). | [optional] 



## Enum: PlantStatusEnum


* `Operational` (value: `"Operational"`)

* `Planned` (value: `"Planned"`)

* `Retired` (value: `"Retired"`)

* `Cancelled` (value: `"Cancelled"`)




