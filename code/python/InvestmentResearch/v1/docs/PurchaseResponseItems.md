# PurchaseResponseItems

The data being returned in the purchase response are purchase results, and under each result, the documents are organized by the requested document identifier. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The requested documentId associated with this group of documents. | [optional] 
**documents** | [**[PurchaseDocument]**](PurchaseDocument.md) | Contains list of documents matching the requested documentId (typically one). | [optional] 
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


