# InlineResponse20015Data

Possible values and value ranges of the parameters. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_count** | **float, none_type** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**value_unit** | [**[InlineResponse20015DataValueUnit]**](InlineResponse20015DataValueUnit.md) | List of value unit identifiers. See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values. | [optional] 
**market** | [**[InlineResponse20015DataMarket]**](InlineResponse20015DataMarket.md) | List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**stock_type** | [**[InlineResponse20015DataStockType]**](InlineResponse20015DataStockType.md) | List of stock types. | [optional] 
**industry_classification** | [**[InlineResponse20015DataIndustryClassification]**](InlineResponse20015DataIndustryClassification.md) | Lists of categories of the industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS). Starting with the most coarse level (one), for each level of the category system, the list of categories of the stocks, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for possible values. | [optional] 
**company** | [**InlineResponse20015DataCompany**](InlineResponse20015DataCompany.md) |  | [optional] 
**compliance** | [**InlineResponse20015DataCompliance**](InlineResponse20015DataCompliance.md) |  | [optional] 
**reported_key_figures** | [**InlineResponse20015DataReportedKeyFigures**](InlineResponse20015DataReportedKeyFigures.md) |  | [optional] 
**performance** | [**InlineResponse20015DataPerformance**](InlineResponse20015DataPerformance.md) |  | [optional] 
**volatility** | [**InlineResponse20015DataVolatility**](InlineResponse20015DataVolatility.md) |  | [optional] 
**trading_value** | [**InlineResponse20015DataTradingValue**](InlineResponse20015DataTradingValue.md) |  | [optional] 
**simple_moving_average** | [**InlineResponse20015DataSimpleMovingAverage**](InlineResponse20015DataSimpleMovingAverage.md) |  | [optional] 
**rsi_wilder** | [**InlineResponse20015DataRsiWilder**](InlineResponse20015DataRsiWilder.md) |  | [optional] 
**recommendation** | [**InlineResponse20015DataRecommendation**](InlineResponse20015DataRecommendation.md) |  | [optional] 
**estimates** | [**InlineResponse20015DataEstimates**](InlineResponse20015DataEstimates.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


