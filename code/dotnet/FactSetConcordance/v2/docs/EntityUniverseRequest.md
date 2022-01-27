# FactSet.SDK.FactSetConcordance.Model.EntityUniverseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UniverseId** | **int** | the id of the universe that entities come from | 
**Offset** | **int** | starting row of the universe | [optional] 
**Limit** | **int** | Limits the number of records in the response. | [optional] 
**MapStatus** | [**List&lt;MapStatus&gt;**](MapStatus.md) | entity statuses to be filtered | [optional] 
**ClientId** | **List&lt;string&gt;** | fetch only the mappings that has client id included in the specified list. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

