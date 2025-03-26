# PendingProductOrder


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | [**ProductResourceReference**](ProductResourceReference.md) |  | 
**type** | **str** | Type of product order, e.g. &#39;Add&#39; or &#39;Remove&#39;. | [readonly] 
**status** | **str** | Status of the pending product order. | [readonly] 
**transaction_code** | **str** | A GUID that is the transaction code of the product order. | [readonly] 
**requested** | **datetime** | Date and time when product was ordered. | [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


