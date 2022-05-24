

# InlineResponse20051DataInterestRateAnnualized

Interest rate on an annual basis. Minimum/maximum interest rates and a fixed interest rate are, in general, mutually exclusive. However, for an instrument with a variable interest rate (i.e. the attribute `coupons.interestRate.type` has the value 4 or 6), a fixed interest rate might be provided if already determined for the respective period (current or past).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixed** | **BigDecimal** | Fixed interest rate. |  [optional]
**minimum** | **BigDecimal** | Minimum interest rate. |  [optional]
**maximum** | **BigDecimal** | Maximum interest rate. |  [optional]


## Implemented Interfaces

* Serializable


