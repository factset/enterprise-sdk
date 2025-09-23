# procuretopayapiscim.PendingProductOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | [**ProductResourceReference**](ProductResourceReference.md) |  | 
**type** | **String** | Type of product order, e.g. &#39;Add&#39; or &#39;Remove&#39;. | [readonly] 
**status** | **String** | Status of the pending product order. | [readonly] 
**transactionCode** | **String** | A GUID that is the transaction code of the product order. | [readonly] 
**requested** | **Date** | Date and time when product was ordered. | [readonly] 



## Enum: TypeEnum


* `Add` (value: `"Add"`)

* `Remove` (value: `"Remove"`)





## Enum: StatusEnum


* `Processing` (value: `"Processing"`)

* `Pending approval` (value: `"Pending approval"`)




