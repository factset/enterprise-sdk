# MinutesbarRequestBody

Level1 Minute bars request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**Tickers**](Tickers.md) |  | 
**factset_exchange_code** | [**FactsetExchangeCode**](FactsetExchangeCode.md) |  | 
**date_time_range** | [**DateTimePeriodMin**](DateTimePeriodMin.md) |  | 
**granularity** | [**Granularity**](Granularity.md) |  | 
**type** | [**Type**](Type.md) |  | 
**single** | **bool** | &lt;p&gt; Set &#x60;true&#x60; to have data returned in a single file. If omitted, data will be returned in multiple files.&lt;/p&gt; &lt;p&gt; Up to 128 Megabytes can be returned per file. Please reduce the date and time range of this request accordingly.&lt;/p&gt;  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


