

# PlantPipelineData

Query parameters for plant gas pipeline connection records. You may provide either plant IDs or unit IDs; when a plant ID is provided, all units within that plant are returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **CategoryPipeline** |  | 
**ids** | **java.util.List&lt;String&gt;** | Array of FactSet power plant and/or plant unit asset identifiers. Accepts both plant IDs (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;) and unit IDs (e.g., &#x60;\&quot;05RLSM-M\&quot;&#x60;). When a plant ID is provided, all units within that plant are returned. | 
**minCapacityMw** | **BigDecimal** | Filter by minimum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity greater than or equal to this value. Note - capacity value is only returned in the Metadata response. |  [optional]
**maxCapacityMw** | **BigDecimal** | Filter by maximum nameplate capacity in megawatts (MW), inclusive. Returns units with capacity less than or equal to this value. Note - capacity value is only returned in the Metadata response. |  [optional]


## Implemented Interfaces

* Serializable


