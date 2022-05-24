

# InlineResponse2001Data

Subsample data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quality** | [**QualityEnum**](#QualityEnum) | Quality of the price. |  [optional]
**subsample** | **java.util.List&lt;BigDecimal&gt;** | Single summary record. The record consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty. |  [optional]



## Enum: QualityEnum

Name | Value
---- | -----
DLY | &quot;DLY&quot;
EOD | &quot;EOD&quot;


## Implemented Interfaces

* Serializable


