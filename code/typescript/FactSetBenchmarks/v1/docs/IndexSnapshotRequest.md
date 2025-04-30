# factsetbenchmarks.IndexSnapshotRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. | 
**date** | **String** | Date of holding expressed in YYYY-MM-DD format. | [optional] 
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**currency** | **String** | Currency for response. | [optional] 
**calendar** | **String** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] [default to &#39;FIVEDAY&#39;]


