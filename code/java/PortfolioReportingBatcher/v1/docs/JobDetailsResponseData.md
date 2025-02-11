

# JobDetailsResponseData

The main object in the JobDetailsResponse schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **Map&lt;String, java.util.List&lt;AccountsForJobAddProp&gt;&gt;** | Please note for PI jobs you will only see portfolioId |  [optional]
**documents** | **Map&lt;String, java.util.List&lt;String&gt;&gt;** | Shows the documents for each job where relevant with a collection of tasks under each document |  [optional]
**runs** | [**java.util.List&lt;RunsForJob&gt;**](RunsForJob.md) | An array of information for each run |  [optional]
**tasks** | **java.util.List&lt;String&gt;** | A list of tasks for the given job |  [optional]


## Implemented Interfaces

* Serializable


