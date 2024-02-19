

# EMSOrderMetadata

EMS Order Metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Ticker symbol |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side of the order |  [optional]
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
SELLSHORT | &quot;sellShort&quot;
SELLSHORTEXEMPT | &quot;sellShortExempt&quot;



## Enum: OrderTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
STOP | &quot;stop&quot;
STOPLIMIT | &quot;stopLimit&quot;
MARKETONCLOSE | &quot;marketOnClose&quot;
LIMITORBETTER | &quot;limitOrBetter&quot;


## Implemented Interfaces

* Serializable


