# FactSet.SDK.FactSetConcordance.Model.PeopleUniverseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UniverseId** | **int** | the id of the universe that entities come from | 
**Offset** | **int** | starting row of the universe | [optional] 
**Limit** | **int** | Limits the number of records in the response. | [optional] 
**MapStatus** | **List&lt;string&gt;** | Filter by the People Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
**ClientId** | **List&lt;string&gt;** | fetch only the mappings that has client id included in the specified list. | [optional] 
**Sort** | **List&lt;string&gt;** | fetch according to sort orders | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

