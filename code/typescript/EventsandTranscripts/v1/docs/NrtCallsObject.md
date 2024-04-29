# eventsandtranscripts.NrtCallsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **Number** | The unique ID for an event. | [optional] 
**sourceCode** | **String** | Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast. | [optional] 
**audioSourceId** | **Number** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. | [optional] 
**ticker** | **String** | Ticker-region identifier for the company hosting the event. | [optional] 
**entityId** | **String** | Factset entity level identifier for the company hosting the event. | [optional] 
**eventType** | **String** | Refers to the various event types covered by FactSet CallStreet. | [optional] 
**eventTitle** | **String** | Title of the Event. | [optional] 
**callStatus** | **String** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**recordingStartTime** | **Date** |  | [optional] 
**eventDatetimeUtc** | **Date** | The official UTC timestamp of the start of the event. | [optional] 



## Enum: SourceCodeEnum


* `PhoneReplay` (value: `"PhoneReplay"`)

* `Webcast` (value: `"Webcast"`)





## Enum: EventTypeEnum


* `AnalystsInvestorsShareholdersMeeting` (value: `"AnalystsInvestorsShareholdersMeeting"`)

* `EarningsCall` (value: `"EarningsCall"`)

* `EarningsRelease` (value: `"EarningsRelease"`)

* `Guidance` (value: `"Guidance"`)

* `SalesRevenueCall` (value: `"SalesRevenueCall"`)

* `SalesRevenueRelease` (value: `"SalesRevenueRelease"`)

* `SpecialSituation` (value: `"SpecialSituation"`)





## Enum: CallStatusEnum


* `InProgress` (value: `"InProgress"`)

* `Ended` (value: `"Ended"`)

* `EndedWithoutNotification` (value: `"EndedWithoutNotification"`)

* `IssueAtSource` (value: `"IssueAtSource"`)




