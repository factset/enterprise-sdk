# PortfolioTransactionCreateDataParentTransaction

Parent transactions can be used to link transactions together. Only sell or cover short sell can be have buy transaction as its parent. All other combinations will be ignored, but they will not affect the current create request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the parent transaction. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


