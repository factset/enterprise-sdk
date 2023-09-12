# FactSet.SDK.PortfolioReportingBatcher.Model.JobOverridesCombinationsRoot
Used for Vault job type only. This creates a matrix of given accounts and dates. When the job is run, it will only run for the accounts and dates within this object. (Settings will only be used temporarily and no changes will be made to the default PRB job.)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accounts** | **List&lt;string&gt;** | An array of accounts | [optional] 
**Dates** | **List&lt;DateTime&gt;** | An array of dates | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

