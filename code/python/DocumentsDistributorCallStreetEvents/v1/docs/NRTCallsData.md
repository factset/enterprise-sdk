# NRTCallsData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**call_status** | **str, none_type** | Status of the call i.e. ended or inProgress or ewn or issueAtSource.  * inProgress- the call is in progress. * ended- the call has ended. * ewn- the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * issueAtSource- the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**report_id** | **int, none_type** | The unique ID for an event. | [optional] 
**source_code** | **str, none_type** | Identifier for the source of how the event is recorded. P:- Phone Replay W:- Webcast | [optional] 
**audio_source_id** | **int, none_type** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. | [optional] 
**recording_start_time** | **str, none_type** | The official UTC timestamp when FactSet starts the recording. | [optional] 
**ticker** | **str, none_type** | Ticker-region identifier for the company hosting the event. | [optional] 
**entity_id** | **str, none_type** | Factset entity level identifier for the company hosting the event. | [optional] 
**event_type** | **str, none_type** | Refers to the various event types covered by FactSet CallStreet - * Analyst, Investor &amp; Shareholder Meeting &#x3D;&gt; AS * Earnings Call &#x3D;&gt; E * Earnings Release &#x3D;&gt; ER * Guidance &#x3D;&gt; G * Sales &amp; Revenue Call &#x3D;&gt; SA * Sales &amp; Revenue Release &#x3D;&gt; SR * Special &amp; M&amp;A (Special Situation) &#x3D;&gt; SS | [optional] 
**event_title** | **str, none_type** | Title of the Event. | [optional] 
**event_datetime_utc** | **str, none_type** | The official UTC timestamp of the start of the event. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


