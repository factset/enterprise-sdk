# FactSet.SDK.FactSetGlobalPrices.Model.Split

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**EventId** | **string** | FactSet identifier that uniquely identifies the Event. | [optional] 
**EventTypeCode** | **string** | Character code that denotes the type of Event. | [optional] 
**EventTypeDesc** | **string** | Corporate Actions Event type description. | [optional] 
**AnnouncementDate** | **string** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**RecordDate** | **string** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**PayDate** | **string** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**EffectiveDate** | **string** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**AdjFactor** | **double** | Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split.  | [optional] 
**AdjFactorCombined** | **double** | Combined adjustment factor for all distribution events on that day. | [optional] 
**DistOldTerm** | **double** | Component of distribution ratio -  Number of shares held. | [optional] 
**DistNewTerm** | **double** | Component of distribution ratio -  Number of shares received. | [optional] 
**ShortDesc** | **string** | Textual description identifying the event. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

