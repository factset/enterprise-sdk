

# TranscriptsByEventsRequest

Search criteria for transcripts based on event IDs and type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventIds** | **java.util.List&lt;String&gt;** | List of event IDs (max 1000). |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
EARNINGS | &quot;Earnings&quot;
GUIDANCE | &quot;Guidance&quot;
ANALYSTSSHAREHOLDERSMEETING | &quot;AnalystsShareholdersMeeting&quot;
CONFERENCEPRESENTATION | &quot;ConferencePresentation&quot;
SALESREVENUE | &quot;SalesRevenue&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;


## Implemented Interfaces

* Serializable


