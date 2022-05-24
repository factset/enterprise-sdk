# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20012Data
Score analytics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Efficiency** | [**InlineResponse20012DataEfficiency**](InlineResponse20012DataEfficiency.md) |  | [optional] 
**Tradability** | [**InlineResponse20012DataTradability**](InlineResponse20012DataTradability.md) |  | [optional] 
**Fit** | [**InlineResponse20012DataFit**](InlineResponse20012DataFit.md) |  | [optional] 
**Grade** | **string** | Combining the efficiency and tradability scores, FactSet assigns a letter grade (A-F) that provides a concise view on how efficient and tradable each ETP is. Available for the regions: US. | [optional] 
**AnalystPick** | **bool** | If true, this fund has been chosen by the FactSet ETP Analytics Team to provide comprehensive, market-like exposure to an area of the market/segment, keeping costs and liquidity in mind. Available for the regions: US. | [optional] 
**OnOpportunitiesList** | **bool** | If true, this fund has been chosen by the FactSet ETP Analytics Team as providing potentially valuable but alternative exposure to the market/segment, keeping costs and liquidity in mind. Available for the regions: US. | [optional] 
**FitRsquared** | **decimal** | The degree to which the daily returns of fund NAV and its FactSet designated segment benchmark move up and down in unison, ranging from 1.0 (perfect co-movement) to zero (no relation). Available for the regions: US. | [optional] 
**Beta** | [**InlineResponse20012DataBeta**](InlineResponse20012DataBeta.md) |  | [optional] 
**StandardDeviationDown** | **decimal** | A measure of the variability between the fund&#39;s returns and the FactSet designated segment benchmark returns on days when the fund underperforms the benchmark. Available for the regions: US. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

