# quotesapifordigitalportals.InlineResponse20086DataAsks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **Number** | Order type. | [optional] 
**price** | **Number** | Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;. | [optional] 
**numberOrders** | **Number** | Number of orders for the price level. | [optional] 
**volume** | **Number** | Summarized volume for the price level. | [optional] 
**time** | **String** | Date and time of the latest change. | [optional] 



## Enum: TypeEnum


* `0` (value: `0`)

* `1` (value: `1`)

* `2` (value: `2`)




