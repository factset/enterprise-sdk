

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataExerciseStyleItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) | Attribute value. | Value | Description | | --- | --- | | american | An American-style securitized derivative can be exercised anytime during its life. | | european | An European-style securitized derivative can be exercised at maturity only. | | bermudan | A Bermudan-style securitized derivative can be exercised only on predetermined dates . |   |  [optional]
**count** | **BigDecimal** | Number of notations. |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
AMERICAN | &quot;american&quot;
EUROPEAN | &quot;european&quot;
BERMUDAN | &quot;bermudan&quot;


## Implemented Interfaces

* Serializable


