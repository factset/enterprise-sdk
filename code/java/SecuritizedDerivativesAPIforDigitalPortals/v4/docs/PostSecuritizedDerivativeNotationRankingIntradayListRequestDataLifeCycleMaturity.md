

# PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycleMaturity

Parameters related to the maturity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**perpetual** | [**PerpetualEnum**](#PerpetualEnum) | Specifies whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. | Value | Description | | --- | --- | | only | Only perpetual securitized derivatives are included in the result. | | include | Perpetual securitized derivatives are included in the result. | | exclude | Perpetual securitized derivatives are excluded from the result. |   |  [optional]



## Enum: PerpetualEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


