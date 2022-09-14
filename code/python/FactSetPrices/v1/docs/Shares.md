# Shares


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | Date expressed in YYYY-MM-DD format. | [optional] 
**adj_date** | **date, none_type** | Date of last split for which return has been adjusted. Use the /factset-prices/v#/splits endpoint for details on split. If not available, date will return as 0001-01-01. | [optional] 
**shares_security** | **float, none_type** | **Security-level** Common Shares Outstanding in base units. Shares sourced primarily from SEC filings. Securities in certain countries will include treasury shares. For details visit [Online Assistant Page #10435](https://oa.apps.factset.com/pages/10435) | [optional] 
**shares_company** | **float, none_type** | **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *excluded*. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867) | [optional] 
**shares_company_nontraded** | **float, none_type** | **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *included* to the calculation basis by the proportion of their nominal or par value. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867) | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


