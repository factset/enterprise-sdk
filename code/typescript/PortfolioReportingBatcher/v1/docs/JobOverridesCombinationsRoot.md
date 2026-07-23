# portfolioreportingbatcher.JobOverridesCombinationsRoot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **[String]** | An array of accounts, used for jobs types PA, ADF, PUB, dataPrep, and vault | [optional] 
**dates** | **[Date]** | An array of dates, used for jobs types PA, ADF, PUB, dataPrep, and vault. Please see OA Page 23173 for more details | [optional] 
**dateRange** | [**JobOverridesCombinationsRootDateRange**](JobOverridesCombinationsRootDateRange.md) |  | [optional] 
**tasks** | **[String]** | Used only for jobs where type is ADF, PA, PUB, dataPrep or vault | [optional] 
**allTasks** | **Boolean** | boolean flag to indicate if all tasks for given ADF, PA, PUB, dataPrep or vault job should be run, e.g. if account is newly created and not yet added to any tasks | [optional] 


