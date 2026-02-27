# factsettickhistory.MinutesbarRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **[String]** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**factsetExchangeCode** | **String** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**dateTimeRange** | [**DateTimePeriodMin**](DateTimePeriodMin.md) |  | 
**granularity** | [**Granularity**](Granularity.md) |  | 
**type** | [**Type**](Type.md) |  | 
**single** | **Boolean** | &lt;p&gt; Set &#x60;true&#x60; to have data returned in a single file. If omitted, data will be returned in multiple files.&lt;/p&gt; &lt;p&gt; Up to 128 Megabytes can be returned per file. Please reduce the date and time range of this request accordingly.&lt;/p&gt;  | [optional] [default to false]


