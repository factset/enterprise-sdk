

# ErrorObjectSource

Reference to the request field that caused the error. For POST requests, `pointer` is used (JSON Pointer to the request body field, e.g. `/ids/1`). For GET requests, `parameter` is used (query parameter name, e.g. `ids[3]`). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pointer** | **String** | JSON Pointer (RFC 6901) to the request body field that caused the error. Used for POST requests (e.g., &#x60;/ids/1&#x60; for the second element of the &#x60;ids&#x60; array).  |  [optional]
**parameter** | **String** | Query parameter name that caused the error. Used for GET requests (e.g., &#x60;ids[3]&#x60;).  |  [optional]
**value** | **String** | The actual value that caused the error. |  [optional]


## Implemented Interfaces

* Serializable


