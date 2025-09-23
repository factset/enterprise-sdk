# SubmitExportResponseData

Information about the status of the long-running job.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the submitted job | [optional] 
**status** | **str** | Current status of the job.\\ &#x60;queued&#x60;: The job has not started.\\ &#x60;executing&#x60;: The job is in progress.\\ &#x60;created&#x60;: The job completed successfully.\\ &#x60;failed&#x60;: The job failed. See the &#x60;error&#x60; property for more information.\\ &#x60;cancelled&#x60;: The job was cancelled before it could finish. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


