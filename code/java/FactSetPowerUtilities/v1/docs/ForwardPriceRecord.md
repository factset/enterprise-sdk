

# ForwardPriceRecord

Forward power price curve record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**locationId** | **String** | Location identifier, as submitted in the request. | 
**locationName** | **String** | Full location name. |  [optional]
**isoCode** | **String** | ISO/TSO market code. |  [optional]
**category** | **CategoryForward** |  | 
**priceDate** | **LocalDate** | Trade or settlement date (YYYY-MM-DD). |  [optional]
**deliveryYear** | **Integer** | Delivery year, derived from the delivery start date. |  [optional]
**deliveryMonth** | **Integer** | Delivery month (1–12), derived from the delivery start date. |  [optional]
**interconnection** | **String** | Higher-level US power market region the location belongs to. |  [optional]
**periodType** | **String** | Term type of the forward delivery period. |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Forward price type. |  [optional]
**avgForwardPriceMwh** | **Double** | Forward price in $/MWh, reported as a rolling 3-day average. |  [optional]



## Enum: PriceTypeEnum

Name | Value
---- | -----
ONPEAK | &quot;OnPeak&quot;
OFFPEAK | &quot;OffPeak&quot;
AROUNDTHECLOCK | &quot;AroundTheClock&quot;


## Implemented Interfaces

* Serializable


