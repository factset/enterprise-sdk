# SecurityExplanationRequestParameters

Parameters for the security explanation request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**start_date** | **date** | Start date of the explain request in YYYY-MM-DD format | 
**end_date** | **date** | End date of the explain request in YYYY-MM-DD format | 
**enable_links** | **bool** | If true, explain response will have link to the related news articles | [optional]  if omitted the server will use the default value of False
**explanation_style** | **str** | Determines the style of the Explanation | [optional]  if omitted the server will use the default value of "short"
**include_performance** | **bool** | If true, includes the performance statement in the explanation | [optional]  if omitted the server will use the default value of False
**internal_investment_rationale** | **str** | Include summarized IRN notes on the company, or just the footnote, or none. Only available for IRN users | [optional]  if omitted the server will use the default value of "none"
**include_company_description** | **bool** | If true, includes the company description in the explanation.In order to include &#39;Company Business Description&#39;, &#39;includePerformance&#39; must be set to True. Even if &#39;includeCompanyDescription&#39; is set to True, if &#39;includePerformance&#39; is false, it will be omitted | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


