# Document

Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headline** | **str** | Concise title or summary of the research story or document. | [optional] 
**source** | **str** | Provides source of the document.  • FRC – FactSet Research Connect   • AMR – Aftermarket Research | [optional] 
**primary_ids** | **[str]** | Refers to the main company a particular document refers to. | [optional] 
**all_ids** | **[str]** | Refers to all companies mentioned in the document. This could also include the primary company id as well. | [optional] 
**categories** | **[str]** | Provides the category of the document, list is provided by the &#x60;/meta/categories&#x60; endpoint. | [optional] 
**story_date_time** | **datetime** | Publish date and time of the latest version, in RFC 3339 format (a subset of ISO 8601), e.g., 2024-07-03T14:00:00Z (UTC). | [optional] 
**link** | **str** | The link to download the document. | [optional] 
**contributor_name** | **str** | Research specific metadata providing the name of the research contributor. | [optional] 
**contributor_id** | **int** | Research specific metadata providing the ID of the research contributor. | [optional] 
**analyst_name** | **[str]** | Research specific metadata providing the name of the analyst(s) who wrote the research. | [optional] 
**analyst_id** | **[int]** | Research specific metadata providing the ID of the analyst(s) who wrote the research. | [optional] 
**pages** | **int** | Total number of pages in the document. | [optional] 
**document_id** | **str** | Unique identifier for a document. | [optional] 
**report_foci** | **[str]** | One or more classification codes indicating the primary focus of the document. | [optional] 
**asset_classes** | **[str]** | One or more codes indicating asset classes covered in the document. | [optional] 
**asset_types** | **[str]** | One or more codes indicating asset types. | [optional] 
**coverage_actions** | **[str]** | One or more codes indicating coverage actions. | [optional] 
**compilation_indicators** | **bool** | An indication of whether the document contains new material or is a compilation/summary of separately published material. | [optional] 
**disciplines** | **[str]** | One or more codes indicating the disciplines reflected in the document. | [optional] 
**issuer_types** | **[str]** | One or more codes indicating issuer types covered in the document. | [optional] 
**periodicities** | **[str]** | One or more codes indicating the fixed time interval at which the document is published. | [optional] 
**purposes** | **[str]** | One or more codes indicating the report purpose of the document. | [optional] 
**rating_actions** | **[str]** | One or more codes indicating rating actions discussed in the document. | [optional] 
**research_approaches** | **[str]** | One or more codes indicating the research perspective provided in the document. | [optional] 
**security_types** | **[str]** | One or more codes indicating security types. | [optional] 
**target_actions** | **[str]** | One or more codes indicating target price actions discussed in the document. | [optional] 
**weighting_actions** | **[str]** | One or more codes indicating weighting actions discussed in the document. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


