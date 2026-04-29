# Scoring

Fund scoring metrics including analyst picks, fund grades, fit scores, efficiency, and tradability ratings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**analyst_pick** | **bool, none_type** | Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind. | [optional] 
**opportunities_list** | **bool, none_type** | Opportunities list flags an ETF that provides potentially valuable but alternative exposure to the market/segment, keeping costs and liquidity in mind. | [optional] 
**fund_grade** | **str, none_type** | Grade combines efficiency and tradability scores and assigns a letter grade. | [optional] 
**fit_score** | **float, none_type** | Returns the Fit score for an ETF. | [optional] 
**segment_average_fit** | **float, none_type** | Returns the segment Average Fit score for an ETF. | [optional] 
**fund_efficiency** | **float, none_type** | Returns Fund Efficiency score for an ETF. | [optional] 
**segment_average_efficiency** | **float, none_type** | Returns the Segment Average efficiency score for an ETF | [optional] 
**fund_tradability** | **float, none_type** | Returns the tradability score of an ETF.  | [optional] 
**segment_average_tradability** | **float, none_type** | Returns the Segment Average Tradability score of an ETF.  | [optional] 
**date** | **date, none_type** | Returns the date when the scores are calculated for an ETF.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


