# InvestorSlidesResponseData

The data being returned in the search response are search results, and under each search result, the documents are organized by requested identifiers. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The requested identifier associated with this group of documents. | [optional] 
**documents** | [**[DocumentOne]**](DocumentOne.md) | Contains list of documents | [optional] 
**error** | [**InvalidIdErrorData**](InvalidIdErrorData.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


