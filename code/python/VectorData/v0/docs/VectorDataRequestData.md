# VectorDataRequestData

Elements of vetctor data request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **str** | Search to include the query text. | 
**start_date** | **date** | Start Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**end_date** | **date** | End Date. Format is YYYY-MM-DD or relative +/- days (0,-1,etc). | 
**sources** | **[str]** | Code for document source to include. Currently EDGAR, StreetAccount and FactSet Callstreet Transcripts are available. | 
**esg_theme** | **[str]** | The search to include any esg themes of given sources. | [optional] 
**search_concept** | **[str]** | The search to include any concept of given sources. | [optional] 
**sentiment** | **[str]** | It is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. Use the &#x60;/meta/themes&#x60; endpoint to get a list of all available sentiment values. | [optional] 
**document_types** | **[str]** | The search to include one valid document type for the provided sources. | [optional] 
**trimmed** | **bool** | Trimmed the vectors from response based on provided value - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  | [optional]  if omitted the server will use the default value of False
**ids** | **[str]** | Requested symbols or securities. Each symbol can be a FactSet exchange symbol | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


