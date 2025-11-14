# FactSet.SDK.FactSetPartnerFunds.Model.HoldingResponseData
Holdings data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The input identifier. | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**AsOfDate** | **DateTime?** | Date when the holdings were reported. | [optional] 
**Top10Weight** | **double?** | Returns the total weight of the top 10 holdings as a percentage | [optional] 
**Holdings** | [**List&lt;Holding&gt;**](Holding.md) | List of holdings | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

