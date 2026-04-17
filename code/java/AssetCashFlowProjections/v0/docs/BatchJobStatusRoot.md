

# BatchJobStatusRoot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **String** | ID generated on trigerring the batch |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the job |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
EXECUTING | &quot;executing&quot;
COMPLETED | &quot;completed&quot;
CANCELLED | &quot;cancelled&quot;


## Implemented Interfaces

* Serializable


