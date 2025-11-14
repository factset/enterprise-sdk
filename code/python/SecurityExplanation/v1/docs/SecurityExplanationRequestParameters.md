# SecurityExplanationRequestParameters

Parameters for the security explanation request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. | 
**start_date** | **date** | Start date of the explain request in YYYY-MM-DD format. | 
**end_date** | **date** | End date of the explain request in YYYY-MM-DD format. | 
**enable_links** | **bool** | Include or exclude hyperlinks to underlying sources. | [optional]  if omitted the server will use the default value of False
**explanation_style** | **str** | Determines the style of the Explanation | [optional]  if omitted the server will use the default value of "short"
**include_performance** | **bool** | Include or exclude the company&#39;s total return for the request period. | [optional]  if omitted the server will use the default value of False
**internal_investment_rationale** | **str** | For IRN users only; select to include a summary, footnotes, or no IRN notes for the period. | [optional]  if omitted the server will use the default value of "none"
**include_company_description** | **bool** | Include or exclude the target company&#39;s business description. | [optional]  if omitted the server will use the default value of False
**include_market_summary** | **bool** | Include or exclude market and sector news relating to the target company for additional context. | [optional]  if omitted the server will use the default value of True
**include_internal_investment_rationale_recommendation** | **bool** | For IRN users only; include or exclude your firm&#39;s rating in the summary or footnote. | [optional]  if omitted the server will use the default value of True
**include_internal_investment_rationale_price_target** | **bool** | For IRN users only; include or exclude your firm&#39;s price target in the summary or footnote. | [optional]  if omitted the server will use the default value of True
**include_security_summary** | **bool** | Include or exclude summary of a security&#39;s performance over the specified period. | [optional]  if omitted the server will use the default value of True
**broker_research_summary** | [**BrokerResearchSummary**](BrokerResearchSummary.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


