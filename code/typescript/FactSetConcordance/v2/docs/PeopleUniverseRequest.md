# factsetconcordance.PeopleUniverseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universeId** | **Number** | the id of the universe that entities come from | 
**offset** | **Number** | starting row of the universe | [optional] 
**limit** | **Number** | Limits the number of records in the response. | [optional] 
**mapStatus** | **[String]** | Filter by the People Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
**clientId** | **[String]** | fetch only the mappings that has client id included in the specified list. | [optional] 
**sort** | **[String]** | fetch according to sort orders | [optional] 



## Enum: [MapStatusEnum]


* `MAPPED` (value: `"MAPPED"`)

* `UNMAPPED` (value: `"UNMAPPED"`)

* `INDETERMINATE` (value: `"INDETERMINATE"`)




