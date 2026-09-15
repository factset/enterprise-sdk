# FactSet.SDK.FactSetPowerUtilities.Model.PlantMetadataDetail
Metadata and coverage record for a single power plant unit. Capacity, status, fuel type, and technology fields are sourced from the underlying unit-level feed. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**FactsetPlantUnitId** | **string** | FactSet unique power plant unit identifier, as submitted in the request. | 
**Category** | **CategoryMetadata** |  | 
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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

