# factsetconcordance.PeopleMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientEntity** | **String** | It describes the name of the company | [optional] 
**clientFirstName** | **String** | It indicates the full name of the client. | [optional] 
**clientId** | **String** | User-defined unique identifier provided by the user in the request | [optional] 
**clientLastName** | **String** | It indicates last name of the client. | [optional] 
**clientMiddleName** | **String** | It indicates middle name of the client. | [optional] 
**clientPersonName** | **String** | It indiactes the name of the client | [optional] 
**clientPriority** | **String** | It indiactes the priority value of the client. | [optional] 
**clientSalutation** | **String** | It indicates the client&#39;s salutation. | [optional] 
**clientSuffix** | **String** | It indicates the suffix for the client. | [optional] 
**clientAdditionalContext** | **{String: String}** | Any additional context information that can be saved along with other input values for mapping. To be used by Managed Service for mapping any unmapped records.  | [optional] 
**createdTime** | **Date** | It indicates the time of the creation | [optional] 
**mapStatus** | **String** | Current status of the people mapping. | [optional] 
**personId** | **String** | Helps to identify a person by using an unique indiactor  | [optional] 
**personName** | **String** | It indiactes the full name of the client | [optional] 
**universeId** | **Number** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 
**updatedTime** | **Date** | It indicates the time of the updation | [optional] 



## Enum: MapStatusEnum


* `MAPPED` (value: `"MAPPED"`)

* `UNMAPPED` (value: `"UNMAPPED"`)

* `INDETERMINATE` (value: `"INDETERMINATE"`)




