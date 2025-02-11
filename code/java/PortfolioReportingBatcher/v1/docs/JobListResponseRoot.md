

# JobListResponseRoot

Available details of a PRB job, please note limited details are available if the job has not been run before, please see the examples

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | Latest run ID for the job |  [optional]
**isApiTriggered** | **Boolean** | Indicates if the latest run was triggered by this API |  [optional]
**name** | **String** | The name of the job |  [optional]
**serialNumber** | **String** | The FactSet serial number which identifies the person or account the job is assigned to |  [optional]
**status** | **Status** |  |  [optional]
**type** | **JobTypes** |  |  [optional]


## Implemented Interfaces

* Serializable


