# FactSet.SDK.SecurityExplanation.Model.SecurityExplanationRequestParameters
Parameters for the security explanation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**StartDate** | **DateTime** | Start date of the explain request in YYYY-MM-DD format | 
**EndDate** | **DateTime** | End date of the explain request in YYYY-MM-DD format | 
**EnableLinks** | **bool** | If true, explain response will have link to the related news articles | [optional] [default to false]
**ExplanationStyle** | **string** | Determines the style of the Explanation | [optional] [default to ExplanationStyleEnum.Short]
**IncludePerformance** | **bool** | If true, includes the performance statement in the explanation | [optional] [default to false]
**InternalInvestmentRationale** | **string** | Include summarized IRN notes on the company, or just the footnote, or none. Only available for IRN users | [optional] [default to InternalInvestmentRationaleEnum.None]
**IncludeCompanyDescription** | **bool** | If true, includes the company description in the explanation.In order to include &#39;Company Business Description&#39;, &#39;includePerformance&#39; must be set to True. Even if &#39;includeCompanyDescription&#39; is set to True, if &#39;includePerformance&#39; is false, it will be omitted | [optional] [default to false]
**IncludeMarketSummary** | **bool** | If true, Includes another paragraph detailing macro news influencing the target company. | [optional] [default to true]
**IncludeInternalInvestmentRationaleRecommendation** | **bool** | If true, Includes recommendation from IRN. If you don&#39;t have a recommendation, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. | [optional] [default to true]
**IncludeInternalInvestmentRationalePriceTarget** | **bool** | If true, Includes price target from IRN. If you don&#39;t have a price target, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

