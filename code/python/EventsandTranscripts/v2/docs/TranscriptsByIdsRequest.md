# TranscriptsByIdsRequest

Search criteria for transcripts based on various IDs and categories.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[str]** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**primary_id** | **bool** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention.  **Note:** Transcripts only have a primary ID, so the results remain the same regardless of whether primaryId&#x3D;true or primaryId&#x3D;false is specified in the request.  | [optional]  if omitted the server will use the default value of False
**report_ids** | **[str]** | List of report IDs (max 1000). | [optional] 
**categories** | **[str]** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**start_date** | **date** | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**end_date** | **date** | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
**date_type** | **str** | &lt;p&gt;&#39;dateType&#x3D;storyDateTime&#39; Enables filtering of transcripts based on their storyDateTime&lt;/p&gt; &lt;p&gt;&#39;dateType&#x3D;uploadDateTime&#39; Enables filtering of transcripts based on their uploadDateTime&lt;/p&gt;  &lt;p&gt;Default value is set to storyDateTime.&lt;/p&gt;  | [optional] 
**search_text** | **str** | Text to search for within the transcript document stories. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


