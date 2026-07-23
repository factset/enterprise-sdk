# FactSet.SDK.FactSetPrices.Model.BatchOne
Enables the ability to asynchronously \"batch\" the request, supporting a long-running request. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch/v1/status` and `/batch/v1/result` endpoints to retrieve the status and result. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

