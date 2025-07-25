# FactSet.SDK.RealTimeOptions.Model.InlineResponse200DataSettlement
Settlement details (type and EOD price).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Settlement type of the option. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. |   | [optional] 
**Price** | **decimal?** | Settlement price. | [optional] 
**Currency** | [**InlineResponse200DataSettlementCurrency**](InlineResponse200DataSettlementCurrency.md) |  | [optional] 
**Time** | **DateTime?** | Date and time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

