# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20051DataInterestRateAnnualized
Interest rate on an annual basis. Minimum/maximum interest rates and a fixed interest rate are, in general, mutually exclusive. However, for an instrument with a variable interest rate (i.e. the attribute `coupons.interestRate.type` has the value 4 or 6), a fixed interest rate might be provided if already determined for the respective period (current or past).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fixed** | **decimal** | Fixed interest rate. | [optional] 
**Minimum** | **decimal** | Minimum interest rate. | [optional] 
**Maximum** | **decimal** | Maximum interest rate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

