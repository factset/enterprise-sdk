# Profile


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**ticker_region** | **str, none_type** | FactSet Ticker-Region for the requested security. | [optional] 
**exchange** | [**Exchange**](Exchange.md) |  | [optional] 
**name** | **str, none_type** | Name of the security | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**industry** | **str, none_type** | The industry classification for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**sector** | **str, none_type** | The sector classification for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**number_of_employees** | **int, none_type** | Number of employees working in the company | [optional] 
**ceo** | **str, none_type** | A chief executive officer (CEO) is the highest-ranking executive in a company | [optional] 
**business_summary** | **str, none_type** | Summary of the security being requested | [optional] 
**year_founded** | **int, none_type** | The year this security is founded | [optional] 
**market_capitalization** | **int, none_type** | The market capitalization of a company. It is the total value of the company&#39;s outstanding shares of common stock | [optional] 
**total_market_capitalization** | **int, none_type** | The total public shares for the company&#39;s listed equity. This aggregates across all share classes, with including non-traded shares. | [optional] 
**shares_outstanding** | **int, none_type** | The number of common shares that a company has issued and are held by investors | [optional] 
**pe_ratio** | **float, none_type** | The price-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings (EPS) | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


