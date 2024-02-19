# factsettickhistory.Level1RequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **[String]** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**factsetExchangeCode** | **String** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**dateTimeRange** | [**DateTimePeriod**](DateTimePeriod.md) |  | 
**fields** | **[String]** | Fields for which data is requested  | [optional] 
**single** | **Boolean** | &lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt;  | [optional] [default to false]



## Enum: [FieldsEnum]


* `TICKER` (value: `"TICKER"`)

* `ISO_CODE` (value: `"ISO_CODE"`)

* `DATE` (value: `"DATE"`)

* `TIME` (value: `"TIME"`)

* `MSG_TYPE` (value: `"MSG_TYPE"`)

* `SEQUENCE` (value: `"SEQUENCE"`)

* `PRODUCT` (value: `"PRODUCT"`)

* `BID` (value: `"BID"`)

* `BID_TIME` (value: `"BID_TIME"`)

* `BID_VOL` (value: `"BID_VOL"`)

* `BID_EXCH` (value: `"BID_EXCH"`)

* `ASK` (value: `"ASK"`)

* `ASK_TIME` (value: `"ASK_TIME"`)

* `ASK_VOL` (value: `"ASK_VOL"`)

* `ASK_EXCH` (value: `"ASK_EXCH"`)

* `LAST_PRICE` (value: `"LAST_PRICE"`)

* `LAST_DATE` (value: `"LAST_DATE"`)

* `LAST_TIME` (value: `"LAST_TIME"`)

* `LAST_VOL` (value: `"LAST_VOL"`)

* `LAST_EXCH` (value: `"LAST_EXCH"`)

* `MID` (value: `"MID"`)

* `MID_TIME` (value: `"MID_TIME"`)

* `CVOL` (value: `"CVOL"`)

* `CCVOL` (value: `"CCVOL"`)

* `VWAP` (value: `"VWAP"`)

* `YIELD_PRICE` (value: `"YIELD_PRICE"`)

* `BENCHMARK_YIELD` (value: `"BENCHMARK_YIELD"`)

* `BENCHMARK_SPREAD` (value: `"BENCHMARK_SPREAD"`)

* `CURRENT_YIELD` (value: `"CURRENT_YIELD"`)

* `TRADE_CONDITION` (value: `"TRADE_CONDITION"`)

* `REPORTING_SIDE` (value: `"REPORTING_SIDE"`)

* `ASK_YIELD` (value: `"ASK_YIELD"`)

* `BID_YIELD` (value: `"BID_YIELD"`)

* `VENUE` (value: `"VENUE"`)

* `BUY_ID` (value: `"BUY_ID"`)

* `MID_YIELD` (value: `"MID_YIELD"`)

* `ORDER_CODE` (value: `"ORDER_CODE"`)

* `SELL_ID` (value: `"SELL_ID"`)

* `TRADED_PRICE` (value: `"TRADED_PRICE"`)

* `TRADED_VOL` (value: `"TRADED_VOL"`)

* `TRADED_CONDITION` (value: `"TRADED_CONDITION"`)

* `TRADED_YIELD` (value: `"TRADED_YIELD"`)

* `ORIG_SEQUENCE` (value: `"ORIG_SEQUENCE"`)

* `SECURITY_TYPE` (value: `"SECURITY_TYPE"`)

* `SECURITY_STATUS` (value: `"SECURITY_STATUS"`)

* `MSG_BITMASK` (value: `"MSG_BITMASK"`)

* `ORDER_NUM` (value: `"ORDER_NUM"`)

* `ISO` (value: `"ISO"`)




