# FactSet.SDK.VectorData.Model.VectorDataRequestData
Elements of vetctor data request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Query** | **string** | Search to include the query text. | 
**StartDate** | **DateTime** | Start Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**EndDate** | **DateTime** | End Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**EsgTheme** | **List&lt;string&gt;** | The search to include any esg themes of given sources. | [optional] 
**SearchConcept** | **List&lt;string&gt;** | The search to include any concept of given sources. | [optional] 
**Sentiment** | **List&lt;string&gt;** | The search to include any sentiment of given sources. | [optional] 
**DocumentTypes** | **List&lt;string&gt;** | The search to include one valid document type for the provided sources. | [optional] 
**Sources** | **List&lt;string&gt;** | Code for document source to include. Currently EDGAR, StreetAccount and FactSet Callstreet Transcripts are available. | 
**Trimmed** | **bool** | Trimmed the vectors from response based on provided value - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  | [optional] [default to false]
**Ids** | **List&lt;string&gt;** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

