# PlantUnitDetail

A single plant unit record. Record shape matches the requested `category`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryThermal**](CategoryThermal.md) |  | 
**factset_plant_id** | **str, none_type** | FactSet unique power plant asset identifier for the plant this unit belongs to. | [optional] 
**plant_name** | **str, none_type** | Official plant name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code for the plant&#39;s interconnection area. | [optional] 
**country** | **str, none_type** | Country name of the plant. | [optional] 
**region** | **str, none_type** | Geographic region where the plant is located (e.g., a US state). | [optional] 
**primary_fuel_type** | **str, none_type** | Primary fuel type. | [optional] 
**primary_fuel_code** | **str, none_type** | Additional detail code for the primary fuel (e.g., &#x60;\&quot;HFO\&quot;&#x60; for heavy fuel oil). | [optional] 
**technology** | **str, none_type** | Generating technology of the plant. | [optional] 
**sub_technology** | **str, none_type** | Additional detail related to the plant&#39;s technology. | [optional] 
**sector** | **str, none_type** | Sector the plant operates within (e.g., commercial or industrial). | [optional] 
**is_chp** | **bool, none_type** | Whether the plant is a combined heat and power (CHP) unit. | [optional] 
**plant_status** | **str, none_type** | Operational status of the plant. | [optional] 
**capacity_mw** | **float, none_type** | Total nameplate (installed) generating capacity in megawatts (MW AC). | [optional] 
**unit_name** | **str, none_type** | Unit name identifying the individually-generating asset within the plant. | [optional] 
**project_grade** | **int, none_type** | Internal grading system primarily used to quantify risk for planned units. | [optional] 
**project_grade_description** | **str, none_type** | Description of the project grade (e.g., \&quot;Proposed\&quot;, \&quot;Announced\&quot;). | [optional] 
**pp_sub_region** | **str, none_type** | Sub-region name where the plant is located (e.g., county in the US). | [optional] 
**sub_region_type** | **str, none_type** | Type of sub-region (e.g., \&quot;County\&quot; in the US). | [optional] 
**pp_region** | **str, none_type** | Region name where the plant is located (e.g., state in the US). | [optional] 
**region_type** | **str, none_type** | Type of region (e.g., \&quot;State\&quot; in the US). | [optional] 
**has_ccs** | **bool, none_type** | Whether the plant is equipped with carbon capture and sequestration (CCS) equipment. | [optional] 
**has_desalination** | **bool, none_type** | Whether the plant is associated with desalination. | [optional] 
**is_floating** | **bool, none_type** | Whether the plant is a floating unit. | [optional] 
**owner_name** | **str, none_type** | Plant owner company name. | [optional] 
**factset_owner_entity_id** | **str, none_type** | FactSet entity identifier for the plant owner. | [optional] 
**commission_date** | **date, none_type** | Date the plant was first commissioned. | [optional] 
**retirement_date** | **date, none_type** | Date the plant was or is scheduled to be retired. Null if the plant is not retired or a retirement date has not been announced. | [optional] 
**eia860_plant_code** | **str, none_type** | EIA Form 860 plant code for cross-reference. | [optional] 
**pipeline_name** | **str, none_type** | Name of the connected gas pipeline. | [optional] 
**pipeline_sequence** | **int, none_type** | When multiple pipelines supply a unit, indicates whether this is the first, second, or third pipeline. | [optional] 
**solar_installed_capacity_mw** | **float, none_type** | Total installed solar capacity in MW DC. | [optional] 
**tracking_type** | **str, none_type** | Solar array/tracking system type (e.g., &#x60;\&quot;Fixed Rack\&quot;&#x60;, &#x60;\&quot;1 Axis\&quot;&#x60;). | [optional] 
**azimuth_angle** | **float, none_type** | For fixed-tilt or single-axis arrays, the fixed azimuth angle in degrees (0 &#x3D; north, 90 &#x3D; east, 180 &#x3D; south, 270 &#x3D; west). | [optional] 
**tilt_angle_degrees** | **float, none_type** | For fixed-tilt or single-axis arrays, the fixed tilt angle in degrees from horizontal (0 &#x3D; horizontal, 90 &#x3D; vertical). | [optional] 
**is_thin_film** | **bool, none_type** | Whether the array uses thin-film module technology. | [optional] 
**acres** | **float, none_type** | Land area used by the array, in acres. | [optional] 
**turbine_count** | **int, none_type** | Total number of wind turbines. | [optional] 
**turbine_manufacturer** | **str, none_type** | Predominant wind turbine manufacturer at the unit. | [optional] 
**factset_manuf_entity_id** | **str, none_type** | FactSet entity identifier for the predominant turbine manufacturer. | [optional] 
**turbine_model** | **str, none_type** | Predominant wind turbine model designation at the unit. | [optional] 
**hub_height_m** | **float, none_type** | Average turbine hub height in meters. | [optional] 
**swept_area_m2** | **float, none_type** | Average area swept by the turbine rotor, in square meters. | [optional] 
**design_heat_rate_btu_per_kwh** | **float, none_type** | Design heat rate, a measure of thermal unit efficiency. | [optional] 
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;factsetPlantUnitId&#x60;. | [optional] 
**factset_plant_unit_id** | **str** | FactSet unique power plant unit identifier, as submitted in the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


