

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataKnockInObservationItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Observation type. | Value | Description | | --- | --- | | continuous | The barrier is observed on a continuous basis (intraday prices are relevant). | | eod | The barrier is observed only at the end of the final auction for the underlying on the relevant exchange (intraday prices are of no relevance). |   |  [optional]
**count** | **BigDecimal** | Number of notations. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CONTINUOUS | &quot;continuous&quot;
EOD | &quot;eod&quot;


## Implemented Interfaces

* Serializable


