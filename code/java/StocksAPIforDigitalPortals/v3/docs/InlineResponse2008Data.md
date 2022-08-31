

# InlineResponse2008Data

Possible values and value ranges of the parameters. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **BigDecimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. |  [optional]
**valueUnit** | [**java.util.List&lt;InlineResponse2008DataValueUnit&gt;**](InlineResponse2008DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. |  [optional]
**market** | [**java.util.List&lt;InlineResponse2008DataMarket&gt;**](InlineResponse2008DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. |  [optional]
**stockType** | [**java.util.List&lt;InlineResponse2008DataStockType&gt;**](InlineResponse2008DataStockType.md) | List of stock types. |  [optional]
**industryClassification** | [**java.util.List&lt;InlineResponse2008DataIndustryClassification&gt;**](InlineResponse2008DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. |  [optional]
**company** | [**InlineResponse2008DataCompany**](InlineResponse2008DataCompany.md) |  |  [optional]
**compliance** | [**InlineResponse2008DataCompliance**](InlineResponse2008DataCompliance.md) |  |  [optional]
**reportedKeyFigures** | [**InlineResponse2008DataReportedKeyFigures**](InlineResponse2008DataReportedKeyFigures.md) |  |  [optional]
**performance** | [**InlineResponse2008DataPerformance**](InlineResponse2008DataPerformance.md) |  |  [optional]
**volatility** | [**InlineResponse2008DataVolatility**](InlineResponse2008DataVolatility.md) |  |  [optional]
**tradingValue** | [**InlineResponse2008DataTradingValue**](InlineResponse2008DataTradingValue.md) |  |  [optional]
**simpleMovingAverage** | [**InlineResponse2008DataSimpleMovingAverage**](InlineResponse2008DataSimpleMovingAverage.md) |  |  [optional]
**rsiWilder** | [**InlineResponse2008DataRsiWilder**](InlineResponse2008DataRsiWilder.md) |  |  [optional]
**recommendation** | [**InlineResponse2008DataRecommendation**](InlineResponse2008DataRecommendation.md) |  |  [optional]
**estimates** | [**InlineResponse2008DataEstimates**](InlineResponse2008DataEstimates.md) |  |  [optional]


## Implemented Interfaces

* Serializable


