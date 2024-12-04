# InlineResponse2002Data

Subsampled time series data for the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_notation** | **str, none_type** | MDG identifier of the listing. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**range** | [**InlineResponse2002DataRange**](InlineResponse2002DataRange.md) |  | [optional] 
**quality** | **str, none_type** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] 
**subsamples** | **[[float]]** | List of summary records as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


