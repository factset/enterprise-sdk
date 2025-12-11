

# SplitCalendar


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. |  [optional]
**eventTypeCode** | [**EventTypeCodeEnum**](#EventTypeCodeEnum) | Character code that denotes the type of Event. |  [optional]
**eventTypeDesc** | **String** | Corporate Actions Event type description. |  [optional]
**announcementDate** | **String** | Date Event was announced in YYYY-MM-DD format. |  [optional]
**recordDate** | **String** | Date of Record for distribution in YYYY-MM-DD format. |  [optional]
**payDate** | **String** | Date of Payment for distribution in YYYY-MM-DD format. |  [optional]
**effectiveDate** | **String** | Effective Date or Ex-Date of distribution in YYYY-MM-DD format. |  [optional]
**adjFactor** | **Double** | Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split.  |  [optional]
**adjFactorCombined** | **Double** | Combined adjustment factor for all distribution events on that day. |  [optional]
**distOldTerm** | **Double** | Component of distribution ratio -  Number of shares held. |  [optional]
**distNewTerm** | **Double** | Component of distribution ratio -  Number of shares received. |  [optional]
**distInstFsymId** | **String** | Parent Spin-Off for a company |  [optional]
**shortDesc** | **String** | Textual description identifying the event. |  [optional]
**requestId** | **String** | The identifier for the company or security will only be returned when IDs are included in the request. Acceptable identifiers include Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent IDs. |  [optional]
**identifier** | **String** | The ticker-region of the company or security. This field is returned regardless of any of the IDs provided. |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]



## Enum: EventTypeCodeEnum

Name | Value
---- | -----
FSP | &quot;FSP&quot;
RSP | &quot;RSP&quot;
SPL | &quot;SPL&quot;


## Implemented Interfaces

* Serializable


