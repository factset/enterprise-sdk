

# MinutesbarRequestBody

Level1 Minute bars request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **java.util.List&lt;String&gt;** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**factsetExchangeCode** | **String** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**dateTimeRange** | [**DateTimePeriodMin**](DateTimePeriodMin.md) |  | 
**granularity** | **Granularity** |  | 
**type** | **Type** |  | 


## Implemented Interfaces

* Serializable


