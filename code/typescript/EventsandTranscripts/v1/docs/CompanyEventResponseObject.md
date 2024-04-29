# eventsandtranscripts.CompanyEventResponseObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | Ticker-region identifier for the company hosting the event. | [optional] 
**companyName** | **String** | The official name of the company. | [optional] 
**description** | **String** | Brief description of the event. | [optional] 
**eventDateTime** | **Date** | Event start time as date/time string according to ISO 8601. | [optional] 
**marketTimeCode** | **String** | Timing code related to opening or closing of market. | [optional] 
**eventType** | **String** | Type/Category of the event based on a predefined list. | [optional] 
**eventId** | **String** | Unique identifier for the event. | [optional] 
**webcastLink** | **String** | Link to the webcast of the event. | [optional] 
**irLink** | **String** | Link to the ir page of the company. | [optional] 
**fiscalYear** | **String** | The fiscal year of the company to which the event pertains. | [optional] 
**fiscalPeriod** | **String** | The fiscal period of the company to which the event pertains. | [optional] 
**contactEmail** | **String** | Contact email for inquiries related to the event. | [optional] 
**contactPhone** | **String** | Contact phone number for inquiries related to the event. | [optional] 
**contactName** | **String** | Name of the contact person for queries related to the event. | [optional] 



## Enum: EventTypeEnum


* `Earnings` (value: `"Earnings"`)

* `SalesRevenueCall` (value: `"SalesRevenueCall"`)

* `GuidanceCall` (value: `"GuidanceCall"`)

* `AnalystsInvestorsMeeting` (value: `"AnalystsInvestorsMeeting"`)

* `ShareholdersMeeting` (value: `"ShareholdersMeeting"`)

* `SpecialSituation` (value: `"SpecialSituation"`)

* `ConferencePresentation` (value: `"ConferencePresentation"`)

* `ConfirmedEarningsRelease` (value: `"ConfirmedEarningsRelease"`)

* `SalesRevenueRelease` (value: `"SalesRevenueRelease"`)

* `ProjectedEarningsRelease` (value: `"ProjectedEarningsRelease"`)

* `Split` (value: `"Split"`)

* `Dividend` (value: `"Dividend"`)




