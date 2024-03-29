# factsetglobalprices.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**date** | **Date** | Date of the record in YYYY-MM-DD format. | [optional] 
**currency** | **String** | Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**requestId** | **String** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
**totalReturn** | **Number** | Returns the data for the given input parameters. | [optional] 
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. | [optional] 
**eventTypeCode** | **String** | Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ] | [optional] 
**eventTypeDesc** | **String** | Corporate Actions Event type description. | [optional] 
**divTypeCode** | **String** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effectiveDate** | **String** | Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format. | [optional] 
**iadDefTradingAdj** | **Number** | Annualized Dividend value in the trading currency. The value is adjusted for splits | [optional] 
**documentId** | **String** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
**reportDate** | **Date** | Reporting date of the position. | [optional] 
**publicationDate** | **Date** | Exact date that results have been communicated to the market. | [optional] 
**fiscalYear** | **Number** | The company&#39;s fiscal year corresponding to the report. | [optional] 
**reportingPeriodDescription** | **String** | Textual description of the reporting period. | [optional] 
**reportingPeriod** | **Number** | Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year  | [optional] 
**description** | **String** | Different stock types based on the rights and benefits from ownership. | [optional] 
**adrDescription** | **String** | Different stock types based on the rights and benefits from ownership for the ADR. | [optional] 
**adrRatio** | **Number** | Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR). | [optional] 
**adrFsymId** | **String** | Unique FactSet generated identifier assigned to a security, representing the ADR security. | [optional] 
**totalOutstanding** | **Number** | Number of shares outstanding as of &#x60;date&#x60;. | [optional] 
**adrTotalOutstanding** | **Number** | Number of shares outstanding for the ADR as of &#x60;date&#x60;. | [optional] 


