# factsetglobalprices.Distribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. | [optional] 
**eventTypeCode** | **String** | Corporate Actions Event type code. | [optional] 
**eventTypeDesc** | **String** | Corporate Actions Event type description. | [optional] 
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. | [optional] 
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. | [optional] 
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. | [optional] 
**effectiveDate** | **String** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. | [optional] 
**adjFactor** | **Number** | Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split.  | [optional] 
**adjFactorCombined** | **Number** | Combined adjustment factor for all distribution events on that day. | [optional] 
**amtDefTradingAdj** | **Number** | Default Amount - Trading Currency, Split Adjusted | [optional] 
**amtDefTradingUnadj** | **Number** | Default Amount - Trading Currency, Unadjusted | [optional] 
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**distPct** | **Number** | Distribution percentage of the event  (i.e. 10%). Typical for stock distributions. | [optional] 
**distOldTerm** | **Number** | Component of distribution ratio -  Number of shares held. | [optional] 
**distNewTerm** | **Number** | Component of distribution ratio -  Number of shares received. | [optional] 
**rightsIssuePrice** | **Number** | Description | [optional] 
**rightsIssueCurrency** | **String** | Description | [optional] 
**shortDesc** | **String** | Textual description identifying the event. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 



## Enum: EventTypeCodeEnum


* `DVS` (value: `"DVS"`)

* `DVSS` (value: `"DVSS"`)

* `BNS` (value: `"BNS"`)

* `BNSS` (value: `"BNSS"`)

* `SPO` (value: `"SPO"`)

* `DSR` (value: `"DSR"`)




