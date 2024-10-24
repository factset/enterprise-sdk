

# CompanyEventResponseObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | Ticker-region identifier for the company hosting the event. |  [optional]
**companyName** | **String** | The official name of the company. |  [optional]
**description** | **String** | Brief description of the event. |  [optional]
**eventDateTime** | **OffsetDateTime** | Event start time as date/time string according to ISO 8601. |  [optional]
**marketTimeCode** | **String** | Timing code related to opening or closing of market. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type/Category of the event based on a predefined list. |  [optional]
**eventId** | **String** | Unique identifier for the event. |  [optional]
**webcastLink** | **String** | Link to the webcast of the event. |  [optional]
**irLink** | **String** | Link to the ir page of the company. |  [optional]
**fiscalYear** | **String** | The fiscal year of the company to which the event pertains. |  [optional]
**fiscalPeriod** | **String** | The fiscal period of the company to which the event pertains. |  [optional]
**contactEmail** | **String** | Contact email for inquiries related to the event. |  [optional]
**contactPhone** | **String** | Contact phone number for inquiries related to the event. |  [optional]
**contactName** | **String** | Name of the contact person for queries related to the event. |  [optional]
**reportId** | **String** | Unique identifier for the report.    **Note:** We do not have a reportId for split and dividend event types.  |  [optional]
**lastModifiedDate** | **OffsetDateTime** | The date and time when the event was last modified. |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
EARNINGS | &quot;Earnings&quot;
SALESREVENUECALL | &quot;SalesRevenueCall&quot;
GUIDANCECALL | &quot;GuidanceCall&quot;
ANALYSTSINVESTORSMEETING | &quot;AnalystsInvestorsMeeting&quot;
SHAREHOLDERSMEETING | &quot;ShareholdersMeeting&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;
CONFERENCEPRESENTATION | &quot;ConferencePresentation&quot;
CONFIRMEDEARNINGSRELEASE | &quot;ConfirmedEarningsRelease&quot;
SALESREVENUERELEASE | &quot;SalesRevenueRelease&quot;
PROJECTEDEARNINGSRELEASE | &quot;ProjectedEarningsRelease&quot;
SPLIT | &quot;Split&quot;
DIVIDEND | &quot;Dividend&quot;


## Implemented Interfaces

* Serializable


