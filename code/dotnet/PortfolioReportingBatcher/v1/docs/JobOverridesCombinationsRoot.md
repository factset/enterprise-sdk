# FactSet.SDK.PortfolioReportingBatcher.Model.JobOverridesCombinationsRoot
This creates a matrix of the given details. When the job is run, it will only run for the accounts, dates and/or tasks within the objects given. Dates can be specified either by giving individual dates in the `dates` parameter, or by using the `dateRange` parameter for where these are supported. The job will fail if both are provided. (Settings will only be used temporarily and no changes will be made to the default PRB job.) Certain parameters are only valid for certain job types. Please see below for more details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accounts** | **List&lt;string&gt;** | An array of accounts, used for jobs types PA, ADF, PUB, and Vault | [optional] 
**Dates** | **List&lt;DateTime&gt;** | An array of dates, used for jobs types PA, ADF, PUB, and Vault. Please see OA Page 23173 for more details | [optional] 
**DateRange** | [**JobOverridesCombinationsRootDateRange**](JobOverridesCombinationsRootDateRange.md) |  | [optional] 
**Tasks** | **List&lt;string&gt;** | Used only for jobs where type is ADF, PA, PUB, or vault | [optional] 
**AllTasks** | **bool** | boolean flag to indicate if all tasks for given ADF, PA, PUB, or vault job should be run, e.g. if account is newly created and not yet added to any tasks | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

