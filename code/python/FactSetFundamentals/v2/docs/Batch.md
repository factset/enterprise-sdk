# Batch

Enables the ability to asynchronously \"batch\" the request, supporting a long-running request. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/status` and `/result` endpoints to retrieve the status and result.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/status&#x60; and &#x60;/result&#x60; endpoints to retrieve the status and result. | defaults to "N",  must be one of ["Y", "N", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


