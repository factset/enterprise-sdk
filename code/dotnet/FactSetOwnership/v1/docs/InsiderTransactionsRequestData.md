# FactSet.SDK.FactSetOwnership.Model.InsiderTransactionsRequestData
Insider Transactions Request Body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | List of identifiers. | 
**StartDate** | **DateTime** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**EndDate** | **DateTime** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**TransactionType** | [**TransactionType**](TransactionType.md) |  | [optional] 
**RowExclusion** | [**RowExclusion**](RowExclusion.md) |  | [optional] 
**Currency** | **string** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Batch** | **Batch** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

