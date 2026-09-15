# FactSet.SDK.FactSetPowerUtilities.Model.PlantUnitDetail
A single plant unit record. Record shape matches the requested `category`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**Category** | **CategoryThermal** |  | 
**FactsetPlantId** | **string** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**PlantName** | **string** | Official plant name. | [optional] 
**IsoCode** | **string** | ISO/TSO market code for the plant&#39;s interconnection area. | [optional] 
**Country** | **string** | Country name of the plant. | [optional] 
**Region** | **string** | Geographic region where the plant is located (e.g., a US state). | [optional] 
**PrimaryFuelType** | **string** | Primary fuel type. | [optional] 
**PrimaryFuelCode** | **string** | Additional detail code for the primary fuel (e.g., &#x60;\&quot;HFO\&quot;&#x60; for heavy fuel oil). | [optional] 
**Technology** | **string** | Generating technology of the plant. | [optional] 
**SubTechnology** | **string** | Additional detail related to the plant&#39;s technology. | [optional] 
**Sector** | **string** | Sector the plant operates within (e.g., commercial or industrial). | [optional] 
**IsChp** | **bool?** | Whether the plant is a combined heat and power (CHP) unit. | [optional] 
**PlantStatus** | **string** | Operational status of the plant. | [optional] 
**CapacityMw** | **double?** | Total nameplate (installed) generating capacity in megawatts (MW AC). | [optional] 
**UnitName** | **string** | Unit name identifying the individually-generating asset within the plant. | [optional] 
**ProjectGrade** | **int?** | Internal grading system primarily used to quantify risk for planned units. | [optional] 
**ProjectGradeDescription** | **string** | Description of the project grade (e.g., \&quot;Proposed\&quot;, \&quot;Announced\&quot;). | [optional] 
**PpSubRegion** | **string** | Sub-region name where the plant is located (e.g., county in the US). | [optional] 
**SubRegionType** | **string** | Type of sub-region (e.g., \&quot;County\&quot; in the US). | [optional] 
**PpRegion** | **string** | Region name where the plant is located (e.g., state in the US). | [optional] 
**RegionType** | **string** | Type of region (e.g., \&quot;State\&quot; in the US). | [optional] 
**HasCcs** | **bool?** | Whether the plant is equipped with carbon capture and sequestration (CCS) equipment. | [optional] 
**HasDesalination** | **bool?** | Whether the plant is associated with desalination. | [optional] 
**IsFloating** | **bool?** | Whether the plant is a floating unit. | [optional] 
**OwnerName** | **string** | Plant owner company name. | [optional] 
**FactsetOwnerEntityId** | **string** | FactSet entity identifier for the plant owner. | [optional] 
**CommissionDate** | **DateTime?** | Date the plant was first commissioned. | [optional] 
**RetirementDate** | **DateTime?** | Date the plant was or is scheduled to be retired. Null if the plant is not retired or a retirement date has not been announced. | [optional] 
**Eia860PlantCode** | **string** | EIA Form 860 plant code for cross-reference. | [optional] 
**PipelineName** | **string** | Name of the connected gas pipeline. | [optional] 
**PipelineSequence** | **int?** | When multiple pipelines supply a unit, indicates whether this is the first, second, or third pipeline. | [optional] 
**SolarInstalledCapacityMw** | **double?** | Total installed solar capacity in MW DC. | [optional] 
**TrackingType** | **string** | Solar array/tracking system type (e.g., &#x60;\&quot;Fixed Rack\&quot;&#x60;, &#x60;\&quot;1 Axis\&quot;&#x60;). | [optional] 
**AzimuthAngle** | **double?** | For fixed-tilt or single-axis arrays, the fixed azimuth angle in degrees (0 &#x3D; north, 90 &#x3D; east, 180 &#x3D; south, 270 &#x3D; west). | [optional] 
**TiltAngleDegrees** | **double?** | For fixed-tilt or single-axis arrays, the fixed tilt angle in degrees from horizontal (0 &#x3D; horizontal, 90 &#x3D; vertical). | [optional] 
**IsThinFilm** | **bool?** | Whether the array uses thin-film module technology. | [optional] 
**Acres** | **double?** | Land area used by the array, in acres. | [optional] 
**TurbineCount** | **int?** | Total number of wind turbines. | [optional] 
**TurbineManufacturer** | **string** | Predominant wind turbine manufacturer at the unit. | [optional] 
**FactsetManufEntityId** | **string** | FactSet entity identifier for the predominant turbine manufacturer. | [optional] 
**TurbineModel** | **string** | Predominant wind turbine model designation at the unit. | [optional] 
**HubHeightM** | **double?** | Average turbine hub height in meters. | [optional] 
**SweptAreaM2** | **double?** | Average area swept by the turbine rotor, in square meters. | [optional] 
**DesignHeatRateBtuPerKwh** | **double?** | Design heat rate, a measure of thermal unit efficiency. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

