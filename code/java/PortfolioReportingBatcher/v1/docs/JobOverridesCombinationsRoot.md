

# JobOverridesCombinationsRoot

This creates a matrix of the given details. When the job is run, it will only run for the accounts, dates and/or tasks within the objects given. Dates can be specified either by giving individual dates in the `dates` parameter, or by using the `dateRange` parameter for where these are supported. The job will fail if both are provided. (Settings will only be used temporarily and no changes will be made to the default PRB job.) Certain parameters are only valid for certain job types. Please see below for more details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **java.util.List&lt;String&gt;** | An array of accounts, used for jobs types ADF, PUB, and Vault |  [optional]
**dates** | **java.util.List&lt;LocalDate&gt;** | An array of dates, used for jobs types ADF, PUB, and Vault. Please see OA Page 20650 for more details |  [optional]
**dateRange** | [**JobOverridesCombinationsRootDateRange**](JobOverridesCombinationsRootDateRange.md) |  |  [optional]
**tasks** | **java.util.List&lt;String&gt;** | Used only for jobs where type is ADF, PA, PUB, or vault |  [optional]
**allTasks** | **Boolean** | boolean flag to indicate if all tasks for given ADF, PA, PUB, or vault job should be run, e.g. if account is newly created and not yet added to any tasks |  [optional]


## Implemented Interfaces

* Serializable


