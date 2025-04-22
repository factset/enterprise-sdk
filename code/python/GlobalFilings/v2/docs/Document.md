# Document

Array of data objects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headline** | **str** | Headline of the story, actual time and date of the event. | [optional] 
**source** | **str** | Provides the source of the document, and the source value is one among those provided by the &#x60;/meta/sources&#x60; endpoint. | [optional] 
**primary_ids** | **[str]** | Refers to the main company a particular document refers to. | [optional] 
**all_ids** | **[str]** | Refers to all companies mentioned in the document. This could also include the primary company id as well.   **Note:** For the \&quot;allIds\&quot; and \&quot;primaryIds\&quot; fields:   - These identifiers can be either SEDOLs or CUSIPs, depending on the search criteria and the type of identifiers specified in your request.   - The API will return the corresponding identifiers based on the search parameters provided. | [optional] 
**filings_date_time** | **str** | Publish date and time of the latest version (in ISO 8601 format, UTC). | [optional] 
**categories** | **[str]** | Categories are Country, Industry, and Subject codes. This is a comma-separated list retrieved from &#x60;/meta/categories&#x60; | [optional] 
**filings_link** | **str** | A secure HTTPS link for downloading the associated document. | [optional] 
**document_id** | **str** | Unique identifier for a document. | [optional] 
**filing_size** | **str** | Filings specific metadata providing info around the size of the document. | [optional] 
**form_types** | **[str]** | Filings specific metadata providing info around the form type (e.g. 8K, 10K, etc.) | [optional] 
**accession** | **str** | A unique identifier given to each EDGAR filings document. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


