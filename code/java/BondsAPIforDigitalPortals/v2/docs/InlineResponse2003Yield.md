

# InlineResponse2003Yield

Yield-related key figures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **BigDecimal** | Current yield, which is the next annual interest payment divided by the price. If the coupon period is different than a year, the interest payment is annualized. |  [optional]
**toMaturity** | **BigDecimal** | Yield to maturity, which is the annual rate of return, assuming the instrument is held until maturity. |  [optional]
**spread** | **BigDecimal** | Credit spread, which is the difference in yield to maturity between a highest-quality debt instrument, also called a benchmark bond, and the debt instrument. See endpoint &#x60;/instrument/benchmark/list&#x60; for the benchmark bond. |  [optional]


## Implemented Interfaces

* Serializable


