# DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency

Frequency of the coupon payments. This filter is only applied to debt instruments whose `coupon.occurrence.type` is `repeated`. If this parameter is set, `occurrence.type` must include the value `repeated` or must not be set (in which case `repeated` is implied).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[float]** | List of frequency identifiers. See endpoint &#x60;/basic/frequency/type/list&#x60; for valid values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


