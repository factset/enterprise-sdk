

# SegmentsAndStructureResponse

Response containing fund classification, similar funds, segments, or fund structure data based on `structureType` parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**java.util.List&lt;SegmentsAndStructureItem&gt;**](SegmentsAndStructureItem.md) | Array of objects - type depends on &#x60;structureType&#x60; parameter: * CLASSIFICATION: Array of Classifications objects * SIMILAR_FUNDS: Array of SimilarFunds objects * SEGMENTS: Array of BenchmarkDetails objects (segments/benchmark data) * FUND_STRUCTURE: Array of FundStructure objects |  [optional]


## Implemented Interfaces

* Serializable


