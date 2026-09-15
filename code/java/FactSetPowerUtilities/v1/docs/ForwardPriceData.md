

# ForwardPriceData

Query parameters for forward power price curves.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **CategoryForward** |  | 
**ids** | **java.util.List&lt;String&gt;** | Array of power price location identifiers such as hub or zone codes (e.g., &#x60;\&quot;HB_NORTH\&quot;&#x60;, &#x60;\&quot;PJM_ATSI_BASE\&quot;&#x60;). | 
**startDate** | **LocalDate** | Return forward price records with a trade date on or after this date (YYYY-MM-DD). | 
**endDate** | **LocalDate** | Return forward price records with a trade date on or before this date (YYYY-MM-DD). | 
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Filter by forward price type. &#x60;AroundTheClock&#x60; availability is pending confirmation with the data team. |  [optional]



## Enum: PriceTypeEnum

Name | Value
---- | -----
ONPEAK | &quot;OnPeak&quot;
OFFPEAK | &quot;OffPeak&quot;
AROUNDTHECLOCK | &quot;AroundTheClock&quot;


## Implemented Interfaces

* Serializable


