# BatchResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**date** | **date, none_type** | Current Market Value Date | [optional] 
**currency** | **str, none_type** | Currency ISO code associated with the annualized dividends. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**request_id** | **str** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
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
**document_id** | **str, none_type** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
**report_date** | **date, none_type** | Reporting date of the position. | [optional] 
**publication_date** | **date, none_type** | Exact date that results have been communicated to the market. | [optional] 
**fiscal_year** | **int, none_type** | The company&#39;s fiscal year corresponding to the report. | [optional] 
**reporting_period_description** | **str, none_type** | Textual description of the reporting period. | [optional] 
**reporting_period** | **int, none_type** | Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year  | [optional] 
**description** | **str, none_type** | Different stock types based on the rights and benefits from ownership. | [optional] 
**adr_description** | **str, none_type** | Different stock types based on the rights and benefits from ownership for the ADR. | [optional] 
**adr_ratio** | **float, none_type** | Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR). | [optional] 
**adr_fsym_id** | **str, none_type** | Unique FactSet generated identifier assigned to a security, representing the ADR security. | [optional] 
**total_outstanding** | **float, none_type** | Number of shares outstanding as of &#x60;date&#x60;. | [optional] 
**adr_total_outstanding** | **float, none_type** | Number of shares outstanding for the ADR as of &#x60;date&#x60;. | [optional] 
**current_market_value** | **float, none_type** | Market Value for a specified security. (Current Only) | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


