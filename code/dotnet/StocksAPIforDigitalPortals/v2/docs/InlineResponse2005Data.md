# FactSet.SDK.StocksAPIforDigitalPortals.Model.InlineResponse2005Data
Possible values and value ranges of the parameters. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **decimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**ValueUnit** | [**List&lt;InlineResponse2005DataValueUnit&gt;**](InlineResponse2005DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**Market** | [**List&lt;InlineResponse2005DataMarket&gt;**](InlineResponse2005DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**StockType** | [**List&lt;InlineResponse2005DataStockType&gt;**](InlineResponse2005DataStockType.md) | List of stock types. | [optional] 
**IndustryClassification** | [**List&lt;InlineResponse2005DataIndustryClassification&gt;**](InlineResponse2005DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**Company** | [**InlineResponse2005DataCompany**](InlineResponse2005DataCompany.md) |  | [optional] 
**Compliance** | [**InlineResponse2005DataCompliance**](InlineResponse2005DataCompliance.md) |  | [optional] 
**ReportedKeyFigures** | [**InlineResponse2005DataReportedKeyFigures**](InlineResponse2005DataReportedKeyFigures.md) |  | [optional] 
**Performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  | [optional] 
**Volatility** | [**InlineResponse2005DataVolatility**](InlineResponse2005DataVolatility.md) |  | [optional] 
**TradingValue** | [**InlineResponse2005DataTradingValue**](InlineResponse2005DataTradingValue.md) |  | [optional] 
**SimpleMovingAverage** | [**InlineResponse2005DataSimpleMovingAverage**](InlineResponse2005DataSimpleMovingAverage.md) |  | [optional] 
**RsiWilder** | [**InlineResponse2005DataRsiWilder**](InlineResponse2005DataRsiWilder.md) |  | [optional] 
**Recommendation** | [**InlineResponse2005DataRecommendation**](InlineResponse2005DataRecommendation.md) |  | [optional] 
**Estimates** | [**InlineResponse2005DataEstimates**](InlineResponse2005DataEstimates.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

