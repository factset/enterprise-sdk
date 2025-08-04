# eventsandtranscripts.TranscriptsByIdsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryId** | **Boolean** | If true, search only for documents where the provided &#x60;ids&#x60; are the primary identifiers. If false, search for any mention.  **Note:** Transcripts only have a primary ID, so the results remain the same regardless of whether primaryId&#x3D;true or primaryId&#x3D;false is specified in the request.  | [optional] [default to false]
**ids** | **[String]** | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
**reportIds** | **[String]** | List of report IDs (max 1000). | [optional] 
**categories** | **[String]** | List of category codes (country, industry, subject). Use &#x60;/meta/categories&#x60; endpoint. Default is all. | [optional] 
**startDate** | **Date** | Start Date (YYYY-MM-DD).  | [optional] 
**endDate** | **Date** | End Date (YYYY-MM-DD).  | [optional] 
**searchText** | **String** | Text to search for within the transcript document stories. | [optional] 


