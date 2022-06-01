

# PeopleMapping

Concordance People Mapping object. Shows the mapping detail related to user's universe. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientEntity** | **String** | It describes the name of the company |  [optional]
**clientFirstName** | **String** | It indicates the full name of the client. |  [optional]
**clientId** | **String** | User-defined unique identifier provided by the user in the request |  [optional]
**clientLastName** | **String** | It indicates last name of the client. |  [optional]
**clientMiddleName** | **String** | It indicates middle name of the client. |  [optional]
**clientPersonName** | **String** | It indiactes the name of the client |  [optional]
**clientPriority** | **String** | It indiactes the priority value of the client. |  [optional]
**clientSalutation** | **String** | It indicates the client&#39;s salutation. |  [optional]
**clientSuffix** | **String** | It indicates the suffix for the client. |  [optional]
**createdTime** | **OffsetDateTime** | It indicates the time of the creation |  [optional]
**mapStatus** | [**MapStatusEnum**](#MapStatusEnum) | Current status of the people mapping. |  [optional]
**personId** | **String** | Helps to identify a person by using an unique indiactor  |  [optional]
**personName** | **String** | It indiactes the full name of the client |  [optional]
**universeId** | **Integer** | The universe this mapping belongs to. Only set in v2 endpoints  |  [optional]
**updatedTime** | **OffsetDateTime** | It indicates the time of the updation |  [optional]



## Enum: MapStatusEnum

Name | Value
---- | -----
MAPPED | &quot;MAPPED&quot;
UNMAPPED | &quot;UNMAPPED&quot;
INDETERMINATE | &quot;INDETERMINATE&quot;


## Implemented Interfaces

* Serializable


