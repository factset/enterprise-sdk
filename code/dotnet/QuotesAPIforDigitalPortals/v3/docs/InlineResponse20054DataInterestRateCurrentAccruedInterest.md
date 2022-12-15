# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20054DataInterestRateCurrentAccruedInterest
Accrued interest, i.e. interest earned but not yet received (realized). The interest starts accruing at the beginning of a coupon period and reaches the declared value (see attribute `interestRate.current.value`) for that period at its end. For the start and end date of a coupon period see endpoint `/instrument/coupon/list`, attribute `coupons.period`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Absolute** | **decimal?** | Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives. | [optional] 
**Relative** | **decimal?** | Accrued interest. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

