# factsetestimates.MetricSegmentDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** | Metric identifier to be used as &#x60;metrics&#x60; input in the FactSet Estimate Segment Detail endpoints.  | [optional] 
**segmentId** | **String** |  | [optional] 
**segmentLabel** | **String** | Plain text name of the metric. | [optional] 
**segmentType** | **String** | Type of selected Segment ID. | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the securityâ€™s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.  | [optional] 



## Enum: SegmentTypeEnum


* `BUS` (value: `"BUS"`)

* `GEO` (value: `"GEO"`)




