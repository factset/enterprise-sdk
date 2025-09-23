

# SubmitExportResponseData

Information about the status of the long-running job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | ID of the submitted job |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the job.\\ &#x60;queued&#x60;: The job has not started.\\ &#x60;executing&#x60;: The job is in progress.\\ &#x60;created&#x60;: The job completed successfully.\\ &#x60;failed&#x60;: The job failed. See the &#x60;error&#x60; property for more information.\\ &#x60;cancelled&#x60;: The job was cancelled before it could finish. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
EXECUTING | &quot;executing&quot;
CREATED | &quot;created&quot;
FAILED | &quot;failed&quot;
CANCELLED | &quot;cancelled&quot;


## Implemented Interfaces

* Serializable


