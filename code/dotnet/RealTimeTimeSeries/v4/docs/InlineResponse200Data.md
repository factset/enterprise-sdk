# FactSet.SDK.RealTimeTimeSeries.Model.InlineResponse200Data
Time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] 
**Prices** | **List&lt;List&lt;decimal&gt;&gt;** | Time series of prices as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp seconds since epoch in UTC; first price; highest price; lowest price; last price; number of units (e.g. shares) traded (price type trade and estimate), offered (price type ask), solicited (price type bid), or empty (price type yield). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

