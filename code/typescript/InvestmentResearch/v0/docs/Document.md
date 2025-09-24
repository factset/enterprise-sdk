# investmentresearch.Document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headline** | **String** | Concise title or summary of the research story or document. | [optional] 
**source** | **String** | Provides source of the document.  • FRC – FactSet Research Connect   • AMR – Aftermarket Research | [optional] 
**primaryIds** | **[String]** | Refers to the main company a particular document refers to. | [optional] 
**allIds** | **[String]** | Refers to all companies mentioned in the document. This could also include the primary company id as well. | [optional] 
**categories** | **[String]** | Provides the category of the document, list is provided by the &#x60;/meta/categories&#x60; endpoint. | [optional] 
**storyDateTime** | **Date** | Publish date and time of the latest version, in RFC 3339 format (a subset of ISO 8601), e.g., 2024-07-03T14:00:00Z (UTC). | [optional] 
**link** | **String** | The link to download the document. | [optional] 
**contributorName** | **String** | Research specific metadata providing the name of the research contributor. | [optional] 
**contributorId** | **Number** | Research specific metadata providing the ID of the research contributor. | [optional] 
**analystName** | **[String]** | Research specific metadata providing the name of the analyst(s) who wrote the research. | [optional] 
**analystId** | **[Number]** | Research specific metadata providing the ID of the analyst(s) who wrote the research. | [optional] 
**pages** | **Number** | Total number of pages in the document. | [optional] 
**documentId** | **String** | Unique identifier for a document. | [optional] 
**reportFoci** | **[String]** | One or more classification codes indicating the primary focus of the document. | [optional] 
**assetClasses** | **[String]** | One or more codes indicating asset classes covered in the document. | [optional] 
**assetTypes** | **[String]** | One or more codes indicating asset types. | [optional] 
**coverageActions** | **[String]** | One or more codes indicating coverage actions. | [optional] 
**compilationIndicators** | **Boolean** | An indication of whether the document contains new material or is a compilation/summary of separately published material. | [optional] 
**disciplines** | **[String]** | One or more codes indicating the disciplines reflected in the document. | [optional] 
**issuerTypes** | **[String]** | One or more codes indicating issuer types covered in the document. | [optional] 
**periodicities** | **[String]** | One or more codes indicating the fixed time interval at which the document is published. | [optional] 
**purposes** | **[String]** | One or more codes indicating the report purpose of the document. | [optional] 
**ratingActions** | **[String]** | One or more codes indicating rating actions discussed in the document. | [optional] 
**researchApproaches** | **[String]** | One or more codes indicating the research perspective provided in the document. | [optional] 
**securityTypes** | **[String]** | One or more codes indicating security types. | [optional] 
**targetActions** | **[String]** | One or more codes indicating target price actions discussed in the document. | [optional] 
**weightingActions** | **[String]** | One or more codes indicating weighting actions discussed in the document. | [optional] 


