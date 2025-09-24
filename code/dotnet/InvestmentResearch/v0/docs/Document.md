# FactSet.SDK.InvestmentResearch.Model.Document
Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headline** | **string** | Concise title or summary of the research story or document. | [optional] 
**Source** | **string** | Provides source of the document.  • FRC – FactSet Research Connect   • AMR – Aftermarket Research | [optional] 
**PrimaryIds** | **List&lt;string&gt;** | Refers to the main company a particular document refers to. | [optional] 
**AllIds** | **List&lt;string&gt;** | Refers to all companies mentioned in the document. This could also include the primary company id as well. | [optional] 
**Categories** | **List&lt;string&gt;** | Provides the category of the document, list is provided by the &#x60;/meta/categories&#x60; endpoint. | [optional] 
**StoryDateTime** | **DateTime** | Publish date and time of the latest version, in RFC 3339 format (a subset of ISO 8601), e.g., 2024-07-03T14:00:00Z (UTC). | [optional] 
**Link** | **string** | The link to download the document. | [optional] 
**ContributorName** | **string** | Research specific metadata providing the name of the research contributor. | [optional] 
**ContributorId** | **int** | Research specific metadata providing the ID of the research contributor. | [optional] 
**AnalystName** | **List&lt;string&gt;** | Research specific metadata providing the name of the analyst(s) who wrote the research. | [optional] 
**AnalystId** | **List&lt;int&gt;** | Research specific metadata providing the ID of the analyst(s) who wrote the research. | [optional] 
**Pages** | **int** | Total number of pages in the document. | [optional] 
**DocumentId** | **string** | Unique identifier for a document. | [optional] 
**ReportFoci** | **List&lt;string&gt;** | One or more classification codes indicating the primary focus of the document. | [optional] 
**AssetClasses** | **List&lt;string&gt;** | One or more codes indicating asset classes covered in the document. | [optional] 
**AssetTypes** | **List&lt;string&gt;** | One or more codes indicating asset types. | [optional] 
**CoverageActions** | **List&lt;string&gt;** | One or more codes indicating coverage actions. | [optional] 
**CompilationIndicators** | **bool** | An indication of whether the document contains new material or is a compilation/summary of separately published material. | [optional] 
**Disciplines** | **List&lt;string&gt;** | One or more codes indicating the disciplines reflected in the document. | [optional] 
**IssuerTypes** | **List&lt;string&gt;** | One or more codes indicating issuer types covered in the document. | [optional] 
**Periodicities** | **List&lt;string&gt;** | One or more codes indicating the fixed time interval at which the document is published. | [optional] 
**Purposes** | **List&lt;string&gt;** | One or more codes indicating the report purpose of the document. | [optional] 
**RatingActions** | **List&lt;string&gt;** | One or more codes indicating rating actions discussed in the document. | [optional] 
**ResearchApproaches** | **List&lt;string&gt;** | One or more codes indicating the research perspective provided in the document. | [optional] 
**SecurityTypes** | **List&lt;string&gt;** | One or more codes indicating security types. | [optional] 
**TargetActions** | **List&lt;string&gt;** | One or more codes indicating target price actions discussed in the document. | [optional] 
**WeightingActions** | **List&lt;string&gt;** | One or more codes indicating weighting actions discussed in the document. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

