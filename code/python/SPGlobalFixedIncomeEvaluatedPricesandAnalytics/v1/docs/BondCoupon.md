# BondCoupon


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | The date on which the price is calculated. | [optional] 
**accrued_interest** | **float, none_type** | The interest that is owed, but not yet paid, added to the price of the bond. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**coupon** | **float, none_type** | The current coupon rate of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**coupon_type** | **str, none_type** | The coupon type of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. | [optional] 
**coupon_frequency** | **str, none_type** | The coupon frequency of the bond. Available only for &#x60;corporate bonds&#x60;.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


