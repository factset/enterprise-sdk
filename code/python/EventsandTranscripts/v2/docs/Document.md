# Document

Array of data objects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_ids** | **[str]** | Refers to the main companies a particular document pertains to. | [optional] 
**all_ids** | **[str]** | Refers to all companies mentioned in the document.  | [optional] 
**headline** | **str** | Headline of the story. | [optional] 
**story_date_time** | **datetime** | Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor. | [optional] 
**categories** | **[str]** | Categories are Country, Industry, and Subject codes. This is a list retrieved from &#x60;/meta/categories&#x60; | [optional] 
**transcript_intelligence_url** | **str** | This is the URL for downloading the document with an expiration duration of 24 hours. | [optional] 
**report_id** | **str** | This is a unique identifier for a specific transcript. | [optional] 
**upload_date_time** | **datetime** | It is the time when transcript is created (in the specified timeZone).                     | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


