

# VectorDataRequestData

Elements of vetctor data request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | Search to include the query text. | 
**startDate** | **LocalDate** | Start Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**endDate** | **LocalDate** | End Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**esgTheme** | **java.util.Set&lt;String&gt;** | The search to include any esg themes of given sources. |  [optional]
**searchConcept** | **java.util.Set&lt;String&gt;** | The search to include any concept of given sources. |  [optional]
**sentiment** | **java.util.Set&lt;String&gt;** | The search to include any sentiment of given sources. |  [optional]
**documentTypes** | **java.util.Set&lt;String&gt;** | The search to include one valid document type for the provided sources. |  [optional]
**sources** | **java.util.Set&lt;String&gt;** | Code for document source to include. Currently EDGAR, StreetAccount and FactSet Callstreet Transcripts are available. | 
**trimmed** | **Boolean** | Trimmed the vectors from response based on provided value - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  |  [optional]
**ids** | **java.util.List&lt;String&gt;** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol |  [optional]


## Implemented Interfaces

* Serializable


