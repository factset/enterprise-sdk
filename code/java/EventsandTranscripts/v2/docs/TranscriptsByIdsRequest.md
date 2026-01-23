

# TranscriptsByIdsRequest

Search criteria for transcripts based on various IDs and categories.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryId** | **Boolean** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention.  **Note:** Transcripts only have a primary ID, so the results remain the same regardless of whether primaryId&#x3D;true or primaryId&#x3D;false is specified in the request.  |  [optional]
**ids** | **java.util.List&lt;String&gt;** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**reportIds** | **java.util.List&lt;String&gt;** | List of report IDs (max 1000). |  [optional]
**categories** | **java.util.List&lt;String&gt;** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. |  [optional]
**startDate** | **LocalDate** | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  |  [optional]
**endDate** | **LocalDate** | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  |  [optional]
**dateType** | **String** | Enables filtering of transcripts based on their uploadDateTime.  |  [optional]
**searchText** | **String** | Text to search for within the transcript document stories. |  [optional]


## Implemented Interfaces

* Serializable


