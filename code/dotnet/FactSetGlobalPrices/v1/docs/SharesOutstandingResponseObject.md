# FactSet.SDK.FactSetGlobalPrices.Model.SharesOutstandingResponseObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**Date** | **DateTime?** | Date of the record in YYYY-MM-DD format. | [optional] 
**DocumentId** | **string** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
**RequestId** | **string** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
**ReportDate** | **DateTime?** | Reporting date of the position. | [optional] 
**PublicationDate** | **DateTime?** | Exact date that results have been communicated to the market. | [optional] 
**FiscalYear** | **int?** | The company&#39;s fiscal year corresponding to the report. | [optional] 
**ReportingPeriodDescription** | **string** | Textual description of the reporting period. | [optional] 
**ReportingPeriod** | **int?** | Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year  | [optional] 
**Description** | **string** | Different stock types based on the rights and benefits from ownership. | [optional] 
**AdrDescription** | **string** | Different stock types based on the rights and benefits from ownership for the ADR. | [optional] 
**AdrRatio** | **decimal?** | Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR). | [optional] 
**AdrFsymId** | **string** | Unique FactSet generated identifier assigned to a security, representing the ADR security. | [optional] 
**TotalOutstanding** | **decimal?** | Number of shares outstanding as of &#x60;date&#x60;. | [optional] 
**AdrTotalOutstanding** | **decimal?** | Number of shares outstanding for the ADR as of &#x60;date&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

