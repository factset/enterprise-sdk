# FactSet.SDK.DocumentsDistributorCallStreetEvents.Model.NRTCallsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CallStatus** | **string** | Status of the call i.e. ended or inProgress or ewn or issueAtSource  * inProgress- the call is in progress * ended- the call has ended * ewn- the call has technically ended and can be considered as ended but is missing a notification from the upstream systems * issueAtSource- the call has ended with no snippet data due to a possible issue at the source | [optional] 
**ReportId** | **int** | The unique ID for an event. | [optional] 
**SourceCode** | **string** | Identifier for the source of how the event is recorded. P:- Phone Replay W:- Webcast | [optional] 
**AudioSourceId** | **int** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosource ids. | [optional] 
**RecordingStartTime** | **string** | The official UTC timestamp when FactSet starts the recording | [optional] 
**Ticker** | **string** | Ticker-region identifier for the company hosting the event | [optional] 
**EntityId** | **string** | Factset entity level identifier for the company hosting the event | [optional] 
**EventType** | **string** | Refers to the various event types covered by FactSet CallStreet - * Analyst, Investor &amp; Shareholder Meeting &#x3D;&gt; AS * Earnings Call &#x3D;&gt; E * Earnings Release &#x3D;&gt; ER * Guidance &#x3D;&gt; G * Sales &amp; Revenue Call &#x3D;&gt; SA * Sales &amp; Revenue Release &#x3D;&gt; SR * Special &amp; M&amp;A (Special Situation) &#x3D;&gt; SS | [optional] 
**EventTitle** | **string** | Title of the Event | [optional] 
**EventDatetimeUtc** | **string** | The official UTC timestamp of the start of the event | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

