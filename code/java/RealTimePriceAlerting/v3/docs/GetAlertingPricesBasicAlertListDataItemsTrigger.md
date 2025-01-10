

# GetAlertingPricesBasicAlertListDataItemsTrigger

Trigger data at the time of alert creation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the trigger. |  [optional]
**creation** | **OffsetDateTime** | Date and time when the trigger was created. |  [optional]
**notation** | [**InlineResponse200DataTriggerNotation**](InlineResponse200DataTriggerNotation.md) |  |  [optional]
**price** | [**GetAlertingPricesBasicAlertListDataItemsTriggerPrice**](GetAlertingPricesBasicAlertListDataItemsTriggerPrice.md) |  |  [optional]
**range** | [**GetAlertingPricesBasicAlertListDataItemsTriggerRange**](GetAlertingPricesBasicAlertListDataItemsTriggerRange.md) |  |  [optional]
**comment** | **String** | Comment of the trigger. |  [optional]
**notification** | [**GetAlertingPricesBasicAlertListDataItemsTriggerNotification**](GetAlertingPricesBasicAlertListDataItemsTriggerNotification.md) |  |  [optional]
**status** | [**PostAlertingPricesBasicTriggerListDataItemsStatus**](PostAlertingPricesBasicTriggerListDataItemsStatus.md) |  |  [optional]


## Implemented Interfaces

* Serializable


