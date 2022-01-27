

# DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency

Frequency of the coupon payments. This filter is only applied to debt instruments whose `coupon.occurrence.type` is `repeated`. If this parameter is set, `occurrence.type` must include the value `repeated` or must not be set (in which case `repeated` is implied).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.Set&lt;BigDecimal&gt;** | List of frequency identifiers. See endpoint &#x60;/basic/frequency/type/list&#x60; for valid values. |  [optional]


## Implemented Interfaces

* Serializable


