# stocksapifordigitalportals.InlineResponse2005Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **Number** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**valueUnit** | [**[InlineResponse2005DataValueUnit]**](InlineResponse2005DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**market** | [**[InlineResponse2005DataMarket]**](InlineResponse2005DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**stockType** | [**[InlineResponse2005DataStockType]**](InlineResponse2005DataStockType.md) | List of stock types. | [optional] 
**industryClassification** | [**[InlineResponse2005DataIndustryClassification]**](InlineResponse2005DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**company** | [**InlineResponse2005DataCompany**](InlineResponse2005DataCompany.md) |  | [optional] 
**compliance** | [**InlineResponse2005DataCompliance**](InlineResponse2005DataCompliance.md) |  | [optional] 
**reportedKeyFigures** | [**InlineResponse2005DataReportedKeyFigures**](InlineResponse2005DataReportedKeyFigures.md) |  | [optional] 
**performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  | [optional] 
**volatility** | [**InlineResponse2005DataVolatility**](InlineResponse2005DataVolatility.md) |  | [optional] 
**tradingValue** | [**InlineResponse2005DataTradingValue**](InlineResponse2005DataTradingValue.md) |  | [optional] 
**simpleMovingAverage** | [**InlineResponse2005DataSimpleMovingAverage**](InlineResponse2005DataSimpleMovingAverage.md) |  | [optional] 
**rsiWilder** | [**InlineResponse2005DataRsiWilder**](InlineResponse2005DataRsiWilder.md) |  | [optional] 
**recommendation** | [**InlineResponse2005DataRecommendation**](InlineResponse2005DataRecommendation.md) |  | [optional] 
**estimates** | [**InlineResponse2005DataEstimates**](InlineResponse2005DataEstimates.md) |  | [optional] 


