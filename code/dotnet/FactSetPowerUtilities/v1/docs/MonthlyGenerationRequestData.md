# FactSet.SDK.FactSetPowerUtilities.Model.MonthlyGenerationRequestData
Monthly generation query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Array of FactSet power plant asset identifiers (e.g., &#x60;\&quot;B00121-M\&quot;&#x60;). Use &#x60;GET /plants/ids&#x60; to discover valid identifiers. | 
**StartDate** | **DateTime** | Return records with a report month on or after this date (YYYY-MM-DD). Only the year and month components are used. | 
**EndDate** | **DateTime** | Return records with a report month on or before this date (YYYY-MM-DD). Only the year and month components are used. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

