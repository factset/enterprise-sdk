

# MonthlyGenerationRequestData

Monthly generation query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of FactSet power plant asset identifiers (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;). Use &#x60;GET /plants/ids&#x60; to discover valid identifiers. | 
**startDate** | **LocalDate** | Return records with a report month on or after this date (YYYY-MM-DD). Only the year and month components are used. | 
**endDate** | **LocalDate** | Return records with a report month on or before this date (YYYY-MM-DD). Only the year and month components are used. | 


## Implemented Interfaces

* Serializable


