# InlineResponse20079DataMarket

Market of the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** | Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values. | [optional] 
**is_open** | **bool** | Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered. The value is &#x60;null&#x60; if the result quality is EOD. | [optional] 
**phase** | **str** | Market-specific code of the current market phase. The value is &#x60;null&#x60; if the result quality is EOD. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


