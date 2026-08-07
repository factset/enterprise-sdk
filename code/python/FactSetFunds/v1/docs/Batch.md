# Batch

Enables asynchronous \"batch\" processing for long-running requests, supporting durations up to 20 minutes. When batch=Y is specified, the service responds with HTTP Status Code 202 (Accepted) indicating that the request has been received and is being processed. Use the batch status endpoint to check job progress, and retrieve results using the batch-result endpoint once processing is complete.  It is recommended to use the POST method for large ID lists, as GET requests are still subject to URL query string length limits. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Enables asynchronous \&quot;batch\&quot; processing for long-running requests, supporting durations up to 20 minutes. When batch&#x3D;Y is specified, the service responds with HTTP Status Code 202 (Accepted) indicating that the request has been received and is being processed. Use the batch status endpoint to check job progress, and retrieve results using the batch-result endpoint once processing is complete.  It is recommended to use the POST method for large ID lists, as GET requests are still subject to URL query string length limits.  | defaults to "N",  must be one of ["Y", "N", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


