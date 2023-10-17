

# InlineResponse200DataTriggerStatus

Status of the trigger.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Code of the status. |  [optional]
**details** | **String** | A human-readable, unstructured explanation specific to this error. |  [optional]
**encryptedDetails** | **String** | Base64-encoded, internal details about the error, in addition to \&quot;details\&quot;. An issue submitted to Service Desk should contain this data to speed up investigation. |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
ERROR | &quot;error&quot;


## Implemented Interfaces

* Serializable


