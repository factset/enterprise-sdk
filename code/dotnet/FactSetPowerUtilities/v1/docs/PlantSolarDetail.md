# FactSet.SDK.FactSetPowerUtilities.Model.PlantSolarDetail
Solar plant technical specification detail record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**Category** | **CategorySolar** |  | 
**SolarInstalledCapacityMw** | **double?** | Total installed solar capacity in MW DC. | [optional] 
**TrackingType** | **string** | Solar array/tracking system type (e.g., &#x60;\&quot;Fixed Rack\&quot;&#x60;, &#x60;\&quot;1 Axis\&quot;&#x60;). | [optional] 
**AzimuthAngle** | **double?** | For fixed-tilt or single-axis arrays, the fixed azimuth angle in degrees (0 &#x3D; north, 90 &#x3D; east, 180 &#x3D; south, 270 &#x3D; west). | [optional] 
**TiltAngleDegrees** | **double?** | For fixed-tilt or single-axis arrays, the fixed tilt angle in degrees from horizontal (0 &#x3D; horizontal, 90 &#x3D; vertical). | [optional] 
**IsThinFilm** | **bool?** | Whether the array uses thin-film module technology. | [optional] 
**Acres** | **double?** | Land area used by the array, in acres. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

