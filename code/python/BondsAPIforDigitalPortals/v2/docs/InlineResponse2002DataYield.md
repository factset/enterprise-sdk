# InlineResponse2002DataYield

Yield-related key figures.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **float** | Current yield, which is the next annual interest payment divided by the price. If the coupon period is different than a year, the interest payment is annualized. | [optional] 
**to_maturity** | **float** | Yield to maturity, which is the annual rate of return, assuming the instrument is held until maturity. | [optional] 
**spread** | **float** | Credit spread, which is the difference in yield to maturity between a highest-quality debt instrument, also called a benchmark bond, and the debt instrument. See endpoint &#x60;/instrument/benchmark/list&#x60; for the benchmark bond. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


