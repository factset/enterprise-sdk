# factsettrading.InboundOrderMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Ticker symbol | [optional] 
**side** | **String** | Side of the order | [optional] 
**orderType** | **String** | Type of the order | [optional] 
**orderQuantity** | **Number** | Number of shares/Quantity. | [optional] 
**error** | **String** | Error message | [optional] 
**info** | **String** | Information | [optional] 
**clientOrderId** | **String** | Client Order Id | [optional] 
**warning** | **String** | Warning | [optional] 



## Enum: SideEnum


* `buy` (value: `"buy"`)

* `sell` (value: `"sell"`)

* `sellShort` (value: `"sellShort"`)

* `sellShortExempt` (value: `"sellShortExempt"`)





## Enum: OrderTypeEnum


* `market` (value: `"market"`)

* `limit` (value: `"limit"`)

* `stop` (value: `"stop"`)

* `stopLimit` (value: `"stopLimit"`)

* `marketOnClose` (value: `"marketOnClose"`)

* `limitOrBetter` (value: `"limitOrBetter"`)




