# etfprofileandprices.InlineResponse20029Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available. This data is available for the US and Canada regions. | [optional] 
**group** | **String** | Factset&#39;s strategy group is the broadest way sort ETPs with a similar investment strategy. This data is available for the US and Canada regions. | [optional] 
**cluster** | **String** | Factset&#39;s strategy cluster is a collection of ETPs with a similar investment strategy, yet smaller than strategy group. This data item is more granular and narrow than the strategy group yet bigger than strategy group. This data is available for the US and Canada regions. | [optional] 
**selectCriteria** | **String** | Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions. | [optional] 
**weighting** | **String** | Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions. | [optional] 
**segment** | **String** | Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values. | [optional] 
**isTransparent** | **Boolean** | Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions. | [optional] 
**fundOfFunds** | **String** | Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions. | [optional] 


