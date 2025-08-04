# FactSet.SDK.IssueTracker.Model.UpdateIssueRequestData
update request infomration for issue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subject** | **string** | subject of ticket | [optional] 
**Severity** | **string** | severity of issue. Accepts Critical, High and Medium for severity. | [optional] 
**ProductId** | **string** | ProductId that needs to be replaced | [optional] 
**CategoryId** | **string** | Category that needs to be replaced | [optional] 
**Status** | **string** | Status that need to be updated | [optional] 
**CloseContent** | **string** | Comment for resolving the issue | [optional] 
**ReadOnly** | **bool** | Mark the issue read-only to stop further modifications.can be set only on closed cards and it value should be only true | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

