# FactSet.SDK.FactSetFunds.Model.BenchmarkDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**BenchmarkId** | **string** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**BenchmarkName** | **string** | The proper name of the Benchmark Id. | [optional] 
**MultipleBenchmarkFlag** | **string** | Indicates if the Fund has a composite benchmark. | [optional] 
**BenchmarkChangeDate** | **DateTime?** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**Segment** | **string** | The segment of the respective segment benchmark id. | [optional] 
**SegmentBenchmarkId** | **string** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**SegmentBenchmarkName** | **string** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**SegmentBenchmarkCurrency** | **string** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**SegmentBenchmarkReturnType** | **string** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

