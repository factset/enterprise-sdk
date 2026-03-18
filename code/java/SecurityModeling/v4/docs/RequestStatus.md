

# RequestStatus

Details of the upsert or delete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **String** | Upsert or delete identifier |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Upsert or delete status |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
EXECUTING | &quot;Executing&quot;
COMPLETED | &quot;Completed&quot;


## Implemented Interfaces

* Serializable


