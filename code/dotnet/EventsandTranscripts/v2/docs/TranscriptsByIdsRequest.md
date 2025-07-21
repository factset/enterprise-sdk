# FactSet.SDK.EventsandTranscripts.Model.TranscriptsByIdsRequest
Search criteria for transcripts based on various IDs and categories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrimaryId** | **bool** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention. | [optional] [default to false]
**Ids** | **List&lt;string&gt;** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**ReportIds** | **List&lt;string&gt;** | List of report IDs (max 1000). | [optional] 
**Categories** | **List&lt;string&gt;** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**StartDate** | **DateTime** | Start Date (YYYY-MM-DD).  | [optional] 
**EndDate** | **DateTime** | End Date (YYYY-MM-DD).  | [optional] 
**SearchText** | **string** | Text to search for within the transcript document stories. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

