# Price


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | Ending date for the period expressed in YYYY-MM-DD format. | [optional] 
**adj_date** | **date, none_type** | Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split. | [optional] 
**currency** | **str, none_type** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**price** | **float, none_type** | Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**price_open** | **float, none_type** | Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET. | [optional] 
**price_high** | **float, none_type** | High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**price_low** | **float, none_type** | Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET. | [optional] 
**volume** | **float, none_type** | Returns the cumulative volume over dates requested. Data is returned in thousands. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


