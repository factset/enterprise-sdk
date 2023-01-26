# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondYield

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**BidYieldToMaturity** | **double?** | The yield to maturity of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**MidYieldToMaturity** | **double?** | The yield to maturity of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**AskYieldToMaturity** | **double?** | The yield to maturity of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BidYieldToWorst** | **double?** | The lowest yield, under all possible scenarios, of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**MidYieldToWorst** | **double?** | The lowest yield, under all possible scenarios, of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**AskYieldToWorst** | **double?** | The lowest yield, under all possible scenarios, of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**BenchmarkBidYieldToMaturity** | **double?** | The bid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BenchmarkMidYieldToMaturity** | **double?** | The mid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BenchmarkAskYieldToMaturity** | **double?** | The ask yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**BidYieldToCall** | **double?** | The yield to call of the bid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**MidYieldToCall** | **double?** | The yield to call of the mid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**YieldTWDate** | **DateTime?** | The date used in the yield to worst calculation. Available only for &#39;corporate bonds&#39;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

