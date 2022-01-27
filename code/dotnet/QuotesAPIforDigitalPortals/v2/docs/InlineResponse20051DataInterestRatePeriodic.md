# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20051DataInterestRatePeriodic
Interest rate based on the coupon period, i.e. not annualized. Period-based data is not available for instruments with a variable interest rate (i.e. the attribute `coupons.interestRate.type` has the value 4 or 6).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fixed** | **decimal** | Fixed interest rate. For coupon periods different from one year, the value differs from the fixed annualized interest rate (see attribute &#x60;coupons.interestRate.annualized.fixed&#x60;). | [optional] 
**Amount** | **decimal** | Coupon amount corresponding to the fixed interest rate (see attribute &#x60;coupons.interestRate.periodic.fixed&#x60;). The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

