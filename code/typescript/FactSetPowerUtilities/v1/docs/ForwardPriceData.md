# factsetpowerutilities.ForwardPriceData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**ids** | **[String]** | Array of power price location identifiers such as hub or zone codes (e.g., &#x60;\&quot;HB_NORTH\&quot;&#x60;, &#x60;\&quot;PJM_ATSI_BASE\&quot;&#x60;). | 
**startDate** | **Date** | Return forward price records with a trade date on or after this date (YYYY-MM-DD). | 
**endDate** | **Date** | Return forward price records with a trade date on or before this date (YYYY-MM-DD). | 
**priceType** | **String** | Filter by forward price type. &#x60;AroundTheClock&#x60; availability is pending confirmation with the data team. | [optional] 



## Enum: PriceTypeEnum


* `OnPeak` (value: `"OnPeak"`)

* `OffPeak` (value: `"OffPeak"`)

* `AroundTheClock` (value: `"AroundTheClock"`)




