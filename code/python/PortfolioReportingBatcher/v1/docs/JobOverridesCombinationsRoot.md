# JobOverridesCombinationsRoot

This creates a matrix of the given details. When the job is run, it will only run for the accounts, dates and/or tasks within the objects given. Dates can be specified either by giving individual dates in the `dates` parameter, or by using the `dateRange` parameter for where these are supported. The job will fail if both are provided. (Settings will only be used temporarily and no changes will be made to the default PRB job.) Certain parameters are only valid for certain job types. Please see below for more details.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **[str]** | An array of accounts, used for jobs types ADF, PUB, and Vault | [optional] 
**dates** | **[date]** | An array of dates, used for jobs types ADF, PUB, and Vault. Please see OA Page 20650 for more details | [optional] 
**date_range** | [**JobOverridesCombinationsRootDateRange**](JobOverridesCombinationsRootDateRange.md) |  | [optional] 
**tasks** | **[str]** | Used only for jobs where type is ADF, PA, PUB, or vault | [optional] 
**all_tasks** | **bool** | boolean flag to indicate if all tasks for given ADF, PA, PUB, or vault job should be run, e.g. if account is newly created and not yet added to any tasks | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


