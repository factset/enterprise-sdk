

# InlineResponse2008DataPrices


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **String** | Date and time. |  [optional]
**price** | **BigDecimal** | Price value. See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for its unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). |  [optional]
**quoteCondition** | **String** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. |  [optional]
**tradingVolume** | **BigDecimal** | Number of units (e.g. shares) traded, offered (price type ask), solicited (price type bid), or empty (price type yield). |  [optional]
**tradingValue** | **BigDecimal** | Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. Empty for price type yield. |  [optional]


## Implemented Interfaces

* Serializable


