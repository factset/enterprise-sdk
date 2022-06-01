

# UnderlyingVolumeRequest

Underlying Volume Request Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. |  [optional]
**frequency** | **Frequency** |  |  [optional]
**exchange** | **Exchange** |  |  [optional]


## Implemented Interfaces

* Serializable


