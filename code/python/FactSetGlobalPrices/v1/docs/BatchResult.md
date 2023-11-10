# BatchResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | End date of the return. Date in YYYY-MM-DD format. Depending on Frequency and Calendar settings, this could represent the entire return period requested. | [optional] 
**currency** | **str, none_type** | Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**total_return** | **float, none_type** | Returns the data for the given input parameters. | [optional] 
**event_id** | **str, none_type** | FactSet identifier that uniquely identifies the Event. | [optional] 
**event_type_code** | **str, none_type** | Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ] | [optional] 
**event_type_desc** | **str, none_type** | Corporate Actions Event type description. | [optional] 
**div_type_code** | **str, none_type** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**announcement_date** | **str, none_type** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**record_date** | **str, none_type** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**pay_date** | **str, none_type** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effective_date** | **str, none_type** | Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format. | [optional] 
**iad_def_trading_adj** | **float, none_type** | Annualized Dividend value in the trading currency. The value is adjusted for splits | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


