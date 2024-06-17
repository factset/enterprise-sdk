# FactSet.SDK.OpenRisk.Model.StatResultValue
Floating point double(s) in a dimension corresponding to the calculation-level. Data is guaranteed to be present and non-empty if the HTTP status code is 200 Success

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rows** | **int** | Number of rows in the matrix | [optional] 
**Columns** | **int** | Number of columns in the matrix | [optional] 
**IndexPointer** | **List&lt;int&gt;** | Array of 0-based index pointers for the compressed sparse row representation | [optional] 
**Indices** | **List&lt;int&gt;** | Array of 0-based indices for the compressed sparse row representation | [optional] 
**Value** | **List&lt;double?&gt;** | Array of floating point values | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

