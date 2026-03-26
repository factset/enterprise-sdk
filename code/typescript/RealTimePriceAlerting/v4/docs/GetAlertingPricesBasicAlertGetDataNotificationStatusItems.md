# realtimepricealerting.GetAlertingPricesBasicAlertGetDataNotificationStatusItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel**](GetAlertingPricesBasicAlertGetDataNotificationStatusItemsChannel.md) |  | [optional] 
**time** | **Date** | Date and time of the most recent change. | [optional] 
**code** | **String** | Code of the status. | Value | Description | | --- | --- | | pending | Notification has not been processed. | | sent | Notification has been sent but delivery status is unknown. | | delivered | Notification has been delivered. | | error | Notification has not been delivered due to an error. | | rejected | Notification delivery has been rejected (possibly due to return mails being received for delivery address). |   | [optional] 



## Enum: CodeEnum


* `pending` (value: `"pending"`)

* `sent` (value: `"sent"`)

* `delivered` (value: `"delivered"`)

* `error` (value: `"error"`)

* `rejected` (value: `"rejected"`)




