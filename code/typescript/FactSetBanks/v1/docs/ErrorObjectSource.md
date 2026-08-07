# factsetbanks.ErrorObjectSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pointer** | **String** | JSON Pointer (RFC 6901) to the request body field that caused the error. Used for POST requests (e.g., &#x60;/ids/1&#x60; for the second element of the &#x60;ids&#x60; array).  | [optional] 
**parameter** | **String** | Query parameter name that caused the error. Used for GET requests (e.g., &#x60;ids[3]&#x60;).  | [optional] 
**value** | **String** | The actual value that caused the error. | [optional] 


