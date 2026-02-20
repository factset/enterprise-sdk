# FactSet.SDK.FactSetOwnership.Model.Batch
Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for     up to 20 minutes. When `batch=Y`, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use batch status to see if the job has been completed. Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to 1000 ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

