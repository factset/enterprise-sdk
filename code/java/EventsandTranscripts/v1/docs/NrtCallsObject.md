

# NrtCallsObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **Integer** | The unique ID for an event. |  [optional]
**sourceCode** | [**SourceCodeEnum**](#SourceCodeEnum) | Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast. |  [optional]
**audioSourceId** | **Integer** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. |  [optional]
**ticker** | **String** | Ticker-region identifier for the company hosting the event. |  [optional]
**entityId** | **String** | Factset entity level identifier for the company hosting the event. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Refers to the various event types covered by FactSet CallStreet. |  [optional]
**eventTitle** | **String** | Title of the Event. |  [optional]
**callStatus** | [**CallStatusEnum**](#CallStatusEnum) | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. |  [optional]
**recordingStartTime** | **OffsetDateTime** |  |  [optional]
**eventDatetimeUtc** | **OffsetDateTime** | The official UTC timestamp of the start of the event. |  [optional]



## Enum: SourceCodeEnum

Name | Value
---- | -----
PHONEREPLAY | &quot;PhoneReplay&quot;
WEBCAST | &quot;Webcast&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
ANALYSTSINVESTORSSHAREHOLDERSMEETING | &quot;AnalystsInvestorsShareholdersMeeting&quot;
EARNINGSCALL | &quot;EarningsCall&quot;
EARNINGSRELEASE | &quot;EarningsRelease&quot;
GUIDANCE | &quot;Guidance&quot;
SALESREVENUECALL | &quot;SalesRevenueCall&quot;
SALESREVENUERELEASE | &quot;SalesRevenueRelease&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;



## Enum: CallStatusEnum

Name | Value
---- | -----
INPROGRESS | &quot;InProgress&quot;
ENDED | &quot;Ended&quot;
ENDEDWITHOUTNOTIFICATION | &quot;EndedWithoutNotification&quot;
ISSUEATSOURCE | &quot;IssueAtSource&quot;


## Implemented Interfaces

* Serializable


