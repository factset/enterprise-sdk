# UpdateIssueRequestData

update request infomration for issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **str** | subject of ticket | [optional] 
**severity** | **str** | severity of issue. Accepts Critical, High and Medium for severity. | [optional] 
**product_id** | **str** | ProductId that needs to be replaced | [optional] 
**category_id** | **str** | Category that needs to be replaced | [optional] 
**status** | **str** | Status that need to be updated | [optional] 
**close_content** | **str** | Comment for resolving the issue | [optional] 
**read_only** | **bool** | Mark the issue read-only to stop further modifications.can be set only on closed cards and it value should be only true | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


