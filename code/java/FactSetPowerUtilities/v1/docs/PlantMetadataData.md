

# PlantMetadataData

Query parameters for plant unit metadata records. You may provide either plant IDs or unit IDs; when a plant ID is provided, all units within that plant are returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **CategoryMetadata** |  | 
**ids** | **java.util.List&lt;String&gt;** | Array of FactSet power plant and/or plant unit asset identifiers. Accepts both plant IDs (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;) and unit IDs (e.g., &#x60;\&quot;05RLSM-M\&quot;&#x60;). When a plant ID is provided, all units within that plant are returned. | 
**plantStatus** | [**PlantStatusEnum**](#PlantStatusEnum) | Filter results by operational status. |  [optional]
**minCapacityMw** | **BigDecimal** | Filter by minimum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity greater than or equal to this value. |  [optional]
**maxCapacityMw** | **BigDecimal** | Filter by maximum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity less than or equal to this value. |  [optional]



## Enum: PlantStatusEnum

Name | Value
---- | -----
OPERATIONAL | &quot;Operational&quot;
PLANNED | &quot;Planned&quot;
RETIRED | &quot;Retired&quot;
CANCELLED | &quot;Cancelled&quot;


## Implemented Interfaces

* Serializable


