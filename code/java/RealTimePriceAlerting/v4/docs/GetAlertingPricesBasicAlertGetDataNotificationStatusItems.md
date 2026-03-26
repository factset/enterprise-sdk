

# GetAlertingPricesBasicAlertGetDataNotificationStatusItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel**](GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel.md) |  |  [optional]
**time** | **OffsetDateTime** | Date and time of the most recent change. |  [optional]
**code** | [**CodeEnum**](#CodeEnum) | Code of the status. | Value | Description | | --- | --- | | pending | Notification has not been processed. | | sent | Notification has been sent but delivery status is unknown. | | delivered | Notification has been delivered. | | error | Notification has not been delivered due to an error. | | rejected | Notification delivery has been rejected (possibly due to return mails being received for delivery address). |   |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
ERROR | &quot;error&quot;
REJECTED | &quot;rejected&quot;


## Implemented Interfaces

* Serializable


