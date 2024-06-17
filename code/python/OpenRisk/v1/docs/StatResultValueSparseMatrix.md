# StatResultValueSparseMatrix

Output representation for compressed sparse row matrix.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rows** | **int** | Number of rows in the matrix | [optional] 
**columns** | **int** | Number of columns in the matrix | [optional] 
**index_pointer** | **[int]** | Array of 0-based index pointers for the compressed sparse row representation | [optional] 
**indices** | **[int]** | Array of 0-based indices for the compressed sparse row representation | [optional] 
**value** | [**StatResultValueVector**](StatResultValueVector.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


