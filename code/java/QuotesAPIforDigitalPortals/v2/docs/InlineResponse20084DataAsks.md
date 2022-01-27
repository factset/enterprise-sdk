

# InlineResponse20084DataAsks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information. |  [optional]
**time** | **String** | Date and time of the latest change. |  [optional]
**type** | **BigDecimal** | Order type. |  [optional]
**price** | **BigDecimal** | Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;. |  [optional]
**quoteCondition** | **String** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. |  [optional]
**volume** | **BigDecimal** | Volume of the order. |  [optional]
**marketMaker** | **String** | Code of the market maker. |  [optional]


## Implemented Interfaces

* Serializable


