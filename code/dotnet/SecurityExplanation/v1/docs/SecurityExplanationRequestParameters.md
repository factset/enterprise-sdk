# FactSet.SDK.SecurityExplanation.Model.SecurityExplanationRequestParameters
Parameters for the security explanation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**StartDate** | **DateTime** | Start date of the explain request in YYYY-MM-DD format. | 
**EndDate** | **DateTime** | End date of the explain request in YYYY-MM-DD format. | 
**EnableLinks** | **bool** | Include or exclude hyperlinks to underlying sources. | [optional] [default to false]
**ExplanationStyle** | **string** | Determines the style of the Explanation | [optional] [default to ExplanationStyleEnum.Short]
**IncludePerformance** | **bool** | Include or exclude the company&#39;s total return for the request period. | [optional] [default to false]
**InternalInvestmentRationale** | **string** | For IRN users only; select to include a summary, footnotes, or no IRN notes for the period. | [optional] [default to InternalInvestmentRationaleEnum.None]
**IncludeCompanyDescription** | **bool** | Include or exclude the target company&#39;s business description. | [optional] [default to false]
**IncludeMarketSummary** | **bool** | Include or exclude market and sector news relating to the target company for additional context. | [optional] [default to true]
**IncludeInternalInvestmentRationaleRecommendation** | **bool** | For IRN users only; include or exclude your firm&#39;s rating in the summary or footnote. | [optional] [default to true]
**IncludeInternalInvestmentRationalePriceTarget** | **bool** | For IRN users only; include or exclude your firm&#39;s price target in the summary or footnote. | [optional] [default to true]
**IncludeSecuritySummary** | **bool** | Include or exclude summary of a security&#39;s performance over the specified period. | [optional] [default to true]
**BrokerResearchSummary** | [**BrokerResearchSummary**](BrokerResearchSummary.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

