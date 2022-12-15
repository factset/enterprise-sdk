# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse20015Data
Possible values and value ranges of the parameters. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **decimal?** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**ValueUnit** | [**List&lt;InlineResponse20015DataValueUnit&gt;**](InlineResponse20015DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**Market** | [**List&lt;InlineResponse20015DataMarket&gt;**](InlineResponse20015DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**StockType** | [**List&lt;InlineResponse20015DataStockType&gt;**](InlineResponse20015DataStockType.md) | List of stock types. | [optional] 
**IndustryClassification** | [**List&lt;InlineResponse20015DataIndustryClassification&gt;**](InlineResponse20015DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**Company** | [**InlineResponse20015DataCompany**](InlineResponse20015DataCompany.md) |  | [optional] 
**Compliance** | [**InlineResponse20015DataCompliance**](InlineResponse20015DataCompliance.md) |  | [optional] 
**ReportedKeyFigures** | [**InlineResponse20015DataReportedKeyFigures**](InlineResponse20015DataReportedKeyFigures.md) |  | [optional] 
**Performance** | [**InlineResponse20015DataPerformance**](InlineResponse20015DataPerformance.md) |  | [optional] 
**Volatility** | [**InlineResponse20015DataVolatility**](InlineResponse20015DataVolatility.md) |  | [optional] 
**TradingValue** | [**InlineResponse20015DataTradingValue**](InlineResponse20015DataTradingValue.md) |  | [optional] 
**SimpleMovingAverage** | [**InlineResponse20015DataSimpleMovingAverage**](InlineResponse20015DataSimpleMovingAverage.md) |  | [optional] 
**RsiWilder** | [**InlineResponse20015DataRsiWilder**](InlineResponse20015DataRsiWilder.md) |  | [optional] 
**Recommendation** | [**InlineResponse20015DataRecommendation**](InlineResponse20015DataRecommendation.md) |  | [optional] 
**Estimates** | [**InlineResponse20015DataEstimates**](InlineResponse20015DataEstimates.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

