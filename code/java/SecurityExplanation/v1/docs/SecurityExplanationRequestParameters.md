

# SecurityExplanationRequestParameters

Parameters for the security explanation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**startDate** | **LocalDate** | Start date of the explain request in YYYY-MM-DD format | 
**endDate** | **LocalDate** | End date of the explain request in YYYY-MM-DD format | 
**enableLinks** | **Boolean** | If true, explain response will have link to the related news articles |  [optional]
**explanationStyle** | [**ExplanationStyleEnum**](#ExplanationStyleEnum) | Determines the style of the Explanation |  [optional]
**includePerformance** | **Boolean** | If true, includes the performance statement in the explanation |  [optional]
**internalInvestmentRationale** | [**InternalInvestmentRationaleEnum**](#InternalInvestmentRationaleEnum) | Include summarized IRN notes on the company, or just the footnote, or none. Only available for IRN users |  [optional]
**includeCompanyDescription** | **Boolean** | If true, includes the company description in the explanation.In order to include &#39;Company Business Description&#39;, &#39;includePerformance&#39; must be set to True. Even if &#39;includeCompanyDescription&#39; is set to True, if &#39;includePerformance&#39; is false, it will be omitted |  [optional]
**includeMarketSummary** | **Boolean** | If true, Includes another paragraph detailing macro news influencing the target company. |  [optional]
**includeInternalInvestmentRationaleRecommendation** | **Boolean** | If true, Includes recommendation from IRN. If you don&#39;t have a recommendation, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. |  [optional]
**includeInternalInvestmentRationalePriceTarget** | **Boolean** | If true, Includes price target from IRN. If you don&#39;t have a price target, it will be omitted. If &#39;internalInvestmentRationale&#39; is set to &#39;none&#39;, this will be ignored. |  [optional]



## Enum: ExplanationStyleEnum

Name | Value
---- | -----
SHORT | &quot;short&quot;
LONG | &quot;long&quot;



## Enum: InternalInvestmentRationaleEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SUMMARY | &quot;summary&quot;
FOOTNOTE | &quot;footnote&quot;


## Implemented Interfaces

* Serializable


