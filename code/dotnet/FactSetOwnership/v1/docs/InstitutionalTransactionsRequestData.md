# FactSet.SDK.FactSetOwnership.Model.InstitutionalTransactionsRequestData
Institutional Transactions Request Body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | List of identifiers. | 
**StartDate** | **DateTime** | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**EndDate** | **DateTime** | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
**TopNHolders** | [**TopNHolders**](TopNHolders.md) |  | [optional] 
**HolderType** | [**HolderType**](HolderType.md) |  | [optional] 
**Currency** | **string** | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**PeriodOfMeasure** | [**PeriodOfMeasure**](PeriodOfMeasure.md) |  | [optional] 
**Batch** | **Batch** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

