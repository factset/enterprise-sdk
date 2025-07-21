# FactSet.SDK.EventsandTranscripts.Model.ResponseTypeData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionId** | **string** | Used to distinguish the corrected reports. As such, one &#x60;reportId&#x60; can have many &#x60;versionIds&#x60;. | [optional] 
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main companies a particular document pertains to. | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document.  | [optional] 
**ReportId** | **string** | This is a unique identifier for a specific transcript (audio or video) returned. | [optional] 
**EventId** | **string** | ID of the conference call. | [optional] 
**Headline** | **string** | Headline of the story. | [optional] 
**StoryDateTime** | **DateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. | [optional] 
**TranscriptsUrl** | **string** | This is the URL for downloading the document with an expiration duration of 24 hours. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

