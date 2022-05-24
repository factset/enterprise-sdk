# Dividend


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**event_id** | **str** | FactSet identifier that uniquely identifies the Event. | [optional] 
**event_type_code** | **str** | Corporate Actions Event type code. | [optional] 
**event_type_desc** | **str** | Corporate Actions Event type description. | [optional] 
**div_type_code** | **str** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**announcement_date** | **str** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**record_date** | **str** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**pay_date** | **str** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effective_date** | **str** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**currency** | **str** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**amt_def_net_gross_indicator** | **str** | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**amt_def_trading_adj** | **float** | Default Amount - Trading Currency, Split Adjusted | [optional] 
**amt_def_trading_unadj** | **float** | Default Amount - Trading Currency, Unadjusted | [optional] 
**amt_gross_trading_adj** | **float** | Gross Amount - Trading Currency, Split Adjusted  | [optional] 
**amt_gross_trading_unadj** | **float** | Gross Amount - Trading Currency, Unadjusted  | [optional] 
**amt_net_trading_adj** | **float** | Net Amount - Trading Currency, Split Adjusted | [optional] 
**amt_net_trading_unadj** | **float** | Net Amount - Trading Currency, Unadjusted | [optional] 
**declared_currency** | **str** | Currency code for declared dividend. | [optional] 
**amt_def_dec_adj** | **float** | Default Amount - Declared Currency, Split Adjusted | [optional] 
**amt_def_dec_unadj** | **float** | Default Amount - Declared Currency, Unadjusted | [optional] 
**amt_gross_dec_adj** | **float** | Gross Amount - Declared Currency, Split Adjusted  | [optional] 
**amt_gross_dec_unadj** | **float** | Gross Amount - Declared Currency, Unadjusted  | [optional] 
**amt_net_dec_adj** | **float** | Net Amount - Declared Currency, Split Adjusted  | [optional] 
**amt_net_dec_unadj** | **float** | Net Amount - Declared Currency, Unadjusted  | [optional] 
**dividend_status** | **int** | Dividend Status Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**dividend_active_flag** | **int** | Dividend active Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**dividends_spec_flag** | **int** | Special Dividend Flag - 1&#x3D;Yes, 0&#x3D;No | [optional] 
**frank_def_trading_adj** | **float** | Default Frank - Trading Currency, Split Adjusted | [optional] 
**frank_def_trading_unadj** | **float** | Default Frank - Trading Currency, Unadjusted | [optional] 
**frank_def_dec_adj** | **float** | Default Frank - Declared Currency, Split Adjusted | [optional] 
**frank_def_dec_unadj** | **float** | Default Frank - Declared Currency, Unadjusted | [optional] 
**frank_pct** | **float** | Default Amount - Declared Currency, Unadjusted | [optional] 
**tax_rate** | **float** | Tax Rate for on gross dividend for net dividend. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


