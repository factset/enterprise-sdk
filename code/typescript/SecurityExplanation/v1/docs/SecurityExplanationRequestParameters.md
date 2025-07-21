# securityexplanation.SecurityExplanationRequestParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**startDate** | **Date** | Start date of the explain request in YYYY-MM-DD format | 
**endDate** | **Date** | End date of the explain request in YYYY-MM-DD format | 
**enableLinks** | **Boolean** | If true, explain response will have link to the related news articles | [optional] [default to false]
**explanationStyle** | **String** | Determines the style of the Explanation | [optional] [default to &#39;short&#39;]
**includePerformance** | **Boolean** | If true, includes the performance statement in the explanation | [optional] [default to false]
**internalInvestmentRationale** | **String** | Include summarized IRN notes on the company, or just the footnote, or none. Only available for IRN users | [optional] [default to &#39;none&#39;]
**includeCompanyDescription** | **Boolean** | If true, includes the company description in the explanation.In order to include &#39;Company Business Description&#39;, &#39;includePerformance&#39; must be set to True. Even if &#39;includeCompanyDescription&#39; is set to True, if &#39;includePerformance&#39; is false, it will be omitted | [optional] [default to false]
**includeMarketSummary** | **Boolean** | If true, Includes another paragraph detailing macro news influencing the target company. | [optional] [default to true]
**includeInternalInvestmentRationaleRecommendation** | **Boolean** | If true, Includes recommendation from IRN. If you don&#39;t have a recommendation, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. | [optional] [default to true]
**includeInternalInvestmentRationalePriceTarget** | **Boolean** | If true, Includes price target from IRN. If you don&#39;t have a price target, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. | [optional] [default to true]



## Enum: ExplanationStyleEnum


* `short` (value: `"short"`)

* `long` (value: `"long"`)





## Enum: InternalInvestmentRationaleEnum


* `none` (value: `"none"`)

* `summary` (value: `"summary"`)

* `footnote` (value: `"footnote"`)




