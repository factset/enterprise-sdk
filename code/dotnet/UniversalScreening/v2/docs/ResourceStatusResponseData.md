# FactSet.SDK.UniversalScreening.Model.ResourceStatusResponseData
Information about the status of the long-running job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**Id** | **Guid** | ID of the submitted job | [optional] 
**Status** | **string** | Current status of the job.\\ &#x60;queued&#x60;: The job has not started.\\ &#x60;executing&#x60;: The job is in progress.\\ &#x60;created&#x60;: The job completed successfully.\\ &#x60;failed&#x60;: The job failed. See the &#x60;error&#x60; property for more information.\\ &#x60;cancelled&#x60;: The job was cancelled before it could finish. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

