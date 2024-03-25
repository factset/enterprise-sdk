# FactSet.SDK.GlobalFilings.Model.InvestmentResearchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headline** | **string** | Headline of the story, actual time and date of the event. | [optional] 
**Source** | **string** | Provides the source of the document, and the source value is one among those provided by the \&quot;/reference/sources\&quot; endpoint. | [optional] 
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main company a particular document refers to. | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document. This could also include the primary company id as well.   **Note:** For the \&quot;allIds\&quot; and \&quot;primaryIds\&quot; fields:   - These identifiers can be either SEDOLs or CUSIPs, depending on the search criteria and the type of identifiers specified in your request.   - The API will return the corresponding identifiers based on the search parameters provided. | [optional] 
**FilingsDateTime** | **string** | Publish date and time of the latest version (in ISO 8601 format, UTC). | [optional] 
**Categories** | **List&lt;string&gt;** | - Comma-separated list of country, industry, and subject codes. - Sourced from \&quot;/reference/categories\&quot; with two-letter codes (SB for subjects, IN for industries, LN for languages, CN for countries, RN for regions, DT for document types). | [optional] 
**FilingsLink** | **string** | A secure HTTPS link for downloading the associated document. | [optional] 
**DocumentId** | **string** | Unique identifier for a document. | [optional] 
**FilingSize** | **string** | Filings specific metadata providing info around the size of the document. | [optional] 
**FormType** | **string** | Filings specific metadata providing info around the form type (e.g. 8K, 10K, etc.) | [optional] 
**Accession** | **string** | A unique identifier given to each EDGAR filings document. | [optional] 
**SearchIds** | **string** | Returns IDs used in the id&#39;s parameter. The identifier type is based on what was used in the parameter. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

