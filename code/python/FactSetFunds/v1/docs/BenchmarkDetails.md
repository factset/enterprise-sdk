# BenchmarkDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**benchmark_id** | **str** | The Fund&#39;s primary Benchmark Identifier. | [optional] 
**benchmark_name** | **str** | The proper name of the Benchmark Id. | [optional] 
**multiple_benchmark_flag** | **str** | Indicates if the Fund has a composite benchmark. | [optional] 
**benchmark_change_date** | **str** | The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null. | [optional] 
**segment** | **str** | The segment of the respective segment benchmark id. | [optional] 
**segment_benchmark_id** | **str** | Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_name** | **str** | The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_currency** | **str** | The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**segment_benchmark_return_type** | **str** | The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


