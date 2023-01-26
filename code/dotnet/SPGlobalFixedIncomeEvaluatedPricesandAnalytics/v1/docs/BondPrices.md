# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondPrices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Currency** | **string** | Returns the coupon currency .Available only  available for &#x60;corporate and asset-backed security bonds&#x60;. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**CleanBidPrice** | **double?** | The bid price of the instrument. | [optional] 
**CleanMidPrice** | **double?** | The bid price of the instrument. | [optional] 
**CleanAskPrice** | **double?** | The bid price of the instrument. | [optional] 
**DirtyBidPrice** | **double?** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**DirtyMidPrice** | **double?** | The price of the bond plus the interest that is accrued between coupon payments, based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**DirtyAskPrice** | **double?** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**Pv** | **double?** | The present variation per one basis point change in yield, based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**BidPriceDate** | **DateTime?** | The date the bid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**MidPriceDate** | **DateTime?** | The date the mid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**AskPriceDate** | **DateTime?** | The date the ask price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**BidPriceType** | **string** | Bid price type for the given identifier. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**MidPriceType** | **string** | Mid price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**AskPriceType** | **string** | Ask price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

