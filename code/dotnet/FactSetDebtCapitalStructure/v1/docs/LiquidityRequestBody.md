# FactSet.SDK.FactSetDebtCapitalStructure.Model.LiquidityRequestBody
Liquidity Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. Maximum of 25 IDs are supported.  | 
**StartDate** | **DateTime** | The date of the period requested in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**Term** | **Term** |  | [optional] 
**Metrics** | **List&lt;string&gt;** | Requested List of Financial Statement Items or Ratios.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

