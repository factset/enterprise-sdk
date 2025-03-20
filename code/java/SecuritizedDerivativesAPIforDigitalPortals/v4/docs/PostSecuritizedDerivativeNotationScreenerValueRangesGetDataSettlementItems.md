

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSettlementItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) | Attribute value. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   |  [optional]
**count** | **BigDecimal** | Number of notations. |  [optional]



## Enum: ValueEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PHYSICAL | &quot;physical&quot;
EITHER | &quot;either&quot;


## Implemented Interfaces

* Serializable


