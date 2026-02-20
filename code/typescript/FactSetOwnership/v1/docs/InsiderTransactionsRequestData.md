# factsetownership.InsiderTransactionsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | List of identifiers. | 
**startDate** | **Date** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**endDate** | **Date** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**transactionType** | [**TransactionType**](TransactionType.md) |  | [optional] 
**rowExclusion** | [**RowExclusion**](RowExclusion.md) |  | [optional] 
**currency** | **String** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 


