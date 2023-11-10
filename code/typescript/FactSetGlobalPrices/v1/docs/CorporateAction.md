# factsetglobalprices.CorporateAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. | [optional] 
**eventTypeCode** | **String** | Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ] | [optional] 
**eventTypeDesc** | **String** | Corporate Actions Event type description. | [optional] 
**divTypeCode** | **String** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effectiveDate** | **String** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 


