

# PortfolioTransactionCreateDataParentTransaction

Parent transactions can be used to link transactions together. Only sell or cover short sell can be have buy transaction as its parent. All other combinations will be ignored, but they will not affect the current create request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the parent transaction. |  [optional]


## Implemented Interfaces

* Serializable


