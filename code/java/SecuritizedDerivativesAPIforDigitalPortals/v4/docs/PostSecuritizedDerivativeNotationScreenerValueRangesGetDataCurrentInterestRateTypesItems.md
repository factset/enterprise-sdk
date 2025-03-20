

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRateTypesItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) | Attribute value. | Value | Description | | --- | --- | | fixed | The interest rate is fixed for all periods and remains unchanged throughout the lifetime of the securitized derivative. | | variable | The interest rate is variable and might change from period to period throughout the lifetime of the securitized derivative. |   |  [optional]
**count** | **BigDecimal** | Number of notations. |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
FIXED | &quot;fixed&quot;
VARIABLE | &quot;variable&quot;


## Implemented Interfaces

* Serializable


