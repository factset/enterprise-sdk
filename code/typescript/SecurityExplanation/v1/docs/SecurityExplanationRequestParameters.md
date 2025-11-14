# securityexplanation.SecurityExplanationRequestParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**startDate** | **Date** | Start date of the explain request in YYYY-MM-DD format. | 
**endDate** | **Date** | End date of the explain request in YYYY-MM-DD format. | 
**enableLinks** | **Boolean** | Include or exclude hyperlinks to underlying sources. | [optional] [default to false]
**explanationStyle** | **String** | Determines the style of the Explanation | [optional] [default to &#39;short&#39;]
**includePerformance** | **Boolean** | Include or exclude the company&#39;s total return for the request period. | [optional] [default to false]
**internalInvestmentRationale** | **String** | For IRN users only; select to include a summary, footnotes, or no IRN notes for the period. | [optional] [default to &#39;none&#39;]
**includeCompanyDescription** | **Boolean** | Include or exclude the target company&#39;s business description. | [optional] [default to false]
**includeMarketSummary** | **Boolean** | Include or exclude market and sector news relating to the target company for additional context. | [optional] [default to true]
**includeInternalInvestmentRationaleRecommendation** | **Boolean** | For IRN users only; include or exclude your firm&#39;s rating in the summary or footnote. | [optional] [default to true]
**includeInternalInvestmentRationalePriceTarget** | **Boolean** | For IRN users only; include or exclude your firm&#39;s price target in the summary or footnote. | [optional] [default to true]
**includeSecuritySummary** | **Boolean** | Include or exclude summary of a security&#39;s performance over the specified period. | [optional] [default to true]
**brokerResearchSummary** | [**BrokerResearchSummary**](BrokerResearchSummary.md) |  | [optional] 



## Enum: ExplanationStyleEnum


* `short` (value: `"short"`)

* `long` (value: `"long"`)





## Enum: InternalInvestmentRationaleEnum


* `none` (value: `"none"`)

* `summary` (value: `"summary"`)

* `footnote` (value: `"footnote"`)




