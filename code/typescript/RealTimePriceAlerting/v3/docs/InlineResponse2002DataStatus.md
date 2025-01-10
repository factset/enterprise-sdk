# realtimepricealerting.InlineResponse2002DataStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the status. | Value | Description | | --- | --- | | active | The trigger is active and trigger conditions are evaluated. | | inactive | The trigger is inactive and conditions do not generate alerts | | error | The trigger is in an error state, error details are noted in \&quot;details\&quot; |   | [optional] 
**details** | **String** | A human-readable, unstructured explanation specific to this error. | [optional] 
**encryptedDetails** | **String** | Base64-encoded, internal details about the error, in addition to \&quot;details\&quot;. An issue submitted to Service Desk should contain this data to speed up investigation. | [optional] 



## Enum: CodeEnum


* `active` (value: `"active"`)

* `inactive` (value: `"inactive"`)

* `error` (value: `"error"`)




