# Distribution


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**event_id** | **str** | FactSet identifier that uniquely identifies the Event. | [optional] 
**event_type_code** | **str** | Corporate Actions Event type code. | [optional] 
**event_type_desc** | **str** | Corporate Actions Event type description. | [optional] 
**announcement_date** | **str** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**record_date** | **str** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**pay_date** | **str** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effective_date** | **str** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**adj_factor** | **float** | Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split.  | [optional] 
**adj_factor_combined** | **float** | Combined adjustment factor for all distribution events on that day. | [optional] 
**amt_def_trading_adj** | **float** | Default Amount - Trading Currency, Split Adjusted | [optional] 
**amt_def_trading_unadj** | **float** | Default Amount - Trading Currency, Unadjusted | [optional] 
**currency** | **str** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**dist_pct** | **float** | Distribution percentage of the event  (i.e. 10%). Typical for stock distributions. | [optional] 
**dist_old_term** | **float** | Component of distribution ratio -  Number of shares held. | [optional] 
**dist_new_term** | **float** | Component of distribution ratio -  Number of shares received. | [optional] 
**rights_issue_price** | **float** | Description | [optional] 
**rights_issue_currency** | **str** | Description | [optional] 
**short_desc** | **str** | Textual description identifying the event. | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


