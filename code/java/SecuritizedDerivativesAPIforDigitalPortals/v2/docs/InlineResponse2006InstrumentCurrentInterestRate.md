

# InlineResponse2006InstrumentCurrentInterestRate

Interest rate of the current coupon period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the interest rate. |  [optional]
**value** | **BigDecimal** | Interest rate of the current coupon period. For coupon periods different than one year, the value is annualized. Not available for securitized derivatives with a current interest rate type other than &#x60;fixed&#x60;. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FIXED | &quot;fixed&quot;
VARIABLE | &quot;variable&quot;


## Implemented Interfaces

* Serializable


