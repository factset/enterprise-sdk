# FactSet.SDK.FactSetGlobalPrices.Model.CorporateAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**EventId** | **string** | FactSet identifier that uniquely identifies the Event. | [optional] 
**EventTypeCode** | **string** | Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ] | [optional] 
**EventTypeDesc** | **string** | Corporate Actions Event type description. | [optional] 
**DivTypeCode** | **string** | Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764).  | [optional] 
**AnnouncementDate** | **string** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**RecordDate** | **string** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**PayDate** | **string** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**EffectiveDate** | **string** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

