

# HourlyGenerationRequestData

Hourly generation query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of FactSet power plant and/or plant unit asset identifiers. Accepts both plant IDs (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;) and unit IDs (e.g., &#x60;\&quot;05RLSM-M\&quot;&#x60;). When a plant ID is provided, all units within that plant are returned. | 
**startDate** | **LocalDate** | Return records on or after this date (YYYY-MM-DD). | 
**endDate** | **LocalDate** | Return records on or before this date (YYYY-MM-DD). | 


## Implemented Interfaces

* Serializable


