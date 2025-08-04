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
**sentiment** | **[str]** | The search to include any sentiment of given sources. | [optional] 
**document_types** | **[str]** | The search to include any of the document type. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


