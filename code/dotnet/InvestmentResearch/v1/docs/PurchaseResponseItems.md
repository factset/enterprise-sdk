# FactSet.SDK.InvestmentResearch.Model.PurchaseResponseItems
The data being returned in the purchase response are purchase results, and under each result, the documents are organized by the requested document identifier. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The requested documentId associated with this group of documents. | [optional] 
**Documents** | [**List&lt;PurchaseDocument&gt;**](PurchaseDocument.md) | Contains list of documents matching the requested documentId (typically one). | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

