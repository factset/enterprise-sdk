

# InlineResponse20093DataAsks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Order type. |  [optional]
**price** | **BigDecimal** | Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;. |  [optional]
**numberOrders** | **BigDecimal** | Number of orders for the price level. |  [optional]
**volume** | **BigDecimal** | Summarized volume for the price level. |  [optional]
**time** | **String** | Date and time of the latest change. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NUMBER_0 | new BigDecimal(&quot;0&quot;)
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)


## Implemented Interfaces

* Serializable


