

# GetFilesResponseLevel2

Returns Tick History Files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The status of the request |  [optional]
**requestTimestamp** | **OffsetDateTime** | Timestamp of when request was made |  [optional]
**updateTimestamp** | **OffsetDateTime** | Timestamp when the file was last updated |  [optional]
**data** | [**java.util.List&lt;Files&gt;**](Files.md) | Data Object |  [optional]
**meta** | [**Meta**](Meta.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
STARTING | &quot;Starting&quot;
RUNNING | &quot;Running&quot;
COMPLETED | &quot;Completed&quot;
ERROR | &quot;Error&quot;
FAILED | &quot;Failed&quot;
STOPPED | &quot;Stopped&quot;


## Implemented Interfaces

* Serializable


