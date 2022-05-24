# InlineResponse20029Data

Strategy.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available. This data is available for the US and Canada regions. | [optional] 
**group** | **str** | Factset&#39;s strategy group is the broadest way sort ETPs with a similar investment strategy. This data is available for the US and Canada regions. | [optional] 
**cluster** | **str** | Factset&#39;s strategy cluster is a collection of ETPs with a similar investment strategy, yet smaller than strategy group. This data item is more granular and narrow than the strategy group yet bigger than strategy group. This data is available for the US and Canada regions. | [optional] 
**select_criteria** | **str** | Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions. | [optional] 
**weighting** | **str** | Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions. | [optional] 
**segment** | **str** | Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values. | [optional] 
**is_transparent** | **bool** | Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions. | [optional] 
**fund_of_funds** | **str** | Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


