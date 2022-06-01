

# PeopleUniverseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universeId** | **Integer** | the id of the universe that entities come from | 
**offset** | **Integer** | starting row of the universe |  [optional]
**limit** | **Integer** | Limits the number of records in the response. |  [optional]
**mapStatus** | [**java.util.List&lt;MapStatusEnum&gt;**](#java.util.List&lt;MapStatusEnum&gt;) | Filter by the People Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping.  |  [optional]
**clientId** | **java.util.List&lt;String&gt;** | fetch only the mappings that has client id included in the specified list. |  [optional]



## Enum: java.util.List&lt;MapStatusEnum&gt;

Name | Value
---- | -----
MAPPED | &quot;MAPPED&quot;
UNMAPPED | &quot;UNMAPPED&quot;
INDETERMINATE | &quot;INDETERMINATE&quot;


## Implemented Interfaces

* Serializable


