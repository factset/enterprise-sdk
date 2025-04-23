

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



## Enum: ExplanationStyleEnum

Name | Value
---- | -----
SHORT | &quot;short&quot;
LONG | &quot;long&quot;


## Implemented Interfaces

* Serializable


