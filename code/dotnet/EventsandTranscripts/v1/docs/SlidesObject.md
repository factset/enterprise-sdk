# FactSet.SDK.EventsandTranscripts.Model.SlidesObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main companies a particular document pertains to. | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document.  | [optional] 
**SearchId** | **string** | Returns IDs used in the ids parameter. The identifier type is based on what was used in the parameter. | [optional] 
**Headline** | **string** | Headline of the story. | [optional] 
**StoryDateTime** | **DateTime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timezone) or the date and time FactSet received it from the vendor. | [optional] 
**Categories** | **List&lt;string&gt;** | Categories are country, industry, and subject codes. This is a comma-separated list. | [optional] 
**SlidesLink** | **string** | This is a link for downloading the document with an expiration duration of 24 hours. | [optional] 
**EventId** | **string** | Unique identifier derived from report_id with a &#39;t&#39; appended, indicating a transcript or slide. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

