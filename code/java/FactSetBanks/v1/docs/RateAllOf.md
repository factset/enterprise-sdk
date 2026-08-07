

# RateAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) |  [optional]
**asOfDate** | **LocalDate** | Date the rate became effective |  [optional]
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**depositProduct** | **String** | Deposit product type, e.g., \&quot;Savings\&quot;, \&quot;Certificate of Deposit\&quot;, \&quot;Fixed Rate IRA\&quot; |  [optional]
**term** | **String** | Product term, e.g., \&quot;0 Month\&quot;, \&quot;1 Year\&quot;, \&quot;18 Months\&quot;, \&quot;All\&quot; |  [optional]
**depositCategory** | **String** | Balance tier category, e.g., \&quot;Up to 2500\&quot;, \&quot;10000 to 100000\&quot;, \&quot;Over 250000\&quot;. Only present for product rates by balance tier. |  [optional]
**apyRate** | **Double** | Annual Percentage Yield rate. Only present for product rates by balance tier. |  [optional]
**prevApyRate** | **Double** | Previous Annual Percentage Yield rate. Only present for product rates by balance tier and average product rates. |  [optional]
**nationalApyAvgRate** | **Double** | National average Annual Percentage Yield rate. Available for product rates by balance tier and average product rates. |  [optional]
**apyAvgRate** | **Double** | Average Annual Percentage Yield rate. Only present for average product rates and location-specific rates. |  [optional]
**prevApyAvgRate** | **Double** | Previous average Annual Percentage Yield rate. Only present for average product rates. |  [optional]
**state** | **String** | Two-letter US state or territory code (ISO 3166-2:US). Only present for location-specific rates. |  [optional]
**minDeposit** | **Double** | Minimum deposit amount. Only present for location-specific rates. |  [optional]
**maxDeposit** | **Double** | Maximum deposit amount. 0 indicates no maximum. Only present for location-specific rates. |  [optional]
**onlineDesc** | **String** | Online availability indicator. Only present for location-specific rates. |  [optional]
**isSpecialOffer** | **Boolean** | Indicates whether the rate is a special promotional offer. Only present for location-specific rates. |  [optional]


## Implemented Interfaces

* Serializable


