# FactSet.SDK.FactSetBanks.Model.RateAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**AsOfDate** | **DateTime** | Date the rate became effective | [optional] 
**Currency** | **string** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**DepositProduct** | **string** | Deposit product type, e.g., \&quot;Savings\&quot;, \&quot;Certificate of Deposit\&quot;, \&quot;Fixed Rate IRA\&quot; | [optional] 
**Term** | **string** | Product term, e.g., \&quot;0 Month\&quot;, \&quot;1 Year\&quot;, \&quot;18 Months\&quot;, \&quot;All\&quot; | [optional] 
**DepositCategory** | **string** | Balance tier category, e.g., \&quot;Up to 2500\&quot;, \&quot;10000 to 100000\&quot;, \&quot;Over 250000\&quot;. Only present for product rates by balance tier. | [optional] 
**ApyRate** | **double?** | Annual Percentage Yield rate. Only present for product rates by balance tier. | [optional] 
**PrevApyRate** | **double?** | Previous Annual Percentage Yield rate. Only present for product rates by balance tier and average product rates. | [optional] 
**NationalApyAvgRate** | **double?** | National average Annual Percentage Yield rate. Available for product rates by balance tier and average product rates. | [optional] 
**ApyAvgRate** | **double?** | Average Annual Percentage Yield rate. Only present for average product rates and location-specific rates. | [optional] 
**PrevApyAvgRate** | **double?** | Previous average Annual Percentage Yield rate. Only present for average product rates. | [optional] 
**State** | **string** | Two-letter US state or territory code (ISO 3166-2:US). Only present for location-specific rates. | [optional] 
**MinDeposit** | **double?** | Minimum deposit amount. Only present for location-specific rates. | [optional] 
**MaxDeposit** | **double?** | Maximum deposit amount. 0 indicates no maximum. Only present for location-specific rates. | [optional] 
**OnlineDesc** | **string** | Online availability indicator. Only present for location-specific rates. | [optional] 
**IsSpecialOffer** | **bool?** | Indicates whether the rate is a special promotional offer. Only present for location-specific rates. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

