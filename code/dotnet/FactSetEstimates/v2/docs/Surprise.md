# FactSet.SDK.FactSetEstimates.Model.Surprise

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** |  | [optional] 
**Date** | **DateTime?** | Date for data expressed in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | Currency code for adjusting the data. Use &#39;ESTIMATE&#39; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**EstimateCurrency** | **string** | Estimate currency of the requested Security | [optional] 
**Metric** | **string** | Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional] 
**Statistic** | **string** | Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114). | [optional] 
**Periodicity** | **string** | Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported. | [optional] 
**FiscalEndDate** | **DateTime?** | Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format | [optional] 
**FiscalYear** | **int?** | Company&#39;s &#39;fiscal year&#39; for the estimate record | [optional] 
**FiscalPeriod** | **int?** | Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period. | [optional] 
**SurpriseDate** | **DateTime?** | Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**SurpriseAmount** | **double?** | Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**SurprisePercent** | **double?** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**SurpriseBefore** | **double?** | Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**SurpriseAfter** | **double?** | Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 
**EventDescription** | **string** | Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**EventFlag** | **int?** | Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601). | [optional] 
**RequestId** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

