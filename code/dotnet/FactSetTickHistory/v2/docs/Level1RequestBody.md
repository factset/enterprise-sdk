# FactSet.SDK.FactSetTickHistory.Model.Level1RequestBody
Level1 request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tickers** | **List&lt;string&gt;** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**FactsetExchangeCode** | **string** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**DateTimeRange** | [**DateTimePeriod**](DateTimePeriod.md) |  | 
**Fields** | **List&lt;string&gt;** | Fields for which data is requested  | [optional] 
**Single** | **bool** | &lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt;  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

