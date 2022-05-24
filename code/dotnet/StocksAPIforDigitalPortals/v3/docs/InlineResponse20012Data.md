# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse20012Data
Possible values and value ranges of the parameters. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **decimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**ValueUnit** | [**List&lt;InlineResponse20012DataValueUnit&gt;**](InlineResponse20012DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**Market** | [**List&lt;InlineResponse20012DataMarket&gt;**](InlineResponse20012DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**StockType** | [**List&lt;InlineResponse20012DataStockType&gt;**](InlineResponse20012DataStockType.md) | List of stock types. | [optional] 
**IndustryClassification** | [**List&lt;InlineResponse20012DataIndustryClassification&gt;**](InlineResponse20012DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**Company** | [**InlineResponse20012DataCompany**](InlineResponse20012DataCompany.md) |  | [optional] 
**Compliance** | [**InlineResponse20012DataCompliance**](InlineResponse20012DataCompliance.md) |  | [optional] 
**ReportedKeyFigures** | [**InlineResponse20012DataReportedKeyFigures**](InlineResponse20012DataReportedKeyFigures.md) |  | [optional] 
**Performance** | [**InlineResponse20012DataPerformance**](InlineResponse20012DataPerformance.md) |  | [optional] 
**Volatility** | [**InlineResponse20012DataVolatility**](InlineResponse20012DataVolatility.md) |  | [optional] 
**TradingValue** | [**InlineResponse20012DataTradingValue**](InlineResponse20012DataTradingValue.md) |  | [optional] 
**SimpleMovingAverage** | [**InlineResponse20012DataSimpleMovingAverage**](InlineResponse20012DataSimpleMovingAverage.md) |  | [optional] 
**RsiWilder** | [**InlineResponse20012DataRsiWilder**](InlineResponse20012DataRsiWilder.md) |  | [optional] 
**Recommendation** | [**InlineResponse20012DataRecommendation**](InlineResponse20012DataRecommendation.md) |  | [optional] 
**Estimates** | [**InlineResponse20012DataEstimates**](InlineResponse20012DataEstimates.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

