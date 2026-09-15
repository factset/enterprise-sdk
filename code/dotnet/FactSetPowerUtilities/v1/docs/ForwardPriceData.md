# FactSet.SDK.FactSetPowerUtilities.Model.ForwardPriceData
Query parameters for forward power price curves.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | **CategoryForward** |  | 
**Ids** | **List&lt;string&gt;** | Array of power price location identifiers such as hub or zone codes (e.g., &#x60;\&quot;HB_NORTH\&quot;&#x60;, &#x60;\&quot;PJM_ATSI_BASE\&quot;&#x60;). | 
**StartDate** | **DateTime** | Return forward price records with a trade date on or after this date (YYYY-MM-DD). | 
**EndDate** | **DateTime** | Return forward price records with a trade date on or before this date (YYYY-MM-DD). | 
**PriceType** | **string** | Filter by forward price type. &#x60;AroundTheClock&#x60; availability is pending confirmation with the data team. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

