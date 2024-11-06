# factsetestimates.EstimateResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | FactSet regional security identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**periodicity** | **String** | Periodicity or frequency of the fiscal periods. | [optional] 
**estimateType** | **String** | The requested estimate type | [optional] 
**estimates** | [**[Estimate]**](Estimate.md) | Array of estimate | [optional] 


