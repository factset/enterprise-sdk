# InlineResponse20054DataInterestRateCurrentAccruedInterest

Accrued interest, i.e. interest earned but not yet received (realized). The interest starts accruing at the beginning of a coupon period and reaches the declared value (see attribute `interestRate.current.value`) for that period at its end. For the start and end date of a coupon period see endpoint `/instrument/coupon/list`, attribute `coupons.period`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **float, none_type** | Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives. | [optional] 
**relative** | **float, none_type** | Accrued interest. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


