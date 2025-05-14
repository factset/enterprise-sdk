

# ScheduleGenerationLog

Details of an individual task generation log.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequenceNumber** | **Integer** | The sequence number of the log entry. |  [optional]
**message** | **String** | A detailed message describing the log event or error. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of log entry. |  [optional]
**logSet** | **Integer** | Identifier for the set of logs this entry belongs to. |  [optional]
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific Task Generation log |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
INFO | &quot;INFO&quot;
WARN | &quot;WARN&quot;
ERROR | &quot;ERROR&quot;
DEBUG | &quot;DEBUG&quot;


## Implemented Interfaces

* Serializable


