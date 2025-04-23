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



## Enum: ExplanationStyleEnum


* `short` (value: `"short"`)

* `long` (value: `"long"`)




