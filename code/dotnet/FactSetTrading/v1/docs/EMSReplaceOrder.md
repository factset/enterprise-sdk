# FactSet.SDK.FactSetTrading.Model.EMSReplaceOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OriginalOrderId** | **string** |  | 
**OrderId** | **string** | Unique id for the order | [optional] 
**Instrument** | [**Instrument**](Instrument.md) |  | 
**Side** | **string** | Side can be buy or sell | 
**OrderType** | **string** | Type of the order | 
**OrderQuantity** | **double** | Order quantity | [optional] 
**Price** | **double** | Order Price | [optional] 
**StopPrice** | **double** | Stop Price | [optional] 
**StrikePrice** | **double** | Strike Price | [optional] 
**Currency** | **string** | Currency | [optional] 
**IsCovered** | **bool** | Currency | [optional] 
**MaxShow** | **double** | Max Show | [optional] 
**MaxFloor** | **double** | Max Floor | [optional] 
**PrevClosePrice** | **double** | Previous close price | [optional] 
**SettlementType** | **string** | Settlement type | [optional] 
**SettlementDate** | **string** | Settlement date in YYYYMMDD format | [optional] 
**HandlingInstructions** | **string** | Handling instructions | 
**ExecutionInstructions** | **string** | Execution instructions | [optional] 
**LocateRequired** | **bool** | Locate Required | [optional] 
**EffectiveTime** | **string** | Effective time in YYYYMMDD-HH:MM:SS format expressed in UTC | [optional] 
**Account** | **string** | Account | [optional] 
**TimeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**UserDefinedFields** | **Dictionary&lt;string, string&gt;** | User defined fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

