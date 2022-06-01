# EntityUniverseRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe_id** | **int** | the id of the universe that entities come from | 
**offset** | **int** | starting row of the universe | [optional] 
**limit** | **int** | Limits the number of records in the response. | [optional] 
**map_status** | **[str]** | Filter by the EPeople Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] 
**client_id** | **[str]** | fetch only the mappings that has client id included in the specified list. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


