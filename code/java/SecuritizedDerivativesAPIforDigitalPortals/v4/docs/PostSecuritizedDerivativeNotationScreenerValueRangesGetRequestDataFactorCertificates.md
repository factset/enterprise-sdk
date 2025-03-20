

# PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates

Parameters for factor certificates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveUnderlying** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesEffectiveUnderlying**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesEffectiveUnderlying.md) |  |  [optional]
**participation** | [**ParticipationEnum**](#ParticipationEnum) | Participation direction of the factor certificate at the level movement of its effective underlying. | Value | Description | | --- | --- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   |  [optional]
**constantLeverage** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverage**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverage.md) |  |  [optional]



## Enum: ParticipationEnum

Name | Value
---- | -----
LONG | &quot;long&quot;
SHORT | &quot;short&quot;


## Implemented Interfaces

* Serializable


