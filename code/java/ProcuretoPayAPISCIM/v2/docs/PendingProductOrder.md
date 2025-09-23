

# PendingProductOrder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | [**ProductResourceReference**](ProductResourceReference.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) | Type of product order, e.g. &#39;Add&#39; or &#39;Remove&#39;. |  [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Status of the pending product order. |  [readonly]
**transactionCode** | **String** | A GUID that is the transaction code of the product order. |  [readonly]
**requested** | **OffsetDateTime** | Date and time when product was ordered. |  [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
ADD | &quot;Add&quot;
REMOVE | &quot;Remove&quot;



## Enum: StatusEnum

Name | Value
---- | -----
PROCESSING | &quot;Processing&quot;
PENDING_APPROVAL | &quot;Pending approval&quot;


## Implemented Interfaces

* Serializable


