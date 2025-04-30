# factsetbenchmarks.BenchmarkConstituentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. | 
**date** | **String** | Date of holding expressed in YYYY-MM-DD format. | [optional] 
**currency** | **String** | Currency for response. | [optional] 
**calendar** | **String** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] [default to &#39;FIVEDAY&#39;]


