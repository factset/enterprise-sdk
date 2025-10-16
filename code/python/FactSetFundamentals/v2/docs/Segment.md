# Segment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str, none_type** | Report labels of the segment type requested. | 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **str, none_type** | The requested &#x60;metric&#x60; input, representing the Fundamentals Data Item. For a definition of the item please use the &#x60;/fundamentals/v2/metrics&#x60; endpoint. | [optional] 
**date** | **date, none_type** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**value** | [**SegmentValue**](SegmentValue.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


