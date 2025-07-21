# FactSet.SDK.FactSetPrivateCompany.Model.FinancialsRequestBody
Financials request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers.  | 
**Metrics** | **List&lt;string&gt;** | Private Company Financials Metrics.  | 
**StartDate** | **DateTime** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**EndDate** | **DateTime** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

