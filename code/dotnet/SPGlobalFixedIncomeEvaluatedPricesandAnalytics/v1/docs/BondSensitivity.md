# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondSensitivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**BidConvexity** | **double?** | Measures the change of Duration with the change in yield,based on the bid price .Available only  for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**MidConvexity** | **double?** | Measures the change of duration with the change in yield,based on the mid price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**AskConvexity** | **double?** | Measures the change of duration with the change in yield,based on the ask price .Available only  for &#x60;corporate bonds&#x60; | [optional] 
**BidEffectiveConvexity** | **double?** | The effective convexity based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**MidEffectiveConvexity** | **double?** | The effective convexity based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**AskEffectiveConvexity** | **double?** |  The effective convexity based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**BidEffectiveDuration** | **double?** | A duration calculation for bonds with embedded options,based on the bid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**MidEffectiveDuration** | **double?** | A duration calculation for bonds with embedded options,based on the mid price. Effective duration takes into account that expected cash flows fluctuate as interest rates change .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**AskEffectiveDuration** | **double?** | A duration calculation for bonds with embedded options,based on the ask price. Effective duration takes into account that expected cash flows fluctuate as interest rates change. Available only  for &#x60;corporate bonds&#x60; | [optional] 
**BidMacaulayDuration** | **double?** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the bid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**MidMacaulayDuration** | **double?** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**AskMacaulayDuration** | **double?** | The weighted average maturity of bond, where the weights are relative discounted cash flows in each period,based on the ask price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**BidModifiedDuration** | **double?** | The first derivative of the bond price, with respect to yield,based on the bid price. | [optional] 
**MidModifiedDuration** | **double?** | The first derivative of the bond price, with respect to yield,based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**AskModifiedDuration** | **double?** | The first derivative of the bond price, with respect to yield,based on the ask price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

