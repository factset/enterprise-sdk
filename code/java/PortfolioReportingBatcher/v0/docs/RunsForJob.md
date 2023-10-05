

# RunsForJob

Provides full details of when the job has been run

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endTime** | **OffsetDateTime** | The date and time the job was finished processing |  [optional]
**id** | **String** | The ID of the run |  [optional]
**isApiTriggered** | **Boolean** | Indicates whether the job was triggered via the PRB API |  [optional]
**prbStatus** | **PrbStatus** |  |  [optional]
**runDuration** | **BigDecimal** | Number of seconds between startTime and endTime |  [optional]
**startTime** | **OffsetDateTime** | The date and time the job started running after being submitted and potentially waiting in any queue |  [optional]
**status** | **Status** |  |  [optional]
**statusDescription** | **String** | Further details on the job&#39;s status |  [optional]
**submitTime** | **OffsetDateTime** | The date and time the job was submitted |  [optional]


## Implemented Interfaces

* Serializable


