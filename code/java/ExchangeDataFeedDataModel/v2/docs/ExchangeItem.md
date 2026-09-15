

# ExchangeItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchangeCode** | **Integer** | Unique code for the exchange. |  [optional]
**exchangeName** | **String** | Name of the exchange. |  [optional]
**marketOpen** | **Integer** | Market open time in hours and minutes (HHMM). |  [optional]
**marketClose** | **Integer** | Market close time in hours and minutes (HHMM). |  [optional]
**timezone** | **String** | Timezone in which the exchange operates. |  [optional]
**isoCode** | **String** | ISO code for the exchange. |  [optional]
**delayTime** | **Integer** | Delay time in minutes. |  [optional]
**products** | [**java.util.List&lt;ExchangeProductItem&gt;**](ExchangeProductItem.md) | List of Level 1 and Level 2 products available for this exchange. |  [optional]


## Implemented Interfaces

* Serializable


