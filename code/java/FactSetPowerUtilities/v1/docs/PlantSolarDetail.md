

# PlantSolarDetail

Solar plant technical specification detail record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | **CategorySolar** |  | 
**solarInstalledCapacityMw** | **Double** | Total installed solar capacity in MW DC. |  [optional]
**trackingType** | **String** | Solar array/tracking system type (e.g., &#x60;\&quot;Fixed Rack\&quot;&#x60;, &#x60;\&quot;1 Axis\&quot;&#x60;). |  [optional]
**azimuthAngle** | **Double** | For fixed-tilt or single-axis arrays, the fixed azimuth angle in degrees (0 &#x3D; north, 90 &#x3D; east, 180 &#x3D; south, 270 &#x3D; west). |  [optional]
**tiltAngleDegrees** | **Double** | For fixed-tilt or single-axis arrays, the fixed tilt angle in degrees from horizontal (0 &#x3D; horizontal, 90 &#x3D; vertical). |  [optional]
**isThinFilm** | **Boolean** | Whether the array uses thin-film module technology. |  [optional]
**acres** | **Double** | Land area used by the array, in acres. |  [optional]


## Implemented Interfaces

* Serializable


