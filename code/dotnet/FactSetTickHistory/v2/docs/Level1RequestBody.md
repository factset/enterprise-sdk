# FactSet.SDK.FactSetTickHistory.Model.Level1RequestBody
Level1 request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tickers** | **List&lt;string&gt;** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**FactsetExchangeCode** | **string** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**DateTimeRange** | [**DateTimePeriod**](DateTimePeriod.md) |  | 
**Fields** | **List&lt;string&gt;** | Fields for which data is requested  | [optional] 
**Single** | **bool** | &lt;p&gt; Set &#x60;true&#x60; to have data returned in a single file. If omitted, data will be returned in multiple files.&lt;/p&gt; &lt;p&gt; Up to 128 Megabytes can be returned per file. Please reduce the date and time range of this request accordingly.&lt;/p&gt;  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

