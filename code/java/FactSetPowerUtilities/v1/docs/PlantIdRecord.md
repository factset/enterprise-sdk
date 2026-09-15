

# PlantIdRecord

Minimal plant identifier record for discovery.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetPlantId** | **String** | FactSet unique power plant asset identifier (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;). |  [optional]
**plantName** | **String** | Official plant name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]
**primaryFuelType** | **String** | Primary fuel type. |  [optional]
**country** | **String** | Country name. |  [optional]
**region** | **String** | Geographic region where the plant is located (e.g., a US state). |  [optional]
**nearestCity** | **String** | Nearest city to the plant. Approximate, not necessarily the plant&#39;s exact municipality. |  [optional]
**continent** | **String** | Continent where the plant is located. |  [optional]
**latitude** | **Double** | Plant latitude in decimal degrees (WGS-84). |  [optional]
**longitude** | **Double** | Plant longitude in decimal degrees (WGS-84). |  [optional]
**latLongPrecision** | **String** | Indicates the precision of the reported coordinates. |  [optional]
**plantStatus** | [**PlantStatusEnum**](#PlantStatusEnum) | Operational status of the plant. |  [optional]
**capacityMw** | **Double** | Total nameplate (installed) generating capacity in megawatts (MW AC). |  [optional]



## Enum: PlantStatusEnum

Name | Value
---- | -----
OPERATIONAL | &quot;Operational&quot;
PLANNED | &quot;Planned&quot;
RETIRED | &quot;Retired&quot;
CANCELLED | &quot;Cancelled&quot;


## Implemented Interfaces

* Serializable


