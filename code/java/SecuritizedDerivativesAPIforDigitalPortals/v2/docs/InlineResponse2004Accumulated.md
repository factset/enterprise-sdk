

# InlineResponse2004Accumulated

Summary data accumulated over all trades of the current trading day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberTrades** | **BigDecimal** | Number of trades. |  [optional]
**tradingVolume** | **BigDecimal** | Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit. |  [optional]
**tradingValue** | **BigDecimal** | Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit. |  [optional]
**currency** | [**InlineResponse2004AccumulatedCurrency**](InlineResponse2004AccumulatedCurrency.md) |  |  [optional]


## Implemented Interfaces

* Serializable


