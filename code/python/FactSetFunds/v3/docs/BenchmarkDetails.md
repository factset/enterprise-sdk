# BenchmarkDetails

Benchmark and segment information including identifiers, names, currencies, and change history

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structure_type** | [**BenchmarkDetailsType**](BenchmarkDetailsType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**benchmark_id** | **str, none_type** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**benchmark_name** | **str, none_type** | The proper name of the Benchmark Id. | [optional] 
**is_composite_benchmark** | **bool, none_type** | Binary flag to indicate whether the fund has a composite benchmark. | [optional] 
**benchmark_change_date** | **date, none_type** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**segment** | **str, none_type** | The segment of the respective segment benchmark ID. | [optional] 
**segment_benchmark_id** | **str, none_type** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_name** | **str, none_type** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_currency** | **str, none_type** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**segment_benchmark_return_type** | **str, none_type** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


