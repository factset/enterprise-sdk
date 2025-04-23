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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

