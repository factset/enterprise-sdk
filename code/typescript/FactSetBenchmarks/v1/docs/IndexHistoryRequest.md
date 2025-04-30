# factsetbenchmarks.IndexHistoryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. | 
**startDate** | **String** | Requested start date expressed in YYYY-MM-DD format. | [optional] 
**endDate** | **String** | Requested end date for Range expressed in YYYY-MM-DD format. | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**hedgeType** | [**HedgeType**](HedgeType.md) |  | [optional] 
**currency** | **String** | Currency for response. | [optional] 
**calendar** | **String** | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional] [default to &#39;FIVEDAY&#39;]
**impliedDate** | [**ImpliedDate**](ImpliedDate.md) |  | [optional] 


