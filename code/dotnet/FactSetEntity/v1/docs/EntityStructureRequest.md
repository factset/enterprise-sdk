# FactSet.SDK.FactSetEntity.Model.EntityStructureRequest
Entity Structure Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**Level** | **int** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
**Active** | **int** | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

