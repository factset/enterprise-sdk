# SegmentsAndStructureResponse

Response containing fund classification, similar funds, segments, or fund structure data based on `structureType` parameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[SegmentsAndStructureItem]**](SegmentsAndStructureItem.md) | Array of objects - type depends on &#x60;structureType&#x60; parameter: * CLASSIFICATION: Array of Classifications objects * SIMILAR_FUNDS: Array of SimilarFunds objects * SEGMENTS: Array of BenchmarkDetails objects (segments/benchmark data) * FUND_STRUCTURE: Array of FundStructure objects | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


