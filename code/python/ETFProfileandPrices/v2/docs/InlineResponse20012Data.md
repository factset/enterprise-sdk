# InlineResponse20012Data

Score analytics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**efficiency** | [**InlineResponse20012DataEfficiency**](InlineResponse20012DataEfficiency.md) |  | [optional] 
**tradability** | [**InlineResponse20012DataTradability**](InlineResponse20012DataTradability.md) |  | [optional] 
**fit** | [**InlineResponse20012DataFit**](InlineResponse20012DataFit.md) |  | [optional] 
**grade** | **str** | Combining the efficiency and tradability scores, FactSet assigns a letter grade (A-F) that provides a concise view on how efficient and tradable each ETP is. Available for the regions: US. | [optional] 
**analyst_pick** | **bool** | If true, this fund has been chosen by the FactSet ETP Analytics Team to provide comprehensive, market-like exposure to an area of the market/segment, keeping costs and liquidity in mind. Available for the regions: US. | [optional] 
**on_opportunities_list** | **bool** | If true, this fund has been chosen by the FactSet ETP Analytics Team as providing potentially valuable but alternative exposure to the market/segment, keeping costs and liquidity in mind. Available for the regions: US. | [optional] 
**fit_rsquared** | **float** | The degree to which the daily returns of fund NAV and its FactSet designated segment benchmark move up and down in unison, ranging from 1.0 (perfect co-movement) to zero (no relation). Available for the regions: US. | [optional] 
**beta** | [**InlineResponse20012DataBeta**](InlineResponse20012DataBeta.md) |  | [optional] 
**standard_deviation_down** | **float** | A measure of the variability between the fund&#39;s returns and the FactSet designated segment benchmark returns on days when the fund underperforms the benchmark. Available for the regions: US. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


