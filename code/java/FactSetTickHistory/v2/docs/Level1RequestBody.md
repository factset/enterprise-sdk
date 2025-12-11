

# Level1RequestBody

Level1 request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **java.util.List&lt;String&gt;** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**factsetExchangeCode** | **String** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**dateTimeRange** | [**DateTimePeriod**](DateTimePeriod.md) |  | 
**fields** | [**java.util.List&lt;FieldsEnum&gt;**](#java.util.List&lt;FieldsEnum&gt;) | Fields for which data is requested  |  [optional]
**single** | **Boolean** | &lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt;  |  [optional]



## Enum: java.util.List&lt;FieldsEnum&gt;

Name | Value
---- | -----
TICKER | &quot;TICKER&quot;
ISO_CODE | &quot;ISO_CODE&quot;
DATE | &quot;DATE&quot;
TIME | &quot;TIME&quot;
MSG_TYPE | &quot;MSG_TYPE&quot;
SEQUENCE | &quot;SEQUENCE&quot;
PRODUCT | &quot;PRODUCT&quot;
BID | &quot;BID&quot;
BID_TIME | &quot;BID_TIME&quot;
BID_VOL | &quot;BID_VOL&quot;
BID_EXCH | &quot;BID_EXCH&quot;
ASK | &quot;ASK&quot;
ASK_TIME | &quot;ASK_TIME&quot;
ASK_VOL | &quot;ASK_VOL&quot;
ASK_EXCH | &quot;ASK_EXCH&quot;
LAST_PRICE | &quot;LAST_PRICE&quot;
LAST_DATE | &quot;LAST_DATE&quot;
LAST_TIME | &quot;LAST_TIME&quot;
LAST_VOL | &quot;LAST_VOL&quot;
LAST_EXCH | &quot;LAST_EXCH&quot;
MID | &quot;MID&quot;
MID_TIME | &quot;MID_TIME&quot;
CVOL | &quot;CVOL&quot;
CCVOL | &quot;CCVOL&quot;
VWAP | &quot;VWAP&quot;
YIELD_PRICE | &quot;YIELD_PRICE&quot;
CURRENT_YIELD | &quot;CURRENT_YIELD&quot;
TRADE_CONDITION | &quot;TRADE_CONDITION&quot;
REPORTING_SIDE | &quot;REPORTING_SIDE&quot;
ASK_YIELD | &quot;ASK_YIELD&quot;
BID_YIELD | &quot;BID_YIELD&quot;
VENUE | &quot;VENUE&quot;
BUY_ID | &quot;BUY_ID&quot;
MID_YIELD | &quot;MID_YIELD&quot;
ORDER_CODE | &quot;ORDER_CODE&quot;
SELL_ID | &quot;SELL_ID&quot;
ORIG_SEQUENCE | &quot;ORIG_SEQUENCE&quot;
SECURITY_TYPE | &quot;SECURITY_TYPE&quot;
SECURITY_STATUS | &quot;SECURITY_STATUS&quot;
MSG_BITMASK | &quot;MSG_BITMASK&quot;
ORDER_NUM | &quot;ORDER_NUM&quot;
ISO | &quot;ISO&quot;
DATE_UTC | &quot;DATE_UTC&quot;
TIME_UTC | &quot;TIME_UTC&quot;


## Implemented Interfaces

* Serializable


