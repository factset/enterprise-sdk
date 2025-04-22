# FactSet.SDK.FactSetTrading.Model.ReplaceChildOrder
Replace Child Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TicketId** | **string** | Ticket Id for the child order to be replaced | 
**OrderType** | **string** | Type of the order | [optional] 
**OrderQuantity** | **double?** | Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order. | [optional] 
**Price** | **double?** | Order price per share. | [optional] 
**TimeInForce** | [**TimeInForce**](TimeInForce.md) |  | [optional] 
**HandlingInstructions** | **string** | Instructions for order handling on Broker trading floor. | [optional] 
**StopPrice** | **double?** | Stop-loss price to buy/sell stock at market. | [optional] 
**MaxFloor** | **double?** | Maximum number of shares within an order to be shown on the exchange floor at any given time. | [optional] 
**MinQuantity** | **double?** | Minimum quantity of an order to be executed. | [optional] 
**SettlementType** | **string** | Order settlement period | [optional] 
**SettlementDate** | **string** | Specific date of trade settlement in YYYYMMDD format. | [optional] 
**ExecutionInstructions** | **string** | Instructions for order handling on exchange trading floor. | [optional] 
**LocateRequired** | **bool?** | Indicates whether the broker is to locate the stock in conjunction with a short sell order. | [optional] 
**Text** | **string** | Free format text string. | [optional] 
**UserDefinedFields** | **Dictionary&lt;string, string&gt;** | User defined fields | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

