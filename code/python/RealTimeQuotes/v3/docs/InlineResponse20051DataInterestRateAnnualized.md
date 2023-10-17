# InlineResponse20051DataInterestRateAnnualized

Interest rate on an annual basis. Minimum/maximum interest rates and a fixed interest rate are, in general, mutually exclusive. However, for an instrument with a variable interest rate (i.e. the attribute `coupons.interestRate.type` has the value 4 or 6), a fixed interest rate might be provided if already determined for the respective period (current or past).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixed** | **float, none_type** | Fixed interest rate. | [optional] 
**minimum** | **float, none_type** | Minimum interest rate. | [optional] 
**maximum** | **float, none_type** | Maximum interest rate. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


