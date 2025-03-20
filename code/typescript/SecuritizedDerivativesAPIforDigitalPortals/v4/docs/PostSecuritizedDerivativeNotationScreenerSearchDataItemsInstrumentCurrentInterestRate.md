# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of the interest rate. | Value | Description | | --- | --- | | fixed | The interest rate is fixed for all periods and remains unchanged throughout the lifetime of the securitized derivative. | | variable | The interest rate is variable and might change from period to period throughout the lifetime of the securitized derivative. |   | [optional] 
**value** | **Number** | Interest rate of the current coupon period. For coupon periods different than one year, the value is annualized. Not available for securitized derivatives with a current interest rate type other than &#x60;fixed&#x60;. | [optional] 



## Enum: TypeEnum


* `fixed` (value: `"fixed"`)

* `variable` (value: `"variable"`)




