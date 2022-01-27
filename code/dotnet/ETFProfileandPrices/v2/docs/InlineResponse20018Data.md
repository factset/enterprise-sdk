# FactSet.SDK.ETFProfileandPrices.Model.InlineResponse20018Data
Strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available.  This data is available for the US and Canada regions. | [optional] 
**Group** | **string** | Factset&#39;s Universal Screening tool code allows screening the greatest number of ETP&#39;s to surface based on a similar ETP strategy. This data is available for the US and Canada regions. | [optional] 
**Cluster** | **string** | Factset&#39;s Universal Screening tool code allows us to screen a greater number of ETP&#39;s to surface; all must have similar ETP strategy characteristics. This data item is more granular and narrow than the strategy group. This data is available for the US and Canada regions. | [optional] 
**SelectCriteria** | **string** | Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions. | [optional] 
**Weighting** | **string** | Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions. | [optional] 
**Segment** | **string** | Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values. | [optional] 
**IsTransparent** | **bool** | Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions. | [optional] 
**FundOfFunds** | **string** | Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

