

# InlineResponse200DataOrderVolume

Conditions on the order volume for placing an order with the issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **BigDecimal** | Minimum order volume required for placing an order at the trading venue of the notation for the given market phase. |  [optional]
**increment** | **BigDecimal** | Increment of the order volume over the minimum (see attribute inimumOrderVolumeSecDer) required for placing an order at the respective trading venue. The order volume over the minimum must be an integral multiple of the increment. The value unit for this attribute is the same as for the attribute tradingVolumeLatestTradePrice. |  [optional]


## Implemented Interfaces

* Serializable


