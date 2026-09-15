# FactSet.SDK.FactSetPowerUtilities.Model.PlantIdRecord
Minimal plant identifier record for discovery.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FactsetPlantId** | **string** | FactSet unique power plant asset identifier (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;). | [optional] 
**PlantName** | **string** | Official plant name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code. | [optional] 
**PrimaryFuelType** | **string** | Primary fuel type. | [optional] 
**Country** | **string** | Country name. | [optional] 
**Region** | **string** | Geographic region where the plant is located (e.g., a US state). | [optional] 
**NearestCity** | **string** | Nearest city to the plant. Approximate, not necessarily the plant&#39;s exact municipality. | [optional] 
**Continent** | **string** | Continent where the plant is located. | [optional] 
**Latitude** | **double?** | Plant latitude in decimal degrees (WGS-84). | [optional] 
**Longitude** | **double?** | Plant longitude in decimal degrees (WGS-84). | [optional] 
**LatLongPrecision** | **string** | Indicates the precision of the reported coordinates. | [optional] 
**PlantStatus** | **string** | Operational status of the plant. | [optional] 
**CapacityMw** | **double?** | Total nameplate (installed) generating capacity in megawatts (MW AC). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

