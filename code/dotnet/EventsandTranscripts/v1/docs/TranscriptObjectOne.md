# FactSet.SDK.EventsandTranscripts.Model.TranscriptObjectOne

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionId** | **string** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. | [optional] 
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main companies a particular document pertains to. | [optional] 
**SearchId** | **string** | Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document.  | [optional] 
**ReportId** | **string** | This is a unique identifier for a specific transcript (audio or video) returned. | [optional] 
**EventId** | **string** | ID of the conference call. | [optional] 
**EventDate** | **DateTime** | The date when the event took place. Formatted as &#39;YYYY-MM-DD&#39;. | [optional] 
**TranscriptType** | **string** | Specifies the type of transcript.   | [optional] 
**Headline** | **string** | Headline of the story. | [optional] 
**StoryDateTime** | **DateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor. | [optional] 
**UploadDateTime** | **DateTime** | It is the time when transcript is created (in the specified timezone). | [optional] 
**EventType** | **string** | Specifies the type of event. Choose from the available options.  | [optional] 
**Categories** | **List&lt;string&gt;** | Categories are country, industry, and subject codes. This is a comma-separated list. | [optional] 
**TranscriptsLink** | **string** | This is a link for downloading the document with an expiration duration of 24 hours. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

