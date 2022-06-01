# factsetoptions.UnderlyingVolumeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**exchange** | [**Exchange**](Exchange.md) |  | [optional] 


