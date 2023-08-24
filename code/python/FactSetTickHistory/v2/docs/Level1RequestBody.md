# Level1RequestBody

Level1 request body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**Tickers**](Tickers.md) |  | 
**factset_exchange_code** | [**FactsetExchangeCode**](FactsetExchangeCode.md) |  | 
**date_time_range** | [**DateTimePeriod**](DateTimePeriod.md) |  | 
**fields** | [**Fields**](Fields.md) |  | [optional] 
**single** | **bool** | &lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt;  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


