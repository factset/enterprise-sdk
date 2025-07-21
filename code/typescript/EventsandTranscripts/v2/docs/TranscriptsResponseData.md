# eventsandtranscripts.TranscriptsResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transcriptResponseType** | **String** | Returns the Transcripts data based on provided Dates, Text and Times. | [optional] 
**requestId** | **String** | The requested identifier associated with this group of documents. | 
**documents** | [**[DocumentResult]**](DocumentResult.md) | Contains list of documents | [optional] 
**error** | [**InvalidIdErrorData**](InvalidIdErrorData.md) |  | [optional] 
**versionId** | **String** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. | [optional] 
**primaryIds** | **[String]** | Refers to the main companies a particular document pertains to. | [optional] 
**allIds** | **[String]** | Refers to all companies mentioned in the document.  | [optional] 
**reportId** | **String** | This is a unique identifier for a specific transcript (audio or video) returned. | [optional] 
**eventId** | **String** | ID of the conference call. | [optional] 
**eventDate** | **Date** | The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;. | [optional] 
**transcriptType** | **String** | Specifies the type of transcript.  * NearRealTime: The initial transcripts available soon after an event, providing quick access to the latest information.  * Raw: Raw verbatim transcripts of conference calls available within hours after the completion of the call.  * Corrected: Verbatim transcripts that have been reviewed and corrected by industry-focused financial professionals. Our editors re-listen to the entire call audio and confirm and research all the terms and numbers in the call. | [optional] 
**headline** | **String** | Headline of the story. | [optional] 
**storyDateTime** | **Date** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. | 
**uploadDateTime** | **Date** | It is the time when transcript is created (in the specified timeZone). | [optional] 
**eventType** | **String** | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**categories** | **[String]** | Categories are Country, Industry, and Subject codes. This is a list retrieved from &#x60;/meta/categories&#x60; | [optional] 
**transcriptsUrl** | **String** | This is the URL for downloading the document with an expiration duration of 24 hours.         | [optional] 



## Enum: TranscriptResponseTypeEnum


* `documentResult` (value: `"documentResult"`)





## Enum: TranscriptTypeEnum


* `NearRealTime` (value: `"NearRealTime"`)

* `Raw` (value: `"Raw"`)

* `Corrected` (value: `"Corrected"`)





## Enum: EventTypeEnum


* `Earnings` (value: `"Earnings"`)

* `Guidance` (value: `"Guidance"`)

* `AnalystsShareholdersMeeting` (value: `"AnalystsShareholdersMeeting"`)

* `ConferencePresentation` (value: `"ConferencePresentation"`)

* `SalesRevenue` (value: `"SalesRevenue"`)

* `SpecialSituation` (value: `"SpecialSituation"`)

* `SalesRevenueRelease` (value: `"SalesRevenueRelease"`)




