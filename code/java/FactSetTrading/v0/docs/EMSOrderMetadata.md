

# EMSOrderMetadata

EMS Order Metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Ticker symbol |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side of the order. |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | Type of the order |  [optional]
**orderQuantity** | **Double** | Number of shares/Quantity. |  [optional]
**error** | **String** | Error message |  [optional]
**info** | **String** | Information |  [optional]
**clientOrderId** | **String** | Client Order Id |  [optional]
**warning** | **String** | Warning |  [optional]



## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;
SELL_SHORT | &quot;sell_short&quot;
SELL_SHORT_EXEMPT | &quot;sell_short_exempt&quot;



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


