# factsetglobalprices.SharesOutstandingResponseObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Security-level FactSet Permanent Identifier associated with the identifier. | [optional] 
**date** | **Date** | Date of the record in YYYY-MM-DD format. | [optional] 
**documentId** | **String** | Unique Identifier for each document or filing which contains the outstanding shares position. | [optional] 
**requestId** | **String** | FactSet Security Permanent Identifier that was used for the request. | [optional] 
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


