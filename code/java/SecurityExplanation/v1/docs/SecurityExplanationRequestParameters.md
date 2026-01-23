

# SecurityExplanationRequestParameters

Parameters for the security explanation request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**startDate** | **LocalDate** | Start date of the explain request in YYYY-MM-DD format. | 
**endDate** | **LocalDate** | End date of the explain request in YYYY-MM-DD format. | 
**enableLinks** | **Boolean** | Include or exclude hyperlinks to underlying sources. |  [optional]
**explanationStyle** | [**ExplanationStyleEnum**](#ExplanationStyleEnum) | Determines the style of the Explanation |  [optional]
**includePerformance** | **Boolean** | Include or exclude the company&#39;s total return for the request period. |  [optional]
**internalInvestmentRationale** | [**InternalInvestmentRationaleEnum**](#InternalInvestmentRationaleEnum) | For IRN users only; select to include a summary, footnotes, or no IRN notes for the period. |  [optional]
**includeCompanyDescription** | **Boolean** | Include or exclude the target company&#39;s business description. |  [optional]
**includeMarketSummary** | **Boolean** | Include or exclude market and sector news relating to the target company for additional context. |  [optional]
**includeInternalInvestmentRationaleRecommendation** | **Boolean** | For IRN users only; include or exclude your firm&#39;s rating in the summary or footnote. |  [optional]
**includeInternalInvestmentRationalePriceTarget** | **Boolean** | For IRN users only; include or exclude your firm&#39;s price target in the summary or footnote. |  [optional]
**includeSecuritySummary** | **Boolean** | Include or exclude summary of a security&#39;s performance over the specified period. |  [optional]
**brokerResearchSummary** | [**BrokerResearchSummary**](BrokerResearchSummary.md) |  |  [optional]



## Enum: ExplanationStyleEnum

Name | Value
---- | -----
SHORT | &quot;short&quot;
LONG | &quot;long&quot;
ULTRASHORT | &quot;ultraShort&quot;



## Enum: InternalInvestmentRationaleEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SUMMARY | &quot;summary&quot;
FOOTNOTE | &quot;footnote&quot;


## Implemented Interfaces

* Serializable


