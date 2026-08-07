

# Meta

Response metadata including pagination and request tracking information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**Pagination**](Pagination.md) |  | 
**requestedIds** | **Integer** | Total number of identifiers submitted in the request. |  [optional]
**failedIds** | **java.util.List&lt;String&gt;** | Identifiers from the request that failed (invalid format, empty, or not found). Empty array when all submitted identifiers resolved successfully. |  [optional]


## Implemented Interfaces

* Serializable


