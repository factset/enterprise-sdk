# FactSet.SDK.FactSetGlobalPrices.Model.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**Date** | **DateTime?** | Current Market Value Date | [optional] 
**Currency** | **string** | Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**RequestId** | **string** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
**TotalReturn** | **double?** | Returns the data for the given input parameters. | [optional] 
**EventId** | **string** | FactSet identifier that uniquely identifies the Event. | [optional] 
**EventTypeCode** | **string** | Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ] | [optional] 
**EventTypeDesc** | **string** | Corporate Actions Event type description. | [optional] 
**DivTypeCode** | **string** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**AnnouncementDate** | **string** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**RecordDate** | **string** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**PayDate** | **string** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**EffectiveDate** | **string** | Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format. | [optional] 
**IadDefTradingAdj** | **float?** | Annualized Dividend value in the trading currency. The value is adjusted for splits | [optional] 
**DocumentId** | **string** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
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
**CurrentMarketValue** | **decimal?** | Market Value for a specified security. (Current Only) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

