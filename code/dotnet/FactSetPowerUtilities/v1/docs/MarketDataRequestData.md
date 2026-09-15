# FactSet.SDK.FactSetPowerUtilities.Model.MarketDataRequestData
Market data query parameters. The `category` field selects the record shape returned. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | **CategoryInterchange** |  | 
**Ids** | **List&lt;string&gt;** | Array of FactSet balancing authority sub-region identifiers (e.g., &#x60;\&quot;05WTTF-M\&quot;&#x60;). Used for the &#x60;Demand&#x60; and &#x60;Interchange&#x60; categories, which are reported at the sub-region level. | 
**StartDate** | **DateTime** | Return records on or after this date (YYYY-MM-DD). | 
**EndDate** | **DateTime** | Return records on or before this date (YYYY-MM-DD). | 
**RespondentFactsetBaSubRegId** | **string** | Filter to a specific counterpart balancing authority sub-region. | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

