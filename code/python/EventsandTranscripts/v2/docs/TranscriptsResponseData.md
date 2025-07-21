# TranscriptsResponseData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transcript_response_type** | **str** | Returns the Transcripts data based on provided Dates, Text and Times. | [optional]  if omitted the server will use the default value of "documentResult"
**documents** | [**[DocumentResult]**](DocumentResult.md) | Contains list of documents | [optional] 
**error** | [**InvalidIdErrorData**](InvalidIdErrorData.md) |  | [optional] 
**version_id** | **str** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. | [optional] 
**primary_ids** | **[str]** | Refers to the main companies a particular document pertains to. | [optional] 
**all_ids** | **[str]** | Refers to all companies mentioned in the document.  | [optional] 
**report_id** | **str** | This is a unique identifier for a specific transcript (audio or video) returned. | [optional] 
**event_id** | **str** | ID of the conference call. | [optional] 
**event_date** | **date** | The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;. | [optional] 
**transcript_type** | **str** | Specifies the type of transcript.  * NearRealTime: The initial transcripts available soon after an event, providing quick access to the latest information.  * Raw: Raw verbatim transcripts of conference calls available within hours after the completion of the call.  * Corrected: Verbatim transcripts that have been reviewed and corrected by industry-focused financial professionals. Our editors re-listen to the entire call audio and confirm and research all the terms and numbers in the call. | [optional] 
**headline** | **str** | Headline of the story. | [optional] 
**upload_date_time** | **datetime** | It is the time when transcript is created (in the specified timeZone). | [optional] 
**event_type** | **str** | Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor &amp; Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates. | [optional] 
**categories** | **[str]** | Categories are Country, Industry, and Subject codes. This is a list retrieved from &#x60;/meta/categories&#x60; | [optional] 
**transcripts_url** | **str** | This is the URL for downloading the document with an expiration duration of 24 hours.         | [optional] 
**request_id** | **str** | The requested identifier associated with this group of documents. | [optional] 
**story_date_time** | **datetime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


