# FactSet.SDK.FactSetEstimates.Model.DetailEstimate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** |  | [optional] 
**Metric** | **string** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**Periodicity** | **string** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. | [optional] 
**FiscalYear** | **int** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**FiscalPeriod** | **int** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**FiscalEndDate** | **DateTime** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**RelativePeriod** | **int** | &#39;Fiscal period&#39; based on relationship to &#39;estimate date&#39;. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**Currency** | **string** | Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**EstimateDate** | **DateTime** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**EstimateValue** | **double** | The value of the estimate. | [optional] 
**AnalystId** | **string** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**AnalystName** | **string** | The name of the analyst making the estimate. | [optional] 
**BrokerId** | **string** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**BrokerName** | **string** | The name of the broker making the estimate. | [optional] 
**PrevEstimateDate** | **DateTime** | Date the previous estimate was made expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**PrevEstimateValue** | **double** | The value of the previous estimate. | [optional] 
**Section** | **string** | Section of the estimate.Returns the details of brokers inlcuded and excluded in the consensus | [optional] 
**StatusCode** | **int** | Status code of the estimate. | [optional] 
**StatusText** | **string** | Status description of the estimate. | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**InputDateTime** | **string** | Date and time when the data is available at the source. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

