

# Document

Array of data objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headline** | **String** | Headline of the story, actual time and date of the event. |  [optional]
**source** | **String** | Provides the source of the document, and the source value is one among those provided by the &#x60;/meta/sources&#x60; endpoint. |  [optional]
**primaryIds** | **java.util.List&lt;String&gt;** | Refers to the main company a particular document refers to. |  [optional]
**allIds** | **java.util.List&lt;String&gt;** | Refers to all companies mentioned in the document. This could also include the primary company id as well.   **Note:** For the \&quot;allIds\&quot; and \&quot;primaryIds\&quot; fields:   - These identifiers can be either SEDOLs or CUSIPs, depending on the search criteria and the type of identifiers specified in your request.   - The API will return the corresponding identifiers based on the search parameters provided. |  [optional]
**filingsDateTime** | **String** | Publish date and time of the latest version (in ISO 8601 format, UTC). |  [optional]
**categories** | **java.util.List&lt;String&gt;** | Categories are Country, Industry, and Subject codes. This is a comma-separated list retrieved from &#x60;/meta/categories&#x60; |  [optional]
**filingsLink** | **String** | A secure HTTPS link for downloading the associated document. |  [optional]
**documentId** | **String** | Unique identifier for a document. |  [optional]
**filingSize** | **String** | Filings specific metadata providing info around the size of the document. |  [optional]
**formTypes** | **java.util.List&lt;String&gt;** | Filings specific metadata providing info around the form type (e.g. 8K, 10K, etc.) |  [optional]
**accession** | **String** | A unique identifier given to each EDGAR filings document. |  [optional]


## Implemented Interfaces

* Serializable


