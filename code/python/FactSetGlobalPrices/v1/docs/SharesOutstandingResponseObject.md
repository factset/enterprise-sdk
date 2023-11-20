# SharesOutstandingResponseObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**date** | **date, none_type** | Date of the record in YYYY-MM-DD format. | [optional] 
**document_id** | **str, none_type** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
**request_id** | **str, none_type** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


