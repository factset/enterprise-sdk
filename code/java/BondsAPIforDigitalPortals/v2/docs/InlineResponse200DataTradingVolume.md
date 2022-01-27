

# InlineResponse200DataTradingVolume

Requirements regarding the trading volume in the over-the-counter (non-exchange-based) trading. For the currency of the trading volume, see attribute `issue.volume.currency`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **BigDecimal** | Minimum trading volume. |  [optional]
**increment** | **BigDecimal** | Incremental trading volume over the minimum. The trading volume over the minimum must be an integral multiple of the increment. |  [optional]


## Implemented Interfaces

* Serializable


