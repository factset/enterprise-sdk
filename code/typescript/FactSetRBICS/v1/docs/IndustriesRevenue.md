# factsetrbics.IndustriesRevenue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Permanent Entity Identifier. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). | [optional] 
**requestId** | **String** | The RBICS Level 6 Sub-Industry identifier submitted in the request. | [optional] 
**companyName** | **String** | The official legal name of the company. This provides a human-readable identifier for the entity. | [optional] 
**asOfDate** | **Date** | The date of the company&#39;s financial report or filing from which the revenue data was sourced. | [optional] 
**periodEndDate** | **Date** | The end date of the fiscal period (e.g., quarter or year) to which the reported revenue corresponds. | [optional] 
**totalPercent** | **Number** | The percentage of the company&#39;s total revenue that is attributable to the specified sector, based on the most recent reported data within the requested time frame. | [optional] 
**l6Id** | **Number** | The RBICS ID for the Level 6 (Sub-Industry) classification to which the revenue is attributed. This is the most granular level in the RBICS hierarchy. | [optional] 
**l6Name** | **String** | The descriptive name for the Level 6 (Sub-Industry) classification. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 


