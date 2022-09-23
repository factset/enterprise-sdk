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
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**impliedDate** | [**ImpliedDate**](ImpliedDate.md) |  | [optional] 


