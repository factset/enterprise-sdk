# FactSet.SDK.FactSetBenchmarks.Model.IndexSnapshotRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. | 
**Date** | **string** | Date of holding expressed in YYYY-MM-DD format. | [optional] 
**ReturnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**Currency** | **string** | Currency for response. | [optional] 
**Calendar** | **string** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] [default to "FIVEDAY"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

