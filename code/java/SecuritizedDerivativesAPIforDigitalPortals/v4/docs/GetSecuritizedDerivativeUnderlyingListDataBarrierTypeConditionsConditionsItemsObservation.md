

# GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservation

Barrier observation modality of the condition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Identifier of the type of observation during the observation period. | Value | Description | | --- | --- | | continuous | The barrier is active, i.e. observed on a continuous basis (intraday prices are relevant). | | eod | The barrier is active, i.e. observed  only at the end of the final auction for the underlying on the relevant exchange (intraday prices are of no relevance). |   |  [optional]
**period** | [**GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservationPeriod**](GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservationPeriod.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CONTINUOUS | &quot;continuous&quot;
EOD | &quot;eod&quot;


## Implemented Interfaces

* Serializable


