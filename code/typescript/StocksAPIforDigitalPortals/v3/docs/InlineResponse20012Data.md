# stocksapifordigitalportals.InlineResponse20012Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **Number** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**valueUnit** | [**[InlineResponse20012DataValueUnit]**](InlineResponse20012DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**market** | [**[InlineResponse20012DataMarket]**](InlineResponse20012DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**stockType** | [**[InlineResponse20012DataStockType]**](InlineResponse20012DataStockType.md) | List of stock types. | [optional] 
**industryClassification** | [**[InlineResponse20012DataIndustryClassification]**](InlineResponse20012DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**company** | [**InlineResponse20012DataCompany**](InlineResponse20012DataCompany.md) |  | [optional] 
**compliance** | [**InlineResponse20012DataCompliance**](InlineResponse20012DataCompliance.md) |  | [optional] 
**reportedKeyFigures** | [**InlineResponse20012DataReportedKeyFigures**](InlineResponse20012DataReportedKeyFigures.md) |  | [optional] 
**performance** | [**InlineResponse20012DataPerformance**](InlineResponse20012DataPerformance.md) |  | [optional] 
**volatility** | [**InlineResponse20012DataVolatility**](InlineResponse20012DataVolatility.md) |  | [optional] 
**tradingValue** | [**InlineResponse20012DataTradingValue**](InlineResponse20012DataTradingValue.md) |  | [optional] 
**simpleMovingAverage** | [**InlineResponse20012DataSimpleMovingAverage**](InlineResponse20012DataSimpleMovingAverage.md) |  | [optional] 
**rsiWilder** | [**InlineResponse20012DataRsiWilder**](InlineResponse20012DataRsiWilder.md) |  | [optional] 
**recommendation** | [**InlineResponse20012DataRecommendation**](InlineResponse20012DataRecommendation.md) |  | [optional] 
**estimates** | [**InlineResponse20012DataEstimates**](InlineResponse20012DataEstimates.md) |  | [optional] 


