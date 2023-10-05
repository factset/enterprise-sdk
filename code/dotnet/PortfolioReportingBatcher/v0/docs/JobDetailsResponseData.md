# FactSet.SDK.PortfolioReportingBatcher.Model.JobDetailsResponseData
The main object in the jobDetailsResponse schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accounts** | **Dictionary&lt;string, List&lt;AccountsForJobAddProp&gt;&gt;** | Please note for PI jobs you will only see portfolioId | [optional] 
**Documents** | **Dictionary&lt;string, List&lt;string&gt;&gt;** | Shows the documents for each job where relevant with a collection of tasks under each document | [optional] 
**Runs** | [**List&lt;RunsForJob&gt;**](RunsForJob.md) | An array of information for each run | [optional] 
**Tasks** | **List&lt;string&gt;** | A list of tasks for the given job | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

