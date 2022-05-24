

# InlineResponse2005DataPrices


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date. |  [optional]
**first** | **BigDecimal** | First price. |  [optional]
**last** | **BigDecimal** | Last price. |  [optional]
**low** | **BigDecimal** | Lowest price. |  [optional]
**high** | **BigDecimal** | Highest price. |  [optional]
**tradingVolume** | **BigDecimal** | Number of units (e.g. shares) traded (price type trade and estimate), offered (price type ask), solicited (price type bid), or empty (price type yield). |  [optional]
**tradingValue** | **BigDecimal** | Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. Empty for price type yield. |  [optional]


## Implemented Interfaces

* Serializable


