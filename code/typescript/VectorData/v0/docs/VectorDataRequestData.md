# vectordata.VectorDataRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | Search to include the query text. | 
**startDate** | **Date** | Start Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**endDate** | **Date** | End Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**esgTheme** | **[String]** | The search to include any esg themes of given sources. | [optional] 
**searchConcept** | **[String]** | The search to include any concept of given sources. | [optional] 
**sentiment** | **[String]** | The search to include any sentiment of given sources. | [optional] 
**documentTypes** | **[String]** | The search to include one valid document type for the provided sources. | [optional] 
**sources** | **[String]** | Code for document source to include. Currently EDGAR, StreetAccount and FactSet Callstreet Transcripts are available. | 
**trimmed** | **Boolean** | Trimmed the vectors from response based on provided value - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  | [optional] [default to false]
**ids** | **[String]** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol | [optional] 


