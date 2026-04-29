# FactSet.SDK.FactSetFunds.Model.TradingAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Date** | **DateTime** | The date of the trading data in YYYY-MM-DD format | [optional] 
**DailyDollarTradingVolume** | **decimal** | Daily $ Trading Volume | [optional] 
**DailyShareTradingVolume** | **decimal** | Daily Share Trading Volume | [optional] 
**AverageSpreadPercent** | **decimal** | Average bid-ask spread (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**AverageSpreadDollar** | **decimal** | Average bid-ask spread ($)This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**BlockLiquidityScore** | **int** | Block liquidity score (0–5 scale).This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**UnderlyingVolumePer1M** | **decimal** | Underlying volume per $1M. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**MarketHoursOverlapPercent** | **decimal** | Market hours overlap (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**CreationFee** | **decimal** | ETF creation fee ($) | [optional] 
**CreationUnitSize** | **int** | Creation unit size (shares) | [optional] 
**ImpedimentsToCreation** | **string** | Impediments to ETF creation/redemption process | [optional] 
**MedianPremiumDiscount12M** | **decimal** | Median premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**MinPremiumDiscount12M** | **decimal** | Minimum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 
**MaxPremiumDiscount12M** | **decimal** | Maximum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

