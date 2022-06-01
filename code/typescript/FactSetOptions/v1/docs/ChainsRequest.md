# factsetoptions.ChainsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**date** | **String** | The as of date for the option chain in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**idType** | [**IdType**](IdType.md) |  | [optional] 
**exchange** | [**Exchange**](Exchange.md) |  | [optional] 


