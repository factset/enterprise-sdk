# FactSet.SDK.EventsandTranscripts.Model.Document
Array of data objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main companies a particular document pertains to. | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document.  | [optional] 
**Headline** | **string** | Headline of the story. | [optional] 
**StoryDateTime** | **DateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. | [optional] 
**Categories** | **List&lt;string&gt;** | Categories are Country, Industry, and Subject codes. This is a list retrieved from &#x60;/meta/categories&#x60; | [optional] 
**TranscriptIntelligenceUrl** | **string** | This is the URL for downloading the document with an expiration duration of 24 hours. | [optional] 
**ReportId** | **string** | This is a unique identifier for a specific transcript. | [optional] 
**UploadDateTime** | **DateTime** | It is the time when transcript is created (in the specified timeZone).                     | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

