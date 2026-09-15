

# ResponseMeta

Response metadata including pagination and request tracking.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**ResponsePagination**](ResponsePagination.md) |  |  [optional]
**requestedIds** | **Integer** | Total number of identifiers submitted in the request. |  [optional]
**failedIds** | **java.util.List&lt;String&gt;** | List of identifiers from the request that failed (invalid format, empty, or not found). Empty array when all submitted IDs resolved successfully. |  [optional]


## Implemented Interfaces

* Serializable


