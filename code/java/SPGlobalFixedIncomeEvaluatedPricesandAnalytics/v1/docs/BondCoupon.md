

# BondCoupon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**date** | **LocalDate** | The date on which the price is calculated. |  [optional]
**accruedInterest** | **Double** | The interest that is owed, but not yet paid, added to the price of the bond. Available only for &#x60;corporate and municipal bonds&#x60;. |  [optional]
**coupon** | **Double** | The current coupon rate of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. |  [optional]
**couponType** | **String** | The coupon type of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;. |  [optional]
**couponFrequency** | **String** | The coupon frequency of the bond. Available only for &#x60;corporate bonds&#x60;.  |  [optional]


## Implemented Interfaces

* Serializable


