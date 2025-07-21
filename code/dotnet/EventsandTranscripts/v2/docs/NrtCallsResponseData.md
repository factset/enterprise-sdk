# FactSet.SDK.EventsandTranscripts.Model.NrtCallsResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportId** | **int?** | The unique ID for an event. | [optional] 
**AudioSource** | **string** | Identifier for the source of how the event is recorded. - PhoneReplay: Event is recorded through phone playback. - Webcast: Event is recorded through online broadcast. | [optional] 
**AudioSourceId** | **int?** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. | [optional] 
**Ticker** | **string** | Ticker-region identifier for the company hosting the event. | [optional] 
**EntityId** | **string** | Factset entity level identifier for the company hosting the event. | [optional] 
**EventType** | **string** | Refers to the various event types covered by FactSet CallStreet:  * EarningsCall: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * EarningsRelease: Official statements or press releases that publish a company&#39;s financial results for a specific period, highlighting profit and loss metrics.  * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SalesRevenueRelease: Press releases that disclose the latest sales and revenue data, detailing the financial performance of sales operations over a given timeframe.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.  * Presentation:  A structured delivery of information to an audience, typically within a conference setting, using formats like lectures, seminars, or webinars to convey specific topics or findings.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * Special Situation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**EventTitle** | **string** | Title of the Event. | [optional] 
**CallStatus** | **string** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**RecordingStartTime** | **DateTime?** | The UTC timestamp of when the recording started. | [optional] 
**EventDatetime** | **DateTime?** | The official UTC timestamp of the start of the event. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

