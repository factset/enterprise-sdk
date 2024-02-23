

# BenchmarkDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**benchmarkId** | **String** | The Fund&#39;s primary Benchmark Identifier. |  [optional]
**benchmarkName** | **String** | The proper name of the Benchmark Id. |  [optional]
**multipleBenchmarkFlag** | **String** | Indicates if the Fund has a composite benchmark. |  [optional]
**benchmarkChangeDate** | **LocalDate** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. |  [optional]
**segment** | **String** | The segment of the respective segment benchmark id. |  [optional]
**segmentBenchmarkId** | **String** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**segmentBenchmarkName** | **String** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**segmentBenchmarkCurrency** | **String** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**segmentBenchmarkReturnType** | **String** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


