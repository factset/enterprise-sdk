# FactSet.SDK.FactSetOptions.Model.ChainsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.   | 
**Date** | **string** | The as of date for the option chain in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**IdType** | [**IdType**](IdType.md) |  | [optional] 
**Exchange** | [**Exchange**](Exchange.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

