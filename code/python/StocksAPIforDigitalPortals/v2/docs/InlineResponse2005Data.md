# InlineResponse2005Data

Possible values and value ranges of the parameters. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_count** | **float** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**value_unit** | [**[InlineResponse2005DataValueUnit]**](InlineResponse2005DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**market** | [**[InlineResponse2005DataMarket]**](InlineResponse2005DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**stock_type** | [**[InlineResponse2005DataStockType]**](InlineResponse2005DataStockType.md) | List of stock types. | [optional] 
**industry_classification** | [**[InlineResponse2005DataIndustryClassification]**](InlineResponse2005DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**company** | [**InlineResponse2005DataCompany**](InlineResponse2005DataCompany.md) |  | [optional] 
**compliance** | [**InlineResponse2005DataCompliance**](InlineResponse2005DataCompliance.md) |  | [optional] 
**reported_key_figures** | [**InlineResponse2005DataReportedKeyFigures**](InlineResponse2005DataReportedKeyFigures.md) |  | [optional] 
**performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  | [optional] 
**volatility** | [**InlineResponse2005DataVolatility**](InlineResponse2005DataVolatility.md) |  | [optional] 
**trading_value** | [**InlineResponse2005DataTradingValue**](InlineResponse2005DataTradingValue.md) |  | [optional] 
**simple_moving_average** | [**InlineResponse2005DataSimpleMovingAverage**](InlineResponse2005DataSimpleMovingAverage.md) |  | [optional] 
**rsi_wilder** | [**InlineResponse2005DataRsiWilder**](InlineResponse2005DataRsiWilder.md) |  | [optional] 
**recommendation** | [**InlineResponse2005DataRecommendation**](InlineResponse2005DataRecommendation.md) |  | [optional] 
**estimates** | [**InlineResponse2005DataEstimates**](InlineResponse2005DataEstimates.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


