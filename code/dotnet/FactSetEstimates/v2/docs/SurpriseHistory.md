# FactSet.SDK.FactSetEstimates.Model.SurpriseHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndDate** | **DateTime?** | Fiscal period end date for which the consensus estimate is being forecasted. | [optional] 
**Currency** | **string** | Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**High** | **double?** | The highest estimate provided by the analysts for the specified period. | [optional] 
**Low** | **double?** | The lowest estimate provided by the analysts for the specified period. | [optional] 
**Up** | **int?** | Number of estimates revised upwards. | [optional] 
**Down** | **int?** | Number of estimates revised downwards. | [optional] 
**AnalystCount** | **int?** | The number of analysts who provided estimates for the given period. | [optional] 
**Mean** | **double?** | The average of all estimates provided by the analysts for the specified period. | [optional] 
**Median** | **double?** | The median of all estimates provided by the analysts for the specified period. | [optional] 
**StandardDeviation** | **double?** | Measure of the dispersion of estimates around the consensus value. | [optional] 
**Actual** | **double?** |  | [optional] 
**SurprisePercent** | **double?** | Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

