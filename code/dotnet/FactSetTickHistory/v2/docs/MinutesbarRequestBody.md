# FactSet.SDK.FactSetTickHistory.Model.MinutesbarRequestBody
Level1 Minute bars request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tickers** | **List&lt;string&gt;** | The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    | 
**FactsetExchangeCode** | **string** | FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  | 
**DateTimeRange** | [**DateTimePeriodMin**](DateTimePeriodMin.md) |  | 
**Granularity** | [**Granularity**](Granularity.md) |  | 
**Type** | [**Type**](Type.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

