

# ProductResourceReferenceWithRapidActivationInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Identifier of the product. | 
**$ref** | **String** | The URI corresponding to this product. |  [optional]
**display** | **String** | A human-readable name, primarily used for display purposes. |  [optional]
**rapidActivationStatus** | [**RapidActivationStatusEnum**](#RapidActivationStatusEnum) | Whether the associated product has been activated for the current month. Possible values are \&quot;eligible\&quot; and \&quot;active\&quot;. |  [optional]
**activationHistoryMonths** | **java.util.List&lt;String&gt;** | A list of the most recent three months (including the current month) during which the associated product has been activated. |  [optional]



## Enum: RapidActivationStatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
ELIGIBLE | &quot;eligible&quot;


## Implemented Interfaces

* Serializable


