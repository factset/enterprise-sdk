

# PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate

Interest rate of the current coupon period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the interest rate. | Value | Description | | --- | --- | | fixed | The interest rate is fixed for all periods and remains unchanged throughout the lifetime of the securitized derivative. | | variable | The interest rate is variable and might change from period to period throughout the lifetime of the securitized derivative. |   |  [optional]
**value** | **BigDecimal** | Interest rate of the current coupon period. For coupon periods different than one year, the value is annualized. Not available for securitized derivatives with a current interest rate type other than &#x60;fixed&#x60;. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FIXED | &quot;fixed&quot;
VARIABLE | &quot;variable&quot;


## Implemented Interfaces

* Serializable


