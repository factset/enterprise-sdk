

# InlineResponse2006DataSubsample

Single summary record. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **LocalDate** | Date of the start of the subsample. |  [optional]
**first** | **BigDecimal** | First price of the subsample. |  [optional]
**last** | **BigDecimal** | Last price of the subsample. |  [optional]
**low** | **BigDecimal** | Lowest price of the subsample. |  [optional]
**high** | **BigDecimal** | Highest price of the subsample. |  [optional]
**tradingVolume** | **BigDecimal** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. |  [optional]
**tradingValue** | **BigDecimal** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. |  [optional]


## Implemented Interfaces

* Serializable


