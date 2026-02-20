# InstitutionalTransactionsRequestData

Institutional Transactions Request Body elements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdTransactions**](IdTransactions.md) |  | 
**start_date** | **date** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**end_date** | **date** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**top_n_holders** | [**TopNHolders**](TopNHolders.md) |  | [optional] 
**holder_type** | [**HolderType**](HolderType.md) |  | [optional] 
**currency** | **str** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**period_of_measure** | [**PeriodOfMeasure**](PeriodOfMeasure.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


