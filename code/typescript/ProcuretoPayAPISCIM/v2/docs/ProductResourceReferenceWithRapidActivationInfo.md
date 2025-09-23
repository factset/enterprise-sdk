# procuretopayapiscim.ProductResourceReferenceWithRapidActivationInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Identifier of the product. | 
**ref** | **String** | The URI corresponding to this product. | [optional] 
**display** | **String** | A human-readable name, primarily used for display purposes. | [optional] 
**rapidActivationStatus** | **String** | Whether the associated product has been activated for the current month. Possible values are \&quot;eligible\&quot; and \&quot;active\&quot;. | [optional] 
**activationHistoryMonths** | **[String]** | A list of the most recent three months (including the current month) during which the associated product has been activated. | [optional] 



## Enum: RapidActivationStatusEnum


* `active` (value: `"active"`)

* `eligible` (value: `"eligible"`)




