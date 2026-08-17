

# PurchaseResponseItems

The data being returned in the purchase response are purchase results, and under each result, the documents are organized by the requested document identifier. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested documentId associated with this group of documents. |  [optional]
**documents** | [**java.util.List&lt;PurchaseDocument&gt;**](PurchaseDocument.md) | Contains list of documents matching the requested documentId (typically one). |  [optional]
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]


## Implemented Interfaces

* Serializable


