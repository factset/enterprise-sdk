# FactSet.SDK.PortfolioReportingBatcher.Model.JobOverrides
If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**Combinations** | [**List&lt;JobOverridesCombinationsRoot&gt;**](JobOverridesCombinationsRoot.md) | An array of date account combinations | [optional] 
**Dates** | [**JobOverridesDates**](JobOverridesDates.md) |  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**RunAsOfDate** | **DateTime** | PUB | [optional] 
**RunAsSerialNumber** | **string** | The FactSet serial number which has the credentials wanted to run the job | [optional] 
**Tasks** | **List&lt;string&gt;** | Used only for jobs where type is PA | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

