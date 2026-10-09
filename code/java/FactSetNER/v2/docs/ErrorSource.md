

# ErrorSource

Source location information for an error, identifying the request parameter or JSON pointer where the error occurred.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter** | **String** | The name of the request parameter where the error occurred. |  [optional]
**pointer** | **String** | JSON Pointer (RFC 6901) referencing the location in the request body where the error occurred. |  [optional]


## Implemented Interfaces

* Serializable


