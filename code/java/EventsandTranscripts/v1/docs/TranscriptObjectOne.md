

# TranscriptObjectOne


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionId** | **String** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. |  [optional]
**primaryIds** | **java.util.List&lt;String&gt;** | Refers to the main companies a particular document pertains to. |  [optional]
**searchId** | **String** | Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter |  [optional]
**allIds** | **java.util.List&lt;String&gt;** | Refers to all companies mentioned in the document.  |  [optional]
**reportId** | **String** | This is a unique identifier for a specific transcript (audio or video) returned. |  [optional]
**eventId** | **String** | ID of the conference call. |  [optional]
**eventDate** | **LocalDate** | The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;. |  [optional]
**transcriptType** | [**TranscriptTypeEnum**](#TranscriptTypeEnum) | Specifies the type of transcript.   |  [optional]
**headline** | **String** | Headline of the story. |  [optional]
**storyDateTime** | **OffsetDateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor. |  [optional]
**uploadDateTime** | **OffsetDateTime** | It is the time when transcript is created (in the specified timezone). |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Specifies the type of event. Choose from the available options.  |  [optional]
**categories** | **java.util.List&lt;String&gt;** | Categories are country, industry, and subject codes. This is a comma-separated list. |  [optional]
**transcriptsLink** | **String** | This is a link for downloading the document with an expiration duration of 24 hours. |  [optional]



## Enum: TranscriptTypeEnum

Name | Value
---- | -----
NEARREALTIME | &quot;NearRealTime&quot;
RAW | &quot;Raw&quot;
CORRECTED | &quot;Corrected&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
EARNINGS | &quot;Earnings&quot;
GUIDANCE | &quot;Guidance&quot;
ANALYSTSSHAREHOLDERSMEETING | &quot;AnalystsShareholdersMeeting&quot;
CONFERENCEPRESENTATION | &quot;ConferencePresentation&quot;
SALESREVENUE | &quot;SalesRevenue&quot;
SPECIALSITUATION | &quot;SpecialSituation&quot;
SALESREVENUERELEASE | &quot;SalesRevenueRelease&quot;


## Implemented Interfaces

* Serializable


