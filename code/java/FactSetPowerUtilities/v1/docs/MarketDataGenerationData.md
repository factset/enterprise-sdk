

# MarketDataGenerationData

Query parameters for balancing authority net generation data. Reported at the balancing-authority level, broken out by fuel type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **CategoryGeneration** |  | 
**ids** | **java.util.List&lt;String&gt;** | Array of FactSet balancing authority identifiers (e.g., &#x60;\&quot;05WTSJ-M\&quot;&#x60;). Used for the &#x60;Generation&#x60; category, which is reported at the balancing-authority level. | 
**startDate** | **LocalDate** | Return records on or after this date (YYYY-MM-DD). | 
**endDate** | **LocalDate** | Return records on or before this date (YYYY-MM-DD). | 


## Implemented Interfaces

* Serializable


