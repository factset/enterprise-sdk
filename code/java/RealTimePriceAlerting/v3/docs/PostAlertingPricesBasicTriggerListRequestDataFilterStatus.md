

# PostAlertingPricesBasicTriggerListRequestDataFilterStatus

Status of the trigger.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Code of the status. | Value | Description | | --- | --- | | active | The trigger is active and trigger conditions are evaluated. | | inactive | The trigger is inactive and conditions do not generate alerts. | | error | The trigger is in an error state, error details are noted in &#x60;details&#x60; |   |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
ERROR | &quot;error&quot;


## Implemented Interfaces

* Serializable


