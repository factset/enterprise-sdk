# factsetpowerutilities.MarketDataRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryInterchange**](CategoryInterchange.md) |  | 
**ids** | **[String]** | Array of FactSet balancing authority sub-region identifiers (e.g., &#x60;\&quot;05WTTF-M\&quot;&#x60;). Used for the &#x60;Demand&#x60; and &#x60;Interchange&#x60; categories, which are reported at the sub-region level. | 
**startDate** | **Date** | Return records on or after this date (YYYY-MM-DD). | 
**endDate** | **Date** | Return records on or before this date (YYYY-MM-DD). | 
**respondentFactsetBaSubRegId** | **String** | Filter to a specific counterpart balancing authority sub-region. | [optional] [default to &#39;null&#39;]


