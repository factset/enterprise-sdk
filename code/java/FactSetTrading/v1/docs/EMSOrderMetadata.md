

# EMSOrderMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Symbol |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Order Type |  [optional]
**orderQuantity** | **Double** | Order Quantity |  [optional]
**error** | **String** | Error message |  [optional]
**info** | **String** | information |  [optional]
**orderId** | **String** | Order Id |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;



## Enum: OrderTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
STOP | &quot;stop&quot;
STOP_LIMIT | &quot;stop_limit&quot;
MARKET_ON_CLOSE | &quot;market_on_close&quot;
LIMIT_OR_BETTER | &quot;limit_or_better&quot;


## Implemented Interfaces

* Serializable


