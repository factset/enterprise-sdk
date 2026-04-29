

# BenchmarkDetailsAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**structureType** | **BenchmarkDetailsType** |  | 
**benchmarkId** | **String** | The Fund&#39;s primary Benchmark Identifier. |  [optional]
**benchmarkName** | **String** | The proper name of the Benchmark Id. |  [optional]
**isCompositeBenchmark** | **Boolean** | Binary flag to indicate whether the fund has a composite benchmark. |  [optional]
**benchmarkChangeDate** | **LocalDate** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. |  [optional]
**segment** | **String** | The segment of the respective segment benchmark ID. |  [optional]
**segmentBenchmarkId** | **String** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**segmentBenchmarkName** | **String** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]
**segmentBenchmarkCurrency** | **String** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**segmentBenchmarkReturnType** | **String** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. |  [optional]


## Implemented Interfaces

* Serializable


