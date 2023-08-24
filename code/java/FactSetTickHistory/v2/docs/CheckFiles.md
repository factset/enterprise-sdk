

# CheckFiles

check-files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | a unique identification for the query requested |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the query |  [optional]
**error** | [**ErrorObject**](ErrorObject.md) |  |  [optional]



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


