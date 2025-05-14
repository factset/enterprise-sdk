

# ReportInstanceLogDTO

Report Generation log details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequenceNumber** | **Integer** | Sequential number of the log entry. |  [optional]
**message** | **String** | Detailed message describing the log event or error. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of log entry, either a general log or an error. |  [optional]
**updateDate** | **String** | The date and time of the last update for this log entry. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
LOG | &quot;LOG&quot;
ERROR | &quot;ERROR&quot;


## Implemented Interfaces

* Serializable


