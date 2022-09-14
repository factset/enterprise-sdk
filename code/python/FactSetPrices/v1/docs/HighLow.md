# HighLow


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adj_date** | **date, none_type** | Date of last split for which prices have been adjusted. | [optional] 
**date** | **date, none_type** | Specific reference date for the period expressed in YYYY-MM-DD format. | [optional] 
**period** | **str, none_type** | The period of measure requested using the period query parameter. | [optional] 
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**price_high** | **float, none_type** | High price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. | [optional] 
**price_low** | **float, none_type** | Low price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. | [optional] 
**price_high_date** | **date, none_type** | Date in which the highest price occurred over the requested period  for the given id expressed in YYYY-MM-DD format. | [optional] 
**price_low_date** | **date, none_type** | Date in which the lowest price occurred over the requested period for the given id expressed in YYYY-MM-DD format. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


