# FactSet.SDK.FactSetOptions.Model.ImpliedVolatility
Volatility Response fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_ImpliedVolatility** | **double** | The estimated volatility of a security&#39;s price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option&#39;s premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options.  | [optional] 
**Date** | **DateTime** | The date the data is as of in YYYY-MM-DD format. | [optional] 
**FsymId** | **string** | FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options) | [optional] 
**RequestId** | **string** | The requested identifier submitted in the query. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

