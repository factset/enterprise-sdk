

# ErrorResponse

Standard error response envelope returned on all non-successful responses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**java.util.List&lt;ErrorItem&gt;**](ErrorItem.md) | A list of one or more errors that describe why the request failed. | 
**data** | [**java.util.List&lt;AccessCheckResult&gt;**](AccessCheckResult.md) | Present only when some codes were successfully decrypted alongside failures. Contains the results for the successfully decrypted codes. |  [optional]


## Implemented Interfaces

* Serializable


