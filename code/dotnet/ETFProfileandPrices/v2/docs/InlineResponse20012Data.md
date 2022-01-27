# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20012Data
Distribution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dividend** | [**InlineResponse20012DataDividend**](InlineResponse20012DataDividend.md) |  | [optional] 
**CapitalGains** | [**InlineResponse20012DataCapitalGains**](InlineResponse20012DataCapitalGains.md) |  | [optional] 
**TotalDistribution** | **decimal** | Total Distribution on exDividend-date. Values are in the ETP&#39;s listing currency in the ISO 4217 format. This data is available for all regions. Please refer currency.listing in /factset/etf/getBySymbol for currency value. | [optional] 
**DistributionYield** | **decimal** | Total 12-month distribution of the ETP multiplied by split factor then divided by its net asset value. Data is split adjusted. This data is available for the US regions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

