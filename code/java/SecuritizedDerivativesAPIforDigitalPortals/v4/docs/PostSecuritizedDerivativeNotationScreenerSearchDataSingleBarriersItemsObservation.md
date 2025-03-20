

# PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsObservation

Barrier observation modality; applicable to the following barrier types: `knockIn`, `knockOut`, `lockIn`, and `lockOut`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the barrier observation. | Value | Description | | --- | --- | | continuous | The barrier is observed on a continuous basis (intraday prices are relevant). | | eod | The barrier is observed only at the end of the final auction for the underlying on the relevant exchange (intraday prices are of no relevance). |   |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CONTINUOUS | &quot;continuous&quot;
EOD | &quot;eod&quot;


## Implemented Interfaces

* Serializable


