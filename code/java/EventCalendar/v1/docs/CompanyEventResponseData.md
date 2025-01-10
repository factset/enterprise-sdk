

# CompanyEventResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** |  |  [optional]
**companyName** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**eventDateTime** | **OffsetDateTime** |  |  [optional]
**marketTimeCode** | **String** |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**eventId** | **String** |  |  [optional]
**webcastLink** | **String** |  |  [optional]
**irLink** | **String** |  |  [optional]
**fiscalYear** | **String** |  |  [optional]
**fiscalPeriod** | **String** |  |  [optional]
**contactEmail** | **String** |  |  [optional]
**contactPhone** | **String** |  |  [optional]
**contactName** | **String** |  |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
EARNINGS | &quot;Earnings&quot;
SALESREVENUECALL | &quot;SalesRevenueCall&quot;
GUIDANCECALL | &quot;GuidanceCall&quot;
ANALYSTSINVESTORSMEETING | &quot;AnalystsInvestorsMeeting&quot;
SHAREHOLDERSMEETING | &quot;ShareholdersMeeting&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;
CONFERENCE | &quot;Conference&quot;
CONFIRMEDEARNINGSRELEASE | &quot;ConfirmedEarningsRelease&quot;
PROJECTEDEARNINGSRELEASE | &quot;ProjectedEarningsRelease&quot;
SALESREVENUERELEASE | &quot;SalesRevenueRelease&quot;
SPLIT | &quot;Split&quot;
DIVIDEND | &quot;Dividend&quot;


## Implemented Interfaces

* Serializable


