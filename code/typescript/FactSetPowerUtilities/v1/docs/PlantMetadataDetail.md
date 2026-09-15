# factsetpowerutilities.PlantMetadataDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | 
**factsetPlantUnitId** | **String** | FactSet unique power plant unit identifier, as submitted in the request. | 
**category** | [**CategoryMetadata**](CategoryMetadata.md) |  | 
**factsetPlantId** | **String** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**plantName** | **String** | Official plant name. | [optional] 
**isoCode** | **String** | ISO/TSO market code for the plant&#39;s interconnection area. | [optional] 
**country** | **String** | Country name of the plant. | [optional] 
**region** | **String** | Geographic region where the plant is located (e.g., a US state). | [optional] 
**primaryFuelType** | **String** | Primary fuel type. | [optional] 
**primaryFuelCode** | **String** | Additional detail code for the primary fuel (e.g., &#x60;\&quot;HFO\&quot;&#x60; for heavy fuel oil). | [optional] 
**technology** | **String** | Generating technology of the plant. | [optional] 
**subTechnology** | **String** | Additional detail related to the plant&#39;s technology. | [optional] 
**sector** | **String** | Sector the plant operates within (e.g., commercial or industrial). | [optional] 
**isChp** | **Boolean** | Whether the plant is a combined heat and power (CHP) unit. | [optional] 
**plantStatus** | **String** | Operational status of the plant. | [optional] 
**capacityMw** | **Number** | Total nameplate (installed) generating capacity in megawatts (MW AC). | [optional] 
**unitName** | **String** | Unit name identifying the individually-generating asset within the plant. | [optional] 
**projectGrade** | **Number** | Internal grading system primarily used to quantify risk for planned units. | [optional] 
**projectGradeDescription** | **String** | Description of the project grade (e.g., \&quot;Proposed\&quot;, \&quot;Announced\&quot;). | [optional] 
**ppSubRegion** | **String** | Sub-region name where the plant is located (e.g., county in the US). | [optional] 
**subRegionType** | **String** | Type of sub-region (e.g., \&quot;County\&quot; in the US). | [optional] 
**ppRegion** | **String** | Region name where the plant is located (e.g., state in the US). | [optional] 
**regionType** | **String** | Type of region (e.g., \&quot;State\&quot; in the US). | [optional] 
**hasCcs** | **Boolean** | Whether the plant is equipped with carbon capture and sequestration (CCS) equipment. | [optional] 
**hasDesalination** | **Boolean** | Whether the plant is associated with desalination. | [optional] 
**isFloating** | **Boolean** | Whether the plant is a floating unit. | [optional] 
**ownerName** | **String** | Plant owner company name. | [optional] 
**factsetOwnerEntityId** | **String** | FactSet entity identifier for the plant owner. | [optional] 
**commissionDate** | **Date** | Date the plant was first commissioned. | [optional] 
**retirementDate** | **Date** | Date the plant was or is scheduled to be retired. Null if the plant is not retired or a retirement date has not been announced. | [optional] 
**eia860PlantCode** | **String** | EIA Form 860 plant code for cross-reference. | [optional] 



## Enum: PlantStatusEnum


* `Operational` (value: `"Operational"`)

* `Planned` (value: `"Planned"`)

* `Retired` (value: `"Retired"`)

* `Cancelled` (value: `"Cancelled"`)




