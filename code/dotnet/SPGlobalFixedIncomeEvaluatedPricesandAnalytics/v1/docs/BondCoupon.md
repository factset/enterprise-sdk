# FactSet.SDK.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Model.BondCoupon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**Date** | **DateTime?** | The date on which the price is calculated. | [optional] 
**AccruedInterest** | **double?** | The interest that is owed, but not yet paid, added to the price of the bond. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**Coupon** | **double?** | The current coupon rate of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**CouponType** | **string** | The coupon type of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**CouponFrequency** | **string** | The coupon frequency of the bond. Available only for &#x60;corporate bonds&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

