

# InlineResponse200DataNotificationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**InlineResponse200DataNotificationChannel**](InlineResponse200DataNotificationChannel.md) |  |  [optional]
**time** | **String** | Date and time of the most recent change. |  [optional]
**code** | [**CodeEnum**](#CodeEnum) | Code of the status. |  [optional]



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


