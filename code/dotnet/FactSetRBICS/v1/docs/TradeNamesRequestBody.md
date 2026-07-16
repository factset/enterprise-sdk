# FactSet.SDK.FactSetRBICS.Model.TradeNamesRequestBody
TradeNames Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 500.  | 
**AsOfDate** | **DateTime** | Effective date for data expressed in YYYY-MM-DD format. This means the as of date will be in between the start and end date returned. Note that it&#39;s possible the end date returned can be null, meaning the tradeName is still active. If no date is requested, the default behavior is to return the latest active data.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

